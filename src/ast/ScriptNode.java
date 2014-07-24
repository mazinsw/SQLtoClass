package ast;

import java.util.ArrayList;
import java.util.List;

public class ScriptNode extends Node {
	private List<Node> statements;

	public ScriptNode() {
		statements = new ArrayList<>();
	}
	
	public List<Node> getStatements() {
		return statements;
	}

	public void addStatement(Node statement) {
		statements.add(statement);
	}
}
