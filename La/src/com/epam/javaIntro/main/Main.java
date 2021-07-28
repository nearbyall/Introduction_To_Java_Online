package com.epam.javaIntro.main;

import com.epam.javaIntro.controller.Controller;
import com.epam.javaIntro.controller.impl.WarehouseController;

public class Main {

	public static void main(String[] args) {
		// menu
		
		String login = "asdasf";
		String password = "12345678";
		
		Controller controller = new WarehouseController();
		
		String request = "logination login=" + login + " password=" + password;
		
		String response = controller.doAction(request);
		
		String result = response.split("\\s+")[0];
		if ("0".equals(result)) {
			System.out.println("Succses");
			// main menu
		} else {
			System.out.println("Succses");
			// goto menu
		}
	}
	
}