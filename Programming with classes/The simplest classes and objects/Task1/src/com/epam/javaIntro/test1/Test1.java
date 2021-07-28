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

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [firstVariable=" + firstVariable + ", secondVariable=" + secondVariable + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstVariable;
		result = prime * result + secondVariable;
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
		Test1 other = (Test1) obj;
		if (firstVariable != other.firstVariable)
			return false;
		if (secondVariable != other.secondVariable)
			return false;
		return true;
	}
}
