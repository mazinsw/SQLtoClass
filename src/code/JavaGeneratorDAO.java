package code;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

import util.Pair;
import ast.Constraint;
import ast.DataType;
import ast.Field;
import ast.Foreign;
import ast.OrderField;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;

public class JavaGeneratorDAO extends JavaGeneratorBase {
	private String classBasePrefix;
	private String classBaseSuffix;
	private String packageBaseName;

	public JavaGeneratorDAO(String outDir, ScriptNode script) {
		super(outDir, script);
	}

	@Override
	public void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		super.genHeader(out, table, name, indexed);
	}

	@Override
	protected int genImport(PrintWriter out, Table table, String name,
			Hashtable<String, Integer> types) {
		int impCount = super.genImport(out, table, name, types);
		if (impCount == 0)
			out.println();
		out.println("import java.util.List;");
		out.println("import java.util.ArrayList;");
		if (types.containsKey("Date")) {
			out.println("import java.util.Locale;");
			out.println("import java.text.ParseException;");
			out.println("import java.text.SimpleDateFormat;");
		}
		out.println();
		out.println("import android.content.ContentValues;");
		out.println("import android.database.Cursor;");
		out.println("import android.database.sqlite.SQLiteDatabase;");
		String pkgBase = importParent(getPackageName());
		if (!pkgBase.isEmpty())
			pkgBase += ".";
		out.println("import " + pkgBase + "db.DatabaseHelper;");
		pkgBase = getPackageBaseName();
		if (!pkgBase.isEmpty())
			out.println("import " + pkgBase + "." + getBaseClassName(name)
					+ ";");
		return impCount;
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		Hashtable<String, String> indexedFields = new Hashtable<>();
		Hashtable<String, Pair<String, Field>> usedFields = new Hashtable<>();
		processArray(table, indexedFields);
		String baseType = getBaseClassName(name);
		String baseVarName = getCamelCaseName(baseType);
		// constructor
		out.println();
		out.println("\t/**");
		out.println("\t * Auto generated class, do not change, all changes will be discarted!");
		out.println("\t */");
		out.println("public class " + getClassName(name)
				+ " extends DAOBase {");

		out.println();
		out.println("\tpublic static final String TABLE_NAME = \"" + table.getName() + "\";");
		out.println();
		out.println("\t/**");
		out.println("\t * Constructor for " + baseType + " data access object");
		out.println("\t *");
		out.println("\t * @param dbHelper a {@link DatabaseHelper} helper to handler database operations");
		out.println("\t */");
		out.println("\tpublic " + getClassName(name)
				+ "(DatabaseHelper dbHelper) {");
		out.println("\t\tsuper(dbHelper);");
		out.println("\t}");
		// find and list objects
		List<UniqueKey> list = getUniqueKeys(table);
		Field pkField = getPkField(table);
		String pkSelect = "*";
		if(pkField != null)
			pkSelect = pkField.getName();
		Constraint uniqueKey = getPrimaryKey(table);
		if(uniqueKey == null && list.size() > 0)
			uniqueKey = list.get(0);
		if (uniqueKey != null) {
			// generate get primary key selection
			out.println();
			out.println("\t/**");
			out.println("\t * Get a primary key selection for a {@link " + baseType + "}");
			out.println("\t *");
			out.println("\t * @return returns a key selection string, example: \"ID = ?\"");
			out.println("\t */");
			out.println("\tpublic static String getUniqueWhere() {");
			String whereSQL = "", whereSep = "";
			for (int i = 0; i < uniqueKey.getFields().size(); i++) {
				OrderField oField = uniqueKey.getFields().get(i);
				whereSQL += whereSep + oField.getName() + " = ?";
				whereSep = " AND ";
			}
			out.println("\t\treturn \"" + whereSQL + "\";");
			out.println("\t}");
		}
		if (uniqueKey != null) {
			// generate update method
			out.println();
			out.println("\t/**");
			out.println("\t * Get a array of string with primary key values");
			out.println("\t *");
			out.println("\t * @param " + baseVarName + " a {@link " + baseType + "} object with the primary key values");
			out.println("\t *");
			out.println("\t * @return returns a string array with primary key values");
			out.println("\t */");
			out.println("\tpublic static String[] getUniqueArgs(" + baseType + " " + baseVarName + ") {");
			out.println("\t\tString[] args = new String[" + uniqueKey.getFields().size() + "];");
			for (int i = 0; i < uniqueKey.getFields().size(); i++) {
				OrderField oField = uniqueKey.getFields().get(i);
				Field field = table.find(oField.getName());
				String varName = normalize(oField.getName(), false);
				String varType = convertType(name, field, true);
				if(varType.equals("String"))
					out.println("\t\targs[" + i + "] = " + baseVarName + "." + getMethodPreffix(field) + varName + "();");
				else
					out.println("\t\targs[" + i + "] = " + convertType(name, field, true) + ".toString(" + baseVarName + "." + getMethodPreffix(field) + varName + "());");
			}
			out.println("\t\treturn args;");
			out.println("\t}");
		}
		// generate order by method
		out.println();
		out.println("\t/**");
		out.println("\t * Get a string that order elemets returned from getAll methods");
		out.println("\t *");
		out.println("\t * @return returns string that order elemets returned from getAll methods");
		out.println("\t */");
		out.println("\tpublic String getOrderBy() {");
		out.println("\t\treturn null; // default order");
		out.println("\t}");
		
		List<Foreign> fkList = getForeignKeys(table);
		List<Constraint> cstList = new ArrayList<>();
		cstList.addAll(fkList);
		if(uniqueKey != null)
			cstList.add(0, uniqueKey);
		HashSet<String> mtdSet = new HashSet<>();
		// generate getAll and load methods
		for (Constraint constraint : cstList) {
			String paramList = "", sep = "", whereSQL = "", whereSep = "", cmmStr = "", cmmCont = "", cmmSep = "", mtdSuffix = "";
			String listType = "List<" + baseType  + ">";
			String listName =  "list";
			for (int i = 0; i < constraint.getFields().size(); i++) {
				OrderField oField = constraint.getFields().get(i);
				Field field = table.find(oField.getName());
				String varName = normalize(oField.getName(), false);
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				mtdSuffix += Character.toUpperCase(varName.charAt(0)) + varName.substring(1);
				String fieldVarName = getCamelCaseName(varName);
				String returnType = listType;
				String instType = "ArrayList<>";
				String returnName = listName;
				boolean loadMethd = i == constraint.getFields().size() - 1 && (constraint instanceof UniqueKey);
				if(loadMethd) {
					returnType = baseType;
					instType = baseType;
					returnName = baseVarName;
				}
				paramList += sep + convertType(name, field) + " " + fieldVarName;
				sep = ", ";
				whereSQL += whereSep + oField.getName() + " = ?";
				whereSep = " AND ";
				if(cmmCont.isEmpty())
					cmmStr = fieldVarName;
				else
					cmmStr = cmmCont + " and " + fieldVarName;
				cmmCont += cmmSep + fieldVarName;
				cmmSep = ", ";
				String methodName = "getAllFrom" + mtdSuffix;
				if(loadMethd) {
					methodName = "load";
				}
				if(mtdSet.contains(methodName))
					continue;
				mtdSet.add(methodName);
				out.println();
				out.println("\t/**");
				if(loadMethd)
					out.println("\t * Get a " + baseType + " from database for " + cmmStr);
				else
					out.println("\t * Get all " + baseVarName + " from database for " + cmmStr);
				out.println("\t *");
				for (int j = 0; j <= i; j++) {
					OrderField coField = constraint.getFields().get(j);
					String cvarName = normalize(coField.getName(), false);
					String cfieldVarName = getCamelCaseName(cvarName);
					out.println("\t * @param " + cfieldVarName + " a identifier for " + cfieldVarName);
				}
				out.println("\t *");
				if(loadMethd)
					out.println("\t * @return returns a " + baseType + " from database for " + cmmStr);
				else
					out.println("\t * @return returns a list of " + baseType + " from database for " + cmmStr);
				out.println("\t */");
				out.println("\tpublic " + returnType + " " + methodName + "(" + paramList + ") {");
				out.println("\t\t" + returnType + " " + returnName + " = new "  + instType + "();");
				out.println("\t\tSQLiteDatabase db = getHelper().getReadableDatabase();");
				if(loadMethd)
					out.println("\t\tString where = getUniqueWhere();");
				else
					out.println("\t\tString where = \"" + whereSQL + "\";");
				out.println("\t\tString[] args = new String[" + (i + 1) + "];");
				for (int j = 0; j <= i; j++) {
					OrderField coField = constraint.getFields().get(j);
					Field cfield = table.find(coField.getName());
					String cvarName = normalize(coField.getName(), false);
					String cfieldVarName = getCamelCaseName(cvarName);
					String cvarType = convertType(name, cfield, true);
					if(cvarType.equals("String"))
						out.println("\t\targs[" + j + "] = " + cfieldVarName + ";");
					else
						out.println("\t\targs[" + j + "] = " + convertType(name, cfield, true) + ".toString(" + cfieldVarName + ");");
				}
				out.println("\t\tCursor cursor = db.query(TABLE_NAME, null, where, args, null, null, getOrderBy());");
				if(loadMethd) {
					out.println("\t\tif (cursor.moveToNext()) {");
					out.println("\t\t\tfill(cursor, " + baseVarName  + ");");
					out.println("\t\t} else {");
					out.println("\t\t\tcursor.close();");
					out.println("\t\t\tdb.close();");
					out.println("\t\t\tthrow new RuntimeException(\"" + table.getName()  + " não encontrado\");");
				} else {
					out.println("\t\twhile (cursor.moveToNext()) {");
					out.println("\t\t\t" + baseType + " " + baseVarName + " = new "  + baseType + "();");
					out.println("\t\t\tfill(cursor, " + baseVarName  + ");");
					out.println("\t\t\t" + listName  + ".add(" + baseVarName + ");");
				}
				out.println("\t\t}");
				out.println("\t\tcursor.close();");
				out.println("\t\tdb.close();");
				out.println("\t\treturn " + returnName + ";");
				out.println("\t}");
			}
		}
		out.println();
		out.println("\t/**");
		out.println("\t * Get all " + baseVarName + " from database");
		out.println("\t *");
		out.println("\t * @return returns a list of all " + baseType + " from database");
		out.println("\t */");
		out.println("\tpublic List<" + baseType  + "> getAll() {");
		out.println("\t\tList<" + baseType  + "> list = new ArrayList<>();");
		out.println("\t\tSQLiteDatabase db = getHelper().getReadableDatabase();");
		out.println("\t\tCursor cursor = db.query(TABLE_NAME, null, null, null, null, null, getOrderBy());");
		out.println("\t\twhile (cursor.moveToNext()) {");
		out.println("\t\t\t" + baseType + " " + baseVarName + " = new "  + baseType + "();");
		out.println("\t\t\tfill(cursor, " + baseVarName  + ");");
		out.println("\t\t\tlist.add(" + baseVarName + ");");
		out.println("\t\t}");
		out.println("\t\tcursor.close();");
		out.println("\t\tdb.close();");
		out.println("\t\treturn list;");
		out.println("\t}");
		// generate getCount
		mtdSet.clear();
		out.println();
		out.println("\t/**");
		out.println("\t * Get count of rows from " + baseVarName + " table");
		out.println("\t *");
		out.println("\t * @return return count of rows from " + baseType);
		out.println("\t */");
		out.println("\tpublic int getCount() {");
		out.println("\t\tSQLiteDatabase db = getHelper().getReadableDatabase();");
		out.println("\t\tCursor cursor = db.query(TABLE_NAME, new String[] {\"COUNT(" + pkSelect + ")\"}, null, null, null, null, null);");
		out.println("\t\tcursor.moveToFirst();");
		out.println("\t\tint count = cursor.getInt(0);");
		out.println("\t\tcursor.close();");
		out.println("\t\tdb.close();");
		out.println("\t\treturn count;");
		out.println("\t}");
		for (Constraint constraint : cstList) {
			String paramList = "", sep = "", whereSQL = "", whereSep = "", cmmStr = "", cmmSep = "", mtdSuffix = "";
			if(constraint instanceof UniqueKey)
				continue;
			for (int i = 0; i < constraint.getFields().size(); i++) {
				OrderField oField = constraint.getFields().get(i);
				Field field = table.find(oField.getName());
				String varName = normalize(oField.getName(), false);
				varName = varName.replaceAll("\\[[0-9]+\\]", "");
				mtdSuffix += Character.toUpperCase(varName.charAt(0)) + varName.substring(1);
				String fieldVarName = getCamelCaseName(varName);
				paramList += sep + convertType(name, field) + " " + fieldVarName;
				sep = ", ";
				whereSQL += whereSep + oField.getName() + " = ?";
				whereSep = " AND ";
				cmmStr += cmmSep + fieldVarName;
				if(i == constraint.getFields().size() - 3)
					cmmSep = " and ";
				else
					cmmSep = ", ";
				String methodName = "getCountFrom" + mtdSuffix;
				if(mtdSet.contains(methodName))
					continue;
				mtdSet.add(methodName);
				out.println();
				out.println("\t/**");
				out.println("\t * Get count of " + baseVarName + " from " + cmmStr);
				out.println("\t *");
				for (int j = 0; j <= i; j++) {
					OrderField coField = constraint.getFields().get(j);
					String cvarName = normalize(coField.getName(), false);
					String cfieldVarName = getCamelCaseName(cvarName);
					out.println("\t * @param " + cfieldVarName + " a identifier for " + cfieldVarName);
				}
				out.println("\t *");
				out.println("\t * @return returns a count of " + baseType + " from " + cmmStr);
				out.println("\t */");
				out.println("\tpublic int " + methodName + "(" + paramList + ") {");
				out.println("\t\tSQLiteDatabase db = getHelper().getReadableDatabase();");
				out.println("\t\tString where = \"" + whereSQL + "\";");
				out.println("\t\tString[] args = new String[" + (i + 1) + "];");
				for (int j = 0; j <= i; j++) {
					OrderField coField = constraint.getFields().get(j);
					Field cfield = table.find(coField.getName());
					String cvarName = normalize(coField.getName(), false);
					String cfieldVarName = getCamelCaseName(cvarName);
					String cvarType = convertType(name, cfield, true);
					if(cvarType.equals("String"))
						out.println("\t\targs[" + j + "] = " + cfieldVarName + ";");
					else
						out.println("\t\targs[" + j + "] = " + convertType(name, cfield, true) + ".toString(" + cfieldVarName + ");");
				}
				out.println("\t\tCursor cursor = db.query(TABLE_NAME, new String[] {\"COUNT(" + pkSelect + ")\"}, where, args, null, null, null);");
				out.println("\t\tcursor.moveToFirst();");
				out.println("\t\tint count = cursor.getInt(0);");
				out.println("\t\tcursor.close();");
				out.println("\t\tdb.close();");
				out.println("\t\treturn count;");
				out.println("\t}");
			}
		}
		// generate insert method
		out.println();
		out.println("\t/**");
		out.println("\t * Insert a " + baseVarName + " into database");
		out.println("\t *");
		out.println("\t * @param " + baseVarName + " a {@link " + baseType + "} object that contains all informations to insert");
		out.println("\t */");
		out.println("\tpublic void insert(" + baseType + " " + baseVarName + ") {");
		out.println("\t\tSQLiteDatabase db = getHelper().getWritableDatabase();");
		out.println("\t\tContentValues values = getValues(" + baseVarName + ");");
		out.println("\t\tdb.execSQL(\"PRAGMA foreign_keys = ON\");");
		String idDecl = "", idVar = "", idName = "";
		if(pkField != null && pkField.isAutoIncrement()) {
			String idType = convertType(name, pkField);
			idName = normalize(pkField.getName(), false);
			idVar = getCamelCaseName(idName);
			idDecl = idType + " " + idVar + " = (" + idType + ") ";
		}
		out.println("\t\t" + idDecl +"db.insert(TABLE_NAME, null, values);");
		if(pkField != null && pkField.isAutoIncrement()) {
			out.println("\t\t" + baseVarName + ".set" + idName + "(" + idVar + ");");
		}
		out.println("\t\tdb.close();");
		out.println("\t}");
		// generate update method
		out.println();
		out.println("\t/**");
		out.println("\t * Update a " + baseVarName + " from database");
		out.println("\t *");
		out.println("\t * @param " + baseVarName + " a {@link " + baseType + "} object to be updated into database");
		out.println("\t */");
		out.println("\tpublic void update(" + baseType + " " + baseVarName + ") {");
		out.println("\t\tSQLiteDatabase db = getHelper().getWritableDatabase();");
		out.println("\t\tContentValues values = getValues(" + baseVarName + ");");
		out.println("\t\tString where = getUniqueWhere();");
		out.println("\t\tString[] args = getUniqueArgs(" + baseVarName + ");");
		out.println("\t\tdb.execSQL(\"PRAGMA foreign_keys = ON\");");
		out.println("\t\tdb.update(TABLE_NAME, values, where, args);");
		out.println("\t\tdb.close();");
		out.println("\t}");
		// generate delete method
		out.println();
		out.println("\t/**");
		out.println("\t * Delete a " + baseVarName + " from database");
		out.println("\t *");
		out.println("\t * @param " + baseVarName + " a {@link " + baseType + "} object that will be deleted from the database");
		out.println("\t */");
		out.println("\tpublic void delete(" + baseType + " " + baseVarName + ") {");
		out.println("\t\tSQLiteDatabase db = getHelper().getWritableDatabase();");
		out.println("\t\tString where = getUniqueWhere();");
		out.println("\t\tString[] args = getUniqueArgs(" + baseVarName + ");");
		out.println("\t\tdb.execSQL(\"PRAGMA foreign_keys = ON\");");
		out.println("\t\tdb.delete(TABLE_NAME, where, args);");
		out.println("\t\tdb.close();");
		out.println("\t}");
		// fill object from cursor
		out.println();
		out.println("\t/**");
		out.println("\t * Fill a " + baseVarName + " from cursor");
		out.println("\t *");
		out.println("\t * @param cursor a valid {@link Cursor} object to get data from");
		out.println("\t * @param " + baseVarName + " a {@link " + baseType + "} object to be filled from data cursor");
		out.println("\t */");
		out.println("\tpublic static void fill(Cursor cursor, " + baseType + " "
				+ baseVarName + ") {");
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
			String fieldType = convertType(name, field);
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
				strName = "\"" + field.getName();
				strName = strName.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					varList += ch + ", ";
					strName = strName.replaceFirst("\\?", "\" + " + ch);
					ch++;
				}
			} else {
				strName = "\"" + field.getName() + "\"";
				javaVarName = getCamelCaseName(varName);
			}
			String extraSpc = "";
			if (!field.isNotNull() && (!sqType.equals("String") || fieldType.equals("Date"))) {
				out.println(spacing
						+ "if (cursor.isNull(cursor.getColumnIndex("
						+ strName + "))) {");
				extraSpc = "\t";
				out.println(spacing + extraSpc + baseVarName + ".set"
						+ varName + "(" + varList + "null);");
				out.println(spacing + "} else {");
			}
			String convType = "";
			if(field.getType().isBoolean()) {
				if(field.getType().getType() == DataType.ENUM)
					convType = ".contains(\"Y\")";
				else
					convType = " != 0";
			}
			String value = "cursor.get" + sqType
					+ "(cursor.getColumnIndex(" + strName + "))" + convType;
			String trySpc = "";
			if(field.getType().getType() == DataType.DECIMAL) {
				value = "new BigDecimal(" + value + ")";
			} else if(field.getType().getType() == DataType.DATE || field.getType().getType() == DataType.DATETIME || field.getType().getType() == DataType.TIME) {
				out.println(spacing + extraSpc + "try {");
				trySpc = "\t";
				out.println(spacing + extraSpc + trySpc + "String " + javaVarName + "String = " + value + ";");
				switch (field.getType().getType()) {
				case DataType.DATE:
					out.println(spacing + extraSpc + trySpc + "Date " + javaVarName + " = new SimpleDateFormat(\"yyyy-MM-dd\", Locale.US).parse(" + javaVarName + "String);");
					break;
				case DataType.TIME:
					out.println(spacing + extraSpc + trySpc + "Date " + javaVarName + " = new SimpleDateFormat(\"HH:mm:ss\", Locale.US).parse(" + javaVarName + "String);");
					break;
				case DataType.DATETIME:
					out.println(spacing + extraSpc + trySpc + "Date " + javaVarName + " = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\", Locale.US).parse(" + javaVarName + "String);");
					break;
				}
				value = javaVarName;
			}
			out.println(spacing + extraSpc + trySpc + baseVarName + ".set"
					+ varName + "(" + varList + value + ");");
			if(field.getType().getType() == DataType.DATE || field.getType().getType() == DataType.DATETIME || field.getType().getType() == DataType.TIME) {
				out.println(spacing + extraSpc + "} catch (ParseException e) {");
				out.println(spacing + extraSpc + trySpc + "e.printStackTrace();");
				out.println(spacing + extraSpc + trySpc + baseVarName + ".set"
						+ varName + "(" + varList + "null);");
				out.println(spacing + extraSpc + "}");
			}
			if (!field.isNotNull() && (!sqType.equals("String") || fieldType.equals("Date")))
				out.println(spacing + "}");
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(1);
				out.println(spacing + "}");
			}
		}
		out.println("\t}");
		// get values from object
		out.println();
		out.println("\t/**");
		out.println("\t * Extract values from a " + baseVarName + " object");
		out.println("\t *");
		out.println("\t * @param " + baseVarName + " a {@link " + baseType + "} object that contains data to be extracted");
		out.println("\t *");
		out.println("\t * @return returns a map that constains values and key from " + baseVarName);
		out.println("\t */");
		out.println("\tpublic static ContentValues getValues("
				+ baseType + " " + baseVarName + ") {");
		out.println("\t\tContentValues values = new ContentValues();");
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
				String sep = "";
				strName = "\"" + field.getName();
				strName = strName.replaceAll("[0-9]+", "?");
				for (int i = 0; i < values.length; i++) {
					varList += sep + ch;
					sep = ", ";
					strName = strName.replaceFirst("\\?", "\" + " + ch);
					ch++;
				}
			} else {
				strName = "\"" + field.getName() + "\"";
				javaVarName = getCamelCaseName(varName);
			}
			String valueGet = baseVarName + "." + getMethodPreffix(field) + varName + "(" + varList + ")";
			String value = valueGet;
			if(field.getType().getType() == DataType.DECIMAL) {
				value = value + ".toPlainString()";
			} else if(field.getType().isBoolean()) {
				if(field.getType().getType() == DataType.ENUM)
					value = valueGet + " ? \"Y\" : \"N\"";
			} else if(field.getType().getType() == DataType.DATE || field.getType().getType() == DataType.DATETIME || field.getType().getType() == DataType.TIME) {
				switch (field.getType().getType()) {
				case DataType.DATE:
					out.println(spacing + "SimpleDateFormat " + javaVarName + " = new SimpleDateFormat(\"yyyy-MM-dd\", Locale.US);");
					break;
				case DataType.TIME:
					out.println(spacing + "SimpleDateFormat " + javaVarName + " = new SimpleDateFormat(\"HH:mm:ss\", Locale.US);");
					break;
				case DataType.DATETIME:
					out.println(spacing + "SimpleDateFormat " + javaVarName + " = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\", Locale.US);");
					break;
				}
				value = javaVarName + ".format(" + value + ")";
				if(!field.isNotNull()) {
					value = valueGet + " == null ? null : " + value;
				}
			}
			if(field.isAutoIncrement() &&  getSQLiteType(name,  field).equals("Int") && field.isNotNull()) {
				out.println(spacing + "if(" + valueGet + " != 0)");
				out.print("\t");
			}
			out.println(spacing + "values.put(" + strName + ", " + value + ");");
			for (int i = values.length - 1; i >= 0; i--) {
				spacing = spacing.substring(1);
				out.println(spacing + "}");
			}
		}
		out.println("\t\treturn values;");
		out.println("\t}");

		out.println();
		out.println("}");
	}

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
	}

	public String getClassBasePrefix() {
		return classBasePrefix;
	}

	public void setClassBasePrefix(String classBasePrefix) {
		this.classBasePrefix = classBasePrefix;
	}

	public String getClassBaseSuffix() {
		return classBaseSuffix;
	}

	public void setClassBaseSuffix(String classBaseSuffix) {
		this.classBaseSuffix = classBaseSuffix;
	}

	private String getBaseClassName(String name) {
		return getClassBasePrefix() + name + getClassBaseSuffix();
	}

	public void setPackageBaseName(String name) {
		this.packageBaseName = name;

	}

	public String getPackageBaseName() {
		return packageBaseName;
	}

}
