package main;

import java.io.IOException;

import tools.Runner;
import util.Configuration;
import util.LogListener;

public class Main implements LogListener {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Main main = new Main();
		int status = main.runConsole(args);
		if(status != 0)
			System.exit(status);
	}
	
	private int runConsole(String[] args) {
		Configuration config = new Configuration();
		boolean silent = false;
		boolean saveOnComplete = false;
		int i = 0;
		while (i < args.length) {
			String cmd = args[i];
			switch (cmd) {
			case "-p":
			case "--project":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setProjectFile(args[i + 1]);
				try {
					config.load();
				} catch (IOException e) {
					return showHelp(400, cmd, e.getMessage());
				}
				i++;
				break;
			case "-f":
			case "--file":
			case "-i":
			case "--input":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setInputFile(args[i + 1]);
				i++;
				break;
			case "-o":
			case "--output":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setOutputPath(args[i + 1]);
				i++;
				break;
			case "-t":
			case "--template":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setTemplatePath(args[i + 1]);
				i++;
				break;
			case "-uw":
			case "--upper-words":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setUpperWords(args[i + 1]);
				i++;
				break;
			case "-sv":
			case "--save":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setProjectFile(args[i + 1]);
				saveOnComplete = true;
				i++;
				break;
			case "-h":
			case "--help":
				return showHelp(0, cmd);
			case "-s":
			case "--silent":
				silent = true;
				break;
			default:
				config.setInputFile(cmd);
			}
			i++;
		}
		if(config.getInputFile() == null)
			return showHelp(404, "-i");
		if(config.getOutputPath() == null)
			return showHelp(404, "-o");
		LogListener log = this;
		if(silent)
			log = null;
		Runner runner = new Runner(log);
		runner.setConfiguration(config);
		return runner.execute(saveOnComplete);
	}

	private int showHelp(int status, String cmd) {
		return showHelp(status, cmd, null);
	}
	
	private int showHelp(int status, String cmd, String errorMessage) {
		System.out.println("===== SQLtoClass =====");
		if(status == 404)
			System.out.println("Command not found: " + cmd);
		else if(status == 400)
			System.out.println("Parameter of '" + cmd + "' not found");
		else if(status != 0)
			System.out.println("Invalid command or usage of '" + cmd + "'");
		if (errorMessage != null) {
			System.out.println("Error: " + errorMessage);
		}
		if(status != 0)
			System.out.println();
		System.out.println("Usage: java -jar SQLtoClass.jar [options] input.sql");
		System.out.println("Options:");
		System.out.println("\t(-p|--project) project.properties: read a project from file");
		System.out.println("\t(-f|--file|-i|--input) input.sql: set the input sql file");
		System.out.println("\t(-o|--output) output_dir: set the output directory");
		System.out.println("\t(-uw|--upper-words) word1|word2: set the uppercase database name");
		System.out.println("\t(-sv|--save) project.properties: save configuration to file when finishes");
		System.out.println("\t(-h|--help): show this help");
		System.out.println("\t(-s|--silent): run without print anything");
		return status;
	}

	@Override
	public void addMessage(String message) {
		System.out.println(message);
	}

}
