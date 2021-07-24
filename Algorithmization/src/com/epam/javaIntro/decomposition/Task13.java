package com.epam.javaIntro.decomposition;

/*
 * 13.Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43). 
 *    Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n  -  заданное натуральное число больше 2.
 *    Для решения задачи использовать декомпозицию.
 */

public class Task13 {
	public static void main(String[] args) {
		int[][] twinks = findTwinks(20);
		for (int[] array : twinks) {
			System.out.println("\nЧисла близнецы : ");
			for (int number : array) {
				System.out.print(number + " ");
			}
		}
	}
	
	public static int[][] findTwinks(int n) {
		int[][] twinks = new int[n - 1][2];
		for (int i = 0; i < twinks.length; i++) {
			twinks[i][0] = n + i;
			twinks[i][1] = twinks[i][0] + 2;
		}
		return twinks;
	}
}
