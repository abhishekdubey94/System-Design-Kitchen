package dish;

public class Dessert implements Dish {

	private String name;

	public Dessert(String name) {
		this.name = name;
	}

	@Override
	public void order() {
		System.out.println("Dessert "+name+" ordered.");	
	}

	@Override
	public void cancel() {
		System.out.println("Dessert "+name+" ordered.");	
	}

}
