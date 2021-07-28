package com.epam.javaIntro.controller;

public interface Controller {
	String doAction(String request);
	// request -  logination login="log" password="passwrd"
	// request - registration name="" ............
	
	// response - "code formattingString"
}
