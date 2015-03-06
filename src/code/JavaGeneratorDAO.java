package code;

import java.io.PrintWriter;

import ast.ScriptNode;
import ast.Table;

public class JavaGeneratorDAO extends JavaGeneratorBase {
	private String classBasePrefix;
	private String classBaseSuffix;

	public JavaGeneratorDAO(String outDir, ScriptNode script) {
		super(outDir, script);
		// TODO Auto-generated constructor stub
	}	

	public String getClassBasePrefix() {
		return classBasePrefix;
	}

	public void setClassBasePrefix(String classBasePrefix) {
		this.classBasePrefix = classBasePrefix;
	}

	public String getClassBaseSuffix() {
		return classBaseSuffix;
	}

	public void setClassBaseSuffix(String classBaseSuffix) {
		this.classBaseSuffix = classBaseSuffix;
	}

	private String getBaseClassName(String name) {
		return getClassBasePrefix() + name + getClassBaseSuffix();
	}

	@Override
	public void genHeader(PrintWriter out, Table table, String name,
			boolean indexed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void genClass(PrintWriter out, Table table, String name,
			boolean indexed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void genFooter(PrintWriter out, Table table, String name,
			boolean indexed) {
		// TODO Auto-generated method stub
		
	}

}
