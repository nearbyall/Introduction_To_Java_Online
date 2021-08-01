package com.epam.javaIntro.view.impl;

import com.epam.javaIntro.bean.Airline;
import com.epam.javaIntro.bean.ListOfAirlines;
import com.epam.javaIntro.view.ListOfAirlinesView;

public class ListOfAirlinesViewImpl implements ListOfAirlinesView {

	@Override
	public void printAirlines(ListOfAirlines listOfAirlines) {
		System.out.println("Список рейсов: \n");
		for (Airline airline : listOfAirlines.getAirlines()) {
			System.out.println(airline.getInfo());
		}
	}

	@Override
	public void printAirlinesByDestination(ListOfAirlines listOfAirlines, String destination) {
		System.out.printf("\nСписок рейсов направляющихся в %s: \n", destination);
		for (Airline airline : listOfAirlines.getAirlines()) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				System.out.println(airline.getInfo());
			}
		}
	}

	@Override
	public void printAirlinesByDayOfWeek(ListOfAirlines listOfAirlines, String dayOfWeek) {
		System.out.printf("\nСписок рейсов отправляющихся в %s: \n", dayOfWeek);
		for (Airline airline : listOfAirlines.getAirlines()) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				System.out.println(airline.getInfo());
			}
		}
	}

	@Override
	public void printAirlinesByDayOfWeekAndDepartureTime(ListOfAirlines listOfAirlines, String dayOfWeek, String departureTime) {
		System.out.printf("\nСписок рейсов отправляющихся в %s позже %s: \n", dayOfWeek, departureTime);
		for (Airline airline : listOfAirlines.getAirlines()) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek) &&
				airline.getDepartureTime().compareTo(departureTime) > 0) {
				System.out.println(airline.getInfo());
			}
		}
	}

}
