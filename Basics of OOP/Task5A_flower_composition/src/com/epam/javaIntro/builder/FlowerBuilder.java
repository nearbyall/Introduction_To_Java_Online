package com.epam.javaIntro.builder;

import com.epam.javaIntro.bean.Flower;

public class FlowerBuilder {
	private String name;
	private String color;
	private String floweringSeason;
	private double price;
	
	public FlowerBuilder(String name) {
		if(name == null || name.equals(""))
			throw new IllegalArgumentException("Цветок не может быть безымянным");
		this.name = name;
	}
	
	public FlowerBuilder withColor(String color) {
		this.color = color;
		return this;
	}
	
	public FlowerBuilder withFloweringSeason(String floweringSeason) {
		this.floweringSeason = floweringSeason;
		return this;
	}
	
	public FlowerBuilder withPrice(double price) {
		this.price = price;
		return this;
	}
	
	public Flower build() {
		return new Flower(this); 
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
}
