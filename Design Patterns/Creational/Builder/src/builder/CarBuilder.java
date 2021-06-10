package builder;

import cars.Car;
import cars.CarType;
import cars.components.Engine;
import cars.components.GPSNavigator;
import cars.components.Transmission;
import cars.components.TripComputer;

public class CarBuilder implements Builder {
	private Car car;

	public CarBuilder() {
		this.car = new Car();
	}

	public void setCarType(CarType type) {
		car.setCarType(type);
	}

	@Override
	public void setSeats(int seats) {
		car.setSeats(seats);
	}

	@Override
	public void setEngine(Engine engine) {
		car.setEngine(engine);
	}

	@Override
	public void setTransmission(Transmission transmission) {
		car.setTransmission(transmission);
	}

	@Override
	public void setTripComputer(TripComputer tripComputer) {
		car.setTripComputer(tripComputer);
	}

	@Override
	public void setGPSNavigator(GPSNavigator gpsNavigator) {
		car.setGpsNavigator(gpsNavigator);
	}

	public Car getResult() {
		return car;
	}
}