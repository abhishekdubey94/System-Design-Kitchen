package player;

public class Player {

	private static int playerId = 1;
	private int id;
	private String name;
	private int currentPosition;

	public Player(String name) {
		this.name = name;
		this.id = getUniqueId();
		this.currentPosition = 0;
	}

	public int getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	private int getUniqueId() {
		return playerId++;
	}

}
