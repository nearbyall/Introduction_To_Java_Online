package com.epam.javaIntro.oneDimensionalArray;

/*
 * 1. � ������ A[N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
 */

public class Task1 {
	public static void main(String[] args) {
		int [] array = {17, 23, 53, 1, 51, 39, 19, 95, 86, 85, 43};
		int result = 0;
		int k = 3;
		for (int i : array) {
			if (i % k == 0) {
				result += i;
			}
		}
		System.out.println("���������: " + result);
	}
}
