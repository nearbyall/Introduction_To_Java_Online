package com.epam.javaIntro.bean;

public class Dragon extends Creature {
	private DragonStatus dragonStatus;
	private int countOfClaws;
	private int countOfMurders;
	
	public Dragon() {
		super();
		this.dragonStatus = DragonStatus.UNIDENTIFIED;
		this.countOfClaws = 0;
		this.countOfMurders = 0;
	}
	
	public Dragon(String name, int age, DragonStatus dragonStatus, int countOfClaws, int countOfMurders) {
		super(name, age);
		this.dragonStatus = dragonStatus;
		this.countOfClaws = countOfClaws;
		this.countOfMurders = countOfMurders;
	}

	public DragonStatus getDragonStatus() {
		return dragonStatus;
	}

	public void setDragonStatus(DragonStatus dragonStatus) {
		this.dragonStatus = dragonStatus;
	}

	public int getCountOfClaws() {
		return countOfClaws;
	}

	public void setCountOfClaws(int countOfClaws) {
		this.countOfClaws = countOfClaws;
	}

	public int getCountOfMurders() {
		return countOfMurders;
	}

	public void setCountOfMurders(int countOfMurders) {
		this.countOfMurders = countOfMurders;
	}

	@Override
	public String toString() {
		return "Дракон: " + super.getName() + " возраст: " + super.getAge();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + countOfClaws;
		result = prime * result + countOfMurders;
		result = prime * result + ((dragonStatus == null) ? 0 : dragonStatus.hashCode());
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
		Dragon other = (Dragon) obj;
		if (countOfClaws != other.countOfClaws)
			return false;
		if (countOfMurders != other.countOfMurders)
			return false;
		if (dragonStatus != other.dragonStatus)
			return false;
		return true;
	}

	public static enum DragonStatus{
		SLEEP("Спит"),
		DEAD("Мертв"),
		AWAKE("Бодрствует"),
		HUNT("Охотится"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private DragonStatus(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
