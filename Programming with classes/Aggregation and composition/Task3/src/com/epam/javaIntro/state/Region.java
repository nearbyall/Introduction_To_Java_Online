package com.epam.javaIntro.state;

import java.util.ArrayList;

public class Region {
	private String name;
	private float square;
	private ArrayList<District> districts;
	private City centerOfRegion;
	
	public Region(String name) {
		this.name = name;
		this.square = 0;
		this.districts = new ArrayList<District>();
		this.centerOfRegion = null;
	}
	
	public Region(String name, float square, ArrayList<District> districts, City centerOfRegion) {
		this.name = name;
		this.square = square;
		this.districts = districts;
		this.centerOfRegion = centerOfRegion;
	}
	
	@Override
	public String toString() {
		return String.format("Название области: %s\n", name);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((centerOfRegion == null) ? 0 : centerOfRegion.hashCode());
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(square);
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
		Region other = (Region) obj;
		if (centerOfRegion == null) {
			if (other.centerOfRegion != null)
				return false;
		} else if (!centerOfRegion.equals(other.centerOfRegion))
			return false;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(square) != Float.floatToIntBits(other.square))
			return false;
		return true;
	}

	public void addDistrict(District district) {
		districts.add(district);
		ArrayList<City> cities = district.getCities();
		for(City city : cities) {
			if (city.isRegionalCenter()) {
				centerOfRegion = city;
			}
		}
	}
	
	public void printCenterOfRegion() {
		if (centerOfRegion != null) {
			System.out.printf("Область %s, областной центр %s\n", name, centerOfRegion.getName());
		} else {
			System.out.println("Областной центр не задан");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public float getSquare() {
		return square;
	}
	
	public ArrayList<District> getDistricts() {
		return districts;
	}
	
	public City getCenterOfRegion() {
		return centerOfRegion;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSquare(float square) {
		this.square = square;
	}
	
	public void setDistricts(ArrayList<District> districts) {
		this.districts = districts;
	}
	
	public void setCenterOfRegion(City centerOfRegion) {
		this.centerOfRegion = centerOfRegion;
	}
}
