package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.Constraint;
import ast.DataType;
import ast.EnumType;
import ast.Field;
import ast.Node;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;

public abstract class CodeGenerator {
	private ScriptNode script;
	private String outDir;
	private Hashtable<String, String> indexedTables;
	private String classPrefix;
	private String classSuffix;

	public CodeGenerator(String outDir, ScriptNode script) {
		this.outDir = outDir;
		this.script = script;
		indexedTables = new Hashtable<>();
	}

	public void start() throws FileNotFoundException {
		for (Node node : script.getStatements()) {
			if (node instanceof Table)
				genFile((Table) node);
		}
	}

	private void genFile(Table table) throws FileNotFoundException {
		String name = normalize(table.getName());
		boolean indexed = false;
		if (name.matches("[a-zA-Z]+\\[[0-9]+\\]")) {
			name = name.replaceAll("\\[[0-9]+\\]", "");
			if (indexedTables.containsKey(name))
				return;
			indexedTables.put(name, name);
			indexed = true;
		}
		String nameWithExt = getNameWithExtension(name);
		String fileName = outDir + File.separatorChar + nameWithExt;
		System.out.println("Writting file: " + nameWithExt);
		PrintWriter out = new PrintWriter(new OutputStreamWriter(
				new FileOutputStream(fileName), getEncoding()), true);
		genHeader(out, table, name, indexed);
		genClass(out, table, name, indexed);
		genFooter(out, table, name, indexed);
		out.close();
		System.out.println("Closing file: " + nameWithExt);
	}

	public abstract void genHeader(PrintWriter out, Table table, String name,
			boolean indexed);

	public abstract void genClass(PrintWriter out, Table table, String name,
			boolean indexed);

	public abstract void genFooter(PrintWriter out, Table table, String name,
			boolean indexed);

	public abstract String getNameWithExtension(String name);

	public static String normalize(String name) {
		return normalize(name, true);
	}
	
	protected Charset getEncoding() {
		return StandardCharsets.UTF_8;
	}
	
	protected boolean isBooleanField(Field field) {
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


	public static String normalize(String name, boolean despluralize) {
		if (name.matches("T[A-Z].*"))
			name = name.substring(1);
		String result = "", lastWord = "";
		boolean lastCaseIsUpper = false, lastIsVector = false, currentIsVector = false;
		int i = 0;
		while (i < name.length()) {
			char ch = name.charAt(i);
			String str = "" + ch;
			currentIsVector = false;
			if (ch == '_') {
				int j = i + 1;
				if (j >= name.length())
					break;
				do {
					ch = name.charAt(j);
					j++;
				} while (ch == '_' && j < name.length());
				if (j > name.length())
					break;
				ch = Character.toUpperCase(ch);
				str = "" + ch;
				lastCaseIsUpper = false;
				i = j - 1;
			} else if (((result.isEmpty() && lastWord.isEmpty()) || lastIsVector)
					&& Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
				str = "" + ch;
			}
			if (Character.isDigit(ch)) {
				lastIsVector = true;
				String digits = "";
				int j = i;
				do {
					ch = name.charAt(j);
					digits += ch;
					j++;
				} while (j < name.length() && Character.isDigit(name.charAt(j)));
				str = "[" + digits + "]";
				lastCaseIsUpper = false;
				i = j - 1;
				currentIsVector = true;
			}
			if (!lastCaseIsUpper
					&& (Character.isUpperCase(ch) || currentIsVector)
					&& !lastWord.isEmpty()) {
				if (lastIsVector && !currentIsVector) {
					if (despluralize)
						result += upperFix(despluralize(lastWord)) + ".";
					else
						result += upperFix(lastWord) + ".";
					lastIsVector = false;
				} else {
					if (despluralize)
						result += upperFix(despluralize(lastWord));
					else
						result += upperFix(lastWord);
				}
				lastWord = str;
				lastCaseIsUpper = true;
			} else if (!lastIsVector) {
				lastWord += ch;
				lastCaseIsUpper = Character.isUpperCase(ch);
			} else {
				lastIsVector = false;
				result += upperFix(lastWord) + ".";
				lastWord = str;
			}
			i++;
		}
		if (!lastWord.isEmpty()) {
			if (!currentIsVector && lastIsVector) {
				if (despluralize)
					result += "." + upperFix(despluralize(lastWord));
				else
					result += "." + upperFix(lastWord);
			} else {
				if (despluralize)
					result += upperFix(despluralize(lastWord));
				else
					result += upperFix(lastWord);
			}
		}
		return result;
	}

	public static String upperFix(String word) {
		String upr = word.toUpperCase();
		if (upr.equals("URL"))
			word = upr;
		else if (upr.equals("CPF"))
			word = upr;
		else if (upr.equals("CNPJ"))
			word = upr;
		else if (upr.equals("RG"))
			word = upr;
		else if (upr.equals("IE"))
			word = upr;
		else if (upr.equals("IM"))
			word = upr;
		else if (upr.equals("UF"))
			word = upr;
		else if (upr.equals("CEP"))
			word = upr;
		else if (upr.equals("GUID"))
			word = upr;
		else if (upr.equals("PID"))
			word = upr;
		return word;
	}

	public static String despluralize(String word) {
		if (word.endsWith("oes"))
			word = word.substring(0, word.length() - 3) + "ao";
		else if (word.endsWith("is"))
			word = word.substring(0, word.length() - 2) + "l";
		else if (word.endsWith("res"))
			word = word.substring(0, word.length() - 2);
		else if (word.endsWith("es") || word.endsWith("as")
				|| word.endsWith("os"))
			word = word.substring(0, word.length() - 1);
		else if (word.endsWith("ns"))
			word = word.substring(0, word.length() - 2) + "m";
		return word;
	}

	public static String unixTransform(String word) {
		String result = "";
		boolean lastIsUpper = true;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (lastIsUpper) {
				if (Character.isLowerCase(ch))
					lastIsUpper = false;
				result += Character.toLowerCase(ch);
			} else if (Character.isUpperCase(ch)) {
				result += "_" + Character.toLowerCase(ch);
				lastIsUpper = true;
			} else
				result += ch;
		}
		return result;
	}
	
	public static boolean isFunctionChecker(String field) {
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
	
	public static boolean canTrimField(String field) {
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
	
	public static boolean numberOnlyField(String field) {
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
	
	public static boolean skipTestField(String field) {
		if(field.compareToIgnoreCase("senha") == 0)
			return true;
		if(field.contains("data"))
			return true;
		return false;
	}

	public static boolean skipFixField(String field) {
		return false;
	}
	
	public static boolean skipUpdateField(String field) {
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
	
	public static boolean isVogal(char letter) {
		return ("aeiou").indexOf(Character.toLowerCase(letter)) >= 0;
	}
	
	public String getGenderChar(String name) {
		String nlc = name.toLowerCase();
		if(!nlc.equals("id") && nlc.endsWith("id"))
			nlc = nlc.substring(0, nlc.length() - 2);
		if(nlc.endsWith("_"))
			nlc = nlc.substring(0, nlc.length() - 1);
		if ((nlc.length() > 1 && !isVogal(nlc.charAt(nlc.length() - 2)) && !nlc.startsWith("m", nlc.length() - 2) && nlc.endsWith("a")) || nlc.endsWith("cao") || nlc.endsWith("de") || nlc.startsWith("a", 2) || (nlc.startsWith("a", 1) && !nlc.endsWith("o") && !nlc.endsWith("e")) || ((nlc.startsWith("e", 1) || nlc.startsWith("i", 0)) && nlc.endsWith("ao")))
			return "a";
		if (nlc.startsWith("o", 1) || nlc.endsWith("e") || nlc.endsWith("or") || nlc.endsWith("o") || nlc.equals("id") || nlc.endsWith("oid") || nlc.endsWith("el") || nlc.endsWith("il")
				|| nlc.endsWith("cnpj") || nlc.endsWith("cpf") || nlc.endsWith("in")|| nlc.endsWith("tema")|| nlc.endsWith("p") || nlc.length() == 1)
			return "o";
		return "a";
	}
	
	public String getCamelCaseName(String name) {
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

	protected List<Constraint> getUniqueKeyList(Table table) {
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
		return list;
	}

	protected Field getPkField(Table table) {
		for (Constraint constraint : table.getConstraints()) {
			if (constraint instanceof PrimaryKey) {
				if(constraint.getFields().size() == 1)
					return table.find(constraint.getFields().get(0).getName());
				break;
			}
		}
		return null;
	}

	public void setClassPrefix(String classPrefix) {
		this.classPrefix = classPrefix;
	}
	
	public String getClassPrefix() {
		return classPrefix;
	}

	public String getClassSuffix() {
		return classSuffix;
	}

	public void setClassSuffix(String classSuffix) {
		this.classSuffix = classSuffix;
	}

}
