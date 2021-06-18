package notify;

public class FacebookNotifier extends BaseDecorator {

	public FacebookNotifier(Notifier wrappee) {
		super(wrappee);
	}
	
	public void send() {
		System.out.println("Facebook notifcation has been sent");
		wrappee.send();
	}

}
