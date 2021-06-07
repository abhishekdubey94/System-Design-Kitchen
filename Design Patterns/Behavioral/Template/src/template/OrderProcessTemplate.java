package template;

public abstract class OrderProcessTemplate {
	
	public boolean isGift;
	public abstract void doSelect();
	public abstract void doPayment();
	public abstract void doDelivery();
	
	public final void giftWrap() {
		System.out.println("Gift wrap successful");
	}
	
	public final void processOrder(boolean isGift) {
		doSelect();
		doPayment();
		if(isGift) {
			giftWrap();
		}
		doDelivery();
	}

}
