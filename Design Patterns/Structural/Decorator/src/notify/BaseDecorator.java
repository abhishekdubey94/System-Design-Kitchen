package notify;

public class BaseDecorator implements Notifier {
	protected Notifier wrappee;

	public BaseDecorator() {
		
	}
	public BaseDecorator(Notifier wrappee) {
		super();
		this.wrappee = wrappee;
	}


	@Override
	public void send() {
		System.out.println("Email Notification Sent From BaseDecorator");
	}

}
