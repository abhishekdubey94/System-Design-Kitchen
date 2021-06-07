package client;

import context.Context;
import strategy.AdditionStrategy;
import strategy.MultiplyStrategy;
import strategy.Strategy;
import strategy.SubtractStrategy;

public class App {

	public static void main(String[] args) {
		Context context = new Context();
		Strategy add = new AdditionStrategy();
		Strategy sub = new SubtractStrategy();
		Strategy mul = new MultiplyStrategy();
		
		int a = 5;
		int b = 6;
		context.setStrategy(add);
		System.out.println(context.executeStrategy(a, b));
		context.setStrategy(sub);
		System.out.println(context.executeStrategy(a, b));
		context.setStrategy(mul);
		System.out.println(context.executeStrategy(a, b));
		
	}

}
