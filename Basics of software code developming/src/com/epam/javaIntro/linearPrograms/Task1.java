package com.epam.javaIntro.linearPrograms;

import java.util.Scanner;

/*
 * 1. �������  �������� �������: z= ( (a�3 ) * b/ 2) + c.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� �������� ���������� A: ");
		int a = in.nextInt();
		System.out.println("������� �������� ���������� B: ");
		int b = in.nextInt();
		System.out.println("������� �������� ���������� C: ");
		int c = in.nextInt();
		int z = ((a - 3) * b / 2) + c;
		System.out.println("���������: " + z);
		in.close();
	}
}
