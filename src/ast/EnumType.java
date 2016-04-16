package ast;

import java.util.ArrayList;
import java.util.List;

public class EnumType extends DataType {
	private List<String> elements;

	public EnumType(int type) {
		super(type);
		elements = new ArrayList<>();
	}

	public List<String> getElements() {
		return elements;
	}

	public void addElement(String element) {
		elements.add(element);
	}
	
	@Override
	public boolean isBoolean() {
		if(getType() != DataType.ENUM || getElements().size() != 2)
			return false;
		if ((getElements().get(0).equals("Y") && getElements().get(1).equals("N")) || 
			(getElements().get(0).equals("N") &&  getElements().get(1).equals("Y")))
			return true;
		return false;
	}

}
