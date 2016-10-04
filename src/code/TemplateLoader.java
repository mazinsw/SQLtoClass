package code;

import java.io.File;
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

public class TemplateLoader {
	private Collection<File> files;
	private File directory;
	
	public static final String UPR_WORDS = "URL|CPF|CNPJ|RG|IE|IM|UF|CEP|GUID|PID|NCM|CFOP|CEST|ICMS|IPI|PIS";

	public TemplateLoader() {
		files = new ArrayList<>();
		directory = new File("template/output/");
	}
	
	public Collection<File> getFiles() {
		return files;
	}

	public void load() {
		files = FileUtils.listFilesAndDirs(directory, TrueFileFilter.TRUE, TrueFileFilter.TRUE);
		files.remove(directory);
	}
	
	public File getBaseDirectory() {
		return directory;
	}
	
	public File rebase(File file, File base) {
		return new File(file.getAbsolutePath().replace(directory.getAbsolutePath(), base.getAbsolutePath()));
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
	
	public static String recase(String wordcase, String entry) {
		return recase(wordcase, entry, false);
	}
	
	public static String recase(String wordcase, String entry, boolean useWordDB) {
		String result = entry;
		if (useWordDB && TemplateLoader.UPR_WORDS.contains(entry.toUpperCase()))
			return entry.toUpperCase();
		if(Character.isLowerCase(wordcase.charAt(0)) && wordcase.length() > 1 && Character.isUpperCase(wordcase.charAt(1)))
			result = entry;
		else if(Character.isLowerCase(wordcase.charAt(0)))
			result = result.toLowerCase();
		else if(wordcase.length() > 1 && Character.isUpperCase(wordcase.charAt(1)))
			result = result.toUpperCase();
		else
			result = result.substring(0, 1).toUpperCase() + result.toLowerCase().substring(1);
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
		case DataType.TIME:
			return "time";
		default:
			return "unknow";
		}
	}
	
	public static File getFileForField(Table table, Field field, Hashtable<String, String> attributes) throws Exception {
		String type = getTypeNameFromType(table, field);
		String attribute = "unknow";
		
		if(table.getReference(field.getName()) != null)
			attribute = "reference";
		else if(attributes.containsKey("F.R"))
			attribute = "radio";
		else if(attributes.containsKey("F.M"))
			attribute = "masked";
		else if(attributes.containsKey("F.P"))
			attribute = "password";
		else if(attributes.containsKey("F.I"))
			attribute = "image";
		switch (attribute) {
		case "reference":
			return new File("template/field/reference.html");
		case "radio":
			return new File("template/field/radio.html");
		case "image":
			return new File("template/field/image.html");
		case "masked":
			return new File("template/field/masked.html");
		case "password":
			return new File("template/field/password.html");
		}
		
		switch (type) {
		case "boolean":
			return new File("template/field/boolean.html");
		case "reference":
			return new File("template/field/reference.html");
		case "currency":
			return new File("template/field/currency.html");
		case "date":
			return new File("template/field/date.html");
		case "datetime":
			return new File("template/field/datetime.html");
		case "radio":
			return new File("template/field/radio.html");
		case "enum":
			return new File("template/field/enum.html");
		case "float":
		case "double":
			return new File("template/field/float.html");
		case "image":
			return new File("template/field/image.html");
		case "blob":
			return new File("template/field/blob.html");
		case "integer":
		case "bigint":
			return new File("template/field/integer.html");
		case "masked":
			return new File("template/field/masked.html");
		case "password":
			return new File("template/field/password.html");
		case "text":
			return new File("template/field/text.html");
		case "string":
			return new File("template/field/string.html");
		case "time":
			return new File("template/field/time.html");
		default:
			throw new Exception(String.format("Unknow template for type '%s'(%d)", type, field.getType().getType()));
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

}
