package entities;

public class TestApp {

	public static void main(String[] args) {
		
		Game g = new Game(10, 2, 6);
		g.addPlayers("A");
		g.addPlayers("B");
		g.addPlayers("C");
		
		g.run();

	}

}
