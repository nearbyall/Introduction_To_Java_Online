package com.epam.javaIntro.view;

import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.bean.TouristAgency;

public interface TouristAgencyView {
	public void addClientWithChoices(TouristAgency touristAgency, Client client);
	void printVouchers(TouristAgency touristAgency);
	void printClients(TouristAgency touristAgency);
}
