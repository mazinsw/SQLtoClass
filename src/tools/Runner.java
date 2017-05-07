package tools;

import ast.ASTBuilder;
import code.CodeGenerator;
import code.DelphiGenerator;
import code.DelphiGeneratorDAO;
import code.FileGenerator;
import code.JavaGenerator;
import code.JavaGeneratorDAO;
import code.PHPGeneratorBase;
import code.PHPGeneratorDB;
import code.PHPGeneratorFluentPDO;
import code.TemplateGenerator;
import util.Configuration;
import util.LogListener;

public class Runner {
	private LogListener log;
	private Configuration configuration;

	public Runner(LogListener log) {
		this.log = log;
		setConfiguration(new Configuration());
	}

	public Configuration getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public int execute() {
		return execute(false);
	}
	
	public int execute(boolean saveOnSuccess) {
		ASTBuilder builder = new ASTBuilder();
		if(!builder.build(configuration.getFile())) {
			for (String	error: builder.getErrors()) {
				log(error);
			}
			return 500;
		}
		CodeGenerator gen;
		CodeGenerator genDAO = null;
		
		if(configuration.isProccessTemplate()) {
			TemplateGenerator tgen = new TemplateGenerator(configuration.getPath(), builder.getScript());
			tgen.getTemplateLoader().setBaseDirectory(configuration.getTemplatePath());
			gen = tgen;
		} else {
			FileGenerator fgen;
			switch (configuration.getGenerator()) {
			case Configuration.GENERATE_DELPHI:
				fgen = new DelphiGenerator(configuration.getPath(), builder.getScript());
				if(configuration.isGenerateDAO()) {
					DelphiGeneratorDAO dgenDAO = new DelphiGeneratorDAO(configuration.getPathDAO(), builder.getScript());
					dgenDAO.setClassPrefix(configuration.getPrefixDAO());
					dgenDAO.setClassSuffix(configuration.getSuffixDAO());
					dgenDAO.setInherited(configuration.isDAOHerdado());
					dgenDAO.setClassBasePrefix(configuration.getPrefix());
					dgenDAO.setClassBaseSuffix(configuration.getSuffix());
					genDAO = dgenDAO;
				}
				break;
			case Configuration.GENERATE_PHP:
				PHPGeneratorBase pgen;
				switch (configuration.getPHPPDO()) {
				case Configuration.PHP_FLUENT_PDO:
					pgen = new PHPGeneratorFluentPDO(configuration.getPath(), builder.getScript());
					break;
				default: // Configuration.PHP_DB_PDO
					pgen = new PHPGeneratorDB(configuration.getPath(), builder.getScript());
				}
				pgen.setArrayAccess(configuration.isArrayAccess());
				fgen = pgen;
				break;
			default: // Configuration.GENERATE_JAVA
				JavaGenerator jgen = new JavaGenerator(configuration.getPath(), builder.getScript());
				jgen.setPackageName(configuration.getPackageName());
				fgen = jgen;
				if(configuration.isGenerateDAO()) {
					JavaGeneratorDAO jgenDAO = new JavaGeneratorDAO(configuration.getPathDAO(), builder.getScript());
					jgenDAO.setClassPrefix(configuration.getPrefixDAO());
					jgenDAO.setClassSuffix(configuration.getSuffixDAO());
					jgenDAO.setClassBasePrefix(configuration.getPrefix());
					jgenDAO.setClassBaseSuffix(configuration.getSuffix());
					jgenDAO.setPackageBaseName(configuration.getPackageName());
					jgenDAO.setPackageName(configuration.getPackageNameDAO());
					genDAO = jgenDAO;
				}
			}
			fgen.setClassPrefix(configuration.getPrefix());
			fgen.setClassSuffix(configuration.getSuffix());
			gen = fgen;
		}
		gen.getTemplateLoader().setUpperWords(configuration.getUpperWords());
		gen.setLogListener(log);
		try {
			gen.start();
			if(genDAO != null)
				genDAO.start();
			if(saveOnSuccess)
				configuration.save();
		} catch (Exception e) {
			log(e.getMessage());
			return 500;
		}
		return 0;
	}

	private void log(String message) {
		if(log != null)
			log.addMessage(message);
	}

}
