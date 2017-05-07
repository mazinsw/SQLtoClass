package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;

import org.apache.commons.io.FileUtils;
import org.mozilla.universalchardet.UniversalDetector;

import ast.Constraint;
import ast.EnumType;
import ast.Field;
import ast.ForeignKey;
import ast.Index;
import ast.OrderField;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;
import util.Messages;

public class TemplateGenerator extends CodeGenerator {
	
	public TemplateGenerator(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	public void start() throws Exception {
		getTemplateLoader().load();
		super.start();
	}
	
	@Override
	protected void run(Table table) throws Exception {
		Hashtable<String, String> values = new Hashtable<>();
		Hashtable<String, CommonField> indexedFields = new Hashtable<>();

		processArray(table, indexedFields);
		TemplateLoader.extractComment(table.getComment(), values, "T.");
		File outDir = new File(getOutputDirectory());
		for (File file : getTemplateLoader().getFiles()) {
			File tempFile = getTemplateLoader().rebase(file, outDir);
			File destFile = new File(applyTemplate(tempFile.getAbsolutePath(), table, indexedFields, null, null, null, values, 0));
			log("Template: " + destFile.getAbsolutePath());
			if (file.isDirectory())
				destFile.mkdirs();
			else {
				destFile.getParentFile().mkdirs();
				try {
					Charset charset = detectEncoding(file);
					String fileContent = FileUtils.readFileToString(file, charset);
					String oldContent = "";
					// same content, append
					if (tempFile.equals(destFile) && destFile.exists() && getCurrentTableIndex() != 0) {
						oldContent = FileUtils.readFileToString(destFile, charset);
					}
					fileContent = applyTemplate(oldContent + fileContent, table, indexedFields, null, null, null, values, 0);
					FileUtils.writeStringToFile(destFile, fileContent, charset);
				} catch (IOException e) {
					log(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

	private String applyTemplate(String source, Table table, Hashtable<String, CommonField> indexedFields, Field field,
			Index index, Constraint constraint, Hashtable<String, String> values, int eachIndex) {
		String name;
		String[] part;
		String unixName;
		String result = source, command = "", option = "";
		Stack<Integer> offsetStack = new Stack<>();
		Stack<String> condStack = new Stack<>();
		Stack<String> stmtStack = new Stack<>();
		int state = 0, startoffset, offset = 0;
		
		name = normalize(table.getName());
		part = name.split("\\.");
		name = part[part.length - 1];
		unixName = unixTransform(name);
		startoffset = -1;
		int i = 0;
		while (i < source.length()) {
			switch (source.charAt(i)) {
			case '$':
				state = 1;
				startoffset = i;
				break;
			case '[':
				if (state == 1) {
					command = "";
					option = "";
					state = 2;
				} else {
					state = 0;
					startoffset = -1;
				}
				break;
			case '.':
				if (state >= 2) {
					if (state > 2) {
						option += source.charAt(i);
					}
					state = 3;
				} else {
					state = 0;
					startoffset = -1;
				}
				break;
			case ']':
				// execute
				if (state >= 2 && !command.isEmpty()) {
					String replace = "";
					// field.if or table.if or table.exists, field.each or table.each
					if (option.startsWith("each") || option.startsWith("if") || option.startsWith("exists") || 
							option.startsWith("match") || option.startsWith("contains")) {
						if (i + 1 < source.length() && source.charAt(i + 1) == '\r') {
							i++;
							if (i + 1 < source.length() && source.charAt(i + 1) == '\n') {
								i++;
							}
						} else if (i + 1 < source.length() && source.charAt(i + 1) == '\n') {
							i++;
						}
						offsetStack.push(startoffset + offset);
						String filter;
						if (option.startsWith("each")) {
							stmtStack.push("each");
							filter = option.replaceFirst("each\\(([^\\)]+)\\)", "$1");
						} else if (option.startsWith("exists")) {
							stmtStack.push("exists");
							filter = option.replaceFirst("exists\\(([^\\)]+)\\)", "$1");
						} else if (option.startsWith("match")) {
							stmtStack.push("match");
							filter = option.replaceFirst("match\\(([^\\)]+)\\)", "$1");
						} else if (option.startsWith("contains")) {
							stmtStack.push("contains");
							filter = option.replaceFirst("contains\\(([^\\)]+)\\)", "$1");
						} else {
							stmtStack.push("if");
							filter = option.replaceFirst("if\\(([^\\)]+)\\)", "$1");
						}
						condStack.push(filter);
						if (offsetStack.size() > 1) {
							replace = source.substring(startoffset, i + 1);
						}
						// field.end or table.end, field.else.[if(filter)] or table.else.[if(filter)]
					} else if (option.equals("end") || option.startsWith("else")) {
						if (i + 1 < source.length() && source.charAt(i + 1) == '\r') {
							i++;
							if (i + 1 < source.length() && source.charAt(i + 1) == '\n') {
								i++;
							}
						} else if (i + 1 < source.length() && source.charAt(i + 1) == '\n') {
							i++;
						}
						if (!offsetStack.empty()) {
							int oldstartoffset = startoffset;
							String cmd = source.substring(startoffset, i + 1);
							String stmt = stmtStack.pop();
							startoffset = offsetStack.pop() - offset;
							String filter = condStack.pop();
							String eachContent = result.substring(startoffset + offset, oldstartoffset + offset);
							if (!offsetStack.empty()) {
								replace = eachContent + cmd;
								// field.else or table.else
								if (option.startsWith("else")) {
									if (option.equals("else")) {
										filter = "";
									} else if (option.startsWith("else.if")) {
										// field.else.if(filter) or table.else.if(filter)
										filter = option.replaceFirst("else.if\\(([^\\)]+)\\)", "$1");
										// table.else.exists(filter)
									} else if (option.startsWith("else.exists")) {
										filter = option.replaceFirst("else.exists\\(([^\\)]+)\\)", "$1");
									} else if (option.startsWith("else.match")) {
										filter = option.replaceFirst("else.match\\(([^\\)]+)\\)", "$1");
									} else if (option.startsWith("else.contains")) {
										filter = option.replaceFirst("else.contains\\(([^\\)]+)\\)", "$1");
									}
									offsetStack.push(oldstartoffset + offset);
									if (option.startsWith("else.exists")) {
										stmtStack.push("exists");
									} else if (option.startsWith("else.match")) {
										stmtStack.push("match");
									} else if (option.startsWith("else.contains")) {
										stmtStack.push("contains");
									} else {
										stmtStack.push("if");
									}
									condStack.push(filter);
								}
								 // field.if or table.if or field.match or field.contains
							} else if (stmt.equals("if") || stmt.equals("exists") || stmt.equals("match") || stmt.equals("contains")) {
								boolean doReplace = filter == null;
								if (!doReplace) {
									if (stmt.equals("match")) {
										if (command.equalsIgnoreCase("table")) {
											doReplace = table.getName().matches(filter);
										} else if (command.equalsIgnoreCase("field") && field != null) {
											doReplace = field.getName().matches(filter);
										}
									} else if (stmt.equals("contains")) {
										if (command.equalsIgnoreCase("table")) {
											doReplace = table.getName().contains(filter);
										} else if (command.equalsIgnoreCase("field") && field != null) {
											doReplace = field.getName().contains(filter);
										}
									} else {
										String[] filters = filter.split("\\|");
										for (String uFilter : filters) {
											if (stmt.equals("exists")) {
												Hashtable<String, String> tableValues = new Hashtable<>();
												Hashtable<String, String> newValues = new Hashtable<>();
												TemplateLoader.extractComment(table.getComment(), tableValues, "T.");
												for (Field afield : table.getFields()) {
													newValues.clear();
													newValues.putAll(tableValues);
													TemplateLoader.extractComment(afield.getComment(), newValues, "F.");
													if (uFilter.equals(TemplateLoader.getTypeNameFromType(table, afield))) {
														doReplace = true;
														break;
													}
													if (hasAttribute(command, table, indexedFields, afield, uFilter, newValues,
															eachIndex, true)) {
														doReplace = true;
														break;
													}
												}
											} else if (field != null && uFilter
													.equals(TemplateLoader.getTypeNameFromType(table, field))) {
												doReplace = true;
											} else if (hasAttribute(command, table, indexedFields, field, uFilter, values, eachIndex, false)) {
												doReplace = true;
											}
											if (doReplace)
												break;
										}
									}
								}
								if (doReplace) {
									replace = applyTemplate(eachContent, table, indexedFields, field, index, constraint, values, eachIndex);
									if (!option.equals("end")) {
										offsetStack.push(
												oldstartoffset + offset - eachContent.length() + replace.length());
										stmtStack.push("if");
										condStack.push("");
									}
								} else if (option.startsWith("else")) {
									if (option.equals("else") && !filter.isEmpty()) {
										filter = null;
									} else if (option.startsWith("else.if") && !filter.isEmpty()) {
										filter = option.replaceFirst("else.if\\(([^\\)]+)\\)", "$1");
									} else if (option.startsWith("else.exists") && !filter.isEmpty()) {
										filter = option.replaceFirst("else.exists\\(([^\\)]+)\\)", "$1");
									} else if (option.startsWith("else.match") && !filter.isEmpty()) {
										filter = option.replaceFirst("else.match\\(([^\\)]+)\\)", "$1");
									} else if (option.startsWith("else.contains") && !filter.isEmpty()) {
										filter = option.replaceFirst("else.contains\\(([^\\)]+)\\)", "$1");
									}
									offsetStack.push(oldstartoffset + offset - eachContent.length());
									if (option.startsWith("else.exists")) {
										stmtStack.push("exists");
									} else if (option.startsWith("else.match")) {
										stmtStack.push("match");
									} else if (option.startsWith("else.contains")) {
										stmtStack.push("contains");
									} else {
										stmtStack.push("if");
									}
									condStack.push(filter);
								}
							} else if (filter.equals("option")) { // field.each(option)
								if (field != null && field.getType() instanceof EnumType) {
									EnumType enumType = (EnumType) field.getType();
									for (int j = 0; j < enumType.getElements().size(); j++) {
										replace += applyTemplate(eachContent, table, indexedFields, field, index, constraint, values, j);
									}
								}
							} else if (filter.equals("comment")) { // field.each(comment) or table.each(comment)
								List<String> commentLines;
								if (command.equalsIgnoreCase("field") && field == null)
									commentLines = splitComment("", 72); // command outside field loop
								else if (command.equalsIgnoreCase("field"))
									commentLines = splitComment(TemplateLoader.extractComment(field.getComment()), 72);
								else
									commentLines = splitComment(TemplateLoader.extractComment(table.getComment()), 72);
								for (String line: commentLines) {
									String replContent = eachContent.replaceAll("(?i)\\$\\[" + command + "\\.comment\\]", Matcher.quoteReplacement(line));
									replace += applyTemplate(replContent, table, indexedFields, field, index, constraint, values, eachIndex);
								}
							} else if (command.equalsIgnoreCase("field")) { // field.each[(filter)]
								int j = 0;
								Field pkField = getPrimary(table);
								for (Field afield : table.getFields()) {
									Hashtable<String, String> newValues = new Hashtable<>();
									TemplateLoader.extractComment(table.getComment(), newValues, "T.");
									TemplateLoader.extractComment(afield.getComment(), newValues, "F.");
									if (!filter.equals("all") && (afield == pkField || newValues.containsKey("F.D")))
										continue;
									if (filter.equals("reference") && table.getReference(afield.getName()) == null)
										continue;
									if (filter.equals("search") && !newValues.containsKey("F.S"))
										continue;
									replace += applyTemplate(eachContent, table, indexedFields, afield, index, constraint, newValues, j);
									j++;
								}
							} else if (command.equalsIgnoreCase("table")) { // table.each[(filter)]
								int j = 0;
								// table.each, every table
								if (filter.isEmpty()) {
									for (Table atable : getTables()) {
										Hashtable<String, String> newValues = new Hashtable<>();
										TemplateLoader.extractComment(atable.getComment(), newValues, "T.");
										if (field != null) {
											TemplateLoader.extractComment(field.getComment(), newValues, "F.");
										}
										Hashtable<String, CommonField> newIndexedFields = new Hashtable<>();
										processArray(atable, newIndexedFields);
										replace += applyTemplate(eachContent, atable, newIndexedFields, field, index, constraint, newValues, j);
										j++;
									}
								} else if (filter.equals("constraint") || filter.equals("foreign") || filter.equals("unique") || filter.equals("primary")) {
									for (Constraint aconstraint : table.getConstraints()) {
										if (filter.equals("foreign") && !(aconstraint instanceof ForeignKey)) {
											continue;
										}
										if (filter.equals("unique") && !(aconstraint instanceof UniqueKey)) {
											continue;
										}
										if (filter.equals("primary") && !(aconstraint instanceof PrimaryKey)) {
											continue;
										}
										replace += applyTemplate(eachContent, table, indexedFields, field, null, aconstraint, values, eachIndex);
									}
								} else {
									for (Index aindex : table.getIndexes()) {
										replace += applyTemplate(eachContent, table, indexedFields, field, aindex, null, values, eachIndex);
									}
								}
							} else if (command.equalsIgnoreCase("index") || command.equalsIgnoreCase("unique") || 
									command.equalsIgnoreCase("primarykey") || command.equalsIgnoreCase("constraint") || 
									command.equalsIgnoreCase("foreign")) { // index.each[(filter)] or constraint.each[(filter)]
								int j = 0;
								Index sourceIndex = index;
								Field pkField = getPrimary(table);
								if (!command.equalsIgnoreCase("index")) {
									sourceIndex = constraint;
								}
								if (sourceIndex != null) {
									for (OrderField ofield : sourceIndex.getFields()) {
										Field afield = table.find(ofield.getName());
										if (afield == null) {
											throw new RuntimeException(String.format(Messages.getString("CodeGenerator.string0"), ofield.getName(), table.getName())); //$NON-NLS-1$
										}
										Hashtable<String, String> newValues = new Hashtable<>();
										TemplateLoader.extractComment(table.getComment(), newValues, "T.");
										TemplateLoader.extractComment(afield.getComment(), newValues, "F.");
										if (!filter.equals("all") && (afield == pkField || newValues.containsKey("F.D")))
											continue;
										if (filter.equals("reference") && table.getReference(afield.getName()) == null)
											continue;
										if (filter.equals("search") && !newValues.containsKey("F.S"))
											continue;
										replace += applyTemplate(eachContent, table, indexedFields, afield, index, constraint, newValues, j);
										j++;
									}
								}
							}
						}
					} else if (!offsetStack.empty()) {
						replace = source.substring(startoffset, i + 1);
					} else if (command.equalsIgnoreCase("field")) {
						if (field == null) {
							// ignore, incorrect usage
						} else if (option.equals("content")) {
							try {
								File fileField = getTemplateLoader().getFileForField(table, field, values);
								String fileContent = FileUtils.readFileToString(fileField, detectEncoding(fileField));
								replace = applyTemplate(fileContent, table, indexedFields, field, index, constraint, values, 0);
							} catch (Exception e) {
								log(e.getMessage());
								e.printStackTrace();
							}
						} else if (option.startsWith("option")) {
							if (field.getType() instanceof EnumType) {
								EnumType enumType = (EnumType) field.getType();
								List<String> elements = enumType.getElements();
								if (option.equals("option.low"))
									replace = String.valueOf(0);
								else if (option.equals("option.high"))
									replace = String.valueOf(elements.size() - 1);
								else if (eachIndex >= 0 && eachIndex < elements.size()) {
									if (option.equals("option.name"))
										replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(
												values.get("F.E"), eachIndex, elements.get(eachIndex)));
									else if (option.equals("option.unix"))
										replace = getTemplateLoader().recase(command, unixTransform(elements.get(eachIndex)));
									else if (option.equals("option.norm"))
										replace = getTemplateLoader().recase(command, normalized(elements.get(eachIndex)), true);
									else if (option.equals("option.index"))
										replace = String.valueOf(eachIndex);
									else
										replace = elements.get(eachIndex);
								}
							}
						} else if (option.equals("mask")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.M"), 0, "");
						} else if (option.equals("style")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("F.L"), 0, ""));
						} else if (option.equals("image.width") || option.equals("image.height")) {
							String value = TemplateLoader.getValueByIndex(values.get("F.I"), 0, "64x64");
							if (option.equals("image.width") || value.split("x").length < 2)
								value = value.split("x")[0];
							else
								value = value.split("x")[1];
							replace = getTemplateLoader().recase(command, value);
						} else if (option.equals("image.folder")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.I"), 1, unixName);
						} else if (option.equals("image.default")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.I"), 2, "");
						} else if (option.equals("gender")) {
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("F.G"),
									0, getGenderChar(despluralize(field.getName()).toLowerCase())));
						} else {
							String varName = normalized(field.getName());
							if (option.equals("unix"))
								replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("F.U"), 0, unixTransform(varName)));
							else if (option.equals("unix.plural")) {
								replace = getTemplateLoader().recase(command, TemplateLoader
										.getValueByIndex(values.get("F.U"), 1,
												unixTransform(normalize(
														TemplateLoader.getValueByIndex(values.get("F.N"), 1, varName + "s"),
														false))));
							} else if (option.equals("norm")) {
								replace = getTemplateLoader().recase(command, varName, true);
							} else if (option.equals("chars")) {
								replace = firstLetters(varName);
							} else if (option.equals("comment")) {
								replace = TemplateLoader.extractComment(field.getComment());
							} else if (option.equals("name")) {
								replace = getTemplateLoader().recase(command,
										TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName()), true);
							} else if (option.startsWith("array.")) {
								if (!indexedFields.containsKey(varName)) {
									log(String.format("Field '%s' of table '%s' is not an array", field.getName(),
											table.getName()));
								} else if (option.startsWith("array.count")) {
									CommonField commonField = indexedFields.get(varName);
									replace = String.valueOf(commonField.size());
								} else if (option.equals("array.index")) {
									CommonField commonField = indexedFields.get(varName);
									replace = String.valueOf(commonField.indexOf(field));
								} else if (option.equals("array.number")) {
									CommonField commonField = indexedFields.get(varName);
									replace = String.valueOf(commonField.indexOf(field) + 1);
								}
							} else if (option.equals("info")) {
								replace = getTemplateLoader().recase(command,
										TemplateLoader.getValueByIndex(values.get("F.F"), 0,
												TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName())));
							} else if (option.equals("get")) {
								replace = getFunctionSuffix(field, "get");
							} else if (option.equals("set")) {
								replace = getFunctionSuffix(field, "set");
							} else
								replace = getTemplateLoader().recase(command, field.getName());
						}
					} else if (command.equalsIgnoreCase("primary")) {
						Field pkField = getPrimary(table);
						Hashtable<String, String> refValues = new Hashtable<>();
						TemplateLoader.extractComment(table.getComment(), refValues, "T.");
						if(pkField != null) {
							TemplateLoader.extractComment(pkField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "fIeld")
									+ (option.isEmpty() ? "" : ".") + option + "]", table, indexedFields, pkField, index, constraint, refValues, eachIndex);
						}
					} else if (command.equalsIgnoreCase("descriptor")) {
						Field descField = getDescriptor(table);
						Hashtable<String, String> refValues = new Hashtable<>();
						TemplateLoader.extractComment(table.getComment(), refValues, "T.");
						if(descField != null) {
							TemplateLoader.extractComment(descField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "fIeld")
									+ (option.isEmpty() ? "" : ".") + option + "]", table, indexedFields, descField, index, constraint, refValues, eachIndex);
						}
					} else if (command.equalsIgnoreCase("table")) {
						Field pkField = getPrimary(table);
						Field descField = getDescriptor(table);

						if (option.startsWith("class")) {
							replace = applyTemplate("$[" + option + "]", table, indexedFields, field, index, constraint, values, eachIndex);
						} else if (option.startsWith("upper")) {
							String upperWords = option.replaceFirst("upper\\(([^\\)]+)\\)", "$1");
							getTemplateLoader().setUpperWords(upperWords);
						} else if (option.equals("package")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.K"), 0, "");
						} else if (option.equals("path")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.K"), 1, "");
						} else if (option.equals("inherited")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.H"), 0, "");
						} else if (option.equals("gender")) {
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.G"),
									0, getGenderChar(despluralize(name).toLowerCase())));
						} else if (option.equals("name"))
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name)), true);
						else if (option.equals("name.plural"))
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.N"), 1, despluralize(name) + "s"),
									true);
						else if (option.equals("info"))
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.F"),
									0, TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name))));
						else if (option.equals("unix"))
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.U"), 0, unixName));
						else if (option.equals("norm"))
							replace = getTemplateLoader().recase(command, name, true);
						else if (option.equals("chars"))
							replace = firstLetters(name);
						else if (option.equals("size"))
							replace = Integer.toString(field.getType().getSize());
						else if (option.equals("length")) {
							// TODO implement field length
							replace = "length.undefined";// Integer.toString(field.getType().getSize());
						} else if (option.equals("comment"))
							replace = TemplateLoader.extractComment(table.getComment());
						else if (option.equals("unix.plural"))
							replace = getTemplateLoader().recase(command, TemplateLoader
									.getValueByIndex(values.get("T.U"), 1,
											unixTransform(normalize(
													TemplateLoader.getValueByIndex(values.get("T.N"), 1, name + "s"),
													false))));
						else if (option.startsWith("pk") && pkField != null) {
							Hashtable<String, String> refValues = new Hashtable<>();
							TemplateLoader.extractComment(table.getComment(), refValues, "T.");
							TemplateLoader.extractComment(pkField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "fIeld")
									+ option.replaceFirst("pk", "") + "]", table, indexedFields, pkField, index, constraint, refValues, eachIndex);
						} else if (option.startsWith("desc") && descField != null) {
							Hashtable<String, String> refValues = new Hashtable<>();
							TemplateLoader.extractComment(table.getComment(), refValues, "T.");
							TemplateLoader.extractComment(descField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "fIeld")
									+ option.replaceFirst("desc", "") + "]", table, indexedFields, descField, index, constraint, refValues, eachIndex);
						} else if (option.equals("style"))
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.L"), 0, ""));
						else
							replace = table.getName();
					} else if (command.equalsIgnoreCase("reference")) {
						if (field != null) {
							Table refTable = findTable(table.getReference(field.getName()));
							if (refTable != null) {
								Hashtable<String, String> refValues = new Hashtable<>();
								TemplateLoader.extractComment(refTable.getComment(), refValues, "T.");
								replace = applyTemplate("$[" + getTemplateLoader().recase(command, "tAble")
										+ (option.isEmpty() ? "" : ".") + option + "]", refTable, indexedFields, null, index, constraint,
										refValues, 0);
							}
						}
					} else if (command.equalsIgnoreCase("inherited")) {
						String tblInherited = TemplateLoader.getValueByIndex(values.get("T.H"), 0, "");
						Table refTable = findTable(tblInherited);
						if (refTable != null) {
							Hashtable<String, String> refValues = new Hashtable<>();
							TemplateLoader.extractComment(refTable.getComment(), refValues, "T.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "tAble")
									+ (option.isEmpty() ? "" : ".") + option + "]", refTable, indexedFields, null, index, constraint,
									refValues, 0);
						}
					} else if (command.equalsIgnoreCase("index")) {
						if (option.equals("name") && index != null) {
							replace = getTemplateLoader().recase(command, index.getName());
						}
					} else if (command.equalsIgnoreCase("constraint") || command.equalsIgnoreCase("foreign") || 
							command.equalsIgnoreCase("unique") || command.equalsIgnoreCase("primarykey")) {
						if (option.equals("name") && constraint != null) {
							replace = getTemplateLoader().recase(command, constraint.getName());
						}
					}
					int oldoffset = offset;
					oldoffset -= result.length();
					result = result.substring(0, startoffset + offset) + replace + result.substring(i + 1 + offset);
					offset = oldoffset + result.length();
				}
				state = 0;
				startoffset = -1;
				break;
			default:
				if (state < 2) {
					state = 0;
					startoffset = -1;
				} else if (state == 2)
					command += source.charAt(i);
				else if (state == 3)
					option += source.charAt(i);
				break;
			}
			i++;
		}
		return result;
	}

	private boolean hasAttribute(String command, Table table, Hashtable<String, CommonField> indexedFields, Field field, String filter,
			Hashtable<String, String> values, int eachIndex, boolean optional) {
		if (command.equalsIgnoreCase("table")) {
			switch (filter) {
			case "inherited":
				return values.containsKey("T.H");
			case "package":
				return values.containsKey("T.K");
			case "path":
				return values.containsKey("T.K") && values.get("F.S").split("|").length > 1;
			case "comment":
				String comment = TemplateLoader.extractComment(table.getComment());
				return comment != null && !comment.isEmpty();
			}
			if(!optional)
				return false;
		}
		if(field == null)
			return false;
		// command = field
		String normName = normalized(field.getName());
		switch (filter) {
		case "null":
			return !field.isNotNull();
		case "default":
			return field.getValue() != null;
		case "primary":
			Field pkField = getPrimary(table);
			return pkField != null && field.equals(pkField);
		case "descriptor":
			return values.containsKey("F.S") && values.get("F.S").isEmpty();
		case "searchable":
			return values.containsKey("F.S");
		case "unique":
			return table.isUnique(field);
		case "reference":
			return table.getReference(field.getName()) != null;
		case "array":
			return indexedFields.containsKey(normName);
		case "radio":
			return values.containsKey("F.R");
		case "masked":
			return values.containsKey("F.M");
		case "password":
			return values.containsKey("F.P");
		case "text":
			return values.containsKey("F.T");
		case "image":
			return values.containsKey("F.I");
		case "info":
			return values.containsKey("F.F");
		case "first":
			return eachIndex == 0;
		case "comment":
			String comment = TemplateLoader.extractComment(field.getComment());
			return comment != null && !comment.isEmpty() && !command.equalsIgnoreCase("table");
		case "repeated":
			if (!indexedFields.containsKey(normName))
				break;
			CommonField commonField = indexedFields.get(normName);
			return commonField.indexOf(field) > 0;
		}
		return false;
	}

	private String getFunctionSuffix(Field field, String preffix) {
		String varName;
		if (field == null)
			varName = "ID";
		varName = normalize(field.getName(), false);
		String params = "";
		if (isIndexed(varName)) {
			List<Integer> indexes = extractIndex(varName);
			String sep = "";
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			for (Integer integer : indexes) {
				params += sep + integer;
				sep = ", ";
			}
		}
		String suffix = ")";
		if (preffix.equals("set") && !params.isEmpty())
			suffix = ", ";
		else if (preffix.equals("set"))
			suffix = "";
		return preffix + varName + "(" + params + suffix;
	}

	private String firstLetters(String typeName) {
		String prefix = "";
		boolean lastIsUpperCase = false;
		for (int i = 0; i < typeName.length(); i++) {
			char ch = typeName.charAt(i);
			if (Character.isUpperCase(ch) && !lastIsUpperCase) {
				prefix += Character.toLowerCase(ch);
				lastIsUpperCase = true;
			} else if (Character.isLowerCase(ch))
				lastIsUpperCase = false;
		}
		return prefix;
	}

	private String normalized(String name) {
		name = normalize(name, false);
		return name.replaceAll("\\[[0-9]+\\]", "");
	}
	
	private Charset detectEncoding(File file) {
		try {
			UniversalDetector detector = new UniversalDetector(null);
			FileInputStream fis = FileUtils.openInputStream(file);
			byte[] buf = new byte[512];
			int nread;
			while ((nread = fis.read(buf)) > 0 && !detector.isDone()) {
				detector.handleData(buf, 0, nread);
			}
			detector.dataEnd();
			String encoding = detector.getDetectedCharset();
			detector.reset();
			return Charset.forName(encoding);
		} catch (Exception e) {
			return getEncoding();
		}
	}
	
	private List<String> splitComment(String comment, int length) {
		List<String> result = new ArrayList<>();
		int offset = 0;
		if (comment == null || comment.trim().isEmpty())
			return result;
		comment = TemplateLoader.wrap(comment, length, null);
		for (int i = 0; i < comment.length(); i++) {
			switch (comment.charAt(i)) {
			case '\r':
			case '\n':
				int old_i = i;
				if (i + 1 < comment.length() && comment.charAt(i + 1) == '\n')
					i++;
				String line = comment.substring(offset, old_i);
				result.add(line.trim());
				offset = i + 1;
				break;
			default:
				break;
			}
		}
		if (offset < comment.length()) {
			String line = comment.substring(offset, comment.length());
			result.add(line.trim());
		}
		return result;
	}
	
}
