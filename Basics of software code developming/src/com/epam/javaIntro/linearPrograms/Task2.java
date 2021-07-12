package com.epam.javaIntro.linearPrograms;

import java.util.Scanner;
import java.lang.Math;

/*
 * 2.Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 *   ((𝑏 + √(𝑏2 + 4𝑎𝑐)) / 2𝑎) − 𝑎3𝑐 + 𝑏^(−2)
 */

public class Task2 {
	public static void main(String[] args) {
		double a, b, c, y;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите значение переменной a: ");
		a = in.nextDouble();
		System.out.println("Введите значение переменной b: ");
		b = in.nextDouble();
		System.out.println("Введите значение переменной c: ");
		c = in.nextDouble();
		if (a != 0) {
			y = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
			System.out.println("Результат: " + y);
		} else {
			System.out.println("Происходит деление на ноль.");
		}		
		in.close();
	}
}
