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
	
	@Override
	public String toString() {
		return String.format("Пункт назначения: %s\n"
						   + "Номер рейса: %s\n"
						   + "Тип самолета: %s\n"
						   + "Время отправления: %s\n"
						   + "День отправления: %s\n",
						   destination, flightNumber, aircraftType, departureTime, dayOfWeek);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightNumber == null) ? 0 : flightNumber.hashCode());
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (dayOfWeek == null) {
			if (other.dayOfWeek != null)
				return false;
		} else if (!dayOfWeek.equals(other.dayOfWeek))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber == null) {
			if (other.flightNumber != null)
				return false;
		} else if (!flightNumber.equals(other.flightNumber))
			return false;
		return true;
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
