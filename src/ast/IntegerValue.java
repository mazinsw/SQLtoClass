package ast;

public class IntegerValue extends Value {
	private int value;

	public IntegerValue(int value) {
		this.setValue(value);
	}
	
	public IntegerValue(String value) {
		this.setValue(Integer.valueOf(value));
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
