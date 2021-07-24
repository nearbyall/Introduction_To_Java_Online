package com.epam.javaIntro.linearPrograms;

import java.util.Scanner;


/*
 * 6.Для данной области составить линейную программу, которая печатает true,
 *   если точка с координатами (х, у) принадлежит закрашенной области, и false—в противном случае: 
 */

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите координату X: ");
        double x = in.nextDouble();
        System.out.print("Введите координату Y: ");
        double y = in.nextDouble();
        System.out.println((y <= 4 && y >= -3 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x <= 4 && x >= -4));
        in.close();
	}
}
