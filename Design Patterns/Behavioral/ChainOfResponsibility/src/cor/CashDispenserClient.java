package cor;

import java.util.Scanner;

public class CashDispenserClient {

	public static void main(String[] args) {
		CashDispenser cd = new CashDispenser(100);
		cd.setNextDispenser(new CashDispenser(50));
		cd.setNextDispenser(new CashDispenser(20));
		cd.setNextDispenser(new CashDispenser(10));
		cd.setNextDispenser(new CashDispenser(5));
		cd.setNextDispenser(new CashDispenser(1));
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		
		cd.dispense(amount);
	}

}
