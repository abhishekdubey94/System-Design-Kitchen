package client;

import command.CancelMainDish;
import command.Order;
import command.OrderMainDish;
import dish.MainDish;
import waiter.Waiter;

public class CommandClient {

	public static void main(String[] args) {
		// create the invoker, inthis case it is the waiter
		Waiter waiter = new Waiter();
		
		// create the concrete command object
		MainDish item = new MainDish("Pizza");
		Order orderMainDish = new OrderMainDish(item);
	
		// pass it to the invoker,
		waiter.execute(orderMainDish);
		
		Order cancelMainOrder = new CancelMainDish(item);
		waiter.execute(cancelMainOrder);
	}

}
