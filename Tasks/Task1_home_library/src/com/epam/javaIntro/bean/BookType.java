package com.epam.javaIntro.bean;

public enum BookType {
	E_BOOK("Электронная"),
	P_BOOK("Бумажная"),
	UNIDENTIFIED("Неопознанный");
	
	private final String value;
	
	private BookType(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
