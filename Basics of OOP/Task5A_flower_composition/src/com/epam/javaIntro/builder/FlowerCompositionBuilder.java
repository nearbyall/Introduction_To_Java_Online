package com.epam.javaIntro.builder;

import java.util.ArrayList;

import com.epam.javaIntro.bean.Flower;
import com.epam.javaIntro.bean.FlowerComposition;
import com.epam.javaIntro.bean.Wrap;

public class FlowerCompositionBuilder {
	private ArrayList<Flower> flowers;
	private Wrap wrap;
	private double price;
	
	public FlowerCompositionBuilder() {
		this.flowers = new ArrayList<Flower>();
		this.wrap = null;
		this.price = 0;
	}
	
	public FlowerCompositionBuilder withWrap(Wrap wrap) {
		this.wrap = wrap;
		this.price += wrap.getPrice();
		return this;
	}
	
	public FlowerCompositionBuilder addFlower(Flower flower) {
		this.flowers.add(flower);
		this.price += flower.getPrice();
		return this;
	}
	
	public FlowerComposition build() {
		return new FlowerComposition(this);
	}

	public ArrayList<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(ArrayList<Flower> flowers) {
		this.flowers = flowers;
	}

	public Wrap getWrap() {
		return wrap;
	}

	public void setWrap(Wrap wrap) {
		this.wrap = wrap;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
