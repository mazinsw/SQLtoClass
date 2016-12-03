package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.Foreign;
import ast.OrderField;
import ast.ScriptNode;
import ast.Table;
import util.Pair;

public abstract class PHPGeneratorBase extends FileGenerator {

	private boolean arrayAccess;
	private static final String[] indexNames = { "$linha", "$coluna" };
	private Hashtable<String, String> indexedFields;

	public PHPGeneratorBase(String outDir, ScriptNode script) {
		super(outDir, script);
		indexedFields = new Hashtable<>();
	}

	public boolean isArrayAccess() {
		return arrayAccess;
	}

	public void setArrayAccess(boolean arrayAccess) {
		this.arrayAccess = arrayAccess;
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
	protected void genHeader(PrintWriter out, Table table, String name, boolean indexed) {
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
	
	private static boolean skipUpdateField(String field) {
		if(field.contains("cadastro") && field.contains("data"))
			return true;
		if(field.contains("inicio") && field.contains("data"))
			return true;
		if(field.contains("abertura") && field.contains("data"))
			return true;
		if(field.contains("criacao") && field.contains("data"))
			return true;
		return false;
	}
	
	private static boolean skipTestField(String field) {
		if(field.compareToIgnoreCase("senha") == 0)
			return true;
		if(field.contains("data"))
			return true;
		return false;
	}

	private static String genEnumArray(Field field) {
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
	
	private static boolean isFunctionChecker(String field) {
		if(field.compareToIgnoreCase("cep") == 0)
			return true;
		if(field.compareToIgnoreCase("cpf") == 0)
			return true;
		if(field.compareToIgnoreCase("cnpj") == 0)
			return true;
		if(field.compareToIgnoreCase("fone") == 0)
			return true;
		if(field.compareToIgnoreCase("email") == 0)
			return true;
		if(field.compareToIgnoreCase("usuario") == 0)
			return true;
		return false;
	}
	
	private static boolean canTrimField(String field) {
		if(field.compareToIgnoreCase("senha") == 0)
			return false;
		if(field.compareToIgnoreCase("cpf") == 0)
			return false;
		if(field.compareToIgnoreCase("cnpj") == 0)
			return false;
		if(field.compareToIgnoreCase("fone") == 0)
			return false;
		return true;
	}
	
	private static boolean numberOnlyField(String field) {
		if(field.compareToIgnoreCase("cpf") == 0)
			return true;
		if(field.compareToIgnoreCase("cnpj") == 0)
			return true;
		if(field.compareToIgnoreCase("fone") == 0)
			return true;
		if(field.compareToIgnoreCase("ie") == 0)
			return true;
		return false;
	}

	@Override
	protected void genBody(PrintWriter out, Table table, String name, boolean indexed) {
		Hashtable<String, Pair<String, Field>> usedFields = new Hashtable<>();
		String unixName = unixTransform(name);
		String className = getClassName(name);
		processArray(table, indexedFields);
		Field pkField = getPrimary(table);
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
					out.println("\t\t\tthrow new Exception('Índice '." + paramNames[i]
							+ ".' inválido, aceito somente de " + minIndex + " até " + maxIndex + "');");
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
					out.println("\t\t\tthrow new Exception('Índice '." + paramNames[i]
							+ ".' inválido, aceito somente de " + minIndex + " até " + maxIndex + "');");
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
									+ " informad" + lgc + " não é válid" + lgc + "';");
						} else if (isFunctionChecker(unixVarName)) {
							out.println(spacing + "if(!check_" + unixVarName + "($" + unixName + "[" + fieldNameStr
									+ "]))");
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + beaultyName + " inválid" + lgc
									+ "';");
						} else {
							out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
							out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
									+ " não pode ser vazi" + lgc + "';");
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
								+ " informad" + lgc + " não é válid" + lgc + "';");
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
								+ " informad" + lgc + " não é válid" + lgc + "';");
					} else if (isFunctionChecker(unixVarName)) {
						out.println(spacing + "else if(!check_" + unixVarName + "($" + unixName + "[" + fieldNameStr
								+ "]))");
						out.println(
								spacing + "\t$erros[" + fieldNameStr + "] = '" + beaultyName + " inválid" + lgc + "';");
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
								+ " não foi informad" + lgc + "';");
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
								+ " não foi informad" + lgc + "';");
					}
				} else {
					out.println(spacing + "$" + unixName + "[" + fieldNameStr + "] = trim($" + unixName + "["
							+ fieldNameStr + "]);");
					out.println(spacing + "if(strlen($" + unixName + "[" + fieldNameStr + "]) == 0)");
					out.println(spacing + "\t$" + unixName + "[" + fieldNameStr + "] = null;");
					out.println(spacing + "else if(!is_numeric($" + unixName + "[" + fieldNameStr + "]))");
					out.println(spacing + "\t$erros[" + fieldNameStr + "] = '" + ugc + " " + beaultyName
							+ " não foi informad" + lgc + "';");
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
						+ "' => '" + ugcf + " " + beaultyNameF + " informad" + lgcf + " já está cadastrad" + lgcf
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
						+ tblgc + " " + tblOneName + " não foi informado'));");
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
			out.println("\t\t\tthrow new Exception('Não foi possível excluir " + tblgc + " " + tblOneName + ", o id d"
					+ tblgc + " " + tblOneName + " não foi informado');");
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
	protected void genFooter(PrintWriter out, Table table, String name, boolean indexed) {
		out.println("}");
	}

	@Override
	protected String getNameWithExtension(String name) {
		return getClassName(name) + ".class.php";
	}

	protected String getClassName(String name) {
		return getClassPrefix() + name + getClassSuffix();
	}

	private static String getAllFunctionName(String name) {
		String tblOneName = despluralize(name).toLowerCase();
		String tblgc = getGenderChar(tblOneName);
		return "getTod" + tblgc + "s";
	}

}
