package com.epam.javaIntro.decomposition;

/*
 * 8.Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6]. 
 *	 Пояснение. Составить метод(методы)  для вычисления суммы трех последовательно расположенных элементов 
 *	 массива с номерами от k до m. 
 */

public class Task8 {
	public static void main(String[] args) {
		int[] array = {1, 4, 6, 4, 4, 3, 8, 97, 21, 3, 17};
		System.out.println("Сумма трех последовательно расположенных элементов: " + getSum(array, 2, 4));
	}
	
	public static int getSum(int[] array, int k, int m) {
		int sum = 0;
		for (int i = k - 1; i < array.length && i < m; i++) {
			sum += array[i];
		}
		return sum;
	}
}
