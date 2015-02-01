package ast;

public class OrderField extends NamedNode {
	public static final int ASCENDENT = 0;
	public static final int DESCENDENT = 1;
	private int order;
	
	public OrderField(String name, int order) {
		super(name);
		this.setOrder(order);
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
