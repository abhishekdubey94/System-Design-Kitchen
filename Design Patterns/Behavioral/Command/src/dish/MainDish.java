package dish;

public class MainDish implements Dish {
	String name;
	

	public MainDish(String name) {
		this.name = name;
	}

	@Override
	public void order() {
		System.out.println("Main Dish "+name+" ordered.");
	}

	@Override
	public void cancel() {
		System.out.println("Main Dish "+name+" cancelled.");
	}

}
