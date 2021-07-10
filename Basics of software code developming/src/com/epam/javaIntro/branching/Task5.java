package com.epam.javaIntro.branching;

import java.util.Scanner;
import static java.lang.Math.pow;

/*
 * 5. ��������� �������� �������:
 * x^2 - 3x + 9, ���� x <= 3;
 * 1 / (x^3 + 6), ���� x > 3.
 */

public class Task5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������� x: ");
        double x = in.nextDouble();
        double y;
        if (x <= 3) {
        	y = pow(x, 2) - 3 * x + 9;
        	System.out.println("result: " + y);
        } else if (pow(x, 3) + 6 != 0) {
        	y = 1 / (pow(x, 3) + 6);
        	System.out.println("result: " + y);
        }       
        in.close();
    }
}
