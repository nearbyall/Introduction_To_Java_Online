package com.epam.javaIntro.bean;

public class Money extends Treasure {
	private MoneyType moneyType;
	
	public Money() {
		super();
		this.moneyType = MoneyType.UNIDENTIFIED;
	}
	
	public Money (String name, String description, double price, MoneyType moneyType) {
		super(name, description, price);
		this.moneyType = moneyType;
	}
	
	public MoneyType getMoneyType() {
		return moneyType;
	}

	public void setMoneyType(MoneyType moneyType) {
		this.moneyType = moneyType;
	}

	@Override
	public String toString() {
		return String.format("Деньги\n"
						   + "Тип денег: %s\n"
						   + "Название: %s\n"
						   + "Описание: %s\n"
						   + "Эквиевалентно: %.2f $\n",
						   this.moneyType.getValue(), super.getName(), super.getDescription(), super.getPrice());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((moneyType == null) ? 0 : moneyType.hashCode());
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
		Money other = (Money) obj;
		if (moneyType != other.moneyType)
			return false;
		return true;
	}

	public static enum MoneyType{
		COIN("Монета"),
		BANK_NOTE("Банкнота"),
		UNIDENTIFIED("Неопознано");
		
		private final String value;
		
		private MoneyType(String value) {
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}
	}
}
