package notify;

public class ClientApp {

	public static void main(String[] args) {
		Notifier notifier = new BaseDecorator();
		boolean enableFacebookNotification = false;
		boolean enableSmsNotification = true;
		
		if(enableFacebookNotification)
			notifier = new FacebookNotifier(notifier);
		if(enableSmsNotification)
			notifier = new SmsDecorator(notifier);
		
		notifier.send();
	}

}
