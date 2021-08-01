package com.epam.javaIntro.view;

import com.epam.javaIntro.view.impl.ListOfBooksViewImpl;

public class ViewProvider {
	private final static ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {};
	
	public static ViewProvider getInstance() {
		return instance;
	}
	
	private final ListOfBooksView listOfBooksView = new ListOfBooksViewImpl();

	public ListOfBooksView getListOfBooksView() {
		return listOfBooksView;
	}
}
