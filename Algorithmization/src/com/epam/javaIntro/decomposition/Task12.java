package com.epam.javaIntro.decomposition;

/*
 * 12.Даны натуральные числа К и N.  Написать метод(методы)  формирования массива А, элементами которого 
 *    являются числа, сумма цифр которых равна К и которые не большее N.
 */

public class Task12 {
	public static void main(String[] args) {
		int[] array = createArray(5, 20);
		for (int number : array) {
			System.out.print(number + " ");
		}
	}
	
	public static int sumOfNumerals(int number) {
		int sum = 0;
		while(number != 0) {
			sum += (number % 10);
			number /= 10;
		}
		return sum;
	}
	
	public static int[] createArray(int k, int n) {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			boolean isPossible = false;
			while (!isPossible) {
				int value = (int) (Math.random() * n + 1);
				if (sumOfNumerals(value) == k) {
					array[i] = value;
					isPossible = true;
				} 
			}			
		}
		return array;
	}
}
