package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	public static final int GENERATE_PHP = 0;
	public static final int GENERATE_DELPHI = 1;
	private String file;
	private String path;
	private String pathDAO;
	private String suffix;
	private String prefix;
	private String suffixDAO;
	private String prefixDAO;
	private boolean generateDAO;
	private int generator;

	public Configuration() {
		load();
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public int getGenerator() {
		return generator;
	}

	public void setGenerator(int generation) {
		this.generator = generation;
	}

	public String getPathDAO() {
		return pathDAO;
	}

	public void setPathDAO(String pathDAO) {
		this.pathDAO = pathDAO;
	}

	public String getSuffixDAO() {
		return suffixDAO;
	}

	public void setSuffixDAO(String suffixDAO) {
		this.suffixDAO = suffixDAO;
	}

	public String getPrefixDAO() {
		return prefixDAO;
	}

	public void setPrefixDAO(String prefixDAO) {
		this.prefixDAO = prefixDAO;
	}

	public boolean isGenerateDAO() {
		return generateDAO;
	}

	public void setGenerateDAO(boolean generateDAO) {
		this.generateDAO = generateDAO;
	}

	public void load() {
		File configFile = new File("config.properties");

		try {
			FileReader reader = new FileReader(configFile);
			Properties props = new Properties();
			props.load(reader);

			file = props.getProperty("file");
			path = props.getProperty("path");
			suffix = props.getProperty("suffix");
			prefix = props.getProperty("prefix");
			pathDAO = props.getProperty("pathDAO");
			suffixDAO = props.getProperty("suffixDAO");
			prefixDAO = props.getProperty("prefixDAO");
			if (props.containsKey("generateDAO"))
				generateDAO = props.getProperty("generateDAO").equals(String.valueOf(true));
			else
				generateDAO = false;
			if (props.containsKey("generator"))
				generator = Integer.valueOf(props.getProperty("generator"));
			else
				generator = GENERATE_PHP;
			reader.close();
		} catch (FileNotFoundException ex) {
			// file does not exist
		} catch (IOException ex) {
			// I/O error
		}
	}

	public void save() {
		File configFile = new File("config.properties");

		try {
			Properties props = new Properties();
			props.setProperty("file", file);
			props.setProperty("path", path);
			props.setProperty("suffix", suffix);
			props.setProperty("prefix", prefix);
			props.setProperty("pathDAO", pathDAO);
			props.setProperty("suffixDAO", suffixDAO);
			props.setProperty("prefixDAO", prefixDAO);
			props.setProperty("generateDAO", String.valueOf(generateDAO));
			props.setProperty("generator", String.valueOf(generator));
			FileWriter writer = new FileWriter(configFile);
			props.store(writer, "generator");
			writer.close();
		} catch (FileNotFoundException ex) {
			// file does not exist
		} catch (IOException ex) {
			// I/O error
		}
	}

}
