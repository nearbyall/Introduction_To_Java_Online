package com.epam.javaIntro.controller.impl;

import com.epam.javaIntro.controller.Controller;
import com.epam.javaIntro.presentation.UserActionViewer;
import com.epam.javaIntro.service.ServiceProvider;
import com.epam.javaIntro.service.UserService;

public class WarehouseController implements Controller {

	@Override
	public String doAction(String request) {
		String[] params;
		String commandName;
		
		params = request.split("\\s+");
		commandName = params[0];
		
		switch(commandName) {
			case "logination":
				ServiceProvider provider = ServiceProvider.getInstance();
				UserService userService = provider.getUserService();
				
				String login = params[1].split("=")[1];
				String password = params[2].split("=")[1];
				
				boolean result = userService.logination(login, password);
				
				return UserActionViewer.loginationAnswer(result);
			case "registration":
				
				break;
		}
		
		return null;
	}

}
