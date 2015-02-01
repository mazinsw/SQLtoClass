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
}
