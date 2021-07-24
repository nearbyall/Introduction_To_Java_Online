package com.epam.javaIntro.decomposition;

import java.util.Scanner;

/*
 * 6.Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		int a = in.nextInt();
		System.out.println("Введите второе число: ");
		int b = in.nextInt();
		System.out.println("Введите третье число: ");
		int c = in.nextInt();

		System.out.println(isMultiply(a, b, c));
		
		in.close();
	}
	
	public static int getGcd(int a, int b, int c) {
		int[] numbers = new int[4];
		numbers[0] = a;
		numbers[1] = b;
		numbers[2] = c;
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
	
	public static boolean isMultiply (int a, int b, int c) {
		return getGcd(a, b, c) == 1;
	}
}
