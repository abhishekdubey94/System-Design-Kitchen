package src.app;

import src.shape.Shape;
import src.shapeFactory.ShapeFactory;

public class ClientDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape shape1 = sf.getShape("circle");
		shape1.draw();
		
		Shape shape = sf.getShape("square");
		shape.draw();

	}

}
