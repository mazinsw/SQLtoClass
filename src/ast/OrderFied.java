package ast;

public class OrderFied extends NamedNode {
	public static final int ASCENDENT = 0;
	public static final int DESCENDENT = 1;
	private int order;
	
	public OrderFied(String name, int order) {
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
