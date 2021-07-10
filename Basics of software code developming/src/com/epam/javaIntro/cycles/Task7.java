package com.epam.javaIntro.cycles;

import java.util.Scanner;

/*
 * 7. ��� ������� ������������ ����� � ���������� �� m�� n������� ��� ��������, 
 * ����� ������� � ������ �����. m� n�������� � ����������.
 */

public class Task7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������� m: ");
        int m = in.nextInt();
        System.out.print("������� �������� ���������� n: ");
        int n = in.nextInt();
        if (m > 0 && n > 0 && m < n) {
            for (int i = m; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println("����� " + i + " �������� " + j);
                    }
                }
            }
        } else {
            System.out.println("�� ����� �������� �������� ������ m � n.");
        }
        in.close();
    }
}
