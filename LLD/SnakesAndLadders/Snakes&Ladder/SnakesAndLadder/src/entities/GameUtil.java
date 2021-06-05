package entities;

import java.util.Random;

public class GameUtil {

	
	public static int getRangeBoundNumber(int low,int high) {
		Random rand = new Random();
		return rand.nextInt(high-low)+low;
	}
}
