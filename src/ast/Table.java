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
		if(constraint instanceof PrimaryKey)
			constraints.add(0, constraint);
		else
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

	public ForeignKey findForeignKey(String fieldName) {
		for (Constraint constraint : constraints) {
			if(constraint instanceof ForeignKey) {
				ForeignKey foreign = (ForeignKey)constraint;
				if(foreign.exists(fieldName))
					return foreign;
			}
		}
		return null;
	}

	public String getReference(String fieldName) {
		ForeignKey foreign = findForeignKey(fieldName);
		if(foreign != null)
			return foreign.getTableName();
		return null;
	}

	public boolean isUnique(Field field) {
		return getUniqueIndex(field) != null;
	}

	public Index getUniqueIndex(Field field) {
		for (Constraint constraint : constraints) {
			if(!(constraint instanceof UniqueKey))
				continue;
			for (OrderField oField : constraint.getFields()) {
				if(oField.getName().equalsIgnoreCase(field.getName()))
					return constraint;
			}
		}
		return null;
	}

	public Index findIndex(Field field) {
		for (Index index : indexes) {
			for (OrderField oField : index.getFields()) {
				if(oField.getName().equalsIgnoreCase(field.getName()))
					return index;
			}
		}
		return null;
	}

	public Constraint findConstraint(String fieldName) {
		for (Constraint constraint : constraints) {
			for (OrderField oField : constraint.getFields()) {
				if(oField.getName().equalsIgnoreCase(fieldName))
					return constraint;
			}
		}
		return null;
	}
}
