package waiter;

import command.Order;

public class Waiter {

	public void execute(Order order) {
		order.execute();
	}
}
