package com.epam.javaIntro.test2;

public class Test2 {
	private int firstVariable, secondVariable;
	
	Test2() {
		firstVariable = 0;
		secondVariable = 0;
	}
	
	Test2(int firstValue, int secondValue) {
		firstVariable = firstValue;
		secondVariable = secondValue;
	}
	
	public void setFirstVariable(int value) {
		firstVariable = value;
	}
	
	public void setSecondVariable(int value) {
		secondVariable = value;
	}
	
	public int getFirstVariable() {
		return firstVariable;
	}
	
	public int getSecondVariable() {
		return secondVariable;
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
		Test2 other = (Test2) obj;
		if (firstVariable != other.firstVariable)
			return false;
		if (secondVariable != other.secondVariable)
			return false;
		return true;
	}
}
