package com.epam.javaIntro.service.impl;

import com.epam.javaIntro.dao.DAOProvider;
import com.epam.javaIntro.dao.UserDAO;
import com.epam.javaIntro.service.UserService;

public class UserServiceImpl implements UserService {

	private final DAOProvider provider = DAOProvider.getInstance();
	
	@Override
	public boolean logination(String login, String password) {
		// validation
		
		UserDAO userDAO = provider.getUserDAO();
		boolean result = userDAO.authorisation(login, password);
		
		return result;
	}

}
