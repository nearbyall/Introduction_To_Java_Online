package com.epam.javaIntro.service;

import com.epam.javaIntro.service.impl.TouristAgencyServiceImpl;

public class ServiceProvider {
private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {};
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private final TouristAgencyService touristAgencyService = new TouristAgencyServiceImpl();

	public TouristAgencyService getTouristAgencyService() {
		return touristAgencyService;
	}
}
