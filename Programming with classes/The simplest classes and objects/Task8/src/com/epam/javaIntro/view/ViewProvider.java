package com.epam.javaIntro.view;

import com.epam.javaIntro.view.impl.ListOfCustomersViewImpl;

public class ViewProvider {
	private static final ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {};
	
	public static ViewProvider getInstance() {
		return instance;
	}
	
	private final ListOfCustomersView listOfCustomersView = new ListOfCustomersViewImpl();

	public ListOfCustomersView getListOfCustomersView() {
		return listOfCustomersView;
	}
}
