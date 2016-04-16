package code;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

import ast.DataType;
import ast.Field;
import ast.Table;

public class TemplateLoader {
	private Collection<File> files;
	private File directory;
	
	public static final String UPR_WORDS = "URL|CPF|CNPJ|RG|IE|IM|UF|CEP|GUID|PID";

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
	
	public static String recase(String wordcase, String entry) {
		return recase(wordcase, entry, false);
	}
	
	public static String recase(String wordcase, String entry, boolean useWordDB) {
		String result = entry;
		if (useWordDB && TemplateLoader.UPR_WORDS.contains(entry.toUpperCase()))
			return entry.toUpperCase();
		if(Character.isLowerCase(wordcase.charAt(0)))
			result = result.toLowerCase();
		else if(wordcase.length() > 1 && Character.isUpperCase(wordcase.charAt(1)))
			result = result.toUpperCase();
		else
			result = result.substring(0, 1).toUpperCase() + result.toLowerCase().substring(1);
		return result;
	}
	
	public static File getFileFromType(Table table, Field field, Hashtable<String, String> values) throws Exception {
		if(field.getType().isBoolean())
			return new File("template/field/boolean.html");
		if(table.getReference(field.getName()) != null)
			return new File("template/field/reference.html");
		switch (field.getType().getType()) {
		case DataType.DECIMAL:
			return new File("template/field/currency.html");
		case DataType.DATE:
			return new File("template/field/date.html");
		case DataType.DATETIME:
			return new File("template/field/datetime.html");
		case DataType.ENUM:
			if(values.containsKey("F.R"))
				return new File("template/field/radio.html");
			return new File("template/field/enum.html");
		case DataType.FLOAT:
		case DataType.DOUBLE:
			return new File("template/field/float.html");
		case DataType.BLOB:
			return new File("template/field/image.html");
		case DataType.TINYINT:
		case DataType.INTEGER:
		case DataType.BIGINT:
			return new File("template/field/integer.html");
		case DataType.STRING:
		case DataType.CHAR:
			if(values.containsKey("F.M"))
				return new File("template/field/masked.html");
			if(values.containsKey("F.T"))
				return new File("template/field/text.html");
			return new File("template/field/string.html");
		case DataType.TEXT:
			return new File("template/field/text.html");
		case DataType.TIME:
			return new File("template/field/time.html");
		default:
			throw new Exception(String.format("Unknow template for type '%d'", field.getType().getType()));
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
	
	public static String extractComment(String fieldComment, Hashtable<String, String> values, String preffix) {
		String comment = "", cmm = fieldComment;
		List<String> cmds = new ArrayList<>();
		int state = 0, offset = -1;
		if(cmm == null)
			return null;
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
