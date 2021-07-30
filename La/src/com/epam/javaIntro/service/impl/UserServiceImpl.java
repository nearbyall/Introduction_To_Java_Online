package com.epam.javaIntro.service.impl;

import com.epam.javaIntro.dao.DAOException;
import com.epam.javaIntro.dao.DAOProvider;
import com.epam.javaIntro.dao.UserDAO;
import com.epam.javaIntro.service.ServiceException;
import com.epam.javaIntro.service.UserService;

public class UserServiceImpl implements UserService {

	private final DAOProvider provider = DAOProvider.getInstance();
	
	@Override
	public boolean logination(String login, String password) throws ServiceException {
		// validation
		
		UserDAO userDAO = provider.getUserDAO();
		boolean result;
		try {
			result = userDAO.authorisation(login, password);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

}
