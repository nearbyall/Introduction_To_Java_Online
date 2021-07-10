package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 10. ��� ������������� ������ � ����������� ��������� �.
 *  ����� ������, �������� �� ���� ������ ������ ������� (�������������� �������� ��������� ������).
 *  ����������. �������������� ������ �� ������������.
 */

public class Task10 {
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

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0 && i != 0) {
                array[i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] == 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }

        System.out.println("\n���������� ������ N ���������: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        in.close();
	}
}
