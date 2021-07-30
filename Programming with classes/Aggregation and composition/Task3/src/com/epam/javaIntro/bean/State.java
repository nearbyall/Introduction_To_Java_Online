package com.epam.javaIntro.bean;

import java.util.ArrayList;

public class State {
	private String name;
	private float square;
	private ArrayList<Region> regions;
	private City capitalOfState;
	
	public State(String name) {
		this.name = name;
		this.square = 0;
		this.regions = new ArrayList<Region>();
		this.capitalOfState = null;
	}
	
	public State(String name, float square, ArrayList<Region> regions, City capitalOfState) {
		this.name = name;
		this.square = square;
		this.regions = regions;
		this.capitalOfState = capitalOfState;
	}

	

	public void addRegion(Region region) {
		regions.add(region);
		square += region.getSquare();
		ArrayList<District> districts = region.getDistricts();
		for (District district : districts) {
			ArrayList<City> cities = district.getCities();
			for (City city : cities) {
				if (city.isCapital()) {
					capitalOfState = city;
				}
			}
		}
	}
	
	public void printCapitalOfState() {
		if (capitalOfState != null) {
			System.out.printf("Государство %s, столица %s\n", name, capitalOfState.getName());
		} else {
			System.out.println("Столица не задана");
		}
	}
	
	public void printCountOfRegions() {
		if (regions.size() > 0) {
			System.out.println("Кол-во областей: " + regions.size());
		} else {
			System.out.println("Области еще не добавлены");
		}
	}
	
	public void printSquare() {
		if (square > 0) {
			System.out.println("Площадь государства: " + square);
		}
	}
	
	public void printCentersOfRegions() {
		if (regions.size() > 0) {
			for (Region region : regions) {
				region.printCenterOfRegion();
			}
		} else {
			System.out.println("Области еще не добавлены");
		}	
	}
	
	public String getName() {
		return name;
	}
	
	public float getSquare() {
		return square;
	}
	
	public ArrayList<Region> getRegions() {
		return regions;
	}
	
	public City getCapitalOfState() {
		return capitalOfState;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSquare(float square) {
		this.square = square;
	}
	
	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}
	
	public void setCapitalOfState(City capitalOfState) {
		this.capitalOfState = capitalOfState;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", square=" + square + ", regions=" + regions + ", capitalOfState="
				+ capitalOfState + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capitalOfState == null) ? 0 : capitalOfState.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capitalOfState == null) {
			if (other.capitalOfState != null)
				return false;
		} else if (!capitalOfState.equals(other.capitalOfState))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (Float.floatToIntBits(square) != Float.floatToIntBits(other.square))
			return false;
		return true;
	}
}