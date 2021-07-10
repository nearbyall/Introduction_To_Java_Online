package com.epam.javaIntro.branching;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/*
 * 3. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������. 
 */

public class Task3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������� x ��� ����� A: ");
        double x1 = in.nextDouble();
        System.out.print("������� �������� ���������� y ��� ����� A: ");
        double y1 = in.nextDouble();
        System.out.print("������� �������� ���������� x ��� ����� C: ");
        double x2 = in.nextDouble();
        System.out.print("������� �������� ���������� y ��� ����� C: ");
        double y2 = in.nextDouble();
        System.out.print("������� �������� ���������� x ��� ����� D: ");
        double x3 = in.nextDouble();
        System.out.print("������� �������� ���������� y ��� ����� D: ");
        double y3 = in.nextDouble();

        double ab, bc, ca, p, s;
        //���������� ����� ������ AB, BC � CA.
        ab = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        bc = sqrt(pow(x3 - x2, 2) + pow(y3 - y2, 2));
        ca = sqrt(pow(x1 - x3, 2) + pow(y1 - y3, 2));
        //�������� ������������ ������������ ������������� �� ���� �����.
        p =  (ab + bc + ca) / 2;
        /*������ ������� ������ ������������ �� ������� ������, 
          ���� ������� ����� ����� ����, �� ����� ����� �� ����� �����.*/
        s = sqrt(p * (p - ab) * (p - bc) * (p - ca));
        if (s == 0) {
            System.out.println("��� ����� ����� �� ����� ������.");
        } else {
            System.out.println("��� ����� �� ����� �� ����� ������.");
        }
        in.close();
    }
}
