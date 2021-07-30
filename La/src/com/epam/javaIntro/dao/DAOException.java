package com.epam.javaIntro.dao;

public class DAOException extends Exception {
	//wrapping
	public DAOException(Exception e) {
		super(e);
	}
}
