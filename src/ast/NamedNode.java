package ast;

public class NamedNode extends Node {
	private String name;
	
	public NamedNode(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
