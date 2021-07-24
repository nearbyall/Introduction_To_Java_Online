package com.epam.javaIntro.bean;

import com.epam.javaIntro.builder.FlowerBuilder;

public class Flower {
	private String name;
	private String color;
	private String floweringSeason;
	private double price;
	
	public Flower() {
		this.name = "";
		this.color = "";
		this.floweringSeason = "";
		this.price = 0;
	}

	public Flower(String name, String color, String floweringSeason, double price) {
		this.name = name;
		this.color = color;
		this.floweringSeason = floweringSeason;
		this.price = price;
	}
	
	public Flower(FlowerBuilder flowerBuilder) {
		this.name = flowerBuilder.getName();
		this.color = flowerBuilder.getColor();
		this.floweringSeason = flowerBuilder.getFloweringSeason();
		this.price = flowerBuilder.getPrice();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFloweringSeason() {
		return floweringSeason;
	}

	public void setFloweringSeason(String floweringSeason) {
		this.floweringSeason = floweringSeason;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Цветок: %s\n"
						   + "Цвет: %s\n"
						   + "Цена: %.2f\n",
						   name, color, price);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((floweringSeason == null) ? 0 : floweringSeason.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Flower other = (Flower) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (floweringSeason == null) {
			if (other.floweringSeason != null)
				return false;
		} else if (!floweringSeason.equals(other.floweringSeason))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
}
