package example.chat;

import java.util.Date;

import example.chat.user.User;

public class ChatRoom {

	public static void sendMessage(User user,String message) {
		System.out.println(new Date().toString()+"[ "+user.getName()+" ]:"+message);
	}
}
