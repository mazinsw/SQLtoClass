package ast;

import java.util.ArrayList;
import java.util.List;

public class Table extends CommentedNode {
	private List<Field> fields;
	private List<Constraint> constraints;
	private List<Index> indexes;

	public Table(String name) {
		super(name);
		fields = new ArrayList<>();
		constraints = new ArrayList<>();
		indexes = new ArrayList<>();
	}
	
	public List<Field> getFields() {
		return fields;
	}

	public void addField(Field field) {
		fields.add(field);
	}

	public List<Constraint> getConstraints() {
		return constraints;
	}

	public void addConstraint(Constraint constraint) {
		constraints.add(constraint);
	}

	public List<Index> getIndexes() {
		return indexes;
	}

	public void addIndex(Index index) {
		indexes.add(index);
	}
	
	public Field find(String name) {
		for (Field field : fields) {
			if(field.getName().equalsIgnoreCase(name))
				return field;
		}
		return null;
	}

	public String getReference(String name) {
		for (Constraint constraint : constraints) {
			if(constraint instanceof Foreign) {
				Foreign foreign = (Foreign)constraint;
				if(foreign.find(name))
					return foreign.getTableName();
			}
		}
		return null;
	}
	
}
