package com.epam.javaIntro.cycles;

import java.util.Scanner;

/*
 * 1. �������� ���������, ��� ������������ ������ ����� ����� ������������� �����.
 * � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������� A: ");
        int A = in.nextInt();
        if (A > 0) {
            int sum = 0;
            for (int i = 0; i <= A; i++) {
                sum += i;
            }
            System.out.println("���� �����: " + sum);
        } else {
            System.out.println("�� ����� ������������ �������� ����������");
        }
        in.close();
	}
}
