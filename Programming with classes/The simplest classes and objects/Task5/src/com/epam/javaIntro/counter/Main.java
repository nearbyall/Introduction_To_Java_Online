package com.epam.javaIntro.counter;

/*
 * 5.������� �����, ����������� ���������� �������, ������� ����� 
 *   ����������� ��� ��������� ���� �������� ��  �������  �  ��������  ���������.
 *   ������������� �������������  ��������  ����������  ��  ���������  � �������������  ����������.
 *   �������  ����� ������ ����������  �  ���������� ���������, �  ����� ����������� �������� ��� ������� ���������.
 *   �������� ���, ��������������� ��� ����������� ������.
 */

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter(0, 10, 0);
		counter.showCurrentInfo();
		
		for (int i = 0; i < 10; i++) {
			counter.increasingValue();
		}
		
		counter.showCurrentInfo();
		
		for (int i = 0; i < 10; i++) {
			counter.decreasingValue();
		}
		
		counter.showCurrentInfo();
	}
}
