package com.epam.javaIntro.branching;

import java.util.Scanner;

/*
 * 2. Найти max{min(a, b), min(c, d)}.
 */

public class Task2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной a: ");
        double a = in.nextDouble();
        System.out.print("Введите значение переменной b: ");
        double b = in.nextDouble();
        System.out.print("Введите значение переменной c: ");
        double c = in.nextDouble();
        System.out.print("Введите значение переменной d: ");
        double d = in.nextDouble();

        if (a > b) {
            if (c > d) {
                if (b > d) {
                    System.out.println(b);
                } else {
                    System.out.println(d);
                }
            } else {
                if (b > c) {
                    System.out.println(b);
                } else {
                    System.out.println(c);
                }
            }
        } else {
            if (c > d) {
                if (a > d) {
                    System.out.println(a);
                } else {
                    System.out.println(d);
                }
            } else {
                if (a > c) {
                    System.out.println(a);
                } else {
                    System.out.println(c);
                }
            }

        }
        in.close();
    }

}
