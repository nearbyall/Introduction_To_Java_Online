package com.epam.javaIntro.counter;

/*
 * 5.Опишите класс, реализующий десятичный счетчик, который может 
 *   увеличивать или уменьшать свое значение на  единицу  в  заданном  диапазоне.
 *   Предусмотрите инициализацию  счетчика  значениями  по  умолчанию  и произвольными  значениями.
 *   Счетчик  имеет методы увеличения  и  уменьшения состояния, и  метод позволяющий получить его текущее состояние.
 *   Написать код, демонстрирующий все возможности класса.
 */

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter(0, 10, 0);
		counter.showCurrentInfo();
		
		for (int i = 0; i < 10; i++) {
			counter.increasingValue();
		}
		
		counter.showCurrentInfo();
		
		for (int i = 0; i < 10; i++) {
			counter.decreasingValue();
		}
		
		counter.showCurrentInfo();
	}
}
