package ast;

public class CommentedNode extends NamedNode {
	
	private String comment;

	public CommentedNode(String name) {
		super(name);
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
