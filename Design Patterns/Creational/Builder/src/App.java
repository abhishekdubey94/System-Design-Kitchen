import builder.CarBuilder;
import director.Director;

public class App {
	public static void main(String[] args) {
		Director director = new Director();
		
		CarBuilder carBuilder = new CarBuilder();
		director.constructSportCar(carBuilder);
		
		System.out.println(carBuilder.getResult().toString());
	}
}
