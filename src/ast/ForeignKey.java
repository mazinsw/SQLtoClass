package ast;

public class ForeignKey extends Constraint {
	public static final int NO_ACTION = 0;
	public static final int RESTRICT = 1;
	public static final int CASCADE = 2;
	public static final int SET_NULL = 3;

	private Index references;
	private String tableName;
	private int updateAction;
	private int deleteAction;
	
	public ForeignKey(String tableName) {
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

	public void setUpdateAction(String action) {
		switch (action) {
		case "CASCADE":
			updateAction = CASCADE;
			break;
		case "RESTRICT":
			updateAction = RESTRICT;
			break;
		default:
			if (action.contains("SET") && action.contains("NULL")) {
				updateAction = SET_NULL;
			} else {
				updateAction = NO_ACTION;
			}
			break;
		}
	}

	public int getDeleteAction() {
		return deleteAction;
	}

	public void setDeleteAction(int deleteAction) {
		this.deleteAction = deleteAction;
	}

	public void setDeleteAction(String action) {
		switch (action) {
		case "CASCADE":
			deleteAction = CASCADE;
			break;
		case "RESTRICT":
			deleteAction = RESTRICT;
			break;
		default:
			if (action.contains("SET") && action.contains("NULL")) {
				deleteAction = SET_NULL;
			} else {
				deleteAction = NO_ACTION;
			}
			break;
		}
	}

	public String getDeleteActionText() {
		switch (deleteAction) {
		case CASCADE:
			return "CASCADE";
		case RESTRICT:
			return "RESTRICT";
		case SET_NULL:
			return "SET NULL";

		default:
			return "NO ACTION";
		}
	}

	public String getUpdateActionText() {
		switch (updateAction) {
		case CASCADE:
			return "CASCADE";
		case RESTRICT:
			return "RESTRICT";
		case SET_NULL:
			return "SET NULL";

		default:
			return "NO ACTION";
		}
	}
}
