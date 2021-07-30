package com.epam.javaIntro.view;

import com.epam.javaIntro.view.impl.TouristAgencyViewImpl;

public final class ViewProvider {
	private static final ViewProvider instance = new ViewProvider();
	
	private ViewProvider() {};
	
	public static ViewProvider getInstance() {
		return instance;
	}
	
	private final TouristAgencyView touristAgencyView = new TouristAgencyViewImpl();

	public TouristAgencyView getTouristAgencyView() {
		return touristAgencyView;
	}
}
