package com.epam.javaIntro.service;

import com.epam.javaIntro.service.impl.UserServiceImpl;
import com.epam.javaIntro.service.impl.WarehouseServiceImpl;

public final class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {};
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private final UserService userService = new UserServiceImpl();
	private final WarehouseService warehouseService = new WarehouseServiceImpl();

	public UserService getUserService() {
		return userService;
	}

	public WarehouseService getWarehouseService() {
		return warehouseService;
	}
}
