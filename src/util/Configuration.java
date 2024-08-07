package util;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static final int GENERATE_PHP = 0;
	public static final int GENERATE_DELPHI = 1;
	public static final int GENERATE_JAVA = 2;
	public static final int PHP_DB_PDO = 0;
	public static final int PHP_FLUENT_PDO = 1;

	private String projectFile;
	private String inputFile;
	private String outputPath;
	private String upperWords;
	private String templatePath;
	private String lang;
	private String dictionary;

	public Configuration() {
		setProjectFile("config.properties");
		setTemplatePath("template/");
		setDictionary("");
	}
	
	public String getProjectFile() {
		return projectFile;
	}

	public void setProjectFile(String projectFile) {
		this.projectFile = projectFile;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void setTemplatePath(String templatePath) {
		this.templatePath = templatePath;
	}

	public String getTemplatePath() {
		return templatePath;
	}

	public String getUpperWords() {
		return upperWords;
	}

	public void setUpperWords(String upperWords) {
		this.upperWords = upperWords;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getDictionary() {
		return dictionary;
	}

	public String[] getDictionaryList() {
		return dictionary.split(";");
	}

	public void setDictionary(String dictionary) {
		this.dictionary = dictionary;
	}

	public void load() throws IOException {
		File configFile = new File(projectFile);

		FileReader reader = new FileReader(configFile);
		Properties props = new Properties();
		props.load(reader);

		if (props.containsKey("file"))
			inputFile = props.getProperty("file");
		if (props.containsKey("inputFile"))
			inputFile = props.getProperty("inputFile");
		if (props.containsKey("path"))
			outputPath = props.getProperty("path");
		if (props.containsKey("outputPath"))
			outputPath = props.getProperty("outputPath");
		if (props.containsKey("templatePath"))
			templatePath = props.getProperty("templatePath");
		lang = props.getProperty("lang", "pt-BR");
		String defaultDict = "oes|aes/3/ao;is/2/l/4;res|ses/2/;es|as|os|ds/1/;ns/2/m";
		if (lang.equalsIgnoreCase("en") || lang.equalsIgnoreCase("en-US")) {
			defaultDict = "ies/3/y;s/1/";
		}
		dictionary = props.getProperty("dict." + lang, defaultDict);
		setUpperWords(props.getProperty("upperWords"));
		reader.close();
	}

	public void save() throws IOException {
		File configFile = new File("config.properties");
		Properties props = new Properties();
		props.setProperty("inputFile", inputFile);
		props.setProperty("outputPath", outputPath);
		props.setProperty("templatePath", templatePath);
		props.setProperty("upperWords", getUpperWords());
		FileWriter writer = new FileWriter(configFile);
		props.store(writer, "generator");
		writer.close();
	}

}
