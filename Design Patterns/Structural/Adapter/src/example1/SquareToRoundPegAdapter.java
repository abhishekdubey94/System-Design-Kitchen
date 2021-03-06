package example1;

public class SquareToRoundPegAdapter extends RoundPeg {

	// Composition type of adapter
	// Wrapping the SquarePeg around Class of type RoundPeg
	private SquarePeg peg;
	
	public SquareToRoundPegAdapter(SquarePeg peg) {
		this.peg = peg;
	}
	
	public double getRadius() {
		return Math.sqrt(2*Math.pow(peg.width/2, 2));
	}
	
}
