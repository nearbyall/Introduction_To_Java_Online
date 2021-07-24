package com.epam.javaIntro.bean;

public class Jewelry extends Treasure {
	JewelryType jewelryType;
	
	public Jewelry() {
		super();
		this.jewelryType = JewelryType.UNIDENTIFIED;
	}
	
	public Jewelry(String name, String description, double price, JewelryType jewelryType) {
		super(name, description, price);
		this.jewelryType = jewelryType;
	}
	
	public JewelryType getJewelryType() {
		return jewelryType;
	}

	public void setJewelryType(JewelryType jewelryType) {
		this.jewelryType = jewelryType;
	}

	@Override
	public String toString() {
		return String.format("Украшение\n"
						   + "Тип украшения: %s\n"
						   + "Название: %s\n"
						   + "Описание: %s\n"
						   + "Цена: %.2f $\n",
						   this.jewelryType.getValue(), super.getName(), super.getDescription(), super.getPrice());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((jewelryType == null) ? 0 : jewelryType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jewelry other = (Jewelry) obj;
		if (jewelryType != other.jewelryType)
			return false;
		return true;
	}

	public static enum JewelryType{
		EARRINGS("Серьги"),
		CHAIN("Цепочка"),
		BRACELET("Браслет"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private JewelryType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
