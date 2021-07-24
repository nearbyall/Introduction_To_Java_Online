package com.epam.javaIntro.decomposition;

import java.util.Scanner;

/*
 * 3.Вычислить  площадь  правильного  шестиугольника  со  стороной  а,
 *   используя  метод  вычисления  площади треугольника. 
 */

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите сторону правильного шестиугольника: ");
		int a = in.nextInt();
		
		System.out.printf("Площадь правильного шестиугольника: %.2f", getRegularHexagonSquare(a));
		
		in.close();
	}
	
	public static double getTriangleSquare(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
	
	public static double getRegularHexagonSquare(double a) {
		//Правильный шестиугольник состоит из 6 правильных треугольников
		return 6 * getTriangleSquare(a, a, a);
	}
}
