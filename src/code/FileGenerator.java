package code;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Hashtable;

import ast.ScriptNode;
import ast.Table;
import util.Messages;

public abstract class FileGenerator extends CodeGenerator {
	private String classPrefix;
	private String classSuffix;
	private Hashtable<String, String> indexedTables;

	public FileGenerator(String outDir, ScriptNode script) {
		super(outDir, script);
		indexedTables = new Hashtable<>();
	}

	public void setClassPrefix(String classPrefix) {
		this.classPrefix = classPrefix;
	}
	
	public String getClassPrefix() {
		return classPrefix;
	}

	public String getClassSuffix() {
		return classSuffix;
	}

	public void setClassSuffix(String classSuffix) {
		this.classSuffix = classSuffix;
	}

	protected void run(Table table) throws FileNotFoundException {
		String name = normalize(table.getName());
		boolean indexed = false;
		if (isIndexed(name)) {
			name = name.replaceAll("\\[[0-9]+\\]", "");
			if (indexedTables.containsKey(name))
				return;
			indexedTables.put(name, name);
			indexed = true;
		}
		String[] part = name.split("\\.");
		name = part[part.length - 1];
		String nameWithExt = getNameWithExtension(name);
		String fileName = getOutputDirectory() + File.separatorChar + nameWithExt;
		log(String.format(Messages.getString("CodeGenerator.string3"), nameWithExt)); //$NON-NLS-1$
		PrintWriter out;
		out = new PrintWriter(new OutputStreamWriter(
				new FileOutputStream(fileName), getEncoding()), true);
		genHeader(out, table, name, indexed);
		genBody(out, table, name, indexed);
		genFooter(out, table, name, indexed);
		out.close();
		log(String.format(Messages.getString("CodeGenerator.string4"), nameWithExt)); //$NON-NLS-1$
	}


	protected abstract void genHeader(PrintWriter out, Table table, String name,
			boolean indexed);

	protected abstract void genBody(PrintWriter out, Table table, String name,
			boolean indexed);

	protected abstract void genFooter(PrintWriter out, Table table, String name,
			boolean indexed);

	protected abstract String getNameWithExtension(String name);

}
