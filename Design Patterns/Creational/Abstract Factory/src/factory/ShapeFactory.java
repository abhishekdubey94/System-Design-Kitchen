package factory;

import shape.Rectangle;
import shape.Shape;
import shape.Square;

public class ShapeFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("square")) {
			return new Square();
		}else if(shapeType.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
	}

}
