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
			System.out.println("���� ����������� �������� �������� ��� ��������." +
							   "\n����� ����������� �������� �� ���������");
			this.minValue = 0;
			this.maxValue = 1000;
			this.currentValue = 1;
		}
		
	}
	
	public void showCurrentInfo() {
		System.out.println("\n������ ������� ��������: " + minValue + 
						   "\n������� ������� ��������: " + maxValue +
						   "\n������� �������� ��������: " + currentValue + '\n');
	}
	
	public void increasingValue() {
		if (currentValue == maxValue) {
			System.out.println("������� ������� �������� ��� ����������.");
			return;
		}
		currentValue++;
		if (currentValue == maxValue) {
			System.out.println("������� �������� ���� ����������!\n" +
							   "������� ��������: " + currentValue);
		}
		if (currentValue < maxValue) {
			System.out.println("�������� �������� ���� ���������!\n" +
							   "������� ��������: " + currentValue);
		}
	}
	
	public void decreasingValue() {
		if (currentValue == minValue) {
			System.out.println("������ ������� �������� ��� ����������.");
			return;
		}
		currentValue--;
		if (currentValue == minValue) {
			System.out.println("������ ������� �������� ���� ����������!\n" +
							   "������� ��������: " + currentValue);
		}
		if (currentValue > minValue) {
			System.out.println("�������� �������� ���� ���������!\n" +
							   "������� ��������: " + currentValue);
		}
	}
}
