package com.epam.javaIntro.decomposition;

/*
 * 14.Натуральное  число,  в  записи  которого  n  цифр,  называется  числом  Армстронга,  если  сумма  его  цифр, 
 *	  возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.  Для решения задачи использовать декомпозицию. 
 */

public class Task14 {
	public static void main(String[] args) {
		printArmstrongNumbers(Integer.MAX_VALUE);
	}
	
	public static boolean isArmstrongNumber(int number) {
		int sum = 0;
		int value = number;
		int length = 0;
		
		while (number != 0) {
			sum += (number % 10);
			length++;
			number /= 10;
		}
		if (Math.pow(sum, length) == value) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void printArmstrongNumbers(int k) {
		for (int i = 0; i < k; i++) {
			if (isArmstrongNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
