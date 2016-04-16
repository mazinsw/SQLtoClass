package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;

import org.apache.commons.io.FileUtils;

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

	public PHPGeneratorBase(String outDir, ScriptNode script) {
		super(outDir, script);
		templateLoader = new TemplateLoader();
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
		if(isProccessTemplate())
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
	
	private String genMultilineComment(String comment, String identation) {
		String result = identation + "/**";
		int offset = 0;
		if(comment == null || comment.trim().isEmpty())
			return null;
		for (int i = 0; i < comment.length(); i++) {
			switch (comment.charAt(i)) {
			case '\r':
			case '\n':
				int old_i = i;
				if(i + 1 < comment.length() && comment.charAt(i + 1) == '\n')
					i++;
				String line = comment.substring(offset, old_i);
				result += "\r\n" + identation + " * " + line.trim();
				offset = i + 1;
				break;
			default:
				break;
			}
		}
		if(offset < comment.length()) {
			String line = comment.substring(offset, comment.length());
			result += "\r\n" + identation + " * " + line.trim();
		}
		return result + "\r\n" + identation + " */";
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
		String arrayIntf = "";
		if(isArrayAccess())
			arrayIntf = " implements ArrayAccess";

		Hashtable<String, String> fieldValues = new Hashtable<>();
		String tableComment = TemplateLoader.extractComment(table.getComment(), fieldValues, "F.");
		String tableMLComment = genMultilineComment(tableComment, "");
		if(tableMLComment != null)
			out.println(tableMLComment);
		out.println("class " + getClassName(name) + arrayIntf + " {");
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
		Field pkField = getPkField(table);
		String pkName = null;
		if(pkField != null)
			pkName = pkField.getName().toLowerCase();
		List<String> ukNames = new ArrayList<String>();
		Constraint uKey = null;
		for (Constraint constraint : getUniqueKeyList(table)) {
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
			if (isIndexed(varName)) {
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
							+ "; $" + ch + " <= " + maxIndex + "; $" + ch
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
				out.println(spacing + "$this->set" + varName + "(" + varList
						+ ", $" + unixName + "[" + strName + "]);");
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
				if(fieldMLComment != null)
					out.println(fieldMLComment);
				out.println("\tpublic function get" + varName + "(" + params
						+ ") {");
				String[] paramNames = params.split(", ");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + minIndex
							+ " || " + paramNames[i] + " > " + maxIndex + ")");
					out.println("\t\t\tthrow new Exception('Índice '."
							+ paramNames[i] + ".' inválido, aceito somente de "
							+ minIndex + " até " + maxIndex + "');");
				}
				out.println("\t\treturn $this->" + unixVarName + genArray(data)
						+ ";");
				out.println("\t}");
				out.println();
				if(fieldMLComment != null)
					out.println(fieldMLComment);
				out.println("\tpublic function set" + varName + "(" + params
						+ ", $value) {");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + minIndex
							+ " || " + paramNames[i] + " > " + maxIndex + ")");
					out.println("\t\t\tthrow new Exception('Índice '."
							+ paramNames[i] + ".' inválido, aceito somente de "
							+ minIndex + " até " + maxIndex + "');");
				}
				out.println("\t\t$this->" + unixVarName + genArray(data)
						+ " = $value;");
				out.println("\t}");
			} else {
				String unixVarName = unixTransform(varName);
				out.println();
				if(fieldMLComment != null)
					out.println(fieldMLComment);
				out.println("\tpublic function get" + varName + "() {");
				out.println("\t\treturn $this->" + unixVarName + ";");
				out.println("\t}");
				if (field.getType().isBoolean()) {
					out.println();
					if(fieldMLComment != null)
						out.println(fieldMLComment);
					out.println("\tpublic function is" + varName + "() {");
					out.println("\t\treturn $this->" + unixVarName + " == 'Y';");
					out.println("\t}");
				}
				out.println();
				if(fieldMLComment != null)
					out.println(fieldMLComment);
				out.println("\tpublic function set" + varName + "($"
						+ unixVarName + ") {");
				out.println("\t\t$this->" + unixVarName + " = $" + unixVarName
						+ ";");
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
				out.println("\t\t$" + unixName + "['"
						+ field.getName().toLowerCase() + "'] = $this->get"
						+ varName + "();");
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
				out.println(spacing + "for($" + ch + " = " + minIndex + "; $"
						+ ch + " <= " + maxIndex + "; $" + ch + "++)"
						+ openBraces);
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
			out.println(spacing + "$" + unixName + "[" + strName
					+ "] = $this->get" + varName + "(" + varList + ");");
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(2);
				if (i < values.length - 1)
					out.println(spacing + "}");
			}
		}
		out.println("\t\treturn $" + unixName + ";");
		out.println("\t}");
		// generate array access interface implementation
		if(isArrayAccess()) {
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
				out.println("\t\t\tcase \"" + field.getName().toLowerCase() + "\": $this->set" + varName + "(" + params + "$value);");
				out.println("\t\t\t\tbreak;");
			}
			out.println("\t\t\tdefault:");
			out.println("\t\t\t\tthrow new Exception('O campo \"'.$offset.'\" não existe');");
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
			String gch = getGenderChar(normalize(constraint.getFields().get(0)
					.getName(), false));
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
			out.println("\tpublic static function getPel" + gch + catFieldName
					+ "(" + paramIndexStr + paramsFieldName + ") {");
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
					out.println(spacing + "for($" + ch + " = " + minIndex
							+ "; $" + ch + " <= " + maxIndex + "; $" + ch
							+ "++)" + openBraces);
					spacing += "\t";
					ch++;
				}
				ch = 'i';
				fieldNameStr = "'" + field.getName().toLowerCase();
				fieldNameStr = fieldNameStr.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					fieldNameStr = fieldNameStr.replaceFirst("\\?", "'.\\$"
							+ ch);
					ch++;
				}
			}
			if (field.getType().getType() == DataType.STRING
					|| field.getType().getType() == DataType.TEXT
					|| field.getType().getType() == DataType.ENUM) {
				if (skipFixField(unixVarName))
					continue;
				if (!field.isNotNull() || field.getValue() == null) {
					if (!numberOnlyField(unixVarName)
							&& canTrimField(unixVarName)
							&& field.getType().getType() != DataType.ENUM
							&& field.getType().getType() != DataType.TEXT) {
						out.println(spacing + "$" + unixName + "["
								+ fieldNameStr + "] = strip_tags(trim($"
								+ unixName + "[" + fieldNameStr + "]));");
					} else if (numberOnlyField(unixVarName)) {
						out.println(spacing + "$" + unixName + "["
								+ fieldNameStr + "] = number_only($" + unixName
								+ "[" + fieldNameStr + "]);");
					} else {
						out.println(spacing + "$" + unixName + "["
								+ fieldNameStr + "] = strval($" + unixName
								+ "[" + fieldNameStr + "]);");
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
							out.println(spacing + "\t$erros[" + fieldNameStr
									+ "] = '" + ugc + " " + field.getName()
									+ " informad" + lgc + " não é válid" + lgc + "';");
						} else if (isFunctionChecker(unixVarName)) {
							out.println(spacing + "if(!check_" + unixVarName
									+ "($" + unixName + "[" + fieldNameStr
									+ "]))");
							out.println(spacing + "\t$erros[" + fieldNameStr
									+ "] = '" + field.getName() + " inválid"
									+ lgc + "';");
						} else {
							out.println(spacing + "if(strlen($" + unixName
									+ "[" + fieldNameStr + "]) == 0)");
							out.println(spacing + "\t$erros[" + fieldNameStr
									+ "] = '" + ugc + " " + field.getName()
									+ " não pode ser vazi" + lgc + "';");
						}
					} else {
						out.println(spacing + "$" + unixName + "["
								+ fieldNameStr + "] = trim($" + unixName + "["
								+ fieldNameStr + "]);");
						out.println(spacing + "if(strlen($" + unixName + "["
								+ fieldNameStr + "]) == 0)");
						out.println(spacing + "\t$" + unixName + "["
								+ fieldNameStr + "] = null;");
						out.println(spacing + "else if(!in_array($" + unixName
								+ "[" + fieldNameStr + "], array("
								+ genEnumArray(field) + ")))");
						out.println(spacing + "\t$erros[" + fieldNameStr
								+ "] = '" + ugc + " " + field.getName()
								+ " informad" + lgc + " não é válid" + lgc + "';");
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
						out.println(spacing + "\t$erros[" + fieldNameStr
								+ "] = '" + ugc + " " + field.getName()
								+ " informad" + lgc + " não é válid" + lgc + "';");
					} else if (isFunctionChecker(unixVarName)) {
						out.println(spacing + "else if(!check_" + unixVarName
								+ "($" + unixName + "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr
								+ "] = '" + field.getName() + " inválid" + lgc
								+ "';");
					}
				}
			} else if (field.getType().getType() == DataType.INTEGER
					|| field.getType().getType() == DataType.DOUBLE
					|| field.getType().getType() == DataType.DECIMAL
					|| field.getType().getType() == DataType.FLOAT) {
				if (field.isAutoIncrement()
						|| (pkName != null && pkName.equalsIgnoreCase(unixVarName)))
					continue;
				if (field.isNotNull()) {
					if (field.getValue() != null) {
						out.println(spacing + "if(!is_numeric($" + unixName
								+ "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr
								+ "] = '" + ugc + " " + field.getName()
								+ " não foi informad" + lgc + "';");
						out.println(spacing + "else");
						if (field.getType().getType() == DataType.INTEGER) {
							out.println(spacing + "\t$" + unixName + "["
									+ fieldNameStr + "] = intval($" + unixName
									+ "[" + fieldNameStr + "]);");
						} else {
							out.println(spacing + "\t$" + unixName + "["
									+ fieldNameStr + "] = floatval($"
									+ unixName + "[" + fieldNameStr + "]);");
						}
					} else {
						out.println(spacing + "if(!is_numeric($" + unixName
								+ "[" + fieldNameStr + "]))");
						out.println(spacing + "\t$erros[" + fieldNameStr
								+ "] = '" + ugc + " " + field.getName()
								+ " não foi informad" + lgc + "';");
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
					out.println(spacing + "\t$erros[" + fieldNameStr + "] = '"
							+ ugc + " " + field.getName()
							+ " não foi informad" + lgc + "';");
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
		if (uKey != null) {
			String gch = getGenderChar(normalize(uKey.getFields().get(0).getName(), false));
			String orSep = "", sep = "", catFieldName = "", ukGetParams = "", paramsFieldName = "", arrElem = "", checkNullField = "", checkNullVars = "";
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
				OrderField orderField = constraint.getFields().get(
						constraint.getFields().size() - 1);
				String normf = despluralize(normalize(orderField.getName(),
						false));
				String gchk = getGenderChar(normf);
				out.println("\t\tif(stripos($e->getMessage(), '"
						+ constraint.getName() + "') !== false)");
				out.println("\t\t\tthrow new ValidationException(array('"
						+ orderField.getName().toLowerCase() + "' => '" + gchk.toUpperCase()
						+ " " + normf + " informad" + gchk
						+ " já está cadastrad" + gchk + "'));");
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
			genSQLInsert(out, tblname, indexStr, pkName, unixName);
			out.println("\t\t} catch (Exception $e) {");
			out.println("\t\t\tself::handleException($e);");
			out.println("\t\t\tthrow $e;");
			out.println("\t\t}");
			out.println("\t\treturn self::getPel" + gch + catFieldName + "(" + ukGetParams + ");");
			out.println("\t}");
			// atualizar
			out.println();
			out.println("\tpublic static function atualizar($" + unixName
					+ ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName
					+ "->toArray();");
			if (pkName != null) {
				out.println("\t\tif(" + checkNullField + ")");
				out.println("\t\t\tthrow new ValidationException(array('"
						+ pkName.toLowerCase() + "' => 'O id d" + tblgc + " "
						+ tblOneName + " não foi informado'));");
			}
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
				if (isIndexed(varName)) {
					varName = varName.replaceAll("\\[[0-9]+\\]", "");
					if (usedFields.containsKey(varName))
						continue;
					String data = indexedFields.get(varName);
					usedFields.put(varName,
							new Pair<String, Field>(data, field));
				} else {
					if (field.isAutoIncrement()
							|| (pkName != null && pkName.equalsIgnoreCase(unixVarName)))
						continue;
					out.println("\t\t\t'" + field.getName().toLowerCase()
							+ "',");
				}
			}
			out.println("\t\t);");
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
					out.println(spacing + "for($" + ch + " = " + minIndex
							+ "; $" + ch + " <= " + maxIndex + "; $" + ch
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
			out.println("\tpublic static function excluir(" + paramIndexStr
					+ paramsFieldName + ") {");
			out.println("\t\tif(" + checkNullVars + ")");
			out.println("\t\t\tthrow new Exception('Não foi possível excluir "
					+ tblgc + " " + tblOneName + ", o id d" + tblgc + " "
					+ tblOneName + " não foi informado');");
			genSQLDelete(out, tblname, indexStr, arrElem);
			out.println("\t}");
		}
		boolean oneId = false;
		// get all data from table
		if (pkName != null) {
			DataType dataType = table.find(pkName).getType();
			if (dataType instanceof EnumType
					&& ((EnumType) dataType).getElements().size() == 1)
				oneId = true;
		}
		if (!oneId) {
			out.println();
			out.println("\tprivate static function initSearch(" + paramIndexStr
					+ ") {");
			genSQLGetTodos(out, tblname, indexStr, pkName, unixName);
			out.println("\t}");
			out.println();
			out.println("\tpublic static function " + getAllFunctionName(name) + "("
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
			out.println("\tpublic static function getCount(" + paramIndexStr
					+ ") {");
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
				arrElem += sep + "'" + fieldName.toLowerCase() + "' => $" + unixField;
				paramsFieldName += sep + "$" + unixField;
				sep = ", ";
				catFieldName += norField;
			}
			out.println();
			out.println("\tprivate static function initSearchD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ") {");
			genSQLGetTodosFk(out, tblname, indexStr, pkName, unixName, arrElem);
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getTod" + tblgc + "sD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ", $inicio = null, $quantidade = null) {");
			out.println("\t\t$query = self::initSearchD" + gch + catFieldName
					+ "(" + paramIndexStr + paramsFieldName + ");");
			genSQLLimit(out, tblname, indexStr, unixName);
			out.println("\t\t$" + unixName + "s = array();");
			out.println("\t\tforeach($_" + unixName + "s as $" + unixName + ")");
			out.println("\t\t\t$" + unixName + "s[] = new " + className + "($"
					+ unixName + ");");
			out.println("\t\treturn $" + unixName + "s;");
			out.println("\t}");
			out.println();
			out.println("\tpublic static function getCountD" + gch
					+ catFieldName + "(" + paramIndexStr + paramsFieldName
					+ ") {");
			out.println("\t\t$query = self::initSearchD" + gch + catFieldName
					+ "(" + paramIndexStr + paramsFieldName + ");");
			genSQLgetCount(out, tblname, indexStr, unixName);
			out.println("\t}");
		}
		out.println();
	}

	protected abstract void genSQLgetCount(PrintWriter out, String tblname,
			String indexStr, String unixName);

	protected abstract void genSQLLimit(PrintWriter out, String tblname,
			String indexStr, String unixName);

	protected abstract void genSQLGetTodos(PrintWriter out, String tblname,
			String indexStr, String pkName, String unixName);

	protected abstract void genSQLGetTodosFk(PrintWriter out, String tblname,
			String indexStr, String pkName, String unixName, String arrElem);

	protected abstract void genSQLUpdate(PrintWriter out, String tblname,
			String indexStr, List<String> ukNames, String unixName);

	protected abstract void genSQLInsert(PrintWriter out, 
			String tblname, String indexStr, String pkName, String unixName);

	protected abstract void genSQLDelete(PrintWriter out, String tblname,
			String indexStr, String arrElem);

	protected abstract void genSQLGetFromPrimaryKey(PrintWriter out,
			String className, String tblname, String indexStr, String arrElem);

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println("}");
		if(isProccessTemplate())
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
			if(file.isDirectory())
				destFile.mkdirs();
			else {
				destFile.getParentFile().mkdirs();
				try {
					String fileContent = FileUtils.readFileToString(file, getEncoding());
					String oldContent = "";
					// same content, append
					if(tempFile.equals(destFile) && destFile.exists() && getCurrentTableIndex() != 0) {
						oldContent = FileUtils.readFileToString(destFile, getEncoding());
					}
					fileContent = applyTemplate(oldContent + fileContent, table, name, null, values, 0);
					FileUtils.writeStringToFile(destFile, fileContent, getEncoding());
				} catch (IOException e) {
					log(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}

	private String applyTemplate(String source, Table table, String name, Field field, Hashtable<String, String> values, int enumIndex) {
		String className = getClassName(name);
		Field pkField = getPkField(table);
		Field descField = getDescField(table);
		String nameWithExt = getNameWithExtension(name);
		String unixName = unixTransform(name);
		String result = source, command = "", option = "";
		Stack<Integer> fieldStack = new Stack<>();
		Stack<String> filterStack = new Stack<>();
		Stack<Integer> optionStack = new Stack<>();
		int state = 0, startoffset, offset = 0;
		startoffset = -1;
		for (int i = 0; i < source.length(); i++) {
			switch (source.charAt(i)) {
			case '$':
				state = 1;
				startoffset = i;
				break;
			case '[':
				if(state == 1) {
					command = "";
					option = "";
					state = 2;
				} else {
					state = 0;
					startoffset = -1;
				}
				break;
			case '.':
				if(state >= 2) {
					if(state > 2)
						option += source.charAt(i);
					state = 3;
				} else {
					state = 0;
					startoffset = -1;
				}
				break;
			case ']':
				// execute
				if(state >= 2 && !command.isEmpty()) {
					String replace = "";
					if(command.equalsIgnoreCase("field")) {
						if(option.startsWith("each")) {
							if(i + 1 < source.length() && source.charAt(i + 1) == '\r') {
								i++;
								if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
									i++;
							} else if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
								i++;
							fieldStack.push(startoffset + offset);
							String filter = option.replaceFirst("each\\((\\w+)\\)", "$1");
							filterStack.push(filter);
						} else if(option.equals("end")) {
							if(i + 1 < source.length() && source.charAt(i + 1) == '\r') {
								i++;
								if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
									i++;
							} else if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
								i++;
							if(!fieldStack.empty()) {
								int oldstartoffset = startoffset;
								startoffset = fieldStack.pop() - offset;
								String filter = filterStack.pop();
								String eachContent = result.substring(startoffset + offset, oldstartoffset + offset);
								for (Field afield : table.getFields()) {
									Hashtable<String, String> fieldValues = new Hashtable<>();
									fieldValues.putAll(values);
									TemplateLoader.extractComment(afield.getComment(), fieldValues, "F.");
									if(afield == pkField || fieldValues.containsKey("F.D"))
										continue;
									if(filter.equals("reference") && table.getReference(afield.getName()) == null)
										continue;
									if(filter.equals("search") && !values.containsKey("F.S"))
										continue;
									replace += applyTemplate(eachContent, table, name, afield, fieldValues, 0);
								}
							}
						} else if(option.equals("option.each")) {
							if(i + 1 < source.length() && source.charAt(i + 1) == '\r') {
								i++;
								if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
									i++;
							} else if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
								i++;
							optionStack.push(startoffset + offset);
						} else if(option.equals("option.end")) {
							if(i + 1 < source.length() && source.charAt(i + 1) == '\r') {
								i++;
								if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
									i++;
							} else if(i + 1 < source.length() && source.charAt(i + 1) == '\n')
								i++;
							if(!optionStack.empty()) {
								int oldstartoffset = startoffset;
								startoffset = optionStack.pop() - offset;
								String eachContent = result.substring(startoffset + offset, oldstartoffset + offset);
								if(field.getType() instanceof EnumType) {
									EnumType enumType = (EnumType)field.getType();
									for (int index = 0; index < enumType.getElements().size(); index++) {
										replace += applyTemplate(eachContent, table, name, field, values, index);
									}
								}
							}
						} else if(!fieldStack.empty() || !optionStack.empty()) {
							replace = source.substring(startoffset, i + 1);
						} else if(field == null) {
							// ignore, incorrect usage
						} else if(option.equals("content")) {
							try {
								File fileField = TemplateLoader.getFileFromType(table, field, values);
								String fileContent = FileUtils.readFileToString(fileField, getEncoding());
								replace = applyTemplate(fileContent, table, name, field, values, 0);
							} catch (Exception e) {
								log(e.getMessage());
								e.printStackTrace();
							}
						} else if(option.equals("option") || option.equals("option.unix") || option.equals("option.name")) {
							if(field.getType() instanceof EnumType) {
								EnumType enumType = (EnumType)field.getType();
								List<String> elements = enumType.getElements();
								if(enumIndex >= 0 && enumIndex < elements.size()) {
									if(option.equals("option.name"))
										replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.E"), enumIndex, elements.get(enumIndex)), true);
									else if(option.equals("option.unix"))
										replace = unixTransform(elements.get(enumIndex));
									else
										replace = elements.get(enumIndex);
								}
							}
						} else if(option.equals("mask")) {
							replace = TemplateLoader.getValueByIndex(values.get("F.M"), 0, "");
						} else if(option.equals("style")) {
							if(values.containsKey("F.M"))
								replace = TemplateLoader.getValueByIndex(values.get("F.L"), 0, "masked");
							else if(field.getType().isNumeric())
								replace = TemplateLoader.getValueByIndex(values.get("F.L"), 0, "numeric");
							else
								replace = TemplateLoader.getValueByIndex(values.get("F.L"), 0, "");
						} else if(option.equals("image.width") || option.equals("image.height")) {
							String value = TemplateLoader.getValueByIndex(values.get("F.I"), 0, "64x64");
							if(option.equals("image.width") || value.split("x").length < 2)
								value = value.split("x")[0];
							else
								value = value.split("x")[1];
							replace = TemplateLoader.recase(command, value);
						} else if(option.equals("image.folder")) {
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.I"), 1, unixName));
						} else if(option.equals("image.default")) {
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.I"), 2, ""));
						} else if(option.equals("gender")) {
								replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.G"), 0, getGenderChar(despluralize(field.getName()).toLowerCase()))); 
						} else {
							String varName = normalize(field.getName(), false);
							if(option.equals("unix"))
								replace = TemplateLoader.getValueByIndex(values.get("F.U"), 0, unixTransform(varName));
							else if(option.equals("name"))
								replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName()), true);
							else if(option.equals("info")) {
								replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("F.F"), 0, 
										TemplateLoader.getValueByIndex(values.get("F.N"), 0, field.getName())));
							} else if(option.equals("get")) {
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
								replace = "get" + varName + "(" + params + ")";
							} else
								replace = TemplateLoader.recase(command, field.getName());
						}
					} else if(!fieldStack.empty() || !optionStack.empty()) {
						replace = source.substring(startoffset, i + 1);
					} else if(command.equalsIgnoreCase("table")) {
						if(option.startsWith("class")) {
							replace = applyTemplate("$[" + option + "]", table, name, field, values, enumIndex);
						} else if(option.equals("gender"))
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("T.G"), 0, getGenderChar(despluralize(name).toLowerCase()))); 
						else if(option.equals("name"))
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name)), true); 
						else if(option.equals("name.plural"))
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("T.N"), 1, despluralize(name) + "s"), true);
						else if(option.equals("info"))
							replace = TemplateLoader.recase(command, TemplateLoader.getValueByIndex(values.get("T.F"), 0, 
									TemplateLoader.getValueByIndex(values.get("T.N"), 0, despluralize(name)))); 
						else if(option.equals("unix"))
							replace = TemplateLoader.getValueByIndex(values.get("F.U"), 0, unixName); 
						else if(option.equals("unix.plural"))
							replace = TemplateLoader.getValueByIndex(values.get("F.U"), 1, unixTransform(normalize(TemplateLoader.getValueByIndex(values.get("T.N"), 1, name + "s"), false)));
						else if(option.equals("pk"))
							replace = TemplateLoader.recase(command, (pkField == null? "ID": pkField.getName()));
						else if(option.equals("pk.unix"))
							replace = unixTransform(pkField == null? "ID": pkField.getName());
						else if(option.equals("pk.get"))
							replace = "get" + getPKFieldFunctionSuffix(pkField);
						else if(option.equals("pk.set"))
							replace = "set" + getPKFieldFunctionSuffix(pkField);
						else if(option.equals("desc"))
							replace = TemplateLoader.recase(command, (descField == null? (pkField == null? "ID": pkField.getName()): descField.getName()));
						else if(option.equals("desc.get"))
							replace = "get" + getDescFieldFunctionSuffix(descField, pkField);
						else
							replace = table.getName();
					} else if(command.equalsIgnoreCase("reference")) {
						if(field != null) {
							Table refTable = findTable(table.getReference(field.getName()));
							if(refTable != null) {
								Hashtable<String, String> refValues = new Hashtable<>();
								TemplateLoader.extractComment(refTable.getComment(), refValues, "T.");
								String refName = normalize(refTable.getName());
								replace = applyTemplate("$[" + TemplateLoader.recase(command, "table") + (option.isEmpty()?"":".") + option + "]", refTable, refName, null, refValues, 0);
							}
						}
					} else if(command.equals("class")) {
						if(option.equals("file"))
							replace = nameWithExt;
						else if(option.equals("get"))
							replace = getPKFunctionName(table);
						else if(option.equals("get.all"))
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
				if(state < 2) {
					state = 0;
					startoffset = -1;
				} else if(state == 2)
					command += source.charAt(i);
				else if(state == 3)
					option += source.charAt(i);
				break;
			}
		}
		return result;
	}

	private static String getAllFunctionName(String name) {
		String tblOneName = despluralize(name).toLowerCase();
		String tblgc = getGenderChar(tblOneName);
		return "getTod" + tblgc + "s";
	}
	
	private String getPKFunctionName(Table table) {
		PrimaryKey constraint = getPrimaryKey(table);
		if(constraint == null)
			return "getPeloID";
		String gch = getGenderChar(normalize(constraint.getFields().get(0)
				.getName(), false));
		String catFieldName = "";
		for (OrderField ofield : constraint.getFields()) {
			String fieldName = ofield.getName();
			String norField = normalize(fieldName, false).replace("][", "_").replace("[", "").replace("]", "");
			catFieldName += norField;
		}
		return "getPel" + gch + catFieldName;
	}

	private static String getPKFieldFunctionSuffix(Field pkField) {
		if(pkField == null)
			return "ID";
		return normalize(pkField.getName(), false);
	}

	private static String getDescFieldFunctionSuffix(Field descField, Field pkField) {
		if(descField == null)
			return getPKFieldFunctionSuffix(pkField);
		return normalize(descField.getName(), false);
	}

}
