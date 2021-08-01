package com.epam.javaIntro.view;

import com.epam.javaIntro.bean.ListOfAirlines;

public interface ListOfAirlinesView {
	void printAirlines(ListOfAirlines listOfAirlines);
	void printAirlinesByDestination(ListOfAirlines listOfAirlines, String destination);
	void printAirlinesByDayOfWeek(ListOfAirlines listOfAirlines, String dayOfWeek);
	void printAirlinesByDayOfWeekAndDepartureTime(ListOfAirlines listOfAirlines, String dayOfWeek, String departureTime);
}
