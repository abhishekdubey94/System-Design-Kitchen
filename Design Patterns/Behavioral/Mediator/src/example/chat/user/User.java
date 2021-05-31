package example.chat.user;

import example.chat.ChatRoom;

public class User {

	String name;

	public User(String name) {
		this.name = name;
	}
	
	public void send(String message) {
		ChatRoom.sendMessage(this, message);
	}

	public String getName() {
		return name;
	}
	
	
}
