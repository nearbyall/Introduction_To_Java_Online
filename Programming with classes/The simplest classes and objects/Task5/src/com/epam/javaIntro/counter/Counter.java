package com.epam.javaIntro.counter;

public class Counter {
	private int minValue;
	private int maxValue;
	private int currentValue;
	
	public Counter() {
		this.minValue = 0;
		this.maxValue = 1000;
		this.currentValue = 0;
	}
	
	public Counter(int minValue, int maxValue, int currentValue) {
		if ((minValue < maxValue) && (currentValue <= maxValue && currentValue >= minValue)) {
			this.minValue = minValue;
			this.maxValue = maxValue;
			this.currentValue = currentValue;
		} else {
			System.out.println("Были установлены неверные значения для счетчика." +
							   "\nБудут установлены значения по умолчанию");
			this.minValue = 0;
			this.maxValue = 1000;
			this.currentValue = 1;
		}
		
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [minValue=" + minValue + ", maxValue=" + maxValue + ", currentValue=" + currentValue + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + maxValue;
		result = prime * result + minValue;
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
		Counter other = (Counter) obj;
		if (currentValue != other.currentValue)
			return false;
		if (maxValue != other.maxValue)
			return false;
		if (minValue != other.minValue)
			return false;
		return true;
	}

	public void showCurrentInfo() {
		System.out.println("\nНижняя граница счетчика: " + minValue + 
						   "\nВерхняя граница счетчика: " + maxValue +
						   "\nТекущее значение счетчика: " + currentValue + '\n');
	}
	
	public void increasingValue() {
		if (currentValue == maxValue) {
			System.out.println("Верхняя граница счетчика уже достигнута.");
			return;
		}
		currentValue++;
		if (currentValue == maxValue) {
			System.out.println("Граница счетчика была достигнута!\n" +
							   "Текущее значение: " + currentValue);
		}
		if (currentValue < maxValue) {
			System.out.println("Значение счетчика было увеличено!\n" +
							   "Текущее значение: " + currentValue);
		}
	}
	
	public void decreasingValue() {
		if (currentValue == minValue) {
			System.out.println("Нижняя граница счетчика уже достигнута.");
			return;
		}
		currentValue--;
		if (currentValue == minValue) {
			System.out.println("Нижняя граница счетчика была достигнута!\n" +
							   "Текущее значение: " + currentValue);
		}
		if (currentValue > minValue) {
			System.out.println("Значение счетчика было уменьшено!\n" +
							   "Текущее значение: " + currentValue);
		}
	}
}
