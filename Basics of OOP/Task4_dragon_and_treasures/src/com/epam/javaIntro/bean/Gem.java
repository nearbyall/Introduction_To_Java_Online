package com.epam.javaIntro.bean;

public class Gem extends Treasure {
	private GemType gemType;
	
	public Gem() {
		super();
		this.gemType = GemType.UNIDENTIFIED;
	}
	
	public Gem(String name, String description, double price, GemType gemType) {
		super(name, description, price);
		this.gemType = gemType;
	}
	
	public GemType getGemType() {
		return gemType;
	}

	public void setGemType(GemType gemType) {
		this.gemType = gemType;
	}

	@Override
	public String toString() {
		return String.format("Драгоценный камень\n"
						   + "Тип камня: %s\n"
						   + "Название: %s\n"
						   + "Описание: %s\n"
						   + "Цена: %.2f $\n",
				           this.gemType.getValue(), super.getName(), super.getDescription(), super.getPrice());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((gemType == null) ? 0 : gemType.hashCode());
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
		Gem other = (Gem) obj;
		if (gemType != other.gemType)
			return false;
		return true;
	}

	public static enum GemType{
		DIAMOND("Алмаз"),
		EMERALD("Изумруд"),
		NEPHRITIS("Нефрит"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private GemType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
