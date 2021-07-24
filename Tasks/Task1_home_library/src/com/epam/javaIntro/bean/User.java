package com.epam.javaIntro.bean;

import com.epam.javaIntro.builder.UserBuilder;

public class User {
	private int id;
	private String username;
	private String login;
	private String password;
	private String email;
	private UserType userType;
	
	public User() {
		this.id = 0;
		this.username = "";
		this.login = "";
		this.password = "";
		this.email = "";
		this.userType = UserType.UNIDENTIFIED;
	}

	public User(int id, String username, String login, String password, String email, UserType userType) {
		this.id = id;
		this.username = username;
		this.login = login;
		this.password = password;
		this.email = email;
		this.userType = userType;
	}

	public User(UserBuilder userBuilder) {
		this.id = userBuilder.getId();
		this.username = userBuilder.getUsername();
		this.login = userBuilder.getLogin();
		this.password = userBuilder.getPassword();
		this.email = userBuilder.getEmail();
		this.userType = userBuilder.getUserType();
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

	@Override
	public String toString() {
		return String.format("Пользователь: %s\n"
						   + "Роль: %s\n",
						   username, userType.getValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userType == null) ? 0 : userType.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userType != other.userType)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
