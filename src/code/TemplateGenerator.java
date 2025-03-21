package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.mozilla.universalchardet.UniversalDetector;

import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.ForeignKey;
import ast.FulltextIndex;
import ast.Index;
import ast.OrderField;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.StringType;
import ast.Table;
import ast.UniqueKey;
import util.Configuration;
import util.Messages;

public class TemplateGenerator extends CodeGenerator {

	public TemplateGenerator(ScriptNode script, Configuration config) {
		super(script, config);
	}

	@Override
	public void start() throws Exception {
		long startTime = System.currentTimeMillis();
		getTemplateLoader().load();
		super.start();
		long estimatedTime = System.currentTimeMillis() - startTime;
		DecimalFormat df = new DecimalFormat("#.###");
		String seconds = df.format(estimatedTime / 1000.0);
		log("Finished after " + seconds + " s");
	}
	
	@Override
	protected void run() throws Exception {
		for (File file : getTemplateLoader().getFiles()) {
			File tempFile = getTemplateLoader().rebase(file);
			File parentFile = tempFile.getParentFile();
			File prevFile = null;
			for (int i = 0; i < getTables().size(); i++) {
				Table table = getTables().get(i);
				Hashtable<String, CommonField> indexedFields = new Hashtable<>();
				processArray(table, indexedFields);
				for (Field field : table.getFields()) {
					int j = 0;
					Hashtable<String, String> newValues = new Hashtable<>();
					TemplateLoader.extractComment(table.getComment(), newValues, "T.");
					TemplateLoader.extractComment(field.getComment(), newValues, "F.");
	
					String filePath = applyTemplate(tempFile.getAbsolutePath(), table, indexedFields, field, null, null, newValues, j, i);
					filePath = filePath.replace('\\', File.separatorChar);
					filePath = filePath.replace('/', File.separatorChar);
					if (filePath.contains(File.separatorChar + "" + File.separatorChar)) {
						continue;
					}
					File destFile = new File(filePath);
					if (parentFile.equals(destFile)) {
						continue;
					}
					if (prevFile != null && prevFile.equals(destFile)) {
						continue;
					}
					j++;
					prevFile = destFile;
					log("Template: " + destFile.getAbsolutePath());
					if (file.isDirectory()) {
						destFile.mkdirs();
					} else {
						destFile.getParentFile().mkdirs();
						try {
							Charset charset = detectEncoding(file);
							String fileContent = FileUtils.readFileToString(file, charset);
							fileContent = applyTemplate(fileContent, table, indexedFields, field, null, null, newValues, j, i);
							FileUtils.writeStringToFile(destFile, fileContent, charset);
						} catch (IOException e) {
							log(e.getMessage());
						}
					}
				}
			}
		}
	}

	private String applyTemplate(String source, Table table, Hashtable<String, CommonField> indexedFields, Field field,
			Index index, Constraint constraint, Hashtable<String, String> values, int fieldIndex, int tableIndex) {
		String name, nameDefault;
		String[] part;
		String unixName, unixNameDefault;
		String result = source, command = "", option = "";
		Stack<Integer> offsetStack = new Stack<>();
		Stack<String> condStack = new Stack<>();
		Stack<String> stmtStack = new Stack<>();
		int state = 0, startoffset, offset = 0;
		
		name = normalize(table.getName());
		part = name.split("\\.");
		name = part[part.length - 1];

		nameDefault = normalize(table.getName(), false);
		part = nameDefault.split("\\.");
		nameDefault = part[part.length - 1];
		
		unixName = unixTransform(name);
		unixNameDefault = unixTransform(nameDefault);
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
					// field.[if|exists|each] or table.[if|exists|each] or descriptor.if or primary.if
					if (option.startsWith("each") || option.startsWith("if") || option.startsWith("exists") || 
							option.startsWith("match") || option.startsWith("finds") || option.startsWith("contains")) {
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
							filter = capture("each\\(([^\\)]+)\\)", option, 1);
						} else if (option.startsWith("exists")) {
							stmtStack.push("exists");
							filter = capture("exists\\(([^\\)]+)\\)", option, 1);
						} else if (option.startsWith("match")) {
							stmtStack.push("match");
							filter = capture("match\\(([^\\)]+)\\)", option, 1);
						} else if (option.startsWith("finds")) {
							stmtStack.push("finds");
							filter = capture("finds\\(([^\\)]+)\\)", option, 1);
						} else if (option.startsWith("contains")) {
							stmtStack.push("contains");
							filter = capture("contains\\(([^\\)]+)\\)", option, 1);
						} else {
							stmtStack.push("if");
							filter = capture("if\\(([^\\)]+)\\)", option, 1);
						}
						condStack.push(filter);
						if (offsetStack.size() > 1) {
							replace = source.substring(startoffset, i + 1);
						}
						// [field|table|primary|descriptor].end or [field|table|primary|descriptor].else[.if(filter)]
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
										filter = capture("else.if\\(([^\\)]+)\\)", option, 1);
										// table.else.exists(filter)
									} else if (option.startsWith("else.exists")) {
										filter = capture("else.exists\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.match")) {
										filter = capture("else.match\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.finds")) {
										filter = capture("else.finds\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.contains")) {
										filter = capture("else.contains\\(([^\\)]+)\\)", option, 1);
									}
									offsetStack.push(oldstartoffset + offset);
									if (option.startsWith("else.exists")) {
										stmtStack.push("exists");
									} else if (option.startsWith("else.match")) {
										stmtStack.push("match");
									} else if (option.startsWith("else.finds")) {
										stmtStack.push("finds");
									} else if (option.startsWith("else.contains")) {
										stmtStack.push("contains");
									} else {
										stmtStack.push("if");
									}
									condStack.push(filter);
								}
								 // field.if or table.if or field.match or field.contains
							} else if (stmt.equals("if") || stmt.equals("exists") || stmt.equals("match") || stmt.equals("finds") || stmt.equals("contains")) {
								boolean doReplace = filter == null;
								if (!doReplace) {
									if (stmt.equals("match")) {
										Pattern mypattern = Pattern.compile(filter, Pattern.CASE_INSENSITIVE);
										if (command.equalsIgnoreCase("table")) {
											doReplace = mypattern.matcher(table.getName()).matches();
										} else if (command.equalsIgnoreCase("field") && field != null) {
											doReplace = mypattern.matcher(field.getName()).matches();
										}
									} else if (stmt.equals("finds")) {
										Pattern mypattern = Pattern.compile(filter, Pattern.CASE_INSENSITIVE);
										Table refTable = table;
										if (command.equalsIgnoreCase("reference") && field != null) {
											refTable = findTable(table.getReference(field.getName()));	
										}
										for (Field checkField : refTable.getFields()) {
											doReplace = mypattern.matcher(checkField.getName()).matches();
											if (doReplace) {
												break;
											}
										}
									} else if (stmt.equals("contains")) {
										if (command.equalsIgnoreCase("table")) {
											doReplace = table.getName().toLowerCase().contains(filter.toLowerCase());
										} else if (command.equalsIgnoreCase("field") && field != null) {
											doReplace = field.getName().toLowerCase().contains(filter.toLowerCase());
										}
									} else {
										boolean andFilter = filter.contains("&");
										String[] filters = andFilter ? filter.split("\\s*&\\s*") : filter.split("\\s*\\|\\s*");
										Field testField = field;
										if (command.equalsIgnoreCase("descriptor")) {
											testField = getDescriptor(table);
										} else if (command.equalsIgnoreCase("primary")) {
											testField = getPrimary(table);
										}
										for (String uFilter : filters) {
											doReplace = false;
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
															fieldIndex, index, true)) {
														doReplace = true;
														break;
													}
												}
											} else if (testField != null && uFilter
													.equals(TemplateLoader.getTypeNameFromType(table, testField))) {
												doReplace = true;
											} else if (hasAttribute(command, table, indexedFields, testField, uFilter, values, fieldIndex, index, false)) {
												doReplace = true;
											}
											if ((doReplace && !andFilter) || (!doReplace && andFilter)){
												break;
											}
										}
									}
								}
								if (doReplace) {
									replace = applyTemplate(eachContent, table, indexedFields, field, index, constraint, values, fieldIndex, tableIndex);
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
										filter = capture("else.if\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.exists") && !filter.isEmpty()) {
										filter = capture("else.exists\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.match") && !filter.isEmpty()) {
										filter = capture("else.match\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.finds") && !filter.isEmpty()) {
										filter = capture("else.finds\\(([^\\)]+)\\)", option, 1);
									} else if (option.startsWith("else.contains") && !filter.isEmpty()) {
										filter = capture("else.contains\\(([^\\)]+)\\)", option, 1);
									}
									offsetStack.push(oldstartoffset + offset - eachContent.length());
									if (option.startsWith("else.exists")) {
										stmtStack.push("exists");
									} else if (option.startsWith("else.match")) {
										stmtStack.push("match");
									} else if (option.startsWith("else.finds")) {
										stmtStack.push("finds");
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
										replace += applyTemplate(eachContent, table, indexedFields, field, index, constraint, values, j, tableIndex);
									}
								}
							} else if (filter.equals("comment") || filter.equals("description")) { // field.each(comment|description) or table.each(comment|description)
								List<String> commentLines;
								if (command.equalsIgnoreCase("field") && field == null)
									commentLines = splitComment("", 72); // command outside field loop
								else if (command.equalsIgnoreCase("field"))
									commentLines = splitComment(TemplateLoader.extractComment(field.getComment()), 72);
								else
									commentLines = splitComment(TemplateLoader.extractComment(table.getComment()), 72);
								int j = 0;
								for (String line: commentLines) {
									if (filter.equals("description")) {
										line  = line.replace("'", "\\'");
									}
									String replContent = eachContent.replaceAll("(?i)\\$\\[" + command + "\\." + filter + "\\]", Matcher.quoteReplacement(line));
									replace += applyTemplate(replContent, table, indexedFields, field, index, constraint, values, j, tableIndex);
									j++;
								}
							} else if (command.equalsIgnoreCase("field") || command.equalsIgnoreCase("reference")) { // field.each[(filter)]
								int j = 0;
								Table refTable = table;
								if (command.equalsIgnoreCase("reference") && field != null) {
									refTable = findTable(table.getReference(field.getName()));	
								}
								boolean andFilter = filter.contains("&");
								String[] filters = andFilter ? filter.split("\\s*&\\s*") : filter.split("\\s*\\|\\s*");
								for (Field afield : refTable.getFields()) {
									Hashtable<String, String> newValues = new Hashtable<>();
									TemplateLoader.extractComment(refTable.getComment(), newValues, "T.");
									TemplateLoader.extractComment(afield.getComment(), newValues, "F.");
									boolean doApply = false;
									for (String uFilter : filters) {
										doApply = false;
										if (uFilter.equals("all")) {
											doApply = true;
										} else if (uFilter.isEmpty() && (afield.getName().equalsIgnoreCase("id") || newValues.containsKey("F.D"))) {
											doApply = false;
										} else if (uFilter.equals(TemplateLoader.getTypeNameFromType(refTable, afield))) {
											doApply = true;
										} else if (hasAttribute(command, refTable, indexedFields, afield, uFilter, newValues, j, index, true)) {
											doApply = true;
										}
										if ((doApply && !andFilter) || (!doApply && andFilter)){
											break;
										}
									}
									if (!doApply) {
										continue;
									}
									replace += applyTemplate(eachContent, refTable, indexedFields, afield, index, constraint, newValues, j, tableIndex);
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
										replace += applyTemplate(eachContent, atable, newIndexedFields, field, index, constraint, newValues, j, j);
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
										replace += applyTemplate(eachContent, table, indexedFields, field, aconstraint, aconstraint, values, j, tableIndex);
										j++;
									}
								} else {
									for (Index aindex : table.getIndexes()) {
										replace += applyTemplate(eachContent, table, indexedFields, field, aindex, null, values, j, tableIndex);
										j++;
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
								if (command.equalsIgnoreCase("primarykey")) {
									sourceIndex = getPrimaryKey(table);
								}
								if (sourceIndex == null && field != null) {
									if (command.equalsIgnoreCase("foreign")) {
										sourceIndex = table.findForeignKey(field.getName());
									} else if (command.equalsIgnoreCase("constraint")) {
										sourceIndex = table.findConstraint(field.getName());
									} else if (command.equalsIgnoreCase("index")) {
										sourceIndex = table.findIndex(field);
									} else {
										sourceIndex = table.getUniqueIndex(field);
									}
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
										replace += applyTemplate(eachContent, table, indexedFields, afield, index, constraint, newValues, j, tableIndex);
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
						} else if (option.startsWith("option")) {
							if (field.getType() instanceof EnumType) {
								EnumType enumType = (EnumType) field.getType();
								List<String> elements = enumType.getElements();
								if (option.equals("option.low"))
									replace = String.valueOf(0);
								else if (option.equals("option.high"))
									replace = String.valueOf(elements.size() - 1);
								else if (fieldIndex >= 0 && fieldIndex < elements.size()) {
									if (option.equals("option.name"))
										replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(
												values.get("F.E"), fieldIndex, elements.get(fieldIndex)));
									else if (option.equals("option.unix"))
										replace = getTemplateLoader().recase(command, unixTransform(elements.get(fieldIndex)));
									else if (option.equals("option.norm"))
										replace = getTemplateLoader().recase(command, normalized(elements.get(fieldIndex)), true);
									else if (option.equals("option.index"))
										replace = String.valueOf(fieldIndex);
									else
										replace = elements.get(fieldIndex);
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
						} else if (option.equals("letter")) {
							replace = getTemplateLoader().recase(command, field.getName().substring(0, 1));
						} else if (option.equals("info")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("F.F"), 0,
											TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName())));
						} else if (option.equals("norm.singular")) {
							String varNameDef = normalized(field.getName(), true);
							replace = getTemplateLoader().recase(command, varNameDef, true);
						} else if (option.equals("on.delete")) {
							ForeignKey foreignKey = table.findForeignKey(field.getName());
							String value = "NO ACTION";
							if (foreignKey != null) {
								value = foreignKey.getDeleteActionText();
							}
							replace = getTemplateLoader().recase(command, value);								
						} else if (option.equals("on.update")) {
							ForeignKey foreignKey = table.findForeignKey(field.getName());
							String value = "NO ACTION";
							if (foreignKey != null) {
								value = foreignKey.getUpdateActionText();
							}
							replace = getTemplateLoader().recase(command, value);
						} else if (option.equals("description")) {
							replace = TemplateLoader.extractComment(field.getComment());
							if (replace != null) {
								replace  = replace.replace("'", "\\'");
							}
						} else if (option.matches("(?i)^replace\\([^,\\)]+(?:,\\S+)?\\)$")) {
							String pattern = "(?i)^replace\\(([^,\\)]+)(?:,(\\S+))?\\)$";
							String target = capture(pattern, option, 1);
							String replacement = capture(pattern, option, 2);
							replacement = replacement == null ? "" : replacement;
							String value = field.getName().replace(target, replacement);
							replace = getTemplateLoader().recase(command, value);
						} else if (option.equals("comment")) {
							replace = TemplateLoader.extractComment(field.getComment());
						} else if (option.equals("name")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName()), true);
						} else if (option.equals("name.norm")) {
							String nameNorm = normalized(TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName()));
							replace = getTemplateLoader().recase(command, nameNorm, true);
						} else if (option.equals("default")) {
							replace = field.getValue() == null ? "null" : field.getValue().toString();
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
							} else if (option.equals("noid")) {
								replace = getTemplateLoader().recase(command, varName.replaceAll("I[dD]$", ""), true);
							} else if (option.equals("chars")) {
								replace = firstLetters(varName);
							} else if (option.equals("size")) {
								replace = Integer.toString(field.getType().getSize());
							} else if (option.equals("length")) {
								replace = Long.toString(((StringType)field.getType()).getLength());
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
							} else {
								replace = getTemplateLoader().recase(command, field.getName());
							}
						}
					} else if (command.equalsIgnoreCase("primary")) {
						Field pkField = getPrimary(table);
						Hashtable<String, String> refValues = new Hashtable<>();
						TemplateLoader.extractComment(table.getComment(), refValues, "T.");
						if(pkField != null) {
							TemplateLoader.extractComment(pkField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "Field")
									+ (option.isEmpty() ? "" : ".") + option + "]", table, indexedFields, pkField, index, constraint, refValues, fieldIndex, tableIndex);
						}
					} else if (command.equalsIgnoreCase("descriptor")) {
						Field descField = getDescriptor(table);
						Hashtable<String, String> refValues = new Hashtable<>();
						TemplateLoader.extractComment(table.getComment(), refValues, "T.");
						if(descField != null) {
							TemplateLoader.extractComment(descField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "Field")
									+ (option.isEmpty() ? "" : ".") + option + "]", table, indexedFields, descField, index, constraint, refValues, fieldIndex, tableIndex);
						}
					} else if (command.equalsIgnoreCase("table")) {
						if (option.startsWith("upper")) {
							String upperWords = capture("upper\\(([^\\)]+)\\)", option, 1);
							getTemplateLoader().setUpperWords(upperWords);
						} else if (option.equals("package")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.K"), 0, "");
						} else if (option.equals("order")) {
							int digits = String.valueOf(getTables().size()).length();
							replace = StringUtils.leftPad(String.valueOf(tableIndex), digits, '0');
						} else if (option.equals("path")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.K"), 1, "");
						} else if (option.equals("inherited")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.H"), 0, "");
						} else if (option.equals("gender")) {
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.G"),
									0, getGenderChar(despluralize(name).toLowerCase())));
						} else if (option.equals("letter")) {
							replace = getTemplateLoader().recase(command, name.substring(0, 1));
						} else if (option.equals("name")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name)), true);
						} else if (option.equals("name.plural")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.N"), 1, despluralize(name) + "s"),
									true);
						} else if (option.equals("info")) {
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.F"),
									0, TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name))));
						} else if (option.equals("unix")) {
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.U"), 0, unixName));
						} else if (option.equals("unix.default")) {
							replace = getTemplateLoader().recase(command, TemplateLoader.getValueByIndex(values.get("T.U"), 1, unixNameDefault));
						} else if (option.equals("norm")) {
							replace = getTemplateLoader().recase(command, name, true);
						} else if (option.equals("norm.default")) {
							replace = getTemplateLoader().recase(command, nameDefault, true);
						} else if (option.equals("chars")) {
							replace = firstLetters(name);
						} else if (option.equals("description")) {
							replace = TemplateLoader.extractComment(table.getComment());
							if (replace != null) {
								replace  = replace.replace("'", "\\'");
							}
						} else if (option.equals("comment")) {
							replace = TemplateLoader.extractComment(table.getComment());
						} else if (option.equals("unix.plural")) {
							replace = getTemplateLoader().recase(command, TemplateLoader
									.getValueByIndex(values.get("T.U"), 1,
											unixTransform(normalize(
													TemplateLoader.getValueByIndex(values.get("T.N"), 1, name + "s"),
													false))));
						} else if (option.equals("style")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.L"), 0, ""));
						} else if (option.equals("style.extra")) {
							replace = getTemplateLoader().recase(command,
									TemplateLoader.getValueByIndex(values.get("T.L"), 1, ""));
						} else if (option.equals("id")) {
							replace = TemplateLoader.getValueByIndex(values.get("T.ID"), 0, "");
						} else {
							replace = getTemplateLoader().recase(command, table.getName());
						}
					} else if (command.equalsIgnoreCase("reference")) {
						if (field != null) {
							Table refTable = findTable(table.getReference(field.getName()));
							if (refTable != null) {
								Hashtable<String, String> refValues = new Hashtable<>();
								TemplateLoader.extractComment(refTable.getComment(), refValues, "T.");
								replace = applyTemplate("$[" + getTemplateLoader().recase(command, "Table")
										+ (option.isEmpty() ? "" : ".") + option + "]", refTable, indexedFields, null, index, constraint,
										refValues, 0, tableIndex);
							}
						}
					} else if (command.equalsIgnoreCase("inherited")) {
						String tblInherited = TemplateLoader.getValueByIndex(values.get("T.H"), 0, "");
						Table refTable = findTable(tblInherited);
						if (refTable != null) {
							Hashtable<String, String> refValues = new Hashtable<>();
							TemplateLoader.extractComment(refTable.getComment(), refValues, "T.");
							replace = applyTemplate("$[" + getTemplateLoader().recase(command, "Table")
									+ (option.isEmpty() ? "" : ".") + option + "]", refTable, indexedFields, null, index, constraint,
									refValues, 0, tableIndex);
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
			Hashtable<String, String> values, int eachIndex, Index index, boolean optional) {
		if (command.equalsIgnoreCase("table")) {
			switch (filter) {
			case "first":
				return eachIndex == 0;
			case "non_first":
				return eachIndex > 0;
			case "constraint":
				boolean primaryKey = getPrimaryKey(table) != null;
				return (table.getConstraints().size() > 1 && primaryKey) || (table.getConstraints().size() > 0 && !primaryKey);
			case "index":
				return table.getIndexes().size() > 0;
			case "unique":
				return table.getUniqueIndexCount() > 0;
			case "inherited":
				return values.containsKey("T.H");
			case "package":
				return values.containsKey("T.K");
			case "unpluralizable":
				return !table.getName().equalsIgnoreCase(normalize(table.getName()) + "s");
			case "pluralizable":
				return table.getName().equalsIgnoreCase(normalize(table.getName()) + "s");
			case "path":
				return values.containsKey("T.K") && values.get("F.S").split("|").length > 1;
			case "comment":
			case "description":
				String comment = TemplateLoader.extractComment(table.getComment());
				return comment != null && !comment.isEmpty();
			}
			if (field != null && field.getName().equalsIgnoreCase(filter)) {
				return true;
			}
			if(!optional)
				return false;
		}
		if (command.equalsIgnoreCase("unique")) {
			switch (filter) {
			case "primary":
				return table.getConstraints().get(eachIndex) instanceof PrimaryKey;
			}
		}
		if (
			command.equalsIgnoreCase("index") ||
			command.equalsIgnoreCase("unique") ||
			command.equalsIgnoreCase("foreign") ||
			command.equalsIgnoreCase("constraint") ||
			command.equalsIgnoreCase("reference") ||
			command.equalsIgnoreCase("primary")
		) {
			Index selectedIndex = index;
			if (selectedIndex == null && field != null) {
				if (command.equalsIgnoreCase("foreign")) {
					selectedIndex = table.findForeignKey(field.getName());
				} else if (command.equalsIgnoreCase("constraint")) {
					selectedIndex = table.findConstraint(field.getName());
				} else if (command.equalsIgnoreCase("index")) {
					selectedIndex = table.findIndex(field);
				} else {
					selectedIndex = table.getUniqueIndex(field);
				}
			}
			switch (filter) {
			case "few_fields":
				return selectedIndex != null && selectedIndex.getFields().size() < 5;
			case "many":
				return selectedIndex != null && selectedIndex.getFields().size() >= 2;
			case "single":
				return selectedIndex != null && selectedIndex.getFields().size() == 1;
			case "fulltext":
				return selectedIndex != null && selectedIndex instanceof FulltextIndex;
			}
		}
		if(field == null)
			return false;
		// command = field
		String normName = normalized(field.getName());
		switch (filter) {
		case "null":
		case "optional":
			return !field.isNotNull();
		case "required":
		case "not_null":
		case "non_null":
			return field.isNotNull();
		case "default":
			return field.getValue() != null;
		case "primary":
			return isPrimaryKeyField(table, field);
		case "descriptor":
			return values.containsKey("F.S") && values.get("F.S").isEmpty();
		case "searchable":
			return values.containsKey("F.S");
		case "ignored":
			return values.containsKey("F.D");
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
		case "non_first":
			return eachIndex > 0;
		case "few_fields":
			return field.getType().getType() != DataType.ENUM || ((EnumType)field.getType()).getElements().size() < 5;
		case "many":
			return field.getType().getType() != DataType.ENUM || ((EnumType)field.getType()).getElements().size() >= 2;
		case "single":
			return field.getType().getType() != DataType.ENUM || ((EnumType)field.getType()).getElements().size() == 1;
		case "comment":
		case "description":
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
		return normalized(name, false);
	}

	private String normalized(String name, boolean despluralize) {
		name = normalize(name, despluralize);
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
