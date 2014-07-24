package ast;

import java.util.ArrayList;
import java.util.List;

public class Index extends Node {

	private List<OrderFied> fields;
	
	public Index() {
		fields = new ArrayList<>();
	}

	public List<OrderFied> getFields() {
		return fields;
	}

	public void addField(OrderFied field) {
		fields.add(field);
	}
}
