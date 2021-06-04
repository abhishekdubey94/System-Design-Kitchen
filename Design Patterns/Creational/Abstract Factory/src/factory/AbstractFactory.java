package factory;

import shape.Shape;

public interface AbstractFactory {
	public Shape getShape(String shapeType);
}
