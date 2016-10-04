package code;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;

import org.apache.commons.io.FileUtils;
import org.mozilla.universalchardet.UniversalDetector;

import util.Pair;
import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.Foreign;
import ast.OrderField;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;

public abstract class PHPGeneratorBase extends CodeGenerator {

	private boolean arrayAccess;
	private boolean proccessTemplate;
	private static final String[] indexNames = { "$linha", "$coluna" };
	private TemplateLoader templateLoader;
	private Hashtable<String, String> indexedFields;

	public PHPGeneratorBase(String outDir, ScriptNode script) {
		super(outDir, script);
		templateLoader = new TemplateLoader();
		indexedFields = new Hashtable<>();
	}

	public boolean isArrayAccess() {
		return arrayAccess;
	}

	public void setArrayAccess(boolean arrayAccess) {
		this.arrayAccess = arrayAccess;
	}

	public boolean isProccessTemplate() {
		return proccessTemplate;
	}

	@Override
	public void start() throws FileNotFoundException {
		if (isProccessTemplate())
			templateLoader.load();
		super.start();
	}

	private String genParams(String data, String sep) {
		String[] values = data.split(";");
		String semicolon = "";
		String indexDecl = "";
		for (int i = 0; i < values.length; i++) {
			String paramName;
			if (values.length == 1)
				paramName = "$index";
			else if (values.length == 2)
				paramName = indexNames[i];
			else
				paramName = "$index" + (i + 1);
			indexDecl += semicolon + paramName;
			semicolon = sep + " ";
		}
		return indexDecl;
	}

	private String genArray(String data) {
		String[] values = data.split(";");
		String indexDecl = "";
		for (int i = 0; i < values.length; i++) {
			String paramName;
			if (values.length == 1)
				paramName = "[$index]";
			else if (values.length == 2)
				paramName = "[" + indexNames[i] + "]";
			else
				paramName = "[" + "$index" + (i + 1) + "]";
			indexDecl += paramName;
		}
		return indexDecl;
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

	private String genMultilineComment(String comment, String identation) {
		String result = identation + "/**";
		int offset = 0;
		if (comment == null || comment.trim().isEmpty())
			return null;
		comment = TemplateLoader.wrap(comment, 80, null);
		for (int i = 0; i < comment.length(); i++) {
			switch (comment.charAt(i)) {
			case '\r':
			case '\n':
				int old_i = i;
				if (i + 1 < comment.length() && comment.charAt(i + 1) == '\n')
					i++;
				String line = comment.substring(offset, old_i);
				result += "\r\n" + identation + " * " + line.trim();
				offset = i + 1;
				break;
			default:
				break;
			}
		}
		if (offset < comment.length()) {
			String line = comment.substring(offset, comment.length());
			result += "\r\n" + identation + " * " + line.trim();
		}
		return result + "\r\n" + identation + " */";
	}

	@Override
	public void genHeader(PrintWriter out, Table table, String name, boolean indexed) {
		out.println("<?php");
		out.println();
		Hashtable<String, String> enumFields = new Hashtable<>();
		// generate enum values
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			if (enumFields.containsKey(varName))
				continue;
			String enumItems = genEnum(name, field);
			if (enumItems == null)
				continue;
			out.println("class " + name + varName + " {");
			out.print(enumItems);
			out.println("}");
			enumFields.put(varName, enumItems);
		}
		if (enumFields.size() > 0)
			out.println();
		String arrayIntf = "";
		if (isArrayAccess())
			arrayIntf = " implements ArrayAccess";

		Hashtable<String, String> fieldValues = new Hashtable<>();
		String tableComment = TemplateLoader.extractComment(table.getComment(), fieldValues, "F.");
		String tableMLComment = genMultilineComment(tableComment, "");
		if (tableMLComment != null)
			out.println(tableMLComment);
		out.println("class " + getClassName(name) + arrayIntf + " {");
	}

	private String genEnum(String name, Field field) {
		if (field.getType().getType() != DataType.ENUM)
			return null;
		EnumType type = (EnumType) field.getType();
		if (type.isBoolean())
			return null;
		if (type.getElements().size() == 1 && type.getElements().get(0).matches("[0-9]+"))
			return null;
		String enumItems = "";
		for (String item : type.getElements()) {
			enumItems += "\tconst " + normalize(item, false).toUpperCase() + " = '" + item + "';\n";
		}
		return enumItems;
	}

	private String genEnumArray(Field field) {
		if (field.getType().getType() != DataType.ENUM)
			return null;
		EnumType type = (EnumType) field.getType();
		String enumItems = "", space = "";
		for (String item : type.getElements()) {
			enumItems += space + "'" + item + "'";
			space = ", ";
		}
		return enumItems;
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name, boolean indexed) {
		Hashtable<String, Pair<String, Field>> usedFields = new Hashtable<>();
		String unixName = unixTransform(name);
		String className = getClassName(name);
		processArray(table, indexedFields);
		Field pkField = getPkField(table);
		String pkName = null;
		if (pkField != null)
			pkName = pkField.getName().toLowerCase();
		List<String> ukNames = new ArrayList<String>();
		Constraint uKey = null;
		for (Constraint constraint : getUniqueKeys(table)) {
			for (OrderField oField : constraint.getFields()) {
				ukNames.add(oField.getName().toLowerCase());
			}
			uKey = constraint;
			break;
		}
		// generate variables
		if (indexed)
			out.println("\tprivate $" + unixName + "_index;");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				String varDecl = "\tprivate $" + unixTransform(varName) + " = array();";
				out.println(varDecl);
				usedFields.put(varName, new Pair<String, Field>(data, field));
			} else
				out.println("\tprivate $" + unixTransform(varName) + ";");
		}
		out.println();
		// generate constructor
		out.println("\tpublic function __construct($" + unixName + " = array()) {");
		out.println("\t\t$this->fromArray($" + unixName + ");");
		out.println("\t}");
		// generate getters and setters
		usedFields.clear();
		if (indexed) {
			out.println();
			out.println("\tpublic function get" + name + "Index() {");
			out.println("\t\treturn $this->" + unixName + "_index;");
			out.println("\t}");
			out.println();
			out.println("\tpublic function set" + name + "Index($" + unixName + "_index) {");
			out.println("\t\t$this->" + unixName + "_index = $" + unixName + "_index;");
			out.println("\t}");
		}
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);

			Hashtable<String, String> fieldValues = new Hashtable<>();
			String fieldComment = TemplateLoader.extractComment(field.getComment(), fieldValues, "F.");
			String fieldMLComment = genMultilineComment(fieldComment, "\t");
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String unixVarName = unixTransform(varName);
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
				String[] values = data.split(";");

				out.println();
				String params = genParams(data, ",");
				// with var array
				if (fieldMLComment != null)
					out.println(fieldMLComment);
				out.println("\tpublic function get" + varName + "(" + params + ") {");
				String[] paramNames = params.split(", ");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + minIndex + " || " + paramNames[i] + " > "
							+ maxIndex + ")");
					out.println("\t\t\tthrow new Exception('�ndice '." + paramNames[i]
							+ ".' inv�lido, aceito somente de " + minIndex + " at� " + maxIndex + "');");
				}
				out.println("\t\treturn $this->" + unixVarName + genArray(data) + ";");
				out.println("\t}");
				out.println();
				out.println("\tpublic function set" + varName + "(" + params + ", $value) {");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + minIndex + " || " + paramNames[i] + " > "
							+ maxIndex + ")");
					out.println("\t\t\tthrow new Exception('�ndice '." + paramNames[i]
							+ ".' inv�lido, aceito somente de " + minIndex + " at� " + maxIndex + "');");
				}
				out.println("\t\t$this->" + unixVarName + genArray(data) + " = $value;");
				out.println("\t}");
			} else {
				String unixVarName = unixTransform(varName);
				out.println();
				if (fieldMLComment != null)
					out.println(fieldMLComment);
				out.println("\tpublic function get" + varName + "() {");
				out.println("\t\treturn $this->" + unixVarName + ";");
				out.println("\t}");
				if (field.getType().isBoolean()) {
					out.println();
					if (fieldMLComment != null)
						out.println(fieldMLComment);
					out.println("\tpublic function is" + varName + "() {");
					out.println("\t\treturn $this->" + unixVarName + " == 'Y';");
					out.println("\t}");
				}
				out.println();
				out.println("\tpublic function set" + varName + "($" + unixVarName + ") {");
				out.println("\t\t$this->" + unixVarName + " = $" + unixVarName + ";");
				out.println("\t}");
			}
		}
		// generate to array function
		out.println();
		out.println("\tpublic function toArray() {");
		out.println("\t\t$" + unixName + " = array();");
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
			} else
				out.println("\t\t$" + unixName + "['" + field.getName().toLowerCase() + "'] = $this->get" + varName
						+ "();");
		}
		Enumeration<String> enumKey = usedFields.keys();
		while (enumKey.hasMoreElements()) {
			String varName = enumKey.nextElement();
			Pair<String, Field> pair = usedFields.get(varName);
			String data = pair.getFirst();
			Field field = pair.getSecond();
			String[] values = data.split(";");
			String spacing = "\t\t";
			char ch = 'i';
			String openBraces = "";
			for (int i = 0; i < values.length; i++) {
				String[] interval = values[i].split(":");
				int minIndex = Integer.valueOf(interval[0]);
				int maxIndex = Integer.valueOf(interval[1]);
				if (i < values.length - 1)
					openBraces = " {";
				else
					openBraces = "";
				out.println(spacing + "for($" + ch + " = " + minIndex + "; $" + ch + " <= " + maxIndex + "; $" + ch
						+ "++)" + openBraces);
				spacing += "\t";
				ch++;
			}
			ch = 'i';
			String sep = "";
			String varList = "";
			String strName = "'" + field.getName().toLowerCase();
			strName = strName.replaceAll("[0-9]+", "?");
			for (int i = 0; i < values.length; i++) {
				varList += sep + "$" + ch;
				sep = ", ";
				strName = strName.replaceFirst("\\?", "'.\\$" + ch);
				ch++;
			}
			out.println(spacing + "$" + unixName + "[" + strName + "] = $this->get" + varName + "(" + varList + ");");
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(2);
				if (i < values.length - 1)
					out.println(spacing + "}");
			}
		}
		out.println("\t\treturn $" + unixName + ";");
		out.println("\t}");
		// generate to array function
		out.println();
		out.println("\tpublic function fromArray($" + unixName + " = array()) {");
		out.println("\t\tif(!is_array($" + unixName + "))");
		out.println("\t\t\treturn $this;");
		usedFields.clear();
		// assign fields from array
		if (indexed)
			out.println("\t\t$this->set" + name + "Index($" + unixName + "['" + unixName + "_index']);");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
				String[] values = data.split(";");
				String spacing = "\t\t";
				char ch = 'i';
				String openBraces = "";
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					if (i < values.length - 1)
						openBraces = " {";
					else
						openBraces = "";
					out.println(spacing + "for($" + ch + " = " + minIndex + "; $" + ch + " <= " + maxIndex + "; $" + ch
							+ "++)" + openBraces);
					spacing += "\t";
					ch++;
				}
				ch = 'i';
				String sep = "";
				String varList = "";
				String strName = "'" + field.getName().toLowerCase();
				strName = strName.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					varList += sep + "$" + ch;
					sep = ", ";
					strName = strName.replaceFirst("\\?", "'.\\$" + ch);
					ch++;
				}
				out.println(
						spacing + "$this->set" + varName + "(" + varList + ", $" + unixName + "[" + strName + "]);");
				for (int i = values.length - 1; i >= 0; i--) {
					spacing = spacing.substring(2);
					if (i < values.length - 1)
						out.println(spacing + "}");
				}
			} else
				out.println(
						"\t\t$this->set" + varName + "($" + unixName + "['" + field.getName().toLowerCase() + "']);");
		}
		out.println("\t}");
		// generate array access interface implementation
		if (isArrayAccess()) {
			// array set: $class['offset'] = $value;
			out.println();
			out.println("\tpublic function offsetSet($offset, $value) {");
			out.println("\t\tswitch($offset) {");
			usedFields.clear();
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
				String params = "";
				if (isIndexed(varName)) {
					List<Integer> indexes = extractIndex(varName);
					varName = varName.replaceAll("\\[[0-9]+\\]", "");
					for (Integer integer : indexes) {
						params += integer + ", ";
					}
				}
				out.println("\t\t\tcase \"" + field.getName().toLowerCase() + "\": $this->set" + varName + "(" + params
						+ "$value);");
				out.println("\t\t\t\tbreak;");
			}
			out.println("\t\t\tdefault:");
			out.println("\t\t\t\tthrow new Exception('O campo \"'.$offset.'\" n�o existe');");
			out.println("\t\t}");
			out.println("\t}");
			// array get: echo $class['offset'];
			out.println();
			out.println("\tpublic function offsetGet($offset) {");
			out.println("\t\tswitch($offset) {");
			usedFields.clear();
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
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
				out.println("\t\t\tcase \"" + field.getName().toLowerCase() + "\":");
				out.println("\t\t\t\treturn $this->get" + varName + "(" + params + ");");
			}
			out.println("\t\t\tdefault:");
			out.println("\t\t\t\treturn null;");
			out.println("\t\t}");
			out.println("\t}");
			// array unset: unset($class['offset']);
			out.println();
			out.println("\tpublic function offsetUnset($offset) {");
			out.println("\t\t$this->offsetSet($offset, null);");
			out.println("\t}");
			// array isset: isset($class['offset']);
			out.println();
			out.println("\tpublic function offsetExists($offset) {");
			out.println("\t\t$array = $this->toArray();");
			out.println("\t\treturn isset($array[$offset]);");
			out.println("\t}");
		}
		String tblname = table.getName();
		tblname = tblname.replaceAll("[0-9]+", "");
		String tblOneName = despluralize(name).toLowerCase();
		String tblgc = getGenderChar(tblOneName);
		// access indexed table
		String paramIndexStr = "";
		if (indexed)
			paramIndexStr = "$index, ";
		String indexStr = "";
		if (indexed)
			indexStr = ".$index";
		// get from primary key or unique key
		for (Constraint constraint : table.getConstraints()) {
			if (constraint instanceof Foreign)
				continue;
			String gch = getGenderChar(normalize(constraint.getFields().get(0).getName(), false));
			String arrElem = "", sep = "", catFieldName = "", paramsFieldName = "";
			for (OrderField ofield : constraint.getFields()) {
				String fieldName = ofield.getName();
				String norField = normalize(fieldName, false).replace("][", "_").replace("[", "").replace("]", "");
				String unixField = unixTransform(norField);
				arrElem += sep + "'" + fieldName.toLowerCase() + "' => $" + unixField;
				paramsFieldName += sep + "$" + unixField;
				sep = ", ";
				catFieldName += norField;
			}
			out.println();
			out.println("\tpublic static function getPel" + gch + catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ") {");
			genSQLGetFromPrimaryKey(out, className, tblname, indexStr, arrElem);
			out.println("\t}");
		}
		// insert into table
		out.println();
		out.println("\tprivate static function validarCampos(&$" + unixName + ") {");
		out.println("\t\t$erros = array();");
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			String unixVarName = unixTransform(varName);
			String fieldName = field.getName().toLowerCase();
			String fieldNameStr = "'" + fieldName + "'";
			String ugc;
			String lgc;
			String spacing = "\t\t";
			String[] values = new String[0];
			Hashtable<String, String> fieldValues = new Hashtable<>();
			TemplateLoader.extractComment(field.getComment(), fieldValues, "F.");
			String beaultyName = TemplateLoader.recase("aa",
					TemplateLoader.getValueByIndex(fieldValues.get("F.N"), 0, field.getName()), true);
			lgc = TemplateLoader.recase("aa",
					TemplateLoader.getValueByIndex(fieldValues.get("F.G"), 0, getGenderChar(fieldName)));
			ugc = lgc.toUpperCase();
			if (indexedFields.containsKey(varName))
				continue;
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				unixVarName = unixTransform(varName);
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
				values = data.split(";");
				char ch = 'i';
				String openBraces = "";
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					openBraces = " {";
					out.println(spacing + "for($" + ch + " = " + minIndex + "; $" + ch + " <= " + maxIndex + "; $" + ch
							+ "++)" + openBraces);
					spacing += "\t";
					ch++;
				}
				ch = 'i';
				fieldNameStr = "'" + field.getName().toLowerCase();
				fieldNameStr = fieldNameStr.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					fieldNameStr = fieldNameStr.replaceFirst("\\?", "'.\\$" + ch);
					ch++;
				}
			}
			if (field.getType().getType() == DataType.STRING || field.getType().getType() == DataType.TEXT
					|| field.getType().getType() == DataType.ENUM) {
				if (skipFixField(unixVarName))
					continue;
				if (!field.isNotNull() || field.getValue() == null) {
					if (fieldValues.containsKey("F.M")) {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = unmask($" + unixName + "["
								+ fieldNameStr + "], '" + TemplateLoader.getValueByIndex(fieldValues.get("F.M"), 0, "")
								+ "');");
					} else if (!numberOnlyField(unixVarName) && canTrimField(unixVarName)
							&& field.getType().getType() != DataType.ENUM
							&& field.getType().getType() != DataType.TEXT) {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = strip_tags(trim($" + unixName
								+ "[" + fieldNameStr + "]));");
					} else if (numberOnlyField(unixVarName)) {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = number_only($" + unixName + "["
								+ fieldNameStr + "]);");
					} else {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = strval($" + unixName + "["
								+ fieldNameStr + "]);");
					}
				}
				if (skipTestField(unixVarName))
					continue;
				if (field.isNotNull()) {
					if (field.getValue() == null) {
						if (field.getType().getType() == DataType.ENUM) {
							if (field.getType().getType() == DataType.ENUM && field.getType().isBoolean()) {
								out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
								out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = 'N';");
								out.println(spacing + "else if(!in_array($" + unixName + "[" + fieldNameStr
										+ "], array(" + genEnumArray(field) + ")))");
							} else {
								out.println(spacing + "if(!in_array($" + unixName + "[" + fieldNameStr + "], array("
										+ genEnumArray(field) + ")))");
							}
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
									+ " informad" + lgc + " n�o � v�lid" + lgc + "';");
						} else if (isFunctionChecker(unixVarName)) {
							out.println(spacing + "if(!check_" + unixVarName + "($" + unixName + "[" + fieldNameStr
									+ "]))");
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + beaultyName + " inv�lid" + lgc
									+ "';");
						} else {
							out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
									+ " n�o pode ser vazi" + lgc + "';");
						}
					} else {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = trim($" + unixName + "["
								+ fieldNameStr + "]);");
						out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
						if (field.getType().getType() == DataType.ENUM && field.getType().isBoolean()) {
							out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = 'N';");
						} else {
							out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = null;");
						}
						out.println(spacing + "else if(!in_array($" + unixName + "[" + fieldNameStr + "], array("
								+ genEnumArray(field) + ")))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
								+ " informad" + lgc + " n�o � v�lid" + lgc + "';");
					}
				} else {
					out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
					if (field.getType().getType() == DataType.ENUM && field.getType().isBoolean()) {
						out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = 'N';");
					} else {

						out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = null;");
					}
					if (field.getType().getType() == DataType.ENUM) {
						out.println(spacing + "else if(!in_array($" + unixName + "[" + fieldNameStr + "], array("
								+ genEnumArray(field) + ")))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
								+ " informad" + lgc + " n�o � v�lid" + lgc + "';");
					} else if (isFunctionChecker(unixVarName)) {
						out.println(spacing + "else if(!check_" + unixVarName + "($" + unixName + "[" + fieldNameStr
								+ "]))");
						out.println(
								spacing + "\t$erros[" + fieldNameStr + "] = '" + beaultyName + " inv�lid" + lgc + "';");
					}
				}
			} else if (field.getType().getType() == DataType.INTEGER || field.getType().getType() == DataType.DOUBLE
					|| field.getType().getType() == DataType.DECIMAL || field.getType().getType() == DataType.FLOAT) {
				if (field.isAutoIncrement() || (pkName != null && pkName.equalsIgnoreCase(unixVarName)))
					continue;
				if (field.isNotNull()) {
					if (field.getValue() != null) {
						out.println(spacing + "if(!is_numeric($" + unixName + "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
								+ " n�o foi informad" + lgc + "';");
						out.println(spacing + "else");
						if (field.getType().getType() == DataType.INTEGER) {
							out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = intval($" + unixName
									+ "[" + fieldNameStr + "]);");
						} else {
							out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = floatval($" + unixName
									+ "[" + fieldNameStr + "]);");
						}
					} else {
						out.println(spacing + "if(!is_numeric($" + unixName + "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
								+ " n�o foi informad" + lgc + "';");
					}
				} else {
					out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = trim($" + unixName + "["
							+ fieldNameStr + "]);");
					out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
					out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = null;");
					out.println(spacing + "else if(!is_numeric($" + unixName + "[" + fieldNameStr + "]))");
					out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
							+ " n�o foi informad" + lgc + "';");
				}
			} else if (field.getType().getType() == DataType.DATETIME) {
				out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = date('Y-m-d H:i:s');");
			} else if (field.getType().getType() == DataType.DATE) {
				out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = date('Y-m-d');");
			} else if (field.getType().getType() == DataType.TIME) {
				out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = date('H:i:s');");
			} else if (field.getType().getType() == DataType.BLOB) {
				out.println(spacing + "if($" + unixName + "[" + fieldNameStr + "] === '')");
				out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = null;");
			}
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(1);
				out.println(spacing + "}");
			}
		}
		out.println("\t\tif(!empty($erros))");
		out.println("\t\t\tthrow new ValidationException($erros);");
		out.println("\t}");
		if (uKey != null) {
			String gch = getGenderChar(normalize(uKey.getFields().get(0).getName(), false));
			String orSep = "", sep = "", catFieldName = "", ukGetParams = "", paramsFieldName = "", arrElem = "",
					checkNullField = "", checkNullVars = "";
			for (OrderField oField : uKey.getFields()) {
				String fieldName = oField.getName();
				String norField = normalize(fieldName, false);
				String unixField = unixTransform(norField);
				ukGetParams += sep + "$_" + unixName + "['" + fieldName.toLowerCase() + "']";
				paramsFieldName += sep + "$" + unixField;
				checkNullVars += orSep + "!$" + unixField;
				checkNullField += orSep + "!$_" + unixName + "['" + fieldName.toLowerCase() + "']";
				arrElem += sep + "'" + fieldName.toLowerCase() + "' => $" + unixField;
				catFieldName += norField;
				sep = ", ";
				orSep = " || ";
			}
			// handle exception
			out.println();
			out.println("\tprivate static function handleException(&$e) {");
			// get from primary key or unique key
			for (Constraint constraint : table.getConstraints()) {
				if (constraint instanceof Foreign)
					continue;
				OrderField orderField = constraint.getFields().get(constraint.getFields().size() - 1);
				Field oField = table.find(orderField.getName());
				String beaultyNameF = despluralize(normalize(orderField.getName(), false));
				Hashtable<String, String> fieldValues = new Hashtable<>();
				TemplateLoader.extractComment(oField.getComment(), fieldValues, "F.");
				beaultyNameF = TemplateLoader.recase("aa",
						TemplateLoader.getValueByIndex(fieldValues.get("F.N"), 0, oField.getName()), true);
				String lgcf;
				String ugcf;
				lgcf = TemplateLoader.recase("aa",
						TemplateLoader.getValueByIndex(fieldValues.get("F.G"), 0, getGenderChar(beaultyNameF)));
				ugcf = lgcf.toUpperCase();
				out.println("\t\tif(stripos($e->getMessage(), '" + constraint.getName() + "') !== false)");
				out.println("\t\t\tthrow new ValidationException(array('" + orderField.getName().toLowerCase()
						+ "' => '" + ugcf + " " + beaultyNameF + " informad" + lgcf + " j� est� cadastrad" + lgcf
						+ "'));");
			}
			out.println("\t}");
			// cadastrar
			out.println();
			out.println("\tpublic static function cadastrar($" + unixName + ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName + "->toArray();");
			out.println("\t\tself::validarCampos($_" + unixName + ");");
			out.println("\t\ttry {");
			genSQLInsert(out, tblname, indexStr, pkName, unixName);
			out.println("\t\t} catch (Exception $e) {");
			out.println("\t\t\tself::handleException($e);");
			out.println("\t\t\tthrow $e;");
			out.println("\t\t}");
			out.println("\t\treturn self::getPel" + gch + catFieldName + "(" + ukGetParams + ");");
			out.println("\t}");
			// atualizar
			out.println();
			out.println("\tpublic static function atualizar($" + unixName + ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName + "->toArray();");
			if (pkName != null) {
				out.println("\t\tif(" + checkNullField + ")");
				out.println("\t\t\tthrow new ValidationException(array('" + pkName.toLowerCase() + "' => 'O id d"
						+ tblgc + " " + tblOneName + " n�o foi informado'));");
			}
			out.println("\t\tself::validarCampos($_" + unixName + ");");
			usedFields.clear();
			out.println("\t\t$campos = array(");
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
				String unixVarName = unixTransform(varName);
				if (skipUpdateField(unixVarName) || field.getType().getType() == DataType.BLOB)
					continue;
				if (indexedFields.containsKey(varName))
					continue;
				if (isIndexed(varName)) {
					varName = varName.replaceAll("\\[[0-9]+\\]", "");
					if (usedFields.containsKey(varName))
						continue;
					String data = indexedFields.get(varName);
					usedFields.put(varName, new Pair<String, Field>(data, field));
				} else {
					if (field.isAutoIncrement() || (pkName != null && pkName.equalsIgnoreCase(unixVarName)))
						continue;
					out.println("\t\t\t'" + field.getName().toLowerCase() + "',");
				}
			}
			out.println("\t\t);");
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
				String unixVarName = unixTransform(varName);
				if (skipUpdateField(unixVarName) || field.getType().getType() != DataType.BLOB)
					continue;
				if (indexedFields.containsKey(varName))
					continue;
				if (isIndexed(varName)) {
					varName = varName.replaceAll("\\[[0-9]+\\]", "");
					if (usedFields.containsKey(varName))
						continue;
					String data = indexedFields.get(varName);
					usedFields.put(varName, new Pair<String, Field>(data, field));
				} else {
					if (field.isAutoIncrement() || (pkName != null && pkName.equalsIgnoreCase(unixVarName)))
						continue;
					out.println("\t\tif($_" + unixName + "['" + field.getName().toLowerCase() + "'] !== true)");
					out.println("\t\t\t$campos[] = '" + field.getName().toLowerCase() + "';");
				}
			}
			enumKey = usedFields.keys();
			while (enumKey.hasMoreElements()) {
				String varName = enumKey.nextElement();
				Pair<String, Field> pair = usedFields.get(varName);
				String data = pair.getFirst();
				Field field = pair.getSecond();
				String[] values = data.split(";");
				String spacing = "\t\t";
				char ch = 'i';
				String openBraces = "";
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					if (i < values.length - 1)
						openBraces = " {";
					else
						openBraces = "";
					out.println(spacing + "for($" + ch + " = " + minIndex + "; $" + ch + " <= " + maxIndex + "; $" + ch
							+ "++)" + openBraces);
					spacing += "\t";
					ch++;
				}
				ch = 'i';
				String strName = "'" + field.getName().toLowerCase();
				strName = strName.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					strName = strName.replaceFirst("\\?", "'.\\$" + ch);
					ch++;
				}
				out.println(spacing + "$campos[] = " + strName + ";");
				for (int i = values.length - 1; i >= 0; i--) {
					spacing = spacing.substring(2);
					if (i < values.length - 1)
						out.println(spacing + "}");
				}
			}
			out.println("\t\ttry {");
			genSQLUpdate(out, tblname, indexStr, ukNames, unixName);
			out.println("\t\t} catch (Exception $e) {");
			out.println("\t\t\tself::handleException($e);");
			out.println("\t\t\tthrow $e;");
			out.println("\t\t}");
			out.println("\t\treturn self::getPel" + gch + catFieldName + "(" + ukGetParams + ");");
			out.println("\t}");
			out.println();
			out.println("\tpublic static function excluir(" + paramIndexStr + paramsFieldName + ") {");
			out.println("\t\tif(" + checkNullVars + ")");
			out.println("\t\t\tthrow new Exception('N�o foi poss�vel excluir " + tblgc + " " + tblOneName + ", o id d"
					+ tblgc + " " + tblOneName + " n�o foi informado');");
			genSQLDelete(out, tblname, indexStr, arrElem);
			out.println("\t}");
		}
		boolean oneId = false;
		// get all data from table
		if (pkName != null) {
			DataType dataType = table.find(pkName).getType();
			if (dataType instanceof EnumType && ((EnumType) dataType).getElements().size() == 1)
				oneId = true;
		}
		if (!oneId) {
			out.println();
			out.println("\tprivate static function initSearch(" + paramIndexStr + ") {");
			genSQLGetTodos(out, tblname, indexStr, pkName, unixName);
			out.println("\t}");
			out.println();
			out.println("\tpublic static function " + getAllFunctionName(name) + "(" + paramIndexStr
					+ "$inicio = null, $quantidade = null) {");
			out.println("\t\t$query = self::initSearch(" + paramIndexStr + ");");
			genSQLLimit(out, tblname, indexStr, unixName);
			out.println("\t\t$" + unixName + "s = array();");
			out.println("\t\tforeach($_" + unixName + "s as $" + unixName + ")");
			out.println("\t\t\t$" + unixName + "s[] = new " + className + "($" + unixName + ");");
			out.println("\t\treturn $" + unixName + "s;");
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getCount(" + paramIndexStr + ") {");
			out.println("\t\t$query = self::initSearch(" + paramIndexStr + ");");
			genSQLgetCount(out, tblname, indexStr, unixName);
			out.println("\t}");
		}

		// get from primary key or unique key
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof Foreign))
				continue;
			String gch = getGenderChar(normalize(constraint.getFields().get(0).getName(), false));
			String arrElem = "", sep = "", catFieldName = "", paramsFieldName = "";
			for (OrderField ofield : constraint.getFields()) {
				String fieldName = ofield.getName();
				String norField = normalize(fieldName, false);
				String unixField = unixTransform(norField);
				arrElem += sep + "'" + fieldName.toLowerCase() + "' => $" + unixField;
				paramsFieldName += sep + "$" + unixField;
				sep = ", ";
				catFieldName += norField;
			}
			out.println();
			out.println("\tprivate static function initSearchD" + gch + catFieldName + "(" + paramIndexStr
					+ paramsFieldName + ") {");
			genSQLGetTodosFk(out, tblname, indexStr, pkName, unixName, arrElem);
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getTod" + tblgc + "sD" + gch + catFieldName + "(" + paramIndexStr
					+ paramsFieldName + ", $inicio = null, $quantidade = null) {");
			out.println("\t\t$query = self::initSearchD" + gch + catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ");");
			genSQLLimit(out, tblname, indexStr, unixName);
			out.println("\t\t$" + unixName + "s = array();");
			out.println("\t\tforeach($_" + unixName + "s as $" + unixName + ")");
			out.println("\t\t\t$" + unixName + "s[] = new " + className + "($" + unixName + ");");
			out.println("\t\treturn $" + unixName + "s;");
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getCountD" + gch + catFieldName + "(" + paramIndexStr
					+ paramsFieldName + ") {");
			out.println("\t\t$query = self::initSearchD" + gch + catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ");");
			genSQLgetCount(out, tblname, indexStr, unixName);
			out.println("\t}");
		}
		out.println();
	}

	protected abstract void genSQLgetCount(PrintWriter out, String tblname, String indexStr, String unixName);

	protected abstract void genSQLLimit(PrintWriter out, String tblname, String indexStr, String unixName);

	protected abstract void genSQLGetTodos(PrintWriter out, String tblname, String indexStr, String pkName,
			String unixName);

	protected abstract void genSQLGetTodosFk(PrintWriter out, String tblname, String indexStr, String pkName,
			String unixName, String arrElem);

	protected abstract void genSQLUpdate(PrintWriter out, String tblname, String indexStr, List<String> ukNames,
			String unixName);

	protected abstract void genSQLInsert(PrintWriter out, String tblname, String indexStr, String pkName,
			String unixName);

	protected abstract void genSQLDelete(PrintWriter out, String tblname, String indexStr, String arrElem);

	protected abstract void genSQLGetFromPrimaryKey(PrintWriter out, String className, String tblname, String indexStr,
			String arrElem);

	@Override
	public void genFooter(PrintWriter out, Table table, String name, boolean indexed) {
		out.println("}");
		if (isProccessTemplate())
			runTemplate(table, name, indexed);
	}

	@Override
	public String getNameWithExtension(String name) {
		return getClassName(name) + ".class.php";
	}

	protected String getClassName(String name) {
		return getClassPrefix() + name + getClassSuffix();
	}

	public void setProccessTemplate(boolean proccessTemplate) {
		this.proccessTemplate = proccessTemplate;
	}

	private void runTemplate(Table table, String name, boolean indexed) {
		Hashtable<String, String> values = new Hashtable<>();
		TemplateLoader.extractComment(table.getComment(), values, "T.");
		File outDir = new File(getOutputDirectory());
		for (File file : templateLoader.getFiles()) {
			File tempFile = templateLoader.rebase(file, outDir);
			File destFile = new File(applyTemplate(tempFile.getAbsolutePath(), table, name, null, values, 0));
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
					fileContent = applyTemplate(oldContent + fileContent, table, name, null, values, 0);
					FileUtils.writeStringToFile(destFile, fileContent, charset);
				} catch (IOException e) {
					log(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

	private String applyTemplate(String source, Table table, String name, Field field, Hashtable<String, String> values,
			int eachIndex) {
		String className = getClassName(name);
		String nameWithExt = getNameWithExtension(name);
		String unixName = unixTransform(name);
		String result = source, command = "", option = "";
		Stack<Integer> offsetStack = new Stack<>();
		Stack<String> condStack = new Stack<>();
		Stack<String> stmtStack = new Stack<>();
		int state = 0, startoffset, offset = 0;
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
					if (state > 2)
						option += source.charAt(i);
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
					if (option.startsWith("each") || option.startsWith("if") || option.startsWith("exists")) { // field.if
																												// or
																												// table.if
																												// or
																												// table.exists,
																												// field.each
																												// or
																												// table.each
						if (i + 1 < source.length() && source.charAt(i + 1) == '\r') {
							i++;
							if (i + 1 < source.length() && source.charAt(i + 1) == '\n')
								i++;
						} else if (i + 1 < source.length() && source.charAt(i + 1) == '\n')
							i++;
						offsetStack.push(startoffset + offset);
						String filter;
						if (option.startsWith("each")) {
							stmtStack.push("each");
							filter = option.replaceFirst("each\\(([^\\)]+)\\)", "$1");
						} else if (option.startsWith("if")) {
							stmtStack.push("if");
							filter = option.replaceFirst("if\\(([^\\)]+)\\)", "$1");
						} else {
							stmtStack.push("exists");
							filter = option.replaceFirst("exists\\(([^\\)]+)\\)", "$1");
						}
						condStack.push(filter);
						if (offsetStack.size() > 1)
							replace = source.substring(startoffset, i + 1);
					} else if (option.equals("end") || option.startsWith("else")) { // field.end
																					// or
																					// table.end,
																					// field.else.[if(filter)]
																					// or
																					// table.else.[if(filter)]
						if (i + 1 < source.length() && source.charAt(i + 1) == '\r') {
							i++;
							if (i + 1 < source.length() && source.charAt(i + 1) == '\n')
								i++;
						} else if (i + 1 < source.length() && source.charAt(i + 1) == '\n')
							i++;
						if (!offsetStack.empty()) {
							int oldstartoffset = startoffset;
							String cmd = source.substring(startoffset, i + 1);
							String stmt = stmtStack.pop();
							startoffset = offsetStack.pop() - offset;
							String filter = condStack.pop();
							String eachContent = result.substring(startoffset + offset, oldstartoffset + offset);
							if (!offsetStack.empty()) {
								replace = eachContent + cmd;
								if (option.startsWith("else")) {
									if (option.equals("else")) // field.else or
																// table.else
										filter = "";
									else if (option.startsWith("else.if"))
										filter = option.replaceFirst("else.if\\(([^\\)]+)\\)", "$1"); // field.else.if(filter)
																										// or
																										// table.else.if(filter)
									else if (option.startsWith("else.exists"))
										filter = option.replaceFirst("else.exists\\(([^\\)]+)\\)", "$1"); // table.else.exists(filter)
									offsetStack.push(oldstartoffset + offset);
									if (option.startsWith("else.exists"))
										stmtStack.push("exists");
									else
										stmtStack.push("if");
									condStack.push(filter);
								}
							} else if (stmt.equals("if") || stmt.equals("exists")) { // field.if
																						// or
																						// table.if
								boolean doReplace = filter == null;
								if (!doReplace) {
									String[] filters = filter.split("\\|");
									for (String uFilter : filters) {
										if (stmt.equals("exists")) {
											Hashtable<String, String> tableValues = new Hashtable<>();
											Hashtable<String, String> fieldValues = new Hashtable<>();
											TemplateLoader.extractComment(table.getComment(), tableValues, "T.");
											for (Field afield : table.getFields()) {
												fieldValues.clear();
												fieldValues.putAll(tableValues);
												TemplateLoader.extractComment(afield.getComment(), fieldValues, "F.");
												if (uFilter.equals(TemplateLoader.getTypeNameFromType(table, afield))) {
													doReplace = true;
													break;
												}
												if (hasAttribute(command, table, afield, uFilter, fieldValues,
														eachIndex)) {
													doReplace = true;
													break;
												}
											}
										} else if (field != null && uFilter
												.equals(TemplateLoader.getTypeNameFromType(table, field))) {
											doReplace = true;
										} else if (hasAttribute(command, table, field, uFilter, values, eachIndex)) {
											doReplace = true;
										}
										if (doReplace)
											break;
									}
								}
								if (doReplace) {
									replace = applyTemplate(eachContent, table, name, field, values, eachIndex);
									if (!option.equals("end")) {
										offsetStack.push(
												oldstartoffset + offset - eachContent.length() + replace.length());
										stmtStack.push("if");
										condStack.push("");
									}
								} else if (option.startsWith("else")) {
									if (option.equals("else") && !filter.isEmpty())
										filter = null;
									else if (option.startsWith("else.if") && !filter.isEmpty())
										filter = option.replaceFirst("else.if\\(([^\\)]+)\\)", "$1");
									else if (option.startsWith("else.exists") && !filter.isEmpty())
										filter = option.replaceFirst("else.exists\\(([^\\)]+)\\)", "$1");
									offsetStack.push(oldstartoffset + offset - eachContent.length());
									if (option.startsWith("else.exists"))
										stmtStack.push("exists");
									else
										stmtStack.push("if");
									condStack.push(filter);
								}
							} else if (filter.equals("option")) { // field.each(option)
								if (field != null && field.getType() instanceof EnumType) {
									EnumType enumType = (EnumType) field.getType();
									for (int index = 0; index < enumType.getElements().size(); index++) {
										replace += applyTemplate(eachContent, table, name, field, values, index);
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
									replace += applyTemplate(replContent, table, name, field, values, eachIndex);
								}
							} else if (command.equalsIgnoreCase("field")) { // field.each[(filter)]
								int index = 0;
								Field pkField = getPkField(table);
								for (Field afield : table.getFields()) {
									Hashtable<String, String> fieldValues = new Hashtable<>();
									fieldValues.putAll(values);
									TemplateLoader.extractComment(afield.getComment(), fieldValues, "F.");
									if (!filter.equals("all") && (afield == pkField || fieldValues.containsKey("F.D")))
										continue;
									if (filter.equals("reference") && table.getReference(afield.getName()) == null)
										continue;
									if (filter.equals("search") && !values.containsKey("F.S"))
										continue;
									replace += applyTemplate(eachContent, table, name, afield, fieldValues, index);
									index++;
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
								File fileField = TemplateLoader.getFileForField(table, field, values);
								String fileContent = FileUtils.readFileToString(fileField, detectEncoding(fileField));
								replace = applyTemplate(fileContent, table, name, field, values, 0);
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
										replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(
												values.get("F.E"), eachIndex, elements.get(eachIndex)), true);
									else if (option.equals("option.unix"))
										replace = unixTransform(elements.get(eachIndex));
									else if (option.equals("option.norm"))
										replace = TemplateLoader.recase(command, normalized(elements.get(eachIndex)));
									else if (option.equals("option.index"))
										replace = String.valueOf(eachIndex);
									else
										replace = elements.get(eachIndex);
								}
							}
						} else if (option.equals("mask")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.M"), 0, "");
						} else if (option.equals("style")) {
							replace = TemplateLoader.recase(command,
									TemplateLoader.getValueByIndex(values.get("F.L"), 0, ""));
						} else if (option.equals("image.width") || option.equals("image.height")) {
							String value = TemplateLoader.getValueByIndex(values.get("F.I"), 0, "64x64");
							if (option.equals("image.width") || value.split("x").length < 2)
								value = value.split("x")[0];
							else
								value = value.split("x")[1];
							replace = TemplateLoader.recase(command, value);
						} else if (option.equals("image.folder")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.I"), 1, unixName);
						} else if (option.equals("image.default")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.I"), 2, "");
						} else if (option.equals("gender")) {
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.G"),
									0, getGenderChar(despluralize(field.getName()).toLowerCase())));
						} else {
							String varName = normalized(field.getName());
							if (option.equals("unix"))
								replace = TemplateLoader.getValueByIndex(values.get("F.U"), 0, unixTransform(varName));
							else if (option.equals("norm"))
								replace = varName;
							else if (option.equals("chars"))
								replace = firstLetters(varName);
							else if (option.equals("comment"))
								replace = TemplateLoader.extractComment(field.getComment());
							else if (option.equals("name"))
								replace = TemplateLoader.recase(command,
										TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName()), true);
							else if (option.equals("array.count")) {
								if (!indexedFields.containsKey(varName))
									log(String.format("Field '%s' of table '%s' is not an array", field.getName(),
											table.getName()));
								else {
									String[] indexes = indexedFields.get(varName).split(";");
									indexes = indexes[0].split(":");
									replace = String.valueOf(Integer.parseInt(indexes[indexes.length - 1])
											- Integer.parseInt(indexes[0]) + 1);
								}
							} else if (option.equals("info")) {
								replace = TemplateLoader.recase(command,
										TemplateLoader.getValueByIndex(values.get("F.F"), 0,
												TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName())));
							} else if (option.equals("get")) {
								replace = getFunctionSuffix(field, "get");
							} else if (option.equals("set")) {
								replace = getFunctionSuffix(field, "set");
							} else
								replace = TemplateLoader.recase(command, field.getName());
						}
					} else if (command.equalsIgnoreCase("primary")) {
						Field pkField = getPkField(table);
						Hashtable<String, String> refValues = new Hashtable<>();
						TemplateLoader.extractComment(table.getComment(), refValues, "T.");
						if(pkField != null) {
							TemplateLoader.extractComment(pkField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + TemplateLoader.recase(command, "fIeld")
									+ (option.isEmpty() ? "" : ".") + option + "]", table, name, pkField, refValues, eachIndex);
						}
					} else if (command.equalsIgnoreCase("descriptor")) {
						Field descField = getDescField(table);
						Hashtable<String, String> refValues = new Hashtable<>();
						TemplateLoader.extractComment(table.getComment(), refValues, "T.");
						if(descField != null) {
							TemplateLoader.extractComment(descField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + TemplateLoader.recase(command, "fIeld")
									+ (option.isEmpty() ? "" : ".") + option + "]", table, name, descField, refValues, eachIndex);
						}
					} else if (command.equalsIgnoreCase("table")) {
						Field pkField = getPkField(table);
						Field descField = getDescField(table);

						if (option.startsWith("class")) {
							replace = applyTemplate("$[" + option + "]", table, name, field, values, eachIndex);
						} else if (option.equals("gender"))
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("T.G"),
									0, getGenderChar(despluralize(name).toLowerCase())));
						else if (option.equals("name"))
							replace = TemplateLoader.recase(command,
									TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name)), true);
						else if (option.equals("name.plural"))
							replace = TemplateLoader.recase(command,
									TemplateLoader.getValueByIndex(values.get("T.N"), 1, despluralize(name) + "s"),
									true);
						else if (option.equals("info"))
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("T.F"),
									0, TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name))));
						else if (option.equals("unix"))
							replace = TemplateLoader.getValueByIndex(values.get("F.U"), 0, unixName);
						else if (option.equals("norm"))
							replace = name;
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
							replace = TemplateLoader
									.getValueByIndex(values.get("F.U"), 1,
											unixTransform(normalize(
													TemplateLoader.getValueByIndex(values.get("T.N"), 1, name + "s"),
													false)));
						else if (option.startsWith("pk") && pkField != null) {
							Hashtable<String, String> refValues = new Hashtable<>();
							TemplateLoader.extractComment(table.getComment(), refValues, "T.");
							TemplateLoader.extractComment(pkField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + TemplateLoader.recase(command, "fIeld")
									+ option.replaceFirst("pk", "") + "]", table, name, pkField, refValues, eachIndex);
						} else if (option.startsWith("desc") && descField != null) {
							Hashtable<String, String> refValues = new Hashtable<>();
							TemplateLoader.extractComment(table.getComment(), refValues, "T.");
							TemplateLoader.extractComment(descField.getComment(), refValues, "F.");
							replace = applyTemplate("$[" + TemplateLoader.recase(command, "fIeld")
									+ option.replaceFirst("desc", "") + "]", table, name, descField, refValues, eachIndex);
						} else if (option.equals("style"))
							replace = TemplateLoader.recase(command,
									TemplateLoader.getValueByIndex(values.get("T.L"), 0, ""));
						else
							replace = table.getName();
					} else if (command.equalsIgnoreCase("reference")) {
						if (field != null) {
							Table refTable = findTable(table.getReference(field.getName()));
							if (refTable != null) {
								Hashtable<String, String> refValues = new Hashtable<>();
								TemplateLoader.extractComment(refTable.getComment(), refValues, "T.");
								String refName = normalize(refTable.getName());
								replace = applyTemplate("$[" + TemplateLoader.recase(command, "tAble")
										+ (option.isEmpty() ? "" : ".") + option + "]", refTable, refName, null,
										refValues, 0);
							}
						}
					} else if (command.equals("class")) {
						if (option.equals("file"))
							replace = nameWithExt;
						else if (option.equals("get"))
							replace = getPKFunctionName(table);
						else if (option.equals("get.all"))
							replace = getAllFunctionName(name);
						else
							replace = className;
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

	private boolean hasAttribute(String command, Table table, Field field, String filter,
			Hashtable<String, String> values, int eachIndex) {
		if (command.equalsIgnoreCase("table")) {
			switch (filter) {
			case "comment":
				String comment = TemplateLoader.extractComment(table.getComment());
				return comment != null && !comment.isEmpty();
			}
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
			Field pkField = getPkField(table);
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
		case "first":
			return eachIndex == 0;
		case "comment":
			String comment = TemplateLoader.extractComment(field.getComment());
			return comment != null && !comment.isEmpty();
		case "repeated":
			if (!indexedFields.containsKey(normName))
				break;
			List<Integer> nameIndexes = extractIndex(normalize(field.getName(), false));
			String[] indexes = indexedFields.get(normName).split(";");
			indexes = indexes[0].split(":");
			return nameIndexes.get(0) != Integer.parseInt(indexes[0]);
		}
		return false;
	}

	private static String getAllFunctionName(String name) {
		String tblOneName = despluralize(name).toLowerCase();
		String tblgc = getGenderChar(tblOneName);
		return "getTod" + tblgc + "s";
	}

	private String getPKFunctionName(Table table) {
		PrimaryKey constraint = getPrimaryKey(table);
		if (constraint == null)
			return "getPeloID";
		String gch = getGenderChar(normalize(constraint.getFields().get(0).getName(), false));
		String catFieldName = "";
		for (OrderField ofield : constraint.getFields()) {
			String fieldName = ofield.getName();
			String norField = normalize(fieldName, false).replace("][", "_").replace("[", "").replace("]", "");
			catFieldName += norField;
		}
		return "getPel" + gch + catFieldName;
	}

	private static String getFunctionSuffix(Field field, String preffix) {
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

}
