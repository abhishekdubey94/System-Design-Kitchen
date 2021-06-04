package client;

import factory.AbstractFactory;
import shape.Shape;

public class DemoApp {

	public static void main(String[] args) {
		AbstractFactory factory = FactoryProducer.getFactory(false);
		AbstractFactory roundedFactory = FactoryProducer.getFactory(true);
		
		Shape shape1 = factory.getShape("square");
		shape1.draw();
		shape1 = factory.getShape("rectangle");
		shape1.draw();
		
		roundedFactory.getShape("square").draw();
		roundedFactory.getShape("rectangle").draw();

	}

}
