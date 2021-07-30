package com.epam.javaIntro.view;

import com.epam.javaIntro.view.impl.ClientViewImpl;

public class ViewProvider {
	private static final ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {};
	
	public static ViewProvider getInstance() {
		return instance;
	}
	
	private final ClientView clientService = new ClientViewImpl();

	public ClientView getClientView() {
		return clientService;
	}
}
