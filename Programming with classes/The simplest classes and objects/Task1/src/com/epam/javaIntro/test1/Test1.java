package com.epam.javaIntro.test1;

public class Test1 {
	private int firstVariable, secondVariable;
	
	Test1() {
		firstVariable = 0;
		secondVariable = 0;
	}
	
	public void setFirstVariable(int value) {
		firstVariable = value;
	}
	
	public void setSecondVariable(int value) {
		secondVariable = value;
	}
	
	public void sumVariables() {
		System.out.println("Сумма двух переменных: " + (firstVariable + secondVariable));
	}
	
	public void printVariables() {
		System.out.println("Первая переменная: " + firstVariable + 
						   "\nВторая переменная: " + secondVariable +
						   "\nВывод закончен.\n");
	}
}
