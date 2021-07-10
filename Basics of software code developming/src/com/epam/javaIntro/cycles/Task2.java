package com.epam.javaIntro.cycles;

import java.util.Scanner;

/*
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 * y =   x, x > 2
 *      -x, x <=2
 */

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной a: ");
        double a = in.nextDouble();
        System.out.print("Введите значение переменной b: ");
        double b = in.nextDouble();
        System.out.print("Введите значение шага dx: ");
        double dx = (double) in.nextDouble();
        if (b >= a) {
        	while (a <= b) {
                if (a > 2) {
                    System.out.println("y = " + a);
                } else {
                    System.out.println("y = " + -a);
                }
                a += dx;
            }
        } else {
        	System.out.println("Вы ввели неверные значения границ.");
        }       
        in.close();
	}
}
