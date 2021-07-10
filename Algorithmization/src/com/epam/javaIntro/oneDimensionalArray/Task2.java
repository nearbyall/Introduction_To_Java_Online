package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 2. ���� ������������������ �������������� ����� �1,�2 ,..., �(n). 
 * �������� ��� �� �����, ������� ������� Z, ���� ������. ���������� ���������� �����.
 */

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("������� ���-�� ��������� �������� ������������������ N: ");
        int N = in.nextInt();
        System.out.println("������� ����� Z");
        int Z = in.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 100);
        }
        System.out.println("�������� ������: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
        int count = 0; // ���-�� �����
        for (int i = 0; i < N; i++) {
            if (nums[i] > Z) {
                nums[i] = Z;
                count++;
            }

        }
        System.out.println("\n���������� ������: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n���-�� �����: " + count);
        in.close();
	}
}
