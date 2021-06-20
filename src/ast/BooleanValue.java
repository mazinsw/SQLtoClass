package ast;

public class BooleanValue extends Value {
	private boolean value;

	public BooleanValue(boolean value) {
		this.setValue(value);
	}
	
	public BooleanValue(String value) {
		this.setValue(Boolean.valueOf(value));
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return String.valueOf(value);
	}
}
