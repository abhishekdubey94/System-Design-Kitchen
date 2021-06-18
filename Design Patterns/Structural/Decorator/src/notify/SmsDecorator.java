package notify;

public class SmsDecorator extends BaseDecorator {

	public SmsDecorator(Notifier wrappee) {
		super(wrappee);
	}
	
	public void send() {
		System.out.println("SMS notifcation has been sent");
		wrappee.send();
	}

}
