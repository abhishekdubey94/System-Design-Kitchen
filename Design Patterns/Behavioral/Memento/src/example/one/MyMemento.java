package example.one;

public class MyMemento implements Memento {

	private String state;
	
	public MyMemento(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
