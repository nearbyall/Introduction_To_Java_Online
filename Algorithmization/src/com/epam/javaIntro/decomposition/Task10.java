package com.epam.javaIntro.decomposition;

/*
 * 10.Дано  натуральное  число  N.  Написать  метод(методы)  для  формирования  массива,  элементами  которого 
 *	  являются цифры числа N. 
 */

public class Task10 {
	public static void main(String[] args) {
		int[] result = numberToArray((657483));
		for (int number : result) {
			System.out.print(number + " ");
		}
	}
	
	public static int[] numberToArray(int a) {
		int[] array = new int[Integer.toString(a).length()];
		int temp = a;
		int i = 0;
		while (temp != 0) {
			array[i] = temp % 10;
			temp /= 10;
			i++;
		}
		return array;
	}
}
