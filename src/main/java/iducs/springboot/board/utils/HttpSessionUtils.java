package iducs.springboot.board.utils;

import javax.servlet.http.HttpSession;

import iducs.springboot.board.domain.User;

public class HttpSessionUtils {
	public static boolean isEmpty(HttpSession session, String key) {
		Object object = session.getAttribute(key);
		if(object == null) return true; 
		else return false;
	}
	public static boolean isSameUser(User login, User writer) {
		System.out.println(writer + "::::" + login);
		return (login.equals(writer)) ? true : false;
	}
}
