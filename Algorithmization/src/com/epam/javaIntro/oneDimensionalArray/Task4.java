package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 4. ���� �������������� ����� �1,�2,..., �(n). �������� ������� ���������� � ���������� ��������.
 */

public class Task4 {
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
        int smallestIndex = 0;
        int biggestIndex = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] > array[biggestIndex]) {
                biggestIndex = i;
            }
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        int temp = array[smallestIndex];
        array[smallestIndex] = array[biggestIndex];
        array[biggestIndex] = temp;
        System.out.println("\n���������� ������ N ���������: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        in.close();
	}
}
