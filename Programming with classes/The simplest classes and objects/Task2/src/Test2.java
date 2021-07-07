
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
}
