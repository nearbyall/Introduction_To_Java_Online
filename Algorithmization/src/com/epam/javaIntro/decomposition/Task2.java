package com.epam.javaIntro.decomposition;

import java.util.Scanner;

/*
 * 2.Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое натуральное число: ");
		int a = in.nextInt();
		System.out.println("Введите второе натуральное число: ");
		int b = in.nextInt();
		System.out.println("Введите третье натуральное число: ");
		int c = in.nextInt();
		System.out.println("Введите четвертое натуральное число: ");
		int d = in.nextInt();
		
		System.out.println("Наибольший общий делитель: " + getGcd(a, b, c, d));
		
		in.close();
	}
	
	public static int getGcd(int a, int b, int c, int d) {
		int[] numbers = new int[4];
		numbers[0] = a;
		numbers[1] = b;
		numbers[2] = c;
		numbers[3] = d;
		int k = Math.abs(numbers[0]);
        for (int number : numbers) {
            int l = Math.abs(number);
            while (k != 0 && l != 0) {
                if (k > l) {
                    k %= l;
                } else {
                    l %= k;
                }
            }
            k += l;
        }
        return k;
	}
}
