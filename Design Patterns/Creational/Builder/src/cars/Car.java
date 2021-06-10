package cars;

import cars.components.Engine;
import cars.components.GPSNavigator;
import cars.components.Transmission;
import cars.components.TripComputer;

public class Car {

	private  CarType carType;
	private  int seats;
	private  Engine engine;
	private  Transmission transmission;
	private  TripComputer tripComputer;
	private  GPSNavigator gpsNavigator;
	private double fuel = 0;

	public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer,
			GPSNavigator gpsNavigator) {
		this.carType = carType;
		this.seats = seats;
		this.engine = engine;
		this.transmission = transmission;
		this.tripComputer = tripComputer;
		if (this.tripComputer != null) {
			this.tripComputer.setCar(this);
		}
		this.gpsNavigator = gpsNavigator;
	}
	
	

	public Car() {
		// TODO Auto-generated constructor stub
	}



	public void setCarType(CarType carType) {
		this.carType = carType;
	}



	public void setSeats(int seats) {
		this.seats = seats;
	}



	public void setEngine(Engine engine) {
		this.engine = engine;
	}



	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}



	public void setTripComputer(TripComputer tripComputer) {
		this.tripComputer = tripComputer;
	}



	public void setGpsNavigator(GPSNavigator gpsNavigator) {
		this.gpsNavigator = gpsNavigator;
	}



	public CarType getCarType() {
		return carType;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}

	public int getSeats() {
		return seats;
	}

	public Engine getEngine() {
		return engine;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public TripComputer getTripComputer() {
		return tripComputer;
	}

	public GPSNavigator getGpsNavigator() {
		return gpsNavigator;
	}



	@Override
	public String toString() {
		return "Car [carType=" + carType + ", seats=" + seats + ", engine=" + engine + ", transmission=" + transmission
				+ ", tripComputer=" + tripComputer + ", gpsNavigator=" + gpsNavigator + ", fuel=" + fuel + "]";
	}
	
	
	
}
