package command;

import dish.MainDish;

public class OrderMainDish implements Order {
	private MainDish item;

	public OrderMainDish(MainDish item) {
		super();
		this.item = item;
	}

	@Override
	public void execute() {
		item.order();
	}
}
