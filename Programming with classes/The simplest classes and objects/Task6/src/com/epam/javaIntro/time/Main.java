package com.epam.javaIntro.time;

/*
 * 6.��������� �������� ������ ��� ������������� �������.
 *   ������������ ����������� ��������� ������� � ��������� ��� ��������� ����� (���, ������, �������)
 *   � ��������� ������������ �������� ��������. � ������ ������������  �������� ����� ���� 
 *   ���������������  �  ��������  0.  �������  ������  ���������  ������� �� �������� ���������� �����, ����� � ������.
 */

public class Main {
	public static void main(String[] args) {
		Time time = new Time(26, 10, 49);
		time.showTime();
		
		time.changeForHours(25);
		time.showTime();
		
		time.changeForMinutes(60);
		time.showTime();
		
		time.changeForSeconds(20);
		time.showTime();
	}
}
