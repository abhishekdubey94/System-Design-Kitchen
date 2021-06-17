package example1;

public class ClientApp {

	public static void main(String[] args) {
		RoundHole rh = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		System.out.println(rh.fits(rpeg));
		
		SquarePeg speg = new SquarePeg(2);
		System.out.println(rh.fits(new SquareToRoundPegAdapter(speg)));

	}

}
