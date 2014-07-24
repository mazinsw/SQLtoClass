package code;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.ScriptNode;
import ast.Table;

public abstract class DelphiGeneratorBase extends CodeGenerator {
	private static final String[] indexNames = { "Linha", "Coluna" };

	public DelphiGeneratorBase(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	public String getNameWithExtension(String name) {
		return getClassName(name) + ".pas";
	}

	protected String getClassName(String name) {
		return getClassPrefix() + name + getClassSuffix();
	}

	protected String convertType(String name, Field field) {
		return convertType(name, field, true);
	}

	protected String convertType(String name, Field field, boolean withPreffix) {
		switch (field.getType().getType()) {
		case DataType.BOOLEAN:
			return "Boolean";
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
			return "TDateTime";
		case DataType.FLOAT:
			return "Single";
		case DataType.DOUBLE:
			return "Double";
		case DataType.BIGINT:
			return "Int64";
		case DataType.INTEGER:
		case DataType.TINYINT:
			return "Integer";
		case DataType.STRING:
		case DataType.TEXT:
		case DataType.CHAR:
			return "string";
		case DataType.BLOB:
			return "TStream";
		case DataType.ENUM:
			EnumType type = (EnumType) field.getType();
			if (type.getElements().size() == 2
					&& ((type.getElements().get(0).equals("Y") && type
							.getElements().get(1).equals("N")) || (type
							.getElements().get(0).equals("N") && type
							.getElements().get(1).equals("Y"))))
				return "Boolean";
			if (type.getElements().size() == 1
					&& type.getElements().get(0).matches("[0-9]+"))
				return "Integer";
			return (withPreffix ? "T" : "")
					+ name
					+ normalize(field.getName(), false).replaceAll(
							"\\[[0-9]+\\]", "");
		}
		return "[Unknown]";
	}

	protected String genEnum(String name, Field field) {
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
		String typeName = name
				+ normalize(field.getName(), false).replaceAll("\\[[0-9]+\\]",
						"");
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
		String enumItems = "";
		String sep = "";
		for (String item : type.getElements()) {
			enumItems += sep + prefix + normalize(item, false);
			sep = ", ";
		}
		return enumItems;
	}

	protected String genEnumString(String name, Field field) {
		if (field.getType().getType() != DataType.ENUM)
			return null;
		EnumType type = (EnumType) field.getType();
		String enumItems = "";
		String sep = "";
		for (String item : type.getElements()) {
			enumItems += sep + "'" + item + "'";
			sep = ", ";
		}
		return enumItems;
	}

	protected void processArray(Table table,
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

	protected String genParams(String data, String sep) {
		String[] values = data.split(";");
		String semicolon = "";
		String indexDecl = "";
		for (int i = 0; i < values.length; i++) {
			String paramName;
			if (values.length == 1)
				paramName = "Index";
			else if (values.length == 2)
				paramName = indexNames[i];
			else
				paramName = "Index" + (i + 1);
			indexDecl += semicolon + paramName;
			semicolon = sep + " ";
		}
		return indexDecl;
	}

	protected String genArray(String data) {
		String[] values = data.split(";");
		String varDecl = "";
		String sep = "";
		for (int i = 0; i < values.length; i++) {
			String[] interval = values[i].split(":");
			int minIndex = Integer.valueOf(interval[0]);
			int maxIndex = Integer.valueOf(interval[1]);
			varDecl += sep + minIndex + ".." + maxIndex;
			sep = ", ";
		}
		return varDecl;
	}

	protected String genArrayAccess(String varName) {
		if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")  || varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
			Matcher m = Pattern.compile("^[a-zA-Z]+\\[([0-9]+)\\]$").matcher(
					varName);
			if (!m.find()) {
				m = Pattern.compile("^[a-zA-Z]+\\[([0-9]+)\\]\\[([0-9]+)\\]$")
						.matcher(varName);
				m.find();
			}
			varName = varName.replaceAll("\\[[0-9]+\\]", "");
			String newData = "[";
			String comma = "";
			for (int i = 0; i < m.groupCount(); i++) {
				String indexStr = m.group(i + 1);
				newData += comma + indexStr;
				comma = ", ";
			}
			newData += "]";
			return varName + newData;
		} else
			return varName;
	}

}