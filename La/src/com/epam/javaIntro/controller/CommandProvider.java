package com.epam.javaIntro.controller;

import java.util.HashMap;
import java.util.Map;

import com.epam.javaIntro.controller.impl.LoginationCommand;
import com.epam.javaIntro.controller.impl.RegistrationCommand;

public class CommandProvider {
	private Map<String, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put("logination", new LoginationCommand());
		commands.put("registration", new RegistrationCommand());
	}
	
	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		
		return command;
	}
}
