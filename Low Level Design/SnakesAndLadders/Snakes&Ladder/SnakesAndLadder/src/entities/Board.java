package entities;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Board {

	private int N;
	private int numberOfSnakes = 5;
	private int numberOfLadders = 5;
	
	private HashMap<Integer,Integer> snakesAndLadder;
	
	public Board(int N) {
		this.N = N;
		snakesAndLadder = new LinkedHashMap<>();
		generateSnakesAndLadder();
	}

	private void generateSnakesAndLadder() {
		// generate snakes range 99-11
		HashSet<Integer> temp = new HashSet<Integer>(); //  to keep track of generated numbers
		for(int i=0;i<numberOfSnakes;i++) {
			int head = GameUtil.getRangeBoundNumber(11, 99);
			while(temp.contains(head)) {
				head = GameUtil.getRangeBoundNumber(11, 99);
			}
			System.out.println("head:"+head);
			int tail = GameUtil.getRangeBoundNumber(1, head-10);
			while(temp.contains(tail)) {
				tail = GameUtil.getRangeBoundNumber(1, head-10);
			}

			System.out.println("tail:"+tail);
			snakesAndLadder.put(head,tail);
		}
		
		// generate Ladder 99-11
		
		for(int i=0;i<numberOfLadders;i++) {
			int head = GameUtil.getRangeBoundNumber(11, 99);
			while(temp.contains(head)) {
				head = GameUtil.getRangeBoundNumber(11, 99);
			}
			System.out.println("head:"+head);
			int tail = GameUtil.getRangeBoundNumber(1, head-10);
			while(temp.contains(tail)) {
				tail = GameUtil.getRangeBoundNumber(1, head-10);
			}
			System.out.println("tail:"+tail);
			snakesAndLadder.put(tail,head);
		}
		
		for(Entry<Integer, Integer> e : snakesAndLadder.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	
	public boolean isSnakeAndLadder(int pos) {
		return snakesAndLadder.containsKey(pos);
	}
	
	public int getNewPosition(int pos) {
		return snakesAndLadder.get(pos);
	}
	
	
	
}
