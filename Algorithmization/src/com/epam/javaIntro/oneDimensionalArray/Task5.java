package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 5. ���� ����� ����� �1,�2 ,..., �(n). ������� �� ������ ������ �� �����, ��� ������� �(i)> i.
 */

public class Task5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���-�� ��������� �������: ");
        int N = in.nextInt();
        int[] array = new int[N];
        System.out.println("��������������� ������ N ���������: ");
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n�������� �������� ������� ������ �������� �� ����������� ������: ");
        for (int i = 0; i < N; i++) {
            if (array[i] > i + 1) {
                System.out.print(array[i] + " ");
            }
        }
        in.close();
    }
}
