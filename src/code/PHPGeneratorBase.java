package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.Pair;
import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.Foreign;
import ast.OrderField;
import ast.ScriptNode;
import ast.Table;

public abstract class PHPGeneratorBase extends CodeGenerator {

	private static final String[] indexNames = { "$linha", "$coluna" };

	public PHPGeneratorBase(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	/**
	 * Compact field from Field, Field1, Field2 to Field[1..3]
	 * 
	 * @param table
	 *            table with fields
	 * @param indexedFields
	 *            array fields with key as name and value as interval list
	 *            separated with semicolon, example: 1:2;1:3, multidimensional
	 *            array with bounds 1 to 2 and 1 to 3
	 */
	private void processArray(Table table,
			Hashtable<String, String> indexedFields) {
		List<Field> normalFields = new ArrayList<>();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (!varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					&& !varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				normalFields.add(field);
				continue;
			}
			Matcher m = Pattern.compile("^[a-zA-Z]+\\[([0-9]+)\\]$").matcher(
					varName);
			if (!m.find()) {
				m = Pattern.compile("^[a-zA-Z]+\\[([0-9]+)\\]\\[([0-9]+)\\]$")
						.matcher(varName);
				m.find();
			}
			System.out.println(varName + " Match count: " + m.groupCount());
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			String semicolon = "";
			String newData = "";
			if (indexedFields.containsKey(varName)) {
				String data = indexedFields.get(varName);
				String[] values = data.split(";");
				for (int i = 0; i < values.length; i++) {
					String string = values[i];
					String indexStr = m.group(i + 1);
					int index = Integer.valueOf(indexStr);
					String[] interval = string.split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					if (minIndex > index || maxIndex < index) {
						if (minIndex > index)
							minIndex = index;
						else
							maxIndex = index;
					}
					newData += semicolon + minIndex + ":" + maxIndex;
					semicolon = ";";
				}
				if (!newData.equals(data))
					indexedFields.put(varName, newData);
				continue;
			}
			for (int i = 0; i < m.groupCount(); i++) {
				String indexStr = m.group(i + 1);
				newData += semicolon + indexStr + ":" + indexStr;
				semicolon = ";";
			}
			indexedFields.put(varName, newData);
		}
		// increment array for fields with same name
		for (Field field : normalFields) {
			String varName = normalize(field.getName(), false);
			if (!indexedFields.containsKey(varName))
				continue;
			String data = indexedFields.get(varName);
			String[] values = data.split(";");
			String semicolon = "";
			String newData = "";
			for (int i = 0; i < values.length; i++) {
				String string = values[i];
				String[] interval = string.split(":");
				int minIndex = Integer.valueOf(interval[0]);
				int maxIndex = Integer.valueOf(interval[1]);
				if (i == values.length - 1)
					maxIndex++;
				newData += semicolon + minIndex + ":" + maxIndex;
				semicolon = ";";
			}
			indexedFields.put(varName, newData);
		}
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

	@Override
	public void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
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
		out.println("class " + getClassName(name) + " {");
	}

	private String genEnum(String name, Field field) {
		if (field.getType().getType() != DataType.ENUM)
			return null;
		EnumType type = (EnumType) field.getType();
		if (type.getElements().size() == 2
				&& ((type.getElements().get(0).equals("Y") && type
						.getElements().get(1).equals("N")) || (type
						.getElements().get(0).equals("N") && type.getElements()
						.get(1).equals("Y"))))
			return null;
		if (type.getElements().size() == 1
				&& type.getElements().get(0).matches("[0-9]+"))
			return null;
		String enumItems = "";
		for (String item : type.getElements()) {
			enumItems += "\tconst " + normalize(item, false).toUpperCase()
					+ " = '" + item + "';\n";
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
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		Hashtable<String, String> indexedFields = new Hashtable<>();
		Hashtable<String, Pair<String, Field>> usedFields = new Hashtable<>();
		String unixName = unixTransform(name);
		String className = getClassName(name);
		processArray(table, indexedFields);
		// generate variables
		if (indexed)
			out.println("\tprivate $" + unixName + "_index;");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				String varDecl = "\tprivate $" + unixTransform(varName)
						+ " = array();";
				out.println(varDecl);
				usedFields.put(varName, new Pair<String, Field>(data, field));
			} else
				out.println("\tprivate $" + unixTransform(varName) + ";");
		}
		out.println();
		// generate constructor
		out.println("\tpublic function __construct($" + unixName
				+ " = array()) {");
		out.println("\t\tif(is_array($" + unixName + ")) {");
		usedFields.clear();
		// assign fields from array
		if (indexed)
			out.println("\t\t\t$this->set" + name + "Index($" + unixName + "['"
					+ unixName + "_index']);");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
				String[] values = data.split(";");
				String spacing = "\t\t\t";
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
					out.println(spacing + "for($" + ch + " = " + minIndex
							+ "; $" + ch + " <= " + maxIndex + "; $" + ch + "++)" + openBraces);
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
				out.println(spacing + "$this->set" + varName + "(" + varList + ", $" + unixName
						+ "[" + strName + "]);");
				for (int i = values.length - 1; i >= 0; i--) {
					spacing = spacing.substring(2);
					if (i < values.length - 1)
						out.println(spacing + "}");
				}
			} else
				out.println("\t\t\t$this->set" + varName + "($" + unixName
						+ "['" + field.getName().toLowerCase() + "']);");
		}
		out.println("\t\t}");
		out.println("\t}");
		// generate getters and setters
		usedFields.clear();
		if (indexed) {
			out.println();
			out.println("\tpublic function get" + name + "Index() {");
			out.println("\t\treturn $this->" + unixName + "_index;");
			out.println("\t}");
			out.println();
			out.println("\tpublic function set" + name + "Index($" + unixName
					+ "_index) {");
			out.println("\t\t$this->" + unixName + "_index = $" + unixName
					+ "_index;");
			out.println("\t}");
		}
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
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
				out.println("\tpublic function get" + varName + "(" + params
						+ ") {");
				String[] paramNames = params.split(", ");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + minIndex
							+ " || " + paramNames[i] + " > " + maxIndex + ")");
					out.println("\t\t\tthrow new Exception('Índice '." + paramNames[i] + ".' inválido, aceito somente de " + minIndex + " até " + maxIndex + "');");
				}
				out.println("\t\treturn $this->" + unixVarName + genArray(data)
						+ ";");
				out.println("\t}");
				out.println();
				out.println("\tpublic function set" + varName + "(" + params
						+ ", $value) {");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + minIndex
							+ " || " + paramNames[i] + " > " + maxIndex + ")");
					out.println("\t\t\tthrow new Exception('Índice '." + paramNames[i] + ".' inválido, aceito somente de " + minIndex + " até " + maxIndex + "');");
				}
				out.println("\t\t$this->" + unixVarName + genArray(data)
						+ " = $value;");
				out.println("\t}");
			} else {
				String unixVarName = unixTransform(varName);
				out.println();
				out.println("\tpublic function get" + varName + "() {");
				out.println("\t\treturn $this->" + unixVarName + ";");
				out.println("\t}");
				if(isBooleanField(field)) {
					out.println();
					out.println("\tpublic function is" + varName + "() {");
					out.println("\t\treturn $this->" + unixVarName + " == 'Y';");
					out.println("\t}");
				}
				out.println();
				out.println("\tpublic function set" + varName + "($"
						+ unixVarName + ") {");
				out.println("\t\t$this->" + unixVarName + " = $" + unixVarName
						+ ";");
				out.println("\t}");
			}
		}
		out.println();
		// generate to array function
		out.println("\tpublic function toArray() {");
		out.println("\t\t$" + unixName + " = array();");
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
			} else
				out.println("\t\t$" + unixName + "['" + field.getName().toLowerCase()
						+ "'] = $this->get" + varName + "();");
		}
		Enumeration<String> enumKey = usedFields.keys();
		while(enumKey.hasMoreElements()) {
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
				out.println(spacing + "for($" + ch + " = " + minIndex
						+ "; $" + ch + " <= " + maxIndex + "; $" + ch + "++)" + openBraces);
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
		// check for id field
		String idName = null;
		for (Constraint constraint : table.getConstraints()) {
			if (constraint instanceof Foreign)
				continue;
			if (constraint.getFields().size() > 1)
				continue;
			idName = constraint.getFields().get(0).getName();
			break;
		}
		// get from primary key or unique key
		for (Constraint constraint : table.getConstraints()) {
			if (constraint instanceof Foreign)
				continue;
			if (constraint.getFields().size() > 2)
				continue;
			String gch = getGenderChar(normalize(constraint.getFields().get(0)
					.getName(), false));
			String arrElem = "", sep = "", catFieldName = "", paramsFieldName = "";
			for (OrderField ofield : constraint.getFields()) {
				String fieldName = ofield.getName().toLowerCase();
				String norField = normalize(fieldName, false);
				String unixField = unixTransform(norField);
				arrElem += sep + "'" + fieldName + "' => $" + unixField;
				paramsFieldName += sep + "$" + unixField;
				sep = ", ";
				catFieldName += norField;
			}
			out.println();
			out.println("\tpublic static function getPel" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ") {");
			genSQLGetFromPrimaryKey(out, className, tblname, indexStr, arrElem);
			out.println("\t}");
		}
		// insert into table
		out.println();
		out.println("\tprivate static function validarCampos(&$" + unixName
				+ ") {");
		out.println("\t\t$erros = array();");
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			String unixVarName = unixTransform(varName);
			String fieldName = field.getName().toLowerCase();
			String fieldNameStr = "'" + fieldName + "'";
			String ugc = getGenderChar(fieldName).toUpperCase();
			String lgc = getGenderChar(fieldName).toLowerCase();
			String spacing = "\t\t";
			String[] values = new String[0];
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
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
					out.println(spacing + "for($" + ch + " = " + minIndex
							+ "; $" + ch + " <= " + maxIndex + "; $" + ch + "++)" + openBraces);
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
			if (field.getType().getType() == DataType.STRING
					|| field.getType().getType() == DataType.TEXT
					|| field.getType().getType() == DataType.ENUM) {
				if (skipFixField(unixVarName))
					continue;
				if (!field.isNotNull() || field.getValue() == null) {
					if (!numberOnlyField(unixVarName) && canTrimField(unixVarName)
							&& field.getType().getType() != DataType.ENUM && field.getType().getType() != DataType.TEXT) {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr
								+ "] = strip_tags(trim($" + unixName + "["
								+ fieldNameStr + "]));");
					} else if(numberOnlyField(unixVarName)) {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr
								+ "] = number_only($" + unixName + "["
								+ fieldNameStr + "]);");
					} else {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr
								+ "] = strval($" + unixName + "["
								+ fieldNameStr + "]);");
					}
				}
				if (skipTestField(unixVarName))
					continue;
				if (field.isNotNull()) {
					if (field.getValue() == null) {
						if (field.getType().getType() == DataType.ENUM) {
							out.println(spacing + "if(!in_array($" + unixName
									+ "[" + fieldNameStr + "], array("
									+ genEnumArray(field) + ")))");
							out.println(spacing + "\t$erros[" + fieldNameStr + " = '" + ugc + " " + field.getName() + " informado não é válid" + lgc + "';");
						} else if (isFunctionChecker(unixVarName)) {
							out.println(spacing + "if(!check_" + unixVarName
									+ "($" + unixName + "[" + fieldNameStr
									+ "]))");
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + field.getName() + " inválid" + lgc + "';");
						} else {
							out.println(spacing + "if(strlen($" + unixName + "["
									+ fieldNameStr + "]) == 0)");
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + field.getName() + " não pode ser vazi" + lgc + "';");
						}
					} else {
						out.println(spacing + "$" + unixName + "[" + fieldNameStr
								+ "] = trim($" + unixName + "[" + fieldNameStr
								+ "]);");
						out.println(spacing + "if(strlen($" + unixName + "["
								+ fieldNameStr + "]) == 0)");
						out.println(spacing + "\t$" + unixName + "[" + fieldNameStr
								+ "] = null;");
						out.println(spacing + "else if(!in_array($" + unixName
								+ "[" + fieldNameStr + "], array("
								+ genEnumArray(field) + ")))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + field.getName() + " informado não é válid" + lgc + "';");
					}
				} else {
					out.println(spacing + "if(strlen($" + unixName + "["
							+ fieldNameStr + "]) == 0)");
					out.println(spacing + "\t$" + unixName + "[" + fieldNameStr
							+ "] = null;");
					if (field.getType().getType() == DataType.ENUM) {
						out.println(spacing + "else if(!in_array($" + unixName
								+ "[" + fieldNameStr + "], array("
								+ genEnumArray(field) + ")))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + field.getName() + " informado não é válid" + lgc + "';");
					} else if (isFunctionChecker(unixVarName)) {
						out.println(spacing + "else if(!check_" + unixVarName
								+ "($" + unixName + "[" + fieldNameStr
								+ "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + field.getName() + " inválid" + lgc + "';");
					}
				}
			} else if (field.getType().getType() == DataType.INTEGER
					|| field.getType().getType() == DataType.DOUBLE
					|| field.getType().getType() == DataType.DECIMAL
					|| field.getType().getType() == DataType.FLOAT) {
				if (field.isAutoIncrement()
						|| (idName != null && idName.equals(unixVarName)))
					continue;
				if (field.isNotNull()) {
					if (field.getValue() != null) {
						out.println(spacing + "if(!is_numeric($" + unixName
								+ "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + field.getName() + " não é um número';");
						out.println(spacing + "else");
						if (field.getType().getType() == DataType.INTEGER) {
							out.println(spacing + "\t$" + unixName + "["
									+ fieldNameStr + "] = intval($"
									+ unixName + "[" + fieldNameStr
									+ "]);");
						} else {
							out.println(spacing + "\t$" + unixName + "["
									+ fieldNameStr + "] = floatval($"
									+ unixName + "[" + fieldNameStr
									+ "]);");
						}
					} else {
						out.println(spacing + "if(!is_numeric($" + unixName
								+ "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + field.getName() + " não é um número';");
					}
				} else {
					out.println(spacing + "$" + unixName + "[" + fieldNameStr
							+ "] = trim($" + unixName + "[" + fieldNameStr
							+ "]);");
					out.println(spacing + "if(strlen($" + unixName + "["
							+ fieldNameStr + "]) == 0)");
					out.println(spacing + "\t$" + unixName + "[" + fieldNameStr
							+ "] = null;");
					out.println(spacing + "else if(!is_numeric($" + unixName
							+ "[" + fieldNameStr + "]))");
					out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + field.getName() + " não é um número';");
				}
			} else if (field.getType().getType() == DataType.DATETIME) {
				out.println(spacing + "$" + unixName + "[" + fieldNameStr
						+ "] = date('Y-m-d H:i:s');");
			} else if (field.getType().getType() == DataType.DATE) {
				out.println(spacing + "$" + unixName + "[" + fieldNameStr
						+ "] = date('Y-m-d');");
			} else if (field.getType().getType() == DataType.TIME) {
				out.println(spacing + "$" + unixName + "[" + fieldNameStr
						+ "] = date('H:i:s');");
			}
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(1);
				out.println(spacing + "}");
			}
		}
		out.println("\t\tif(!empty($erros))");
		out.println("\t\t\tthrow new ValidationException($erros);");
		out.println("\t}");
		if (idName != null) {
			String gch = getGenderChar(normalize(idName, false));
			// handle exception
			out.println();
			out.println("\tprivate static function handleException(&$e) {");
			// get from primary key or unique key
			for (Constraint constraint : table.getConstraints()) {
				if (constraint instanceof Foreign)
					continue;
				OrderField orderField = constraint.getFields().get(constraint.getFields().size() - 1);
				String normf =  despluralize(normalize(orderField.getName(), false));
				String gchk = getGenderChar(normf);
				out.println("\t\tif(stripos($e->getMessage(), '" + constraint.getName() + "') !== false)");
				out.println("\t\t\tthrow new ValidationException(array('" + orderField.getName() + "' => '" + gchk.toUpperCase() + " " + normf + " informad" + gchk + " já está cadastrad" + gchk + "'));");
			}
			out.println("\t}");
			// cadastrar
			out.println();
			out.println("\tpublic static function cadastrar($" + unixName
					+ ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName
					+ "->toArray();");
			out.println("\t\tself::validarCampos($_" + unixName + ");");
			out.println("\t\ttry {");
			genSQLInsert(out, unixName, idName, tblname, indexStr);
			out.println("\t\t} catch (Exception $e) {");
			out.println("\t\t\tself::handleException($e);");
			out.println("\t\t\tthrow $e;");			
			out.println("\t\t}");
			out.println("\t\treturn self::getPel" + gch + "Id($_" + unixName
					+ "['" + idName.toLowerCase() + "']);");
			out.println("\t}");
			// atualizar
			out.println();
			out.println("\tpublic static function atualizar($" + unixName
					+ ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName
					+ "->toArray();");
			out.println("\t\tif(!$_" + unixName + "['" + idName.toLowerCase() + "'])");
			out.println("\t\t\tthrow new ValidationException(array('" + idName.toLowerCase() + "' => 'O id d" + tblgc + " " + tblOneName + " não foi informado'));");
			out.println("\t\tself::validarCampos($_" + unixName + ");");
			usedFields.clear();
			out.println("\t\t$campos = array(");
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
				String unixVarName = unixTransform(varName);
				if (skipUpdateField(unixVarName))
					continue;
				if (indexedFields.containsKey(varName))
					continue;
				if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
						|| varName
								.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
					varName = varName.replaceAll("\\[[0-9]+\\]", "");
					if (usedFields.containsKey(varName))
						continue;
					String data = indexedFields.get(varName);
					usedFields.put(varName, new Pair<String, Field>(data, field));
				} else {
					if (field.isAutoIncrement()
							|| (idName != null && idName.equals(unixVarName)))
						continue;
					out.println("\t\t\t'" + field.getName().toLowerCase() + "',");
				}
			}
			out.println("\t\t);");
			enumKey = usedFields.keys();
			while(enumKey.hasMoreElements()) {
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
					out.println(spacing + "for($" + ch + " = " + minIndex
							+ "; $" + ch + " <= " + maxIndex + "; $" + ch + "++)" + openBraces);
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
			genSQLUpdate(out, tblname, indexStr, unixName, idName);	
			out.println("\t\t} catch (Exception $e) {");
			out.println("\t\t\tself::handleException($e);");
			out.println("\t\t\tthrow $e;");			
			out.println("\t\t}");
			out.println("\t\treturn self::getPel" + gch + "Id($_" + unixName
					+ "['" + idName.toLowerCase() + "']);");		
			out.println("\t}");
			String fieldName = idName.toLowerCase();
			String norField = normalize(fieldName, false);
			String unixField = unixTransform(norField);
			out.println();
			out.println("\tpublic static function excluir(" + paramIndexStr + "$" + unixField + ") {");
			out.println("\t\tif(!$" + unixField + ")");
			out.println("\t\t\tthrow new Exception('Não foi possível excluir " + tblgc + " " + tblOneName + ", o id d" + tblgc + " " + tblOneName + " não foi informado');");
			genSQLDelete(out, tblname, indexStr, "'" + fieldName + "' => $" + unixField);
			out.println("\t}");
		}
		boolean oneId = false;
		// get all data from table
		if (idName != null) {
			DataType dataType = table.find(idName).getType();
			if (dataType instanceof EnumType
					&& ((EnumType) dataType).getElements().size() == 1)
				oneId = true;
		}
		if (!oneId) {
			out.println();
			out.println("\tprivate static function initSearch("
					+ paramIndexStr + ") {");
			genSQLGetTodos(out, tblname, indexStr, unixName);
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getTod" + tblgc + "s("
					+ paramIndexStr + "$inicio = null, $quantidade = null) {");
			out.println("\t\t$query = self::initSearch(" + paramIndexStr + ");");
			genSQLLimit(out, tblname, indexStr, unixName);
			out.println("\t\t$" + unixName + "s = array();");
			out.println("\t\tforeach($_" + unixName + "s as $" + unixName + ")");
			out.println("\t\t\t$" + unixName + "s[] = new " + className + "($"
					+ unixName + ");");
			out.println("\t\treturn $" + unixName + "s;");
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getCount("
					+ paramIndexStr + ") {");
			out.println("\t\t$query = self::initSearch(" + paramIndexStr + ");");
			genSQLgetCount(out, tblname, indexStr, unixName);
			out.println("\t}");
		}

		// get from primary key or unique key
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof Foreign))
				continue;
			String gch = getGenderChar(normalize(constraint.getFields().get(0)
					.getName(), false));
			String arrElem = "", sep = "", catFieldName = "", paramsFieldName = "";
			for (OrderField ofield : constraint.getFields()) {
				String fieldName = ofield.getName();
				String norField = normalize(fieldName, false);
				String unixField = unixTransform(norField);
				arrElem += sep + "'" + fieldName + "' => $" + unixField;
				paramsFieldName += sep + "$" + unixField;
				sep = ", ";
				catFieldName += norField;
			}
			out.println();
			out.println("\tprivate static function initSearchD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName + ") {");
			genSQLGetTodosFk(out, tblname, indexStr, unixName, arrElem);
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getTod" + tblgc + "sD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ", $inicio = null, $quantidade = null) {");
			out.println("\t\t$query = self::initSearchD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName + ");");
			genSQLLimit(out, tblname, indexStr, unixName);
			out.println("\t\t$" + unixName + "s = array();");
			out.println("\t\tforeach($_" + unixName + "s as $" + unixName + ")");
			out.println("\t\t\t$" + unixName + "s[] = new " + className + "($"
					+ unixName + ");");
			out.println("\t\treturn $" + unixName + "s;");
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getCountD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName + ") {");
			out.println("\t\t$query = self::initSearchD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName + ");");
			genSQLgetCount(out, tblname, indexStr, unixName);
			out.println("\t}");
		}
		out.println();
	}

	protected abstract void genSQLgetCount(PrintWriter out, String tblname,
			String indexStr, String unixName);

	protected abstract void genSQLLimit(PrintWriter out, String tblname, String indexStr,
			String unixName);

	protected abstract void genSQLGetTodos(PrintWriter out, String tblname,
			String indexStr, String unixName);
	
	protected abstract void genSQLGetTodosFk(PrintWriter out, 
			String tblname, String indexStr, String unixName, String arrElem);

	protected abstract void genSQLUpdate(PrintWriter out, String tblname, String indexStr,
			String unixName, String idName);

	protected abstract void genSQLInsert(PrintWriter out, String unixName, String idName,
			String tblname, String indexStr);

	protected abstract void genSQLDelete(PrintWriter out, String tblname, String indexStr,
			String arrElem);
	
	protected abstract void genSQLGetFromPrimaryKey(PrintWriter out, String className,
			String tblname, String indexStr, String arrElem);

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println("}");
	}

	@Override
	public String getNameWithExtension(String name) {
		return getClassName(name) + ".class.php";
	}
	
	protected String getClassName(String name) {
		return getClassPrefix() + name + getClassSuffix();
	}
	
	private boolean isBooleanField(Field field) {
		if(field.getType().getType() != DataType.ENUM)
			return false;
		EnumType type = (EnumType) field.getType();
		if (type.getElements().size() == 2
				&& ((type.getElements().get(0).equals("Y") && type
						.getElements().get(1).equals("N")) || (type
						.getElements().get(0).equals("N") && type
						.getElements().get(1).equals("Y"))))
			return true;
		return false;
	}

}
