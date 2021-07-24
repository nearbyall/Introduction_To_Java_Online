package com.epam.javaIntro.bean;

import com.epam.javaIntro.builder.WrapBuilder;

public class Wrap {
	private WrapType wrapType;
	public double price;
	
	public Wrap() {
		this.wrapType = WrapType.UNINENDIFIEND;
		this.price = 0;
	}
	
	public Wrap(WrapType wrapType, double price) {
		super();
		this.wrapType = wrapType;
		this.price = price;
	}
	
	public Wrap(WrapBuilder wrapBuilder) {
		this.wrapType = wrapBuilder.getWrapType();
		this.price = wrapBuilder.getPrice();
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

	@Override
	public String toString() {
		return String.format("Упаковка: %s\n"
						   + "Цена: %.2f\n",
						   wrapType.getValue(), price);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((wrapType == null) ? 0 : wrapType.hashCode());
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
		Wrap other = (Wrap) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (wrapType != other.wrapType)
			return false;
		return true;
	}

	public static enum WrapType{
		POLYETELINE("Полиэтиленовая"),
		KNITTED("Вязаная"),
		PAPER("Бумажная"),
		UNINENDIFIEND("Неопознано");
		
		private final String value;
		
		private WrapType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
