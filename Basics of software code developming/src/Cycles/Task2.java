package Cycles;

import java.util.Scanner;

/*
 * 2. ��������� �������� ������� �� ������� [�,b] c ����� h:
 * y =   x, x > 2
 *      -x, x <=2
 */

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������� a: ");
        double a = in.nextDouble();
        System.out.print("������� �������� ���������� b: ");
        double b = in.nextDouble();
        System.out.print("������� �������� ���� dx: ");
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
        	System.out.println("�� ����� �������� �������� ������.");
        }       
        in.close();
	}
}
