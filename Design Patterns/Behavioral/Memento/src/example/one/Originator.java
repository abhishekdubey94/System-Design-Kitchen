package example.one;

public class Originator {
	private String state;
	
	public Originator(String state){
		this.state=state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento saveStateInMemento() {
		return new MyMemento(state);
	}
	
	public void getStateFromMemento(Memento memento) {
		this.state = memento.getState();
	}
}
