package com.epam.javaIntro.bean;

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
	
	public ArrayList<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [airlines=" + airlines + "]";
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
}
