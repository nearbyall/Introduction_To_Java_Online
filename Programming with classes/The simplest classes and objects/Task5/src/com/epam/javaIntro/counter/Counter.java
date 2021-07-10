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
