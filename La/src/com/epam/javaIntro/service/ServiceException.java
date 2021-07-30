package com.epam.javaIntro.service;

public class ServiceException extends Exception {
	public ServiceException(Exception e) {
		super(e);
	}
}
