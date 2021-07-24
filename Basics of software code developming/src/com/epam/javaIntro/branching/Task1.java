package com.epam.javaIntro.branching;

import java.util.Scanner;

/*
 * 1.Даны два угла треугольника (в градусах). Определить, существует
 *   ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите значение первого угла: ");
        int a = in.nextInt();
        System.out.print("Введите значение второго угла: ");
        int b = in.nextInt();
        System.out.print("Введите значение третьего: ");
        int c = in.nextInt();

        if (a > 0 && b > 0 && c > 0 && a < 179 && b < 179 && c < 179) {
            if (a + b + c == 180) {
                if (a == 90 || b == 90 || c == 90) {
                    System.out.println("Ваш треугольник является прямоугольным");
                } else {
                    System.out.println("Ваш треугольник не является прямоугольным");
                }
            } else {
                System.out.println("Такого треугольника не существует");
            }
        } else {
            System.out.println("Вы ввели некоректные значения углов треугольника");
        }
        
        in.close();
	}
}
