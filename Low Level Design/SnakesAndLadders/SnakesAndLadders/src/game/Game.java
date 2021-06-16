package game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import player.Player;
import snakesAndLadder.Ladder;
import snakesAndLadder.Snake;

public class Game {
	private List<Player> players;
	private int currentTurn;
	private Player winner;
	private Map<Integer, Integer> snakesAndLadder;

	public Game(List<Player> players, List<Snake> snakes, List<Ladder> ladders) {
		this.players = players;
		this.snakesAndLadder = new HashMap<Integer, Integer>();
		for (Snake s : snakes) {
			snakesAndLadder.put(s.getStart(), s.getEnd());
		}
		for (Ladder l : ladders) {
			snakesAndLadder.put(l.getStart(), l.getEnd());
		}
	}

	public List<Player> getPlayer() {
		return this.players;
	}

	public Player getWinner() {
		return this.winner;
	}

	public boolean roll(Player player, int value) {
		if (winner != null || value > 6 || value < 1 || players.get(currentTurn).getId() != player.getId())
			return false;

		int destination = players.get(currentTurn).getCurrentPosition() + value;

		if (destination <= 100) {
			if (snakesAndLadder.containsKey(destination)) {
				players.get(currentTurn).setCurrentPosition(snakesAndLadder.get(destination));
			} else {
				players.get(currentTurn).setCurrentPosition(destination);
			}
		}
		if (destination == 100) {
			this.winner = this.players.get(currentTurn);
		}
		nextPlayer();
		return true;
	}

	private void nextPlayer() {
		currentTurn = (currentTurn + 1) % players.size();
	}

}
