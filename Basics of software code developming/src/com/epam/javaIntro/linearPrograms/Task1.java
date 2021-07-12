package com.epam.javaIntro.linearPrograms;

import java.util.Scanner;

/*
 * 1.Найдите значение функции: z = ( (a–3 ) * b/ 2) + c.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double a, b, c, z;
		System.out.println("Введите значение переменной A: ");
		a = in.nextDouble();
		System.out.println("Введите значение переменной B: ");
		b = in.nextDouble();
		System.out.println("Введите значение переменной C: ");
		c = in.nextDouble();
		z = ((a - 3) * b / 2) + c;
		System.out.println("Реузльтат: " + z);
		in.close();
	}
}
