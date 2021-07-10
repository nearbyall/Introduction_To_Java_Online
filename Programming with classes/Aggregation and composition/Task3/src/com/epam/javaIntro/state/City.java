package com.epam.javaIntro.state;

public class City {
	private String name;
	private boolean regionalCenter;
	private boolean capital;
	private boolean districtCenter;
	
	public City(String name, boolean regionalCenter, boolean capital, boolean districtCenter) {
		this.name = name;
		this.regionalCenter = regionalCenter;
		this.capital = capital;
		this.districtCenter = districtCenter;
	}
	
	@Override
	public String toString() {
		return String.format("Название города: %s", name);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capital ? 1231 : 1237);
		result = prime * result + (districtCenter ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (regionalCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (capital != other.capital)
			return false;
		if (districtCenter != other.districtCenter)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionalCenter != other.regionalCenter)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}
	
	public boolean isRegionalCenter() {
		return regionalCenter;
	}
	
	public boolean isCapital() {
		return capital;
	}
	
	public boolean isDistrictCenter() {
		return districtCenter;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegionalCenter(boolean regionalCenter) {
		this.regionalCenter = regionalCenter;
	}
	
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	
	public void setDistrictCenter(boolean districtCenter) {
		this.districtCenter = districtCenter;
	}
}
