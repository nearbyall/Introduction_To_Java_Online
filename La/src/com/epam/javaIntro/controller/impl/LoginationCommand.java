package com.epam.javaIntro.controller.impl;

import com.epam.javaIntro.controller.Command;
import com.epam.javaIntro.presentation.UserActionViewer;
import com.epam.javaIntro.service.ServiceException;
import com.epam.javaIntro.service.ServiceProvider;
import com.epam.javaIntro.service.UserService;

public class LoginationCommand implements Command {

	@Override
	public String execute(String[] params) {
		ServiceProvider provider = ServiceProvider.getInstance();
		UserService userService = provider.getUserService();
		
		String login = params[1].split("=")[1];
		String password = params[2].split("=")[1];
		boolean result;
		
		try {
			result = userService.logination(login, password);
			return UserActionViewer.loginationAnswer(result);
		} catch (ServiceException e) {
			//logging e
			return "Error";
		}
	}
	
}
