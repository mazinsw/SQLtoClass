package code;

import java.io.PrintWriter;
import java.util.Hashtable;

import ast.DataType;
import ast.Field;
import ast.ScriptNode;
import ast.Table;

public abstract class JavaGeneratorBase extends FileGenerator {
	private String packageName;
	private static final String[] indexNames = { "linha", "coluna" };

	public JavaGeneratorBase(String outDir, ScriptNode script) {
		super(outDir, script);
	}
	
	@Override
	protected void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		if(packageName != null && !packageName.equals(""))
			out.println("package " + getPackageName() + ";");
		Hashtable<String, Integer> types = getTypes(table, name);
		genImport(out, table, name, types);

	}

	protected int genImport(PrintWriter out, Table table, String name,
			Hashtable<String, Integer> types) {
		int outCount = 0;
		if (types.containsKey("Date")) {
			out.println();
			out.println("import java.util.Date;");
			outCount++;
		}
		if (types.containsKey("BigDecimal")) {
			if(outCount == 0)
				out.println();
			out.println("import java.math.BigDecimal;");
			outCount++;
		}
		return outCount;
	}

	private Hashtable<String, Integer> getTypes(Table table, String name) {
		Hashtable<String, Integer> types = new Hashtable<String, Integer>();

		for (Field field : table.getFields()) {
			String typeName = convertType(name, field);
			if (types.containsKey(typeName))
				continue;
			types.put(typeName, 1);
		}
		return types;
	}

	protected String genArray(String data) {
		return genArray(data, false);
	}
	
	protected String genArray(String data, boolean instantiate) {
		String[] values = data.split(";");
		String varDecl = "";
		for (int i = 0; i < values.length; i++) {
			if(instantiate) {
				String[] interval = values[i].split(":");
				int minIndex = Integer.valueOf(interval[0]);
				int maxIndex = Integer.valueOf(interval[1]);
				varDecl += "[" + (maxIndex - minIndex + 1) +  "]";
			} else {
				varDecl += "[]";
			}
		}
		return varDecl;
	}
	protected String genArrayAccess(String data) {
		String[] values = data.split(";");
		String indexDecl = "";
		for (int i = 0; i < values.length; i++) {
			String[] interval = values[i].split(":");
			int minIndex = Integer.valueOf(interval[0]);
			String fixPos = "";
			if(minIndex != 0) {
				fixPos = " - " + minIndex;
			}
			String paramName;
			if (values.length == 1)
				paramName = "[index" + fixPos + "]";
			else if (values.length == 2)
				paramName = "[" + indexNames[i] + fixPos + "]";
			else
				paramName = "[index" + (i + 1) + fixPos + "]";
			indexDecl += paramName;
		}
		return indexDecl;
	}

	protected String genParams(String data, String sep) {
		String[] values = data.split(";");
		String semicolon = "";
		String indexDecl = "";
		for (int i = 0; i < values.length; i++) {
			String paramName;
			if (values.length == 1)
				paramName = "int index";
			else if (values.length == 2)
				paramName = "int " + indexNames[i];
			else
				paramName = "int index" + (i + 1);
			indexDecl += semicolon + paramName;
			semicolon = sep + " ";
		}
		return indexDecl;
	}

	protected String genVarParams(String data, String sep) {
		String[] values = data.split(";");
		String semicolon = "";
		String indexDecl = "";
		for (int i = 0; i < values.length; i++) {
			String paramName;
			if (values.length == 1)
				paramName = "index";
			else if (values.length == 2)
				paramName = indexNames[i];
			else
				paramName = "index" + (i + 1);
			indexDecl += semicolon + paramName;
			semicolon = sep + " ";
		}
		return indexDecl;
	}
	
	protected String importParent(String importUrl) {
		int dotIdx = importUrl.lastIndexOf(".");
		if(dotIdx != -1)
			importUrl = importUrl.substring(0, dotIdx);
		else
			importUrl = "";
		return importUrl;
	}
	
	protected boolean isObjectType(Field field) {
		if(!field.isNotNull())
			return true;
		switch (field.getType().getType()) {
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
			return true;
		case DataType.DECIMAL:
			return true;
		case DataType.STRING:
		case DataType.TEXT:
		case DataType.CHAR:
			return true;
		case DataType.ENUM:
			if (field.getType().isBoolean()) {
				return false;
			}
			return true;
		}
		return false;
	}

	protected String convertType(String name, Field field) {
		return convertType(name, field, false);
	}

	protected String getMethodPreffix(Field field) {
		if(field.getType().isBoolean())
			return "is";
		return "get";
	}
	
	protected String convertType(String name, Field field, boolean alwaysClass) {
		switch (field.getType().getType()) {
		case DataType.BOOLEAN:
			if(!field.isNotNull() || alwaysClass)
				return "Boolean";
			return "boolean";
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
			return "Date";
		case DataType.FLOAT:
			if(!field.isNotNull() || alwaysClass)
				return "Float";
			return "float";
		case DataType.DOUBLE:
			if(!field.isNotNull() || alwaysClass)
				return "Double";
			return "double";
		case DataType.DECIMAL:
			return "BigDecimal";
		case DataType.BIGINT:
			if(!field.isNotNull() || alwaysClass)
				return "Long";
			return "long";
		case DataType.INTEGER:
		case DataType.TINYINT:
			if(!field.isNotNull() || alwaysClass)
				return "Integer";
			return "int";
		case DataType.STRING:
		case DataType.TEXT:
		case DataType.CHAR:
			return "String";
		case DataType.BLOB:
			return "byte[]";
		case DataType.ENUM:
			if (field.getType().isBoolean()) {
				if(!field.isNotNull() || alwaysClass)
					return "Boolean";
				return "boolean";
			}
			return "String";
		}
		return "[Unknown]";
	}

	protected String getSQLiteType(String name, Field field) {
		switch (field.getType().getType()) {
		case DataType.FLOAT:
			return "Float";
		case DataType.DOUBLE:
			return "Double";
		case DataType.DECIMAL:
			return "String";
		case DataType.BIGINT:
			return "Long";
		case DataType.BOOLEAN:
		case DataType.INTEGER:
		case DataType.TINYINT:
			return "Int";
		case DataType.DATE:
		case DataType.TIME:
		case DataType.DATETIME:
		case DataType.STRING:
		case DataType.TEXT:
		case DataType.CHAR:
		case DataType.ENUM:
			return "String";
		case DataType.BLOB:
			return "Blob";
		}
		return "Unknown";
	}
	
	protected String getCamelCaseName(String name) {
		String camelCase = "";
		for (int i = 0; i < name.length(); i++) {
			if(Character.isUpperCase(name.charAt(i))) {
				camelCase += Character.toLowerCase(name.charAt(i));
			} else {
				camelCase += name.substring(i);
				break;
			}
		}
		return camelCase;
	}

	@Override
	protected String getNameWithExtension(String name) {
		return getClassName(name) + ".java";
	}

	protected String getClassName(String name) {
		return getClassPrefix() + name + getClassSuffix();
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

}
