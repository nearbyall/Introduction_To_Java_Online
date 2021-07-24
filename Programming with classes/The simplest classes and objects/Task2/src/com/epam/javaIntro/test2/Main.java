package com.epam.javaIntro.test2;

/*
 * 2.Создйте класс  Test2 двумя  переменными.  Добавьте конструктор  с  входными  параметрами.  Добавьте 
 *	 конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра 
 *	 класса. 
 */

public class Main {
	public static void main(String[] args) {
		Test2 test = new Test2(10, 15);
		test.setFirstVariable(5);
		test.setSecondVariable(6);
		System.out.printf("Первая переменная: %d\nВторая переменная: %d\n", test.getFirstVariable(), test.getSecondVariable());
	}
}
