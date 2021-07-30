package com.epam.javaIntro.dao.impl;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.epam.javaIntro.bean.User;
import com.epam.javaIntro.dao.DAOException;
import com.epam.javaIntro.dao.UserDAO;

public class SQLUserDAOImpl implements UserDAO {

	@Override
	public boolean authorisation(String login, String password) throws DAOException {
		
		try {
			FileReader reaedr = new FileReader("base.txt");
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		}
		
		return false;
	}

	@Override
	public void registration(User newUser) throws DAOException {
		// TODO Auto-generated method stub
		
	}

}
