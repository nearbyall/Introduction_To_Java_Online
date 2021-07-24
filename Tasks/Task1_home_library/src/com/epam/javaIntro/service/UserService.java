package com.epam.javaIntro.service;

import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.epam.javaIntro.bean.User;
import com.epam.javaIntro.bean.UserType;
import com.epam.javaIntro.builder.UserBuilder;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.storage.TXTStorage;

public class UserService {
	private static ArrayList<User> users;
	
	static {
		users = TXTStorage.loadUsers();
	}
	
	public static ArrayList<User> getUsers() {
		return users;
	}
	
	public static boolean isUserExist(String login) {
		for (User user : users) {
			if (user.getLogin().equals(login)) {
				return true;
			}
		}
		return false;
	}
	
	public static User login(String login, String password) {
		for (User user : users) {
			if (user.getLogin().equals(login) && verifyPassword(password, user.getPassword())) {
				return user;
			}
		}
		return null;
	}
	
	public static boolean addUser() {
		System.out.println("Введите логин: ");
		String login = Input.checkInputLine();
		if (isUserExist(login)) {
			System.out.println("Такой пользователь уже зарегистрирован");
			return false;
		}
		System.out.println("Введите пароль: ");
		String password = Input.checkInputLine();
		System.out.println("Введите имя пользователя: ");
		String username = Input.checkInputLine();
		System.out.println("Введите адрес электронной почты: ");
		String email = Input.checkInputLine();
		User user = new UserBuilder()
					   .withUsername(username)
					   .withLogin(login)
					   .withPassword(encryptPasswordWithMD5(password))
					   .withEmail(email)
					   .withUserType(UserType.USER)
					   .withId((int) Math.random() * 100)
					   .build();
		users.add(user);
		TXTStorage.saveUsers(users);
		return true;
	}
	
	public static boolean removeUser() {
		System.out.println("Введите логин: ");
		String login = Input.checkInputLine();
		if (!isUserExist(login)) {
			System.out.println("Такого пользователя не существует");
			return false;
		}
		System.out.println("Введите пароль: ");
		String password = Input.checkInputLine();
		for (User user : users) {
			if (user.getLogin().equals(login) && verifyPassword(password, user.getPassword())) {
				users.remove(user);
			}
		}
		TXTStorage.saveUsers(users);
		return true;
	}
	
	public static String encryptPasswordWithMD5(String password) {
		try {
			MessageDigest md;
	        md = MessageDigest.getInstance("MD5");
	        byte[] passBytes = password.getBytes();
	        md.reset();
	        byte[] digested = md.digest(passBytes);
	        StringBuffer sb = new StringBuffer();
	        for(int i = 0; i < digested.length; i++){
	            sb.append(Integer.toHexString(0xff & digested[i]));
	        }
	        return sb.toString();
	    } catch (NoSuchAlgorithmException e) {
	    	e.printStackTrace();
	    }
	        return null;
	}
	
	public static boolean verifyPassword(String inPassword, String encryptedPassword) {
		return encryptedPassword.equals(encryptPasswordWithMD5(inPassword));
	}
}

