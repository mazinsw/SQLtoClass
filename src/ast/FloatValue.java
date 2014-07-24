package ast;

public class FloatValue extends Value {
	private float value;

	public FloatValue(float value) {
		this.setValue(value);
	}
	
	public FloatValue(String value) {
		this.setValue(Float.valueOf(value));
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
}
