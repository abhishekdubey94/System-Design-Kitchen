package command;

import dish.Dessert;

public class OrderDessert implements Order {
	Dessert item;
	
	public OrderDessert(Dessert item) {
		this.item = item;
	}

	@Override
	public void execute() {
		item.order();
	}

}
