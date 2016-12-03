package code;

import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.List;

import util.Pair;
import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.OrderField;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;

public class JavaGenerator extends JavaGeneratorBase {

	public JavaGenerator(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	protected void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		super.genHeader(out, table, name, indexed);
	}

	@Override
	protected int genImport(PrintWriter out, Table table, String name,
			Hashtable<String, Integer> types) {
		int impCount = super.genImport(out, table, name, types);
		if (impCount == 0)
			out.println();
		if (types.containsKey("Date")) {
			out.println("import java.util.Locale;");
			out.println("import java.text.SimpleDateFormat;");
		}
		out.println("import java.io.Serializable;");
		out.println("import org.json.JSONObject;");
		impCount += 2;
		return impCount;
	}

	@Override
	protected void genBody(PrintWriter out, Table table, String name,
			boolean indexed) {
		Hashtable<String, String> indexedFields = new Hashtable<>();
		Hashtable<String, Pair<String, Field>> usedFields = new Hashtable<>();
		String baseType = getClassName(name);
		String baseVarName = getCamelCaseName(baseType);
		boolean hasArrayField = false;
		boolean constAdded = false;
		
		processArray(table, indexedFields);
		Hashtable<String, String> tableOptions  = new Hashtable<>();
		String tableComment = TemplateLoader.extractComment(table.getComment(), tableOptions, "T.");
		out.println();
		out.println("\t/**");
		if (tableComment != null && !tableComment.isEmpty()) {
			out.println(TemplateLoader.wrap(tableComment, 100, "\t * "));
		}
		out.println("\t * Auto generated class, do not change, all changes will be discarted!");
		out.println("\t */");
		out.println("public class " + baseType + " implements Serializable {");

		// constants
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (isIndexed(varName)
					|| field.getType().isBoolean()
					|| field.getType().getType() != DataType.ENUM) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				continue;
			}
			EnumType enumType = (EnumType) field.getType();
			if (enumType.getElements().size() < 2)
				continue;
			if (!constAdded)
				out.println();
			for (String elem : enumType.getElements()) {
				out.println("\tpublic static final String "
						+ getConstantName(varName) + "_"
						+ getConstantName(elem) + " = \"" + elem + "\";");
			}
			constAdded = true;
		}
		out.println();
		if (indexed)
			out.println("\tprivate int " + baseVarName + "Index");
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				out.println("\tprivate " + convertType(name, field)
						+ genArray(data) + " " + getCamelCaseName(varName)
						+ ";");
				usedFields.put(varName, new Pair<String, Field>(data, field));
				hasArrayField = true;
			} else {
				out.println("\tprivate " + convertType(name, field) + " "
						+ getCamelCaseName(varName) + ";");
			}
		}
		out.println();
		out.println("\tpublic " + baseType + "() {");
		if (hasArrayField) {
			// constructor
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
					out.println("\t\t" + getCamelCaseName(varName) + " = new "
							+ convertType(name, field) + genArray(data, true)
							+ ";");
					usedFields.put(varName, new Pair<String, Field>(data, field));
				}
			}
		}
		out.println("\t}");
		out.println();
		out.println("\tpublic " + baseType + "(JSONObject " + baseVarName + ") throws Exception {");
		if (hasArrayField) {
			// constructor
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
					out.println("\t\t" + getCamelCaseName(varName) + " = new "
							+ convertType(name, field) + genArray(data, true)
							+ ";");
					usedFields.put(varName, new Pair<String, Field>(data, field));
				}
			}
		}
		// constructor for assign from JSONObject
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (indexedFields.containsKey(varName))
				continue;
			String strName;
			String javaVarName;
			String varList = "";
			String spacing = "\t\t";
			String[] values = new String[0];
			String sqType = getSQLiteType(name, field);
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				javaVarName = getCamelCaseName(varName);
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
				values = data.split(";");
				char ch = 'i';
				String openBraces = "";
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					if (i < values.length - 1)
						openBraces = " {";
					else
						openBraces = " {";
					out.println(spacing + "for (int " + ch + " = " + minIndex
							+ "; " + ch + " <= " + maxIndex + "; " + ch + "++)"
							+ openBraces);
					spacing += "\t";
					ch++;
				}
				ch = 'i';
				strName = field.getName().toLowerCase();
				strName = "\"" + strName;
				strName = strName.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					varList += ch + ", ";
					strName = strName.replaceFirst("\\?", "\" + " + ch);
					ch++;
				}
			} else {
				strName = field.getName().toLowerCase();
				strName = "\"" + strName + "\"";
				javaVarName = getCamelCaseName(varName);
			}
			String extraSpc = "";
			if (!field.isNotNull()) {
				out.println(spacing
						+ "if (!JSONObject.NULL.equals(" + baseVarName + ".get("+ strName + "))) {");
				extraSpc = "\t";
			}
			String convType = "";
			if(field.getType().isBoolean()) {
				if(field.getType().getType() == DataType.ENUM)
					convType = ".contains(\"Y\")";
				else
					convType = " != 0";
			}
			String value = baseVarName + ".get" + sqType
					+ "(" + strName + ")" + convType;
			if(field.getType().getType() == DataType.DECIMAL) {
				value = "new BigDecimal(" + value + ")";
			} else if(field.getType().getType() == DataType.DATE || field.getType().getType() == DataType.DATETIME || field.getType().getType() == DataType.TIME) {
				out.println(spacing + extraSpc + "String " + javaVarName + "String = " + value + ";");
				switch (field.getType().getType()) {
				case DataType.DATE:
					out.println(spacing + extraSpc + "Date " + javaVarName + " = new SimpleDateFormat(\"yyyy-MM-dd\", Locale.US).parse(" + javaVarName + "String);");
					break;
				case DataType.TIME:
					out.println(spacing + extraSpc + "Date " + javaVarName + " = new SimpleDateFormat(\"HH:mm:ss\", Locale.US).parse(" + javaVarName + "String);");
					break;
				case DataType.DATETIME:
					out.println(spacing + extraSpc + "Date " + javaVarName + " = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\", Locale.US).parse(" + javaVarName + "String);");
					break;
				}
				value = javaVarName;
			}
			out.println(spacing + extraSpc + "set"
					+ varName + "(" + varList + value + ");");
			if (!field.isNotNull())
				out.println(spacing + "}");
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(1);
				out.println(spacing + "}");
			}
		}
		out.println("\t}");
		// generate getters and setters
		usedFields.clear();
		if (indexed) {
			out.println();
			out.println("\tpublic int get" + name + "Index() {");
			out.println("\t\treturn " + baseVarName + "Index;");
			out.println("\t}");
			out.println();
			out.println("\tpublic void set" + name + "Index(int "
					+ baseVarName + "Index) {");
			out.println("\t\tthis." + baseVarName + "Index = "
					+ baseVarName + "Index;");
			out.println("\t}");
		}
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			Hashtable<String, String> fieldOptions  = new Hashtable<>();
			String fieldComment = TemplateLoader.extractComment(field.getComment(), fieldOptions, "F.");
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String javaVarName = getCamelCaseName(varName);
				String data = indexedFields.get(varName);
				String[] values = data.split(";");

				out.println();
				String params = genParams(data, ",");
				String varParams = genVarParams(data, ",");
				if (fieldComment != null && !fieldComment.isEmpty()) {
					out.println("\t/**");
					out.println(TemplateLoader.wrap(fieldComment, 100, "\t * "));
					out.println("\t */");
				}
				// with var array
				out.println("\tpublic " + convertType(name, field) + " "
						+ getMethodPreffix(field) + varName + "(" + params
						+ ") {");
				String[] paramNames = varParams.split(", ");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < "
							+ minIndex + " || " + paramNames[i] + " > "
							+ maxIndex + ")");
					out.println("\t\t\tthrow new RuntimeException(\"Índice \" + "
							+ paramNames[i]
							+ " + \" inválido, aceito somente de "
							+ minIndex
							+ " até "
							+ maxIndex
							+ "\");");
				}
				out.println("\t\treturn " + javaVarName + genArrayAccess(data)
						+ ";");
				out.println("\t}");
				out.println();
				out.println("\tpublic void set" + varName + "(" + params + ", "
						+ convertType(name, field) + " " + javaVarName + ") {");
				for (int i = 0; i < values.length; i++) {
					String[] interval = values[i].split(":");
					int minIndex = Integer.valueOf(interval[0]);
					int maxIndex = Integer.valueOf(interval[1]);
					out.println("\t\tif (" + paramNames[i] + " < "
							+ minIndex + " || " + paramNames[i] + " > "
							+ maxIndex + ")");
					out.println("\t\t\tthrow new RuntimeException(\"Índice \" + "
							+ paramNames[i]
							+ " + \" inválido, aceito somente de "
							+ minIndex
							+ " até "
							+ maxIndex
							+ "\");");
				}

				out.println("\t\tthis." + javaVarName + genArrayAccess(data)
						+ " = " + javaVarName + ";");
				out.println("\t}");
				usedFields.put(varName, new Pair<String, Field>(data, field));
			} else {
				String javaVarName = getCamelCaseName(varName);
				out.println();
				if (fieldComment != null && !fieldComment.isEmpty()) {
					out.println("\t/**");
					out.println("\t * " + fieldComment);
					out.println("\t */");
				}
				out.println("\tpublic " + convertType(name, field) + " "
						+ getMethodPreffix(field) + varName + "() {");
				out.println("\t\treturn " + javaVarName + ";");
				out.println("\t}");
				out.println();
				out.println("\tpublic void set" + varName + "("
						+ convertType(name, field) + " " + javaVarName + ") {");
				out.println("\t\tthis." + javaVarName + " = " + javaVarName
						+ ";");
				out.println("\t}");
			}
		}
		// generate getters and setters
		usedFields.clear();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (isIndexed(varName)) {
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				if (usedFields.containsKey(varName))
					continue;
				String data = indexedFields.get(varName);
				usedFields.put(varName, new Pair<String, Field>(data, field));
			} else {
				String javaVarName = getCamelCaseName(varName);
				if (!convertType(name, field).equals("String"))
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
		out.println("\t\tif(o == null || !(o instanceof " + baseType
				+ "))");
		out.println("\t\t\treturn false;");
		out.println("\t\t" + baseType + " obj = ("
				+ baseType + ")o;");
		List<UniqueKey> list = getUniqueKeys(table);
		Constraint uniqueKey = getPrimaryKey(table);
		if(uniqueKey == null && list.size() > 0)
			uniqueKey = list.get(0);
		if (uniqueKey != null) {
			out.print("\t\tif(");
			OrderField prevField = null;
			for (OrderField oField : uniqueKey.getFields()) {
				if (prevField != null) {
					out.println(" &&");
					out.print("\t\t   ");
				}
				String varName = normalize(oField.getName(), false);
				Field field = table.find(oField.getName());
				String mthPreffix = getMethodPreffix(field);
				if (isObjectType(field)) {
					out.print(mthPreffix + varName + "() != null && "
							+ mthPreffix + varName + "().equals(obj."
							+ mthPreffix + varName + "())");
				} else {
					out.print(mthPreffix + varName + "() == obj." + mthPreffix
							+ varName + "()");
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
	protected void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		// TODO Auto-generated method stub

	}

	protected String getConstantName(String name) {
		String cName = "";
		boolean prevIsUpr = true;
		for (int i = 0; i < name.length(); i++) {
			if(Character.isLowerCase(name.charAt(i))) {
				cName += name.charAt(i);
				prevIsUpr = false;
			} else {
				if(!prevIsUpr) {
					cName += "_";
					prevIsUpr = true;
				}
				cName += name.charAt(i);
			}
		}
		return cName.toUpperCase();
	}

}