package code;

import java.io.File;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.apache.commons.lang3.text.WordUtils;

import ast.DataType;
import ast.Field;
import ast.Table;
import util.Configuration;

public class TemplateLoader {
	private Collection<File> files;
	private File templateDirectory;
	private File ouputDirectory;
	private String upperWords;

	public TemplateLoader(Configuration config) {
		files = new ArrayList<>();
		this.templateDirectory = new File(config.getTemplatePath());
		this.ouputDirectory = new File(config.getOutputPath());
		this.setUpperWords(config.getUpperWords());
	}

	public Collection<File> getFiles() {
		return files;
	}

	public void load() {
		files = FileUtils.listFilesAndDirs(templateDirectory, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
		files.remove(templateDirectory);
	}
	
	public File rebase(File file) {
		return new File(file.getAbsolutePath().replace(templateDirectory.getAbsolutePath(), ouputDirectory.getAbsolutePath()));
	}

	/**
	 * Return wrap text with max length characters
	 * 
	 * @param text text to wrap
	 * @param length max line width
	 * @param preffix preffix for each line
	 * @return
	 */
	public static String wrap(String text, int length, String preffix) {
		text = WordUtils.wrap(text, length);
		if(preffix == null)
			return text;
		return preffix + text.replaceAll("\n", "\n" + preffix);
	}
	
	public String recase(String wordcase, String entry) {
		return recase(wordcase, entry, false);
	}
	
	public static String camelCase(String name) {
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
	
	public String recase(String wordcase, String entry, boolean useWordDB) {
		String result = entry;
		if (useWordDB && canUpper(entry)) {
			entry =  entry.toUpperCase();
		}
		if(Character.isLowerCase(wordcase.charAt(0)) && wordcase.length() > 1 && Character.isUpperCase(wordcase.charAt(1)))
			result = camelCase(entry);
		else if(Character.isLowerCase(wordcase.charAt(0)))
			result = result.toLowerCase();
		else if(wordcase.length() > 1 && Character.isUpperCase(wordcase.charAt(1)))
			result = result.toUpperCase();
		else
			result = entry;
		return result;
	}
	
	public static String getTypeNameFromType(Table table, Field field) {
		if(field.getType().isBoolean())
			return "boolean";
		switch (field.getType().getType()) {
		case DataType.DECIMAL:
			return "currency";
		case DataType.DATE:
			return "date";
		case DataType.DATETIME:
			return "datetime";
		case DataType.ENUM:
			return "enum";
		case DataType.FLOAT:
			return "float";
		case DataType.DOUBLE:
			return "double";
		case DataType.BLOB:
			return "blob";
		case DataType.TINYINT:
		case DataType.INTEGER:
			return "integer";
		case DataType.BIGINT:
			return "bigint";
		case DataType.STRING:
		case DataType.CHAR:
			return "string";
		case DataType.TEXT:
			return "text";
		case DataType.JSON:
			return "json";
		case DataType.TIME:
			return "time";
		default:
			return "unknow";
		}
	}
	
	public static String getValueByIndex(String separatedValues, int index, String defaultValue) {
		if(separatedValues == null)
			return defaultValue;
		String[] array = separatedValues.split("\\|");
		if(index < 0 || index >= array.length)
			return defaultValue;
		return array[index];
	}

	public String normalize(String name) {
		return normalize(name, true);
	}
	
	public String normalize(String name, boolean despluralize) {
		if (name.matches("T[A-Z].*")) {
			name = name.substring(1);
		}
		name = Normalizer.normalize(name, Normalizer.Form.NFD);
		name = name.replaceAll("\\p{M}", "");
		String result = "", lastWord = "";
		boolean lastCaseIsUpper = false, lastIsVector = false, currentIsVector = false;
		int i = 0;
		while (i < name.length()) {
			char ch = name.charAt(i);
			String str = "" + ch;
			currentIsVector = false;
			if (ch == '_' || ch == ' ') {
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

	public String upperFix(String word) {
		if (canUpper(word)) {
			word = word.toUpperCase();
		}
		return word;
	}

	public static String despluralize(String word) {
		List<String> list = new ArrayList();
		for (String rule : list) {
			String[] parts = rule.split("/");
			String[] subsjects = parts[0].split("\\|"); 
			int cut = Integer.parseInt(parts[1]);
			String replacement = parts[2];
			int minLength = 0;
			if (parts.length >= 4) {
				minLength = Integer.parseInt(parts[3]);
			}
			if (word.length() <= minLength) {
				continue;
			}
			boolean test = false;
			for (String endsWith: subsjects) {
				test = test || word.endsWith(endsWith);
			}
			if (!test) {
				continue;
			}
			word = word.substring(0, word.length() - cut) + replacement;
			break;
		}
		return word;
	}

	public static String despluralizeOld(String word) {
		if (word.endsWith("oes") || word.endsWith("aes"))
			word = word.substring(0, word.length() - 3) + "ao";
		else if (word.endsWith("is") && word.length() > 4)
			word = word.substring(0, word.length() - 2) + "l";
		else if (word.endsWith("res") || word.endsWith("ses"))
			word = word.substring(0, word.length() - 2);
		else if (word.endsWith("es") || word.endsWith("as")
				|| word.endsWith("os") || word.endsWith("ds"))
			word = word.substring(0, word.length() - 1);
		else if (word.endsWith("ns"))
			word = word.substring(0, word.length() - 2) + "m";
		return word;
	}
	
	private static String resolveSlashs(String cmm) {
		String comment = "";
		for (int i = 0; i < cmm.length(); i++) {
			switch (cmm.charAt(i)) {
			case '\\':
				if(i + 1 >= cmm.length())
					break;
				i++;
				if(cmm.charAt(i) == 'n')
					comment += '\n';
				else if(cmm.charAt(i) == 't')
					comment += '\t';
				else if(cmm.charAt(i) == 'r')
					comment += '\r';
				else
					comment += cmm.charAt(i);
				break;
			default:
				comment += cmm.charAt(i);
				break;
			}
		}
		return comment;
	}
	
	public static String extractComment(String fieldComment) {
		Hashtable<String, String> values = new Hashtable<>();
		return extractComment(fieldComment, values, "");
	}
	
	public static String extractComment(String fieldComment, Hashtable<String, String> values) {
		return extractComment(fieldComment, values, "");
	}
	
	public static String extractComment(String fieldComment, Hashtable<String, String> values, String preffix) {
		String comment = "", cmm = fieldComment;
		List<String> cmds = new ArrayList<>();
		int state = 0, offset = -1;
		if(cmm == null)
			return null;
		cmm = resolveSlashs(cmm);
		for (int i = cmm.length() - 1; i >= 0; i--) {
			switch (cmm.charAt(i)) {
			case ']':
				state = 1;
				offset = i;
				break;
			case '[':
				if(state != 1)
					break;
				String cmd = cmm.substring(i + 1, offset);
				cmds.add(cmd);
				offset = -1;
				state = 0;
				break;
			default:
				if(state == 1)
					break;
				if(" \n\r\t".indexOf(cmm.charAt(i)) == -1) {
					cmm = cmm.substring(0, i + 1);
					i = 0; // exit for loop
					state = 2;
				}
				break;
			}
		}
		if(state != 2)
			cmm = "";
		comment = cmm;
		for (String cmd : cmds) {
			offset = cmd.indexOf(':');
			if(offset == -1) {
				if(!cmd.isEmpty())
					values.put(preffix + cmd, "");
				continue;
			}
			String key = cmd.substring(0, offset);
			if(key.isEmpty())
				continue;
			values.put(preffix + key, cmd.substring(offset + 1));
		}
		return comment;
	}

	public String getUpperWords() {
		return upperWords;
	}

	public void setUpperWords(String upperWords) {
		if (upperWords != null && !upperWords.startsWith("|")) {
			upperWords = "|" + upperWords;
		}
		if (upperWords != null && !upperWords.endsWith("|")) {
			upperWords = upperWords + "|";
		}
		if (upperWords != null) {
			upperWords = upperWords.toUpperCase();
		}
		this.upperWords = upperWords;
	}
	
	public boolean canUpper(String entry) {
		if (getUpperWords() == null) {
			return false;
		}
		return getUpperWords().contains("|" + entry.toUpperCase() + "|");
	}

}
