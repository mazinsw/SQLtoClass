package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.Foreign;
import ast.OrderFied;
import ast.ScriptNode;
import ast.Table;

public class PHPGenerator extends CodeGenerator {

	private static final String[] indexNames = { "$linha", "$coluna" };

	public PHPGenerator(String outDir, ScriptNode script) {
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
		out.println("class Z" + name + " {");
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
		Hashtable<String, String> usedFields = new Hashtable<>();
		String unixName = unixTransform(name);

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
				usedFields.put(varName, data);
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
				usedFields.put(varName, data);
				out.println("\t\t\t// TODO: assign array field " + varName
						+ "[" + data + "]");
			} else
				out.println("\t\t\t$this->set" + varName + "($" + unixName
						+ "['" + field.getName() + "']);");
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
				usedFields.put(varName, data);
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
					out.println("\t\t\treturn null;");
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
					out.println("\t\t\treturn;");
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
			String unixVarName = unixTransform(varName);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, data);
				out.println("\t\t// TODO: assign array field " + varName + "["
						+ data + "]");
			} else
				out.println("\t\t$" + unixName + "['" + unixVarName
						+ "'] = $this->get" + varName + "();");
		}
		out.println("\t\treturn array_filter($" + unixName + ");");
		out.println("\t}");
		String tblname = table.getName();
		tblname = tblname.replaceAll("[0-9]+", "");
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
			String arrElem = "", sep = "", orSep = "", catFieldName = "", paramsFieldName = "", ifFields = "";
			for (OrderFied ofield : constraint.getFields()) {
				String fieldName = ofield.getName();
				String norField = normalize(fieldName, false);
				String unixField = unixTransform(norField);
				arrElem += sep + "'" + fieldName + "' => $" + unixField;
				paramsFieldName += sep + "$" + unixField;
				sep = ", ";
				ifFields += orSep + "!$" + unixField;
				orSep = " || ";
				catFieldName += norField;
			}
			out.println();
			if (idName != null) {
				out.println("\tpublic static function getPel" + gch
						+ catFieldName + "(" + paramIndexStr + paramsFieldName
						+ ", $igonore_id = null) {");
				out.println("\t\tif ( " + ifFields + " )");
				out.println("\t\t\treturn new Z" + name + "();");
				out.println("\t\t$condition = array(" + arrElem + ");");
				out.println("\t\tif(!is_null($igonore_id))");
				out.println("\t\t\t$condition[] = '" + idName
						+ " <> '.intval($igonore_id);");
				out.println("\t\treturn new Z" + name + "(DB::GetTableRow('"
						+ tblname + "'" + indexStr + ", $condition));");
			} else {
				out.println("\tpublic static function getPel" + gch
						+ catFieldName + "(" + paramIndexStr + paramsFieldName
						+ ") {");
				out.println("\t\treturn new Z" + name + "(DB::GetTableRow('"
						+ tblname + "'" + indexStr + ", array(" + arrElem
						+ ")));");
			}
			out.println("\t}");
			if (idName != null
					&& idName.equals(constraint.getFields().get(0).getName())
					&& constraint.getFields().size() == 1) {
				out.println();
				out.println("\tpublic static function excluir(" + paramIndexStr
						+ paramsFieldName + ") {");
				out.println("\t\tif ( " + ifFields + " )");
				out.println("\t\t\treturn false;");
				out.println("\t\treturn DB::Delete('" + tblname + "'"
						+ indexStr + ", array(" + arrElem + "));");
				out.println("\t}");
			}
		}
		// insert into table
		out.println();
		out.println("\tpublic static function validarCampos(&$" + unixName
				+ ") {");
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			String unixVarName = unixTransform(varName);
			if (indexedFields.containsKey(varName))
				continue;
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, data);
				out.println("\t\t// TODO: assign array field " + varName + "["
						+ data + "]");
			} else {
				if (field.getType().getType() == DataType.STRING
						|| field.getType().getType() == DataType.ENUM) {
					if (skipFixField(unixVarName))
						continue;
					if (!field.isNotNull() || field.getValue() == null) {
						if (canTrimField(unixVarName)
								&& field.getType().getType() != DataType.ENUM) {
							out.println("\t\t$" + unixName + "['" + unixVarName
									+ "'] = trim($" + unixName + "['"
									+ unixVarName + "']);");
						} else {
							out.println("\t\t$" + unixName + "['" + unixVarName
									+ "'] = strval($" + unixName + "['"
									+ unixVarName + "']);");
						}
					}
					if (skipTestField(unixVarName))
						continue;
					if (field.isNotNull()) {
						if (field.getValue() == null) {
							if (field.getType().getType() == DataType.ENUM) {
								out.println("\t\tif(!in_array($" + unixName
										+ "['" + unixVarName + "'], array("
										+ genEnumArray(field) + ")))");
							} else if (isFunctionChecker(unixVarName)) {
								out.println("\t\tif(!check_" + unixVarName
										+ "($" + unixName + "['" + unixVarName
										+ "']))");
							} else {
								out.println("\t\tif(strlen($" + unixName + "['"
										+ unixVarName + "']) == 0)");
							}
							out.println("\t\t\treturn false;");
						}
					} else {
						out.println("\t\tif(strlen($" + unixName + "['"
								+ unixVarName + "']) == 0)");
						out.println("\t\t\t$" + unixName + "['" + unixVarName
								+ "'] = null;");
						if (field.getType().getType() == DataType.ENUM) {
							out.println("\t\telse if(!in_array($" + unixName
									+ "['" + unixVarName + "'], array("
									+ genEnumArray(field) + ")))");
							out.println("\t\t\treturn false;");
						} else if (isFunctionChecker(unixVarName)) {
							out.println("\t\telse if(!check_" + unixVarName
									+ "($" + unixName + "['" + unixVarName
									+ "']))");
							out.println("\t\t\treturn false;");
						}
					}
				} else if (field.getType().getType() == DataType.INTEGER
						|| field.getType().getType() == DataType.DOUBLE
						|| field.getType().getType() == DataType.FLOAT) {
					if (field.isAutoIncrement()
							|| (idName != null && idName.equals(unixVarName)))
						continue;
					if (field.isNotNull()) {
						if (field.getValue() != null) {
							out.println("\t\tif(array_key_exists('"
									+ unixVarName + "', $" + unixName + ")) {");
							out.println("\t\t\tif(!is_numeric($" + unixName
									+ "['" + unixVarName + "']))");
							out.println("\t\t\t\treturn false;");
							out.println("\t\t\telse");
							if (field.getType().getType() == DataType.INTEGER) {
								out.println("\t\t\t\t$" + unixName + "['"
										+ unixVarName + "'] = intval($"
										+ unixName + "['" + unixVarName
										+ "']);");
							} else {
								out.println("\t\t\t\t$" + unixName + "['"
										+ unixVarName + "'] = floatval($"
										+ unixName + "['" + unixVarName
										+ "']);");
							}
							out.println("\t\t}");
						} else {
							out.println("\t\tif(!is_numeric($" + unixName
									+ "['" + unixVarName + "']))");
							out.println("\t\t\treturn false;");
						}
					} else {
						out.println("\t\t$" + unixName + "['" + unixVarName
								+ "'] = trim($" + unixName + "['" + unixVarName
								+ "']);");
						out.println("\t\tif(strlen($" + unixName + "['"
								+ unixVarName + "']) == 0)");
						out.println("\t\t\t$" + unixName + "['" + unixVarName
								+ "'] = null;");
						out.println("\t\telse if(!is_numeric($" + unixName
								+ "['" + unixVarName + "']))");
						out.println("\t\t\treturn false;");
					}
				} else if (field.getType().getType() == DataType.DATETIME) {
					out.println("\t\t$" + unixName + "['" + unixVarName
							+ "'] = date('Y-m-d H:i:s');");
				} else if (field.getType().getType() == DataType.DATE) {
					out.println("\t\t$" + unixName + "['" + unixVarName
							+ "'] = date('Y-m-d');");
				} else if (field.getType().getType() == DataType.TIME) {
					out.println("\t\t$" + unixName + "['" + unixVarName
							+ "'] = date('H:i:s');");
				}
			}
		}
		out.println("\t\treturn true;");
		out.println("\t}");
		if (idName != null) {
			String gch = getGenderChar(normalize(idName, false));
			// cadastrar
			out.println();
			out.println("\tpublic static function cadastrar($" + unixName
					+ ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName
					+ "->toArray();");
			out.println("\t\tif(!self::validarCampos($_" + unixName + "))");
			out.println("\t\t\treturn new Z" + name + "();");
			out.println("\t\t$_" + unixName + "['" + idName
					+ "'] = DB::Insert('" + tblname + "'" + indexStr + ", $_"
					+ unixName + ");");
			out.println("\t\treturn self::getPel" + gch + "Id($_" + unixName
					+ "['" + idName + "']);");
			out.println("\t}");
			// atualizar
			out.println();
			out.println("\tpublic static function atualizar($" + unixName
					+ ") {");
			out.println("\t\t$_" + unixName + " = $" + unixName
					+ "->toArray();");
			out.println("\t\tif(!$_" + unixName + "['" + idName + "'])");
			out.println("\t\t\treturn false;");
			out.println("\t\tif(!self::validarCampos($_" + unixName + "))");
			out.println("\t\t\treturn false;");
			usedFields.clear();
			out.println("\t\t$campos = array(");
			for (Field field : table.getFields()) {
				String varName = normalize(field.getName(), false);
				String unixVarName = unixTransform(varName);
				if (indexedFields.containsKey(varName))
					continue;
				if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
						|| varName
								.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
					varName = varName.replaceAll("\\[[0-9]+\\]", "");
					if (usedFields.containsKey(varName))
						continue;
					String data = indexedFields.get(varName);
					usedFields.put(varName, data);
					out.println("\t\t\t// TODO: assign array field " + varName
							+ "[" + data + "]");
				} else {
					if (field.isAutoIncrement()
							|| (idName != null && idName.equals(unixVarName)))
						continue;
					out.println("\t\t\t'" + unixVarName + "',");
				}
			}
			out.println("\t\t);");
			out.println("\t\t$table = new Table('" + tblname + "'" + indexStr
					+ ", $_" + unixName + ");");
			out.println("\t\t$table->SetPk('" + idName + "', $_" + unixName
					+ "['" + idName + "']);");
			out.println("\t\treturn $table->Update($campos);");
			out.println("\t}");
		}
		boolean uniqueId = false;
		// get all data from table
		if (idName != null) {
			DataType dataType = table.find(idName).getType();
			if (dataType instanceof EnumType
					&& ((EnumType) dataType).getElements().size() == 1)
				uniqueId = true;
		}
		if (!uniqueId) {
			out.println();
			out.println("\tpublic static function getTod" + getGenderChar(name) + "s("
					+ paramIndexStr + "$inicio = null, $quantidade = null) {");
			out.println("\t\t$condition = array();");
			out.println("\t\tif(!is_null($inicio) && !is_null($quantidade)) {");
			out.println("\t\t\t$condition['order'] = 'ORDER BY id DESC';");
			out.println("\t\t\t$condition['size'] = $quantidade;");
			out.println("\t\t\t$condition['offset'] = $inicio;");
			out.println("\t\t}");
			out.println("\t\t$_" + unixName + "s = DB::LimitQuery('" + tblname
					+ "'" + indexStr + ", $condition);");
			out.println("\t\t$" + unixName + "s = array();");
			out.println("\t\tforeach($_" + unixName + "s as $" + unixName + ")");
			out.println("\t\t\t$" + unixName + "s[] = new Z" + name + "($"
					+ unixName + ");");
			out.println("\t\treturn $" + unixName + "s;");
			out.println("\t}");
		}
		out.println();
	}

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		out.println("}");

	}

	@Override
	public String getNameWithExtension(String name) {
		return "Z" + name + ".class.php";
	}

}
