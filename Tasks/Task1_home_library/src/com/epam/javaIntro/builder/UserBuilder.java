package com.epam.javaIntro.builder;

import com.epam.javaIntro.bean.User;
import com.epam.javaIntro.bean.UserType;

public class UserBuilder {
	private int id;
	private String username;
	private String login;
	private String password;
	public String email;
	private UserType userType;
	
	public UserBuilder() {
		this.id = 0;
		this.username = "";
		this.login = "";
		this.password = "";
		this.email = "";
		this.userType = UserType.UNIDENTIFIED;
	}
	
	public UserBuilder withId(int id) {
		this.id = id;
		return this;
	}
	
	public UserBuilder withUsername(String username) {
		this.username = username;
		return this;
	}
	
	public UserBuilder withLogin(String login) {
		this.login = login;
		return this;
	}
	
	public UserBuilder withPassword(String password) {
		this.password = password;
		return this;
	}
	
	public UserBuilder withEmail(String email) {
		this.email = email;
		return this;
	}
	
	public UserBuilder withUserType(UserType userType) {
		this.userType = userType;
		return this;
	}
	
	public User build() {
		return new User(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
}
