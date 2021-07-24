package com.epam.javaIntro.decomposition;

/*
 * 7.Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9. 
 */

public class Task7 {
	public static void main(String[] args) {
		System.out.println("Сумма факториалов нечетных чисел от 1 до 9: " + oddFactorialSum());
	}
	
	public static int oddFactorialSum() {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				sum += getFactorial(i);
			}
		}
		return sum;
	}
	
	public static int getFactorial(int f) {
		int result = 1;
		for (int i = 1; i <= f; i++) {
			result = result * i;
		}
		return result;
	}
}
