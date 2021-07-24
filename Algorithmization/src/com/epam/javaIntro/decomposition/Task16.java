package com.epam.javaIntro.decomposition;

/*
 * 16.Написать  программу,  определяющую  сумму  n  -  значных  чисел,  содержащих  только  нечетные  цифры. 
 *	  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию. 
 */

public class Task16 {
	public static void main(String[] args) {
		System.out.println("Сумма: " + getSum(4) + "\nКол-во четных цифр: " + countOfEvenNumerals(getSum(4)));
	}
	
	public static int getSum(int n) {
		int sum = 0;
		for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
			if (isOnlyOddNumerals(i)) {
				sum += i;
			}
		}
		return sum;
	}
	
	public static int countOfEvenNumerals (int number) {
		int count = 0;
		while (number != 0) {
			if ((number % 10) % 2 == 0) {
				count++;
			}
			number /= 10;
		}
		return count;
	}
	
	public static boolean isOnlyOddNumerals(int number) {
		while (number != 0) {
			if ((number % 10) % 2 == 0) {
				return false;
			}
			number /= 10;
		}
		return true;
	}
}
