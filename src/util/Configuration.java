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
	public static final int GENERATE_JAVA = 2;
	public static final int PHP_DB_PDO = 0;
	public static final int PHP_FLUENT_PDO = 1;

	private String projectFile;
	private String file;
	private String path;
	private String pathDAO;
	private String suffix;
	private String prefix;
	private String suffixDAO;
	private String prefixDAO;
	private String upperWords;
	private boolean generateDAO;
	private int generator;
	private int phpPDO;
	private String packageName;
	private String packageNameDAO;
	private boolean daoHerdado;
	private boolean arrayAccess;
	private boolean proccessTemplate;
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

	public int getPHPPDO() {
		return phpPDO;
	}

	public void setPHPPDO(int phpDB) {
		this.phpPDO = phpDB;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageNameDAO() {
		return packageNameDAO;
	}

	public void setPackageNameDAO(String packageNameDAO) {
		this.packageNameDAO = packageNameDAO;
	}

	public boolean isDAOHerdado() {
		return daoHerdado;
	}

	public void setDAOHerdado(boolean daoHerdado) {
		this.daoHerdado = daoHerdado;
	}

	public boolean isArrayAccess() {
		return arrayAccess;
	}

	public void setArrayAccess(boolean arrayAccess) {
		this.arrayAccess = arrayAccess;
	}

	public boolean isProccessTemplate() {
		return proccessTemplate;
	}

	public void setProccessTemplate(boolean proccessTemplate) {
		this.proccessTemplate = proccessTemplate;
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

	public void load() {
		File configFile = new File(projectFile);

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
			packageName = props.getProperty("packageName");
			packageNameDAO = props.getProperty("packageNameDAO");
			setUpperWords(props.getProperty("upperWords"));
			if (props.containsKey("templatePath"))
				templatePath = props.getProperty("templatePath");
			if (props.containsKey("generateDAO"))
				generateDAO = props.getProperty("generateDAO").equals(String.valueOf(true));
			else
				generateDAO = false;
			if (props.containsKey("DAOHerdado"))
				daoHerdado = props.getProperty("DAOHerdado").equals(String.valueOf(true));
			else
				daoHerdado = false;
			if (props.containsKey("ArrayAccess"))
				arrayAccess = props.getProperty("ArrayAccess").equals(String.valueOf(true));
			else
				arrayAccess = false;
			if (props.containsKey("ProccessTemplate"))
				proccessTemplate = props.getProperty("ProccessTemplate").equals(String.valueOf(true));
			else
				proccessTemplate = false;
			if (props.containsKey("generator"))
				generator = Integer.valueOf(props.getProperty("generator"));
			else
				generator = GENERATE_PHP;
			phpPDO = PHP_DB_PDO;
			if (props.containsKey("phpPDO")) {
				if(props.getProperty("phpPDO").equals(String.valueOf(PHP_FLUENT_PDO)))
					phpPDO = PHP_FLUENT_PDO;
			}
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
			props.setProperty("packageName", packageName);
			props.setProperty("packageNameDAO", packageNameDAO);
			props.setProperty("templatePath", templatePath);
			props.setProperty("upperWords", getUpperWords());
			props.setProperty("generateDAO", String.valueOf(generateDAO));
			props.setProperty("DAOHerdado", String.valueOf(daoHerdado));
			props.setProperty("ArrayAccess", String.valueOf(arrayAccess));
			props.setProperty("ProccessTemplate", String.valueOf(proccessTemplate));
			props.setProperty("generator", String.valueOf(generator));
			props.setProperty("phpPDO", String.valueOf(phpPDO));
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
