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

}
