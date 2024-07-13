package ast;

import java.util.ArrayList;
import java.util.List;

public class Index extends NamedNode {

	private List<OrderField> fields;
	
	public Index() {
		super(null);
		fields = new ArrayList<>();
	}

	public List<OrderField> getFields() {
		return fields;
	}

	public void addField(OrderField field) {
		fields.add(field);
	}

	public OrderField find(String name) {
		for (OrderField orderField : getFields()) {
			if(orderField.getName().equals(name))
				return orderField;
		}
		return null;
	}

	public boolean exists(String name) {
		return find(name) != null;
	}
}
