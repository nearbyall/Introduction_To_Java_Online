package com.epam.javaIntro.linearPrograms;

/*
 * 4. ���� �������������� ����� R���� nnn.ddd(��� �������� ������� � ������� � ����� ������). 
 * �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
 */

public class Task4 {
	public static void main(String[] args) {
		double x = 657.918;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
	}
}



