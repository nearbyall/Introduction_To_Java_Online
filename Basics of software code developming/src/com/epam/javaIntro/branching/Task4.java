package com.epam.javaIntro.branching;

import java.util.Scanner;

/*
 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, zкирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной A: ");
        int A = in.nextInt();
        System.out.print("Введите значение переменной B: ");
        int B = in.nextInt();
        System.out.print("Введите значение переменной x: ");
        int x = in.nextInt();
        System.out.print("Введите значение переменной y: ");
        int y = in.nextInt();
        System.out.print("Введите значение переменной z: ");
        int z = in.nextInt();

        if (A > 0 && B > 0 && x > 0 && y > 0 && z > 0) {
            if ((A > x && B > y) || (A > y && B > x)) {
                System.out.println("Кирпич пройдет через отверстие.");
            } else if ((A > x && B > z) || (A > z && B > x)) {
                System.out.println("Кирпич пройдет через отверстие.");
            } else if ((A > y && B > z) || (A > z && B > y)) {
                System.out.println("Кирпич пройдет через отверстие.");
            } else {
                System.out.println("Кирпич не пройдет через отверстие.");
            }
        } else {
            System.out.println("Переменные введены некоректно");
        }
        in.close();
	}
}
