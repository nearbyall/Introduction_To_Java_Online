package com.epam.javaIntro.airlines;

import java.util.ArrayList;

public class ListOfAirlines {
	private ArrayList<Airline> airlines;
	
	public ListOfAirlines() {
		this.airlines = new ArrayList<Airline>();
	}
	
	public ListOfAirlines(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}
	
	public void addAirline(Airline airline) {
		airlines.add(airline);
	}
	
	public void printAirlines() {
		System.out.println("—писок рейсов: \n");
		for (Airline airline : airlines) {
			System.out.println(airline.toString());
		}
	}
	
	public void printAirlinesByDestination(String destination) {
		System.out.printf("\n—писок рейсов направл€ющихс€ в %s: \n", destination);
		for (Airline airline : airlines) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				System.out.println(airline.toString());
			}
		}
	}
	
	public void printAirlinesByDayOfWeek(String dayOfWeek) {
		System.out.printf("\n—писок рейсов отправл€ющихс€ в %s: \n", dayOfWeek);
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				System.out.println(airline.toString());
			}
		}
	}
	
	public void printAirlinesByDayOfWeekAndDepartureTime(String dayOfWeek, String departureTime) {
		System.out.printf("\n—писок рейсов отправл€ющихс€ в %s позже %s: \n", dayOfWeek, departureTime);
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek) &&
				airline.getDepartureTime().compareTo(departureTime) > 0) {
				System.out.println(airline.toString());
			}
		}
	}
}
