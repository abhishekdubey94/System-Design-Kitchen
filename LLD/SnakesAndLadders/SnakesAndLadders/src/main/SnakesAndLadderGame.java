package main;

import java.util.ArrayList;
import java.util.Random;

import game.Game;
import player.Player;
import snakesAndLadder.Ladder;
import snakesAndLadder.Snake;

public class SnakesAndLadderGame {

	public static void main(String[] args) {
		Player p1 = new Player("Robert");
		Player p2 = new Player("Stannis");
		Player p3 = new Player("Renly");
		
		Snake s1 = new Snake(17, 7);
		Snake s2 = new Snake(54, 34);
		Snake s3 = new Snake(62, 19);
		Snake s4 = new Snake(64, 60);
		Snake s5 = new Snake(87,36);
		Snake s6 = new Snake(92,73);
		Snake s7 = new Snake(95,75);
		Snake s8 = new Snake(98,79);
		
		Ladder l1 = new Ladder(1, 38);
		Ladder l2 = new Ladder(4, 14);
		Ladder l3 = new Ladder(9, 31);
		Ladder l4 = new Ladder(21, 42);
		Ladder l5 = new Ladder(28, 84);
		Ladder l6 = new Ladder(51, 67);
		Ladder l7 = new Ladder(72, 91);
		Ladder l8 = new Ladder(80, 99);
		
		ArrayList<Snake> snakes = new ArrayList<>();
		snakes.add(s1);
		snakes.add(s2);
		snakes.add(s3);
		snakes.add(s4);
		snakes.add(s5);
		snakes.add(s6);
		snakes.add(s7);
		snakes.add(s8);
		
		ArrayList<Ladder> ladders = new ArrayList<>();
		ladders.add(l1);
		ladders.add(l2);
		ladders.add(l3);
		ladders.add(l4);
		ladders.add(l5);
		ladders.add(l6);
		ladders.add(l7);
		ladders.add(l8);
		
		ArrayList<Player> players = new ArrayList<>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		
		Game game = new Game(players,snakes,ladders);
		Random rand = new Random();
		while(game.getWinner()==null) {
			for(int i=0;i<players.size();i++) {
				int diceVal = rand.nextInt(6)+1;
				game.roll(players.get(i), diceVal);
			}
		}
		
		System.out.println("The winner is: "+ game.getWinner().getName());
		
		System.out.println("All scores");
		for(Player p : players) {
			System.out.print(p.getCurrentPosition()+" ");
		}
	}

}
