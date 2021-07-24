package com.epam.javaIntro.decomposition;

/*
 * 5.Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, 
 *	 которое меньше максимального элемента массива, но больше всех других элементов). 
 */

public class Task5 {
	public static void main(String[] args) {
		int[] array = {1, 25, 32, 21, 9, 65, 32, 12, 87, 98, 44, 56, 17};
		System.out.println("Второй по величине элемент массива: " + getSecondLargestNumber(array));
	}
	
	public static int getSecondLargestNumber(int[] array) {
		int largestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > largestNumber) {
				largestNumber = array[i];
			}
		}
		
		int secondLargestNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondLargestNumber && array[i] < largestNumber) {
				secondLargestNumber = array[i];
			}
		}
		
		return secondLargestNumber;
	}
}
