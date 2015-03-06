package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import ast.Constraint;
import ast.Field;
import ast.OrderField;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;

public class JavaGenerator extends JavaGeneratorBase {

	public JavaGenerator(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	public void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		super.genHeader(out, table, name, indexed);
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		Hashtable<String, String> indexedFields = new Hashtable<>();
		Hashtable<String, String> usedFields = new Hashtable<>();
		processArray(table, indexedFields);
		out.println();
		out.println("public class " + getClassName(name) + " {");
		boolean hasArrayField = false;

		out.println();
		if (indexed)
			out.println("\tprivate int " + getCamelCaseName(name) + "Index");
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
				out.println("\tprivate " + convertType(name, field) + genArray(data) + " " + 
						getCamelCaseName(varName) + ";");
				usedFields.put(varName, data);
				hasArrayField = true;
			} else {
				out.println("\tprivate " + convertType(name, field) + " " + getCamelCaseName(varName) + ";");
			}
		}
		if(hasArrayField) {
			out.println();
			out.println("\tpublic " + getClassName(name) + "() {");
			// constructor
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
					out.println("\t\t" + getCamelCaseName(varName) + " = new " + convertType(name, field) + genArray(data, true) + ";");
					usedFields.put(varName, data);
				}
			}
			out.println("\t}");
		}
		// generate getters and setters
		usedFields.clear();
		if (indexed) {
			out.println();
			out.println("\tpublic int get" + name + "Index() {");
			out.println("\t\treturn " + getCamelCaseName(name) + "Index;");
			out.println("\t}");
			out.println();
			out.println("\tpublic void set" + name + "Index(int " + getCamelCaseName(name)
					+ "Index) {");
			out.println("\t\tthis." + getCamelCaseName(name) + "Index = " + getCamelCaseName(name)
					+ "Index;");
			out.println("\t}");
		}
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String javaVarName = getCamelCaseName(varName);
				String data = indexedFields.get(varName);
				String[] values = data.split(";");

				out.println();
				String params = genParams(data, ",");
				String varParams = genVarParams(data, ",");
				// with var array
				if(isBooleanField(field)) {
					out.println("\tpublic " + convertType(name, field) + " is" + varName + "(" + params
							+ ") {");
				} else {
					out.println("\tpublic " + convertType(name, field) + " get" + varName + "(" + params
							+ ") {");
				}
				String[] paramNames = varParams.split(", ");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + (minIndex - 1)
							+ " || " + paramNames[i] + " > " + (maxIndex - 1) + ")");
					out.println("\t\t\tthrow new RuntimeException(\"Índice \" + " + paramNames[i] + " + \" inválido, aceito somente de " + (minIndex - 1) + " até " + (maxIndex - 1) + "\");");
				}
				out.println("\t\treturn " + javaVarName + genArrayAccess(data) + ";");
				out.println("\t}");
				out.println();
				out.println("\tpublic void set" + varName + "(" + params
						+ ", " + convertType(name, field) + " " + javaVarName + ") {");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < " + (minIndex - 1)
							+ " || " + paramNames[i] + " > " + (maxIndex - 1) + ")");
					out.println("\t\t\tthrow new RuntimeException(\"Índice \" + " + paramNames[i] + " + \" inválido, aceito somente de " + (minIndex - 1) + " até " + (maxIndex - 1) + "\");");
				}
				
				out.println("\t\tthis." + javaVarName + genArrayAccess(data)
						+ " = " + javaVarName + ";");
				out.println("\t}");
				usedFields.put(varName, data);
			} else {
				String javaVarName = getCamelCaseName(varName);
				out.println();
				if(isBooleanField(field)) {
					out.println("\tpublic " + convertType(name, field) +  " is" + varName + "() {");
				} else {
					out.println("\tpublic " + convertType(name, field) + " get" + varName + "() {");
				}
				out.println("\t\treturn " + javaVarName + ";");
				out.println("\t}");
				out.println();
				out.println("\tpublic void set" + varName + "(" + convertType(name, field) + " " + javaVarName + ") {");
				out.println("\t\tthis." + javaVarName + " = " + javaVarName + ";");
				out.println("\t}");
			}
		}
		// generate getters and setters
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (varName.matches("^[a-zA-Z]+\\[[0-9]+\\]$")
					|| varName.matches("^[a-zA-Z]+\\[[0-9]+\\]\\[[0-9]+\\]$")) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, data);
			} else {
				String javaVarName = getCamelCaseName(varName);
				if(!convertType(name, field).equals("String"))
					continue;
				out.println();
				out.println("\t@Override");
				out.println("\tpublic String toString() {");
				out.println("\t\treturn " + javaVarName + ";");
				out.println("\t}");
				break;
			}
		}
		out.println();
		out.println("\t@Override");
		out.println("\tpublic boolean equals(Object o) {");
		out.println("\t\tif(o == null || !(o instanceof " + getClassName(name) + "))");
		out.println("\t\t\treturn false;");
		out.println("\t\t" + getClassName(name) + " obj = (" + getClassName(name) + ")o;");
		List<Constraint> list = new ArrayList<Constraint>();
		// get from primary key
		for (Constraint constraint : table.getConstraints()) {
			if (constraint instanceof PrimaryKey) {
				list.add(constraint);
				break;
			}
		}
		// get from unique key
		if(list.isEmpty()) {
			for (Constraint constraint : table.getConstraints()) {
				if (constraint instanceof UniqueKey) {
					list.add(constraint);
					break;
				}
			}
		}
		for (Constraint constraint : list) {
			out.print("\t\tif(");
			OrderField prevField = null;
			for (OrderField oField : constraint.getFields()) {
				if(prevField != null) {
					out.println(" &&");
					out.print("\t\t   ");
				}
				String varName = normalize(oField.getName(), false);
				Field field = table.find(oField.getName());
				if(isObjectType(field)) {
					out.print("get" + varName + "() != null && get" + varName + "().equals(obj.get" + varName + "())");					
				} else {
					out.print("get" + varName + "() == obj.get" + varName + "()");					
				}
				prevField = oField;
			}
			out.println(")");
			out.println("\t\t\treturn true;");
		}
		out.println("\t\treturn false;");
		out.println("\t}");
		out.println();
		out.println("}");
	}

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		// TODO Auto-generated method stub

	}

}