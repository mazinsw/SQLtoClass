package main;

import java.awt.EventQueue;

import gui.MainWindow;
import tools.Runner;
import util.Configuration;
import util.LogListener;

public class Main implements LogListener {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		if(args.length == 0) {
			runUI();
			return;
		}
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
				config.load();
				i++;
				break;
			case "-f":
			case "--file":
			case "-i":
			case "--input":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setFile(args[i + 1]);
				i++;
				break;
			case "-o":
			case "--output":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setPath(args[i + 1]);
				i++;
				break;
			case "-od":
			case "--output-dao":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setPathDAO(args[i + 1]);
				i++;
				break;
			case "-pf":
			case "--preffix":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setPrefix(args[i + 1]);
				i++;
				break;
			case "-pfd":
			case "--preffix-dao":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setPrefixDAO(args[i + 1]);
				i++;
				break;
			case "-sf":
			case "--suffix":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setSuffix(args[i + 1]);
				i++;
				break;
			case "-sfd":
			case "--suffix-dao":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setSuffixDAO(args[i + 1]);
				i++;
				break;
			case "-pk":
			case "--package":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setPackageName(args[i + 1]);
				i++;
				break;
			case "-pkd":
			case "--package-dao":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setPackageNameDAO(args[i + 1]);
				i++;
				break;
			case "-l":
			case "--lang":
			case "--language":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				switch (args[i + 1]) {
				case "delphi":
				case "pascal":
					config.setGenerator(Configuration.GENERATE_DELPHI);
					break;
				case "java":
					config.setGenerator(Configuration.GENERATE_JAVA);
					break;
				case "php":
					config.setGenerator(Configuration.GENERATE_PHP);
					break;
				}
				i++;
				break;
			case "-t":
			case "--template":
				if(i + 1 >= args.length)
					return showHelp(400, cmd);
				config.setProccessTemplate(true);
				config.setTemplatePath(args[i + 1]);
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
			case "-n":
			case "--inherited":
				config.setDAOHerdado(true);
				break;
			case "-a":
			case "--array":
				config.setArrayAccess(true);
				break;
			case "-d":
			case "--dao":
				config.setGenerateDAO(true);
				break;
			case "-u":
			case "--fluentePDO":
				config.setPHPPDO(Configuration.PHP_FLUENT_PDO);
				break;
			case "-h":
			case "--help":
				return showHelp(0, cmd);
			case "-s":
			case "--silent":
				silent = true;
				break;
			default:
				config.setFile(cmd);
			}
			i++;
		}
		if(config.getFile() == null)
			return showHelp(404, "-i");
		if(config.getPath() == null)
			return showHelp(404, "-o");
		LogListener log = this;
		if(silent)
			log = null;
		Runner runner = new Runner(log);
		runner.setConfiguration(config);
		return runner.execute(saveOnComplete);
	}

	private int showHelp(int status, String cmd) {
		System.out.println("===== SQLtoClass =====");
		if(status == 404)
			System.out.println("Command not found: " + cmd);
		else if(status == 400)
			System.out.println("Parameter of '" + cmd + "' not found");
		else if(status != 0)
			System.out.println("Invalid command or usage of '" + cmd + "'");
		if(status != 0)
			System.out.println();
		System.out.println("Usage: java -jar SQLtoClass.jar [options] input.sql");
		System.out.println("Options:");
		System.out.println("\t(-p|--project) project.properties: read a project from file");
		System.out.println("\t(-f|--file|-i|--input) input.sql: set the input sql file");
		System.out.println("\t(-o|--output) output_dir: set the output directory");
		System.out.println("\t(-od|--output-dao) outdir_dir: set the output directory of dao");
		System.out.println("\t(-pf|--preffix) preffix: set the class name preffix");
		System.out.println("\t(-pfd|--preffix-dao) preffix: set the name preffix of DAO class");
		System.out.println("\t(-sf|--suffix) suffix: set the suffix of class name");
		System.out.println("\t(-sfd|--suffix-dao) suffix: set the suffix of DAO class name");
		System.out.println("\t(-pk|--package) package: set the package name (for Java)");
		System.out.println("\t(-pkd|--package-dao) package: set the package name for DAO classes (for Java)");
		System.out.println("\t(-l|--lang|--language) (delphi|pascal|java|php): set the language to generate code");
		System.out.println("\t(-sv|--save) project.properties: save configuration to file when finishes");
		System.out.println("\t(-n|--inherited): generate DAO inherited (for Delphi and Pascal)");
		System.out.println("\t(-a|--array): generate class array access for fields(for PHP)");
		System.out.println("\t(-d|--dao): generate DAO classes");
		System.out.println("\t(-u|--fluentePDO): generate DAO with fluentPDO (for PHP)");
		System.out.println("\t(-t|--template): generate template only");
		System.out.println("\t(-h|--help): show this help");
		System.out.println("\t(-s|--silent): run without print anything");
		return status;
	}

	private static void runUI() {
		// Locale.setDefault(new Locale("pt", "BR"));
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void addMessage(String message) {
		System.out.println(message);
	}

}
