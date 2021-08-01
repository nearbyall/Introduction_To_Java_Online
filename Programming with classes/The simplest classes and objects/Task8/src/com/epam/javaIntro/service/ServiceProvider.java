package com.epam.javaIntro.service;

import com.epam.javaIntro.service.impl.ListOfCustomersServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {};
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private final ListOfCustomersService listOfCustomersService = new ListOfCustomersServiceImpl();

	public ListOfCustomersService getListOfCustomersService() {
		return listOfCustomersService;
	}
}
