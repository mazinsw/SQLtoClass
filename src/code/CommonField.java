package code;

import java.util.ArrayList;
import java.util.List;

import ast.Field;

public class CommonField {
	
	private List<Field> fields;
	private String range;
	
	public CommonField() {
		this.fields = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return getRange();
	}

	public List<Field> getFields() {
		return fields;
	}

	public void addField(Field field) {
		this.fields.add(field);
	}
	
	public int indexOf(Field field) {
		return getFields().indexOf(field);
	}
	
	public int size() {
		return getFields().size();
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

}
