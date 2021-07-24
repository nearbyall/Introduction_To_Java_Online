package com.epam.javaIntro.bean;

public enum UserType {
	ADMIN("Администратор"),
	USER("Пользователь"),
	UNIDENTIFIED("Неопознанный");
	
	private final String value;
	
	private UserType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
