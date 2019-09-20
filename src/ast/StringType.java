package ast;

public class StringType extends DataType {
	
	private long length;

	public StringType(int type) {
		super(type);
	}

	public void setLength(long length) {
		this.length = length;
	}

	public long getLength() {
		return length;
	}

}
