package com.epam.javaIntro.decomposition;

/*
 * 11.Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Task11 {
	public static void main(String[] args) {
		System.out.println("Более длиное число: " + whichNumberIsLonger(236, 8937));
	}
	
	public static int whichNumberIsLonger(int a, int b) {
		int temp1 = a, temp2 = b;
		while (true) {
			temp1 /= 10;
			temp2 /= 10;
			if (temp1 == 0) {
				return b;
			} else if (temp2 == 0) {
				return a;
			}
		}
	}
}
