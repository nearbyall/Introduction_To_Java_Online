package com.epam.javaIntro.service;

import com.epam.javaIntro.service.impl.BankServiceImpl;
import com.epam.javaIntro.service.impl.ClientServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	
	private ServiceProvider() {};
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	private final ClientService clientService = new ClientServiceImpl();
	private final BankService bankService = new BankServiceImpl();

	public ClientService getClientService() {
		return clientService;
	}

	public BankService getBankService() {
		return bankService;
	}
}
