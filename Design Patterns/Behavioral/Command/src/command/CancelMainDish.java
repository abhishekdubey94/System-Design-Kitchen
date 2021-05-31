package command;

import dish.MainDish;

public class CancelMainDish implements Order {
	private MainDish item;

	public CancelMainDish(MainDish item) {
		super();
		this.item = item;
	}

	@Override
	public void execute() {
		item.cancel();
	}
}
