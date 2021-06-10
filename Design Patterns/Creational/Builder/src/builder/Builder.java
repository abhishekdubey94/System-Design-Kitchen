package builder;

import cars.CarType;
import cars.components.Engine;
import cars.components.GPSNavigator;
import cars.components.Transmission;
import cars.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}