package client;

import command.CancelMainDish;
import command.Order;
import command.OrderMainDish;
import dish.MainDish;
import waiter.CommandExecutor;

public class CommandClient {

	public static void main(String[] args) {
		// create the invoker, inthis case it is the waiter
		CommandExecutor waiter = new CommandExecutor();
		
		// create the concrete command object
		MainDish item = new MainDish("Pizza");
		Order orderMainDish = new OrderMainDish(item);
	
		// pass it to the invoker,
		waiter.execute(orderMainDish);
		
		Order cancelMainOrder = new CancelMainDish(item);
		waiter.execute(cancelMainOrder);
	}

}
