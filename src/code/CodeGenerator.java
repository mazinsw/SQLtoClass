package code;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ast.Constraint;
import ast.Field;
import ast.Foreign;
import ast.Node;
import ast.OrderField;
import ast.PrimaryKey;
import ast.ScriptNode;
import ast.Table;
import ast.UniqueKey;
import util.LogListener;
import util.Messages;

public abstract class CodeGenerator implements LogListener {
	private ScriptNode script;
	private String outDir;

	private LogListener logListener;
	private int currentTableIndex;

	public CodeGenerator(String outDir, ScriptNode script) {
		this.script = script;
		this.outDir = outDir;
		setLogListener(this);
		currentTableIndex = -1;
	}
	
	public String getOutputDirectory() {
		return outDir;
	}

	public Table findTable(String name) {
		if(name == null)
			return null;
		for (Node node : script.getStatements()) {
			if (node instanceof Table && ((Table) node).getName().equalsIgnoreCase(name))
				return (Table) node;
		}
		return null;
	}
	
	public int getCurrentTableIndex() {
		return currentTableIndex;
	}

	public void start() throws Exception {
		for (Node node : script.getStatements()) {
			if (node instanceof Table) {
				currentTableIndex++;
				run((Table) node);
			}
		}
	}

	protected abstract void run(Table node) throws Exception;

	public static String normalize(String name) {
		return normalize(name, true);
	}
	
	protected Charset getEncoding() {
		return StandardCharsets.UTF_8;
	}
	
	protected void log(String message) {
		if(logListener != null)
			logListener.addMessage(message);
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
	protected static void processArray(Table table,
			Hashtable<String, String> indexedFields) {
		List<Field> normalFields = new ArrayList<>();
		for (Field field : table.getFields()) {
			String varName = normalize(field.getName(), false);
			if (!isIndexed(varName)) {
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
			// log(String.format(Messages.getString("CodeGenerator.string13"), varName, m.groupCount())); //$NON-NLS-1$
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
		if (TemplateLoader.UPR_WORDS.contains(upr))
			word = upr;
		return word;
	}

	public static String despluralize(String word) {
		if (word.endsWith("oes") || word.endsWith("aes"))
			word = word.substring(0, word.length() - 3) + "ao";
		else if (word.endsWith("is") && word.length() > 4)
			word = word.substring(0, word.length() - 2) + "l";
		else if (word.endsWith("res") || word.endsWith("ses"))
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
		word = Normalizer.normalize(word, Normalizer.Form.NFD);
		word = word.replaceAll("\\p{M}", "");
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
		return result.replace(' ', '_');
	}

	public static boolean isIndexed(String field) {
		return field.matches("^[a-zA-Z]+[\\[[0-9]+\\]]+$");
	}

	public static List<Integer> extractIndex(String field) {
		Matcher m = Pattern.compile("[([0-9]+)]+").matcher(field);
		List<Integer> list = new ArrayList<>();
		while(m.find()) {
			list.add(Integer.valueOf(m.group(0)));
		}
		return list;
	}
	
	public static boolean isVogal(char letter) {
		return ("aeiou").indexOf(Character.toLowerCase(letter)) >= 0;
	}
	
	public static String getGenderChar(String name) {
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

	public List<Field> getFields(Table table, Constraint constraint) {
		List<Field> list = new ArrayList<>();
		if(constraint == null)
			return list;
		for (OrderField orderField : constraint.getFields()) {
			Field field = table.find(orderField.getName());
			if(field == null)
				throw new RuntimeException(String.format(Messages.getString("CodeGenerator.string0"), orderField.getName(), table.getName())); //$NON-NLS-1$
			list.add(field);
		}
		return list;
	}
	
	public List<UniqueKey> getUniqueKeys(Table table) {
		return getUniqueKeys(table, false);
	}

	public List<UniqueKey> getUniqueKeys(Table table, boolean skipPk) {
		List<UniqueKey> list = new ArrayList<>();
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof UniqueKey))
				continue;
			if(skipPk && (constraint instanceof PrimaryKey))
				continue;
			list.add((UniqueKey)constraint);
		}
		return list;
	}

	public List<Foreign> getForeignKeys(Table table) {
		List<Foreign> list = new ArrayList<>();
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof Foreign))
				continue;
			list.add((Foreign)constraint);
		}
		return list;
	}
	
	public PrimaryKey getPrimaryKey(Table table) {
		for (Constraint constraint : table.getConstraints()) {
			if (!(constraint instanceof PrimaryKey))
				continue;
			return (PrimaryKey)constraint;
		}
		return null;
	}

	protected Field getPrimary(Table table) {
		Constraint constraint = getPrimaryKey(table);
		if(constraint != null && constraint.getFields().size() == 1)
			return table.find(constraint.getFields().get(0).getName());
		return null;
	}

	protected Field getDescriptor(Table table) {
		Hashtable<String, String> values = new Hashtable<>();
		Field descField = null;
		for (Field field : table.getFields()) {
			values.clear();
			TemplateLoader.extractComment(field.getComment(), values, "F.");
			if(values.containsKey("F.S")) {
				if(field.getType().isString() || descField == null)
					descField = field;
				if(values.get("F.S").isEmpty())
					return field;
			}
		}
		if(descField != null)
			return descField;
		for (Constraint constraint : table.getConstraints()) {
			if (constraint instanceof UniqueKey) {
				if(constraint.getFields().size() == 1) {
					Field field = table.find(constraint.getFields().get(0).getName());
					if(field.getType().isString())
						return field;
				}
			}
		}
		for (Field field : table.getFields()) {
			if(field.getType().isString())
				return field;
		}
		return getPrimary(table);
	}
	
	@Override
	public void addMessage(String message) {
		System.out.println(message);
	}

	public void setLogListener(LogListener logListener) {
		this.logListener = logListener;
	}

}
