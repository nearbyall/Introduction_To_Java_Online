package com.epam.javaIntro.state;

import java.util.ArrayList;

public class District {
	private String name;
	private ArrayList<City> cities;
	private City centerOfDistrict;
	
	public District(String name) {
		this.name = name;
		this.cities = new ArrayList<City>();
		centerOfDistrict = null;
	}
	
	public District(String name, ArrayList<City> cities, City centerOfDistrict) {
		this.name = name;
		this.cities = cities;
		this.centerOfDistrict = centerOfDistrict;
	}
	
	@Override
	public String toString() {
		return String.format("Название региона: %s\n", name);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centerOfDistrict == null) ? 0 : centerOfDistrict.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		District other = (District) obj;
		if (centerOfDistrict == null) {
			if (other.centerOfDistrict != null)
				return false;
		} else if (!centerOfDistrict.equals(other.centerOfDistrict))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void addCity(City city) {
		cities.add(city);
		if (city.isDistrictCenter()) {
			centerOfDistrict = city;
		}
	}
	
	public void printCenterOfDistrict() {
		if (centerOfDistrict != null ) {
			System.out.printf("Район %s, районный центр %s\n", name, centerOfDistrict); 
		} else {
			System.out.println("Районный центр отсутствует");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<City> getCities() {
		return cities;
	}
	
	public City getCenterOfDistrict() {
		return centerOfDistrict;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
	public void setCenterOfDistrict(City centerOfDistrict) {
		this.centerOfDistrict = centerOfDistrict;
	}
}
