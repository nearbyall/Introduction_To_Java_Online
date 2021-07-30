package com.epam.javaIntro.dao;

import com.epam.javaIntro.bean.User;

public interface UserDAO {
	boolean authorisation(String login, String password) throws DAOException;
	void registration(User newUser) throws DAOException;
}
