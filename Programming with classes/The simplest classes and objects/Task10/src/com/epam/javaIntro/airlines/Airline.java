package com.epam.javaIntro.airlines;

public class Airline {
	private String destination;
	private String flightNumber;
	private String aircraftType;
	private String departureTime;
	private String dayOfWeek;
	
	public Airline(String destination, String flightNumber, String aircraftType, String departureTime, String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}
	
	public String toString() {
		return String.format("Пункт назначения: %s\n"
						   + "Номер рейса: %s\n"
						   + "Тип самолета: %s\n"
						   + "Время отправления: %s\n"
						   + "День отправления: %s\n",
						   destination, flightNumber, aircraftType, departureTime, dayOfWeek);
	}
	
	public String getDestination() {
		return destination;
	}
	
	public String getFlightNumber() {
		return flightNumber;
	}
	
	public String getAircraftType() {
		return aircraftType;
	}
	
	public String getDepartureTime() {
		return departureTime;
	}
	
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}
	
	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
	
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
}
