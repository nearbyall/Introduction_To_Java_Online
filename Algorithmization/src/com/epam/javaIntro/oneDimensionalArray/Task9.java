package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 9. � ������� ����� ����� � ����������� ��������� n����� �������� ����� ������������� �����.
 *  ���� ����� ����� ���������, �� ���������� ���������� �� ���.
 */

public class Task9 {
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

        int currentCounter = 0;
        int biggestCounter = 0;
        int frequentElement = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    currentCounter++;
                }
            }
            if (currentCounter > biggestCounter) {
                biggestCounter = currentCounter;
                frequentElement = i;
            }
            currentCounter = 0;
        }

        int minValue = array[0];
        for (int i = 0;i<array.length;i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        if (biggestCounter != 0) {
            System.out.println("\n�������� ������������� �������: " + array[frequentElement] +
                               "\n���-�� ����������: " + biggestCounter);
        } else {
            System.out.println("\n���������� ����, ����������� �������: " + minValue);
        }
        in.close();
	}
}
