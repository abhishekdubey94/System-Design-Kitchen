package factory;

import shape.RoundedRectangle;
import shape.RoundedSquare;
import shape.Shape;

public class RoundedShapeFactory implements AbstractFactory {

	@Override
	public Shape getShape(String shapeType) {
		if(shapeType.equalsIgnoreCase("square")) {
			return new RoundedSquare();
		}else if(shapeType.equalsIgnoreCase("rectangle")) {
			return new RoundedRectangle();
		}
		return null;
	}

}
