package com.epam.javaIntro.view;

import com.epam.javaIntro.view.impl.ListOfAirlinesViewImpl;

public class ViewProvider {
	private final static ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {};
	
	public static ViewProvider getInstance() {
		return instance;
	}
	
	private final ListOfAirlinesView listOfAirlinesView = new ListOfAirlinesViewImpl();

	public ListOfAirlinesView getListOfAirlinesView() {
		return listOfAirlinesView;
	}
}
