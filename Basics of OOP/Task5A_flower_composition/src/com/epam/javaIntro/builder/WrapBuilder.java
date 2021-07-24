package com.epam.javaIntro.builder;

import com.epam.javaIntro.bean.Wrap;
import com.epam.javaIntro.bean.Wrap.WrapType;

public class WrapBuilder {
	private WrapType wrapType;
	public double price;
	
	public WrapBuilder() {
		this.wrapType = WrapType.UNINENDIFIEND;
		this.price = 0;
	}
	
	public WrapBuilder withWrapType(WrapType wrapType) {
		this.wrapType = wrapType;
		return this;
	}
	
	public WrapBuilder withPrice(double price) {
		this.price = price;
		return this;
	}
	
	public Wrap build() {
		return new Wrap(this);
	}

	public WrapType getWrapType() {
		return wrapType;
	}

	public void setWrapType(WrapType wrapType) {
		this.wrapType = wrapType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
