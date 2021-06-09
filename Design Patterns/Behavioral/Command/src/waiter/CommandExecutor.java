package waiter;

import command.Order;

public class CommandExecutor {

	
	// it will get the command and call its execute method
	public void execute(Order order) {
		order.execute();
	}
}
