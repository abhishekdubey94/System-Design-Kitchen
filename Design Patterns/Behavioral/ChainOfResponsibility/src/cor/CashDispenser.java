package cor;

public class CashDispenser {

	private int denominator;
	private CashDispenser nextDispenser;
	
	public CashDispenser(int denominator) {
		this.denominator = denominator;
	}
	
	public void setNextDispenser(CashDispenser cd) {
		if(nextDispenser==null) {
			nextDispenser = cd;
		}else {
			nextDispenser.setNextDispenser(cd);
		}
	}
	
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
