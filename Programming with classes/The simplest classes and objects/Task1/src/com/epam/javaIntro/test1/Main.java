package com.epam.javaIntro.test1;

/*
 * 1.Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
 *  Добавьте метод, который находит сумму значений этих переменных, и метод,который находит наибольшее значение из этих двух переменных.
 */

public class Main {
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.setFirstVariable(5);
		test.setSecondVariable(2);
		test.printVariables();
		test.sumVariables();
	}
}
