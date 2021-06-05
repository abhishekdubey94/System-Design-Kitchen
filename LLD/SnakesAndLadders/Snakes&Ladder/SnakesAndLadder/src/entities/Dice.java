package entities;

import java.util.Random;

public class Dice {

	// dice maximum number
	int N;
	
	public Dice(int n) {
		this.N = n;
	}
	
	public int getRandomNumber() {
		return GameUtil.getRangeBoundNumber(1, 6);
	}
}
