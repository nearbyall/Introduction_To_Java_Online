package com.epam.javaIntro.bean;

import java.util.ArrayList;

import com.epam.javaIntro.builder.FlowerCompositionBuilder;

public class FlowerComposition {
	private ArrayList<Flower> flowers;
	private Wrap wrap;
	private double price = 0;
	
	
	public FlowerComposition() {
		this.flowers = new ArrayList<Flower>();
		this.wrap = null;
		this.price = 0;
	}
	
	public FlowerComposition(Wrap wrap) {
		this.flowers = new ArrayList<Flower>();
		this.wrap = wrap;
		this.price = 0;
	}

	public FlowerComposition(FlowerCompositionBuilder flowerCompositionBuilder) {
		this.flowers = flowerCompositionBuilder.getFlowers();
		this.wrap = flowerCompositionBuilder.getWrap();
		this.price = flowerCompositionBuilder.getPrice();
	}
	
	public void addFlower(Flower flower) {
		flowers.add(flower);
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

	@Override
	public String toString() {
		return String.format("Букет в упаковке: %s\n", wrap.getWrapType().getValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((wrap == null) ? 0 : wrap.hashCode());
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
		FlowerComposition other = (FlowerComposition) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (wrap == null) {
			if (other.wrap != null)
				return false;
		} else if (!wrap.equals(other.wrap))
			return false;
		return true;
	}
}
