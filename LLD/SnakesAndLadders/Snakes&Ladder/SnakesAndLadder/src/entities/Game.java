package entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
	private Board board;
	private List<Player> players;
	private List<Dice> dices;
	private Queue<Player> turnQueue;

	public Game(int size, int numberOfDices, int maxNumberOnDice) {
		board = new Board(size);
		dices = new ArrayList<Dice>();
		players = new ArrayList<>();
		turnQueue = new LinkedList<Player>();
		for (int i = 0; i < numberOfDices; i++) {
			dices.add(new Dice(maxNumberOnDice));
		}
	}

	public void addPlayers(String name) {
		Player player = new Player(name);
		players.add(player);
		turnQueue.add(player);
	}

	public void run() {
		int pos = Integer.MIN_VALUE;
		while (pos < 100) {

			// pop the player from the queue
			Player currentPlayer = turnQueue.poll();

			// extract the position
			int currentPosition = currentPlayer.getPos();

			// generate numbers from the dices
			int sum = 0;
			for (Dice d : dices) {
				sum += d.getRandomNumber();
			}

			// add that number to the position of the current player and should be less than
			// 100
			// if addition is moving making more than 100 discard
			System.out.println(currentPlayer.getName() + "\'s turn   Dice Number: " + sum);
			int newPosition = currentPosition + sum;
			if (newPosition == 100) {
				System.out.println("------------------------------------------------------");
				System.out.println("------------------------------------------------------");
				System.out.println("");
				System.out.println("Winner = " + currentPlayer.getName());
				
				currentPlayer.setPos(newPosition);
				
				System.out.println("------------------------------------------------------");
				System.out.println("Final Scores:");
				printCurrentPostions();
				System.out.println("------------------------------------------------------");
				break;
			} else if (newPosition < 100) {
				currentPosition = newPosition;
			}

			// check if that number is present in the snakesAndLadder of board
			if (board.isSnakeAndLadder(currentPosition)) {
				// if present, update with the new position
				currentPosition = board.getNewPosition(currentPosition);
			}

			// update player postion
			currentPlayer.setPos(currentPosition);

			// add the player to the queue
			turnQueue.add(currentPlayer);

			// print positions
			printCurrentPostions();
		}

	}

	public void printCurrentPostions() {
		// System.out.println("---------------------------------------------");
		for (Player p : players) {
			System.out.println(p.getName() + " :" + p.getPos());
		}
		System.out.println("------------------------------------------------------");
	}
}
