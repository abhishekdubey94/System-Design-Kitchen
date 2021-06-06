package cor;

public class CashDispenser {

	private int denominator;
	// reference to the next handler
	private CashDispenser nextDispenser;
	
	public CashDispenser(int denominator) {
		this.denominator = denominator;
	}
	
	// method to set next handler
	public void setNextDispenser(CashDispenser cd) {
		if(nextDispenser==null) {
			nextDispenser = cd;
		}else {
			nextDispenser.setNextDispenser(cd);
		}
	}
	
	// handler method
	public void dispense(int amount) {
		if(amount>=denominator) {
			int num = amount/denominator;
			int balance = amount%denominator;
			System.out.println(num+" * $"+denominator);
			if(balance>0)
				this.nextDispenser.dispense(balance);
		}else {
			this.nextDispenser.dispense(amount);
		}
	}
}
