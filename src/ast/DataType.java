package ast;

public class DataType extends Node {
	public static final int STRING = 0;
	public static final int INTEGER = 1;
	public static final int FLOAT = 2;
	public static final int ENUM = 3;
	public static final int DATETIME = 4;
	public static final int DATE = 5;
	public static final int TIME = 6;
	public static final int BOOLEAN = 7;
	public static final int DOUBLE = 8;
	public static final int BIGINT = 9;
	public static final int TEXT = 10;
	public static final int CHAR = 11;
	public static final int TINYINT = 12;
	public static final int BLOB = 13;
	public static final int DECIMAL = 14;
	private int type;
	
	public DataType(int type) {
		setType(type);
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public boolean isBoolean() {
		return getType() == BOOLEAN;
	}

	public boolean isNumeric() {
		return getType() == INTEGER || getType() == BIGINT || getType() == TINYINT || 
				getType() == FLOAT || getType() == DECIMAL || getType() == DOUBLE;
	}
}
