package example.chat;

import example.chat.user.User;

public class MediatorPatternDemo {

	public static void main(String[] args) {
		User u1 = new User("Abhishek");
		User u2 = new User("Abhay");
		
		u1.send("Hi Abhay!");
		u2.send("Hello Abhishek");
	}

}
