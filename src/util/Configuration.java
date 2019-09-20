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

	public Configuration() {
		setProjectFile("config.properties");
		setTemplatePath("template/");
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
