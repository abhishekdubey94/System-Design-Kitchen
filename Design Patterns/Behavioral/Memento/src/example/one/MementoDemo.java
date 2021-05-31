package example.one;

public class MementoDemo {

	public static void main(String[] args) {
		CareTaker ct = new CareTaker();
		Originator og = new Originator("#1");
		og.setState("#2");
		ct.add(og.saveStateInMemento());
		og.setState("#3");
		ct.add(og.saveStateInMemento());

		og.setState("State #4");
		System.out.println("Current State: " + og.getState());

		og.getStateFromMemento(ct.get(0));
		System.out.println("First saved State: " + og.getState());
		og.getStateFromMemento(ct.get(1));
		System.out.println("Second saved State: " + og.getState());

	}

}
