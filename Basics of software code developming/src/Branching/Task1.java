package Branching;

import java.util.Scanner;

/*
 * 1. ���� ��� ���� ������������ (� ��������). 
 * ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("������� ������ ���� ������������: ");
        int a = in.nextInt();
        System.out.print("������� ������ ���� ������������: ");
        int b = in.nextInt();
        System.out.print("������� ������ ���� ������������: ");
        int c = in.nextInt();

        if (a > 0 && b > 0 && c > 0 && a < 179 && b < 179 && c < 179) {
            if (a + b + c == 180) {
                if (a == 90 || b == 90 || c == 90) {
                    System.out.println("��� ����������� ���������� � �� �������������.");
                } else {
                    System.out.println("��� ����������� ����������.");
                }
            } else {
                System.out.println("�� ���������� ������������ � ������ ������.");
            }
        } else {
            System.out.println("�� ����� ����������� �������� ����� �����������");
        }
        in.close();
	}
}
