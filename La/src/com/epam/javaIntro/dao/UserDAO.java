package com.epam.javaIntro.dao;

import com.epam.javaIntro.bean.User;

public interface UserDAO {
	boolean authorisation(String login, String password);
	void registration(User newUser);
}
