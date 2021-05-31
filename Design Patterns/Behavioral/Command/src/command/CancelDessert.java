package command;

import dish.Dessert;

public class CancelDessert implements Order {
	Dessert item;
	
	public CancelDessert(Dessert item) {
		this.item = item;
	}

	@Override
	public void execute() {
		item.cancel();
	}

}
