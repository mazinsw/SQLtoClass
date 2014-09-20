package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Hashtable;

import ast.Node;
import ast.ScriptNode;
import ast.Table;

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
		PrintWriter out = new PrintWriter(fileName);
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
						result += despluralize(lastWord) + ".";
					else
						result += lastWord + ".";
					lastIsVector = false;
				} else {
					if (despluralize)
						result += despluralize(lastWord);
					else
						result += lastWord;
				}
				lastWord = str;
				lastCaseIsUpper = true;
			} else if (!lastIsVector) {
				lastWord += ch;
				lastCaseIsUpper = Character.isUpperCase(ch);
			} else {
				lastIsVector = false;
				result += lastWord + ".";
				lastWord = str;
			}
			i++;
		}
		if (!lastWord.isEmpty()) {
			if (!currentIsVector && lastIsVector) {
				if (despluralize)
					result += "." + despluralize(lastWord);
				else
					result += "." + lastWord;
			} else {
				if (despluralize)
					result += despluralize(lastWord);
				else
					result += lastWord;
			}
		}
		return result;
	}

	public static String despluralize(String word) {
		if (word.endsWith("oes"))
			word = word.substring(0, word.length() - 3) + "ao";
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
		if(field.compareToIgnoreCase("email") == 0)
			return false;
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
	
	public static boolean skipTestField(String field) {
		if(field.compareToIgnoreCase("secreto") == 0)
			return true;
		if(field.compareToIgnoreCase("senha") == 0)
			return true;
		if(field.contains("data"))
			return true;
		return false;
	}

	public static boolean skipFixField(String field) {
		if(field.compareToIgnoreCase("secreto") == 0)
			return true;
		return false;
	}
	
	public String getGenderChar(String name) {
		String nlc = name.toLowerCase();
		if (nlc.endsWith("e") || nlc.endsWith("or") || nlc.endsWith("o") || nlc.equals("id") || nlc.endsWith("oid") || nlc.endsWith("il")
				|| nlc.endsWith("cnpj") || nlc.endsWith("cpf") || nlc.endsWith("in")|| nlc.endsWith("tema"))
			return "o";
		return "a";
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
