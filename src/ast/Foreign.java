package ast;

public class Foreign extends Constraint {
	public static final int RESTRICT = 0;
	public static final int CASCADE = 1;
	private Index references;
	private String tableName;
	private int updateAction;
	private int deleteAction;
	
	public Foreign(String tableName) {
		references = new Index();
		setTableName(tableName);
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Index getReferences() {
		return references;
	}

	public int getUpdateAction() {
		return updateAction;
	}

	public void setUpdateAction(int updateAction) {
		this.updateAction = updateAction;
	}

	public int getDeleteAction() {
		return deleteAction;
	}

	public void setDeleteAction(int deleteAction) {
		this.deleteAction = deleteAction;
	}

	public boolean find(String name) {
		for (OrderField orderField : getFields()) {
			if(orderField.getName().equals(name))
				return true;
		}
		return false;
	}
}
