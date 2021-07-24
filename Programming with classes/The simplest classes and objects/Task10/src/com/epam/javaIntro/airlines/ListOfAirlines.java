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
	
	@Override
	public String toString() {
		return "ListOfAirlines [airlines=" + airlines + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListOfAirlines other = (ListOfAirlines) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}
	
	public void printAirlines() {
		System.out.println("Список рейсов: \n");
		for (Airline airline : airlines) {
			System.out.println(airline.toString());
		}
	}
	
	public void printAirlinesByDestination(String destination) {
		System.out.printf("\nСписок рейсов направляющихся в %s: \n", destination);
		for (Airline airline : airlines) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				System.out.println(airline.toString());
			}
		}
	}
	
	public void printAirlinesByDayOfWeek(String dayOfWeek) {
		System.out.printf("\nСписок рейсов отправляющихся в %s: \n", dayOfWeek);
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				System.out.println(airline.toString());
			}
		}
	}
	
	public void printAirlinesByDayOfWeekAndDepartureTime(String dayOfWeek, String departureTime) {
		System.out.printf("\nСписок рейсов отправляющихся в %s позже %s: \n", dayOfWeek, departureTime);
		for (Airline airline : airlines) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek) &&
				airline.getDepartureTime().compareTo(departureTime) > 0) {
				System.out.println(airline.toString());
			}
		}
	}
}
