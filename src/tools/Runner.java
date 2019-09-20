package tools;

import ast.ASTBuilder;
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
		if(!builder.build(configuration.getInputFile())) {
			for (String	error: builder.getErrors()) {
				log(error);
			}
			return 500;
		}	
		try {
			TemplateGenerator generator = new TemplateGenerator(builder.getScript(), configuration);
			generator.setLogListener(log);
			generator.start();
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
