package client;

import template.NetOrder;
import template.OrderProcessTemplate;
import template.StoreOrder;

public class App {

	public static void main(String[] args) {
		OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(true);

	}

}
