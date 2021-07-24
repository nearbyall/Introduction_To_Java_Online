package com.epam.javaIntro.decomposition;

import java.util.Scanner;

/*
 * 1.Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
 *	 натуральных чисел:
 *	 НОК(А,Б) = А * Б / НОД(А,Б)
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое натуральное число: ");
		int a = in.nextInt();
		System.out.println("Введите второе натуральное число: ");
		int b = in.nextInt();
		
		System.out.println("Наибольший общий делитель: " + getGcd(a, b));
		System.out.println("Наименьшее общее кратное: " + getLcm(a, b));
		
		in.close();
	}
	
	private static int getGcd(int a, int b) {
		for (int i = 0; i < 2; i++) {
			while (a != 0 && b != 0) {
				if (a > b) {
					a %= b;
				} else {
					b %= a;
				}
			}
			a += b;
		}
		return a;
	}
	
	private static int getLcm(int a, int b) {
		return Math.abs(a * b / getGcd(a, b));
	}
}
