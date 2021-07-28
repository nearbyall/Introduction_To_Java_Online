package com.epam.javaIntro.dao;

import com.epam.javaIntro.dao.impl.SQLUserDAOImpl;
import com.epam.javaIntro.dao.impl.SQLWarehouseDAOImpl;

public final class DAOProvider {
	private static final DAOProvider instance = new DAOProvider();
	
	private UserDAO userDAO = new SQLUserDAOImpl();
	private WarehouseDAO warehouseDAO = new SQLWarehouseDAOImpl();
	
	private DAOProvider() {}
	
	public static DAOProvider getInstance() {
		return instance;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}
	
	public WarehouseDAO getWarehouseDAO() {
		return warehouseDAO;
	}
}
