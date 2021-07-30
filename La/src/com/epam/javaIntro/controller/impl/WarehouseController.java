package com.epam.javaIntro.controller.impl;

import com.epam.javaIntro.controller.Command;
import com.epam.javaIntro.controller.CommandProvider;
import com.epam.javaIntro.controller.Controller;

public class WarehouseController implements Controller {
	private CommandProvider provider = new CommandProvider();
	
	
	@Override
	public String doAction(String request) {
		String[] params;
		String commandName;
		
		params = request.split("\\s+");
		commandName = params[0];
		
		Command currentCommand = provider.getCommand(commandName);
		
		String response = currentCommand.execute(params);
		
		return response;
	}

}
