package com.epam.javaIntro.test1;

/*
 * 1.�������� ����� Test1 c ����� �����������. �������� ����� ������ �� ����� � ������ ��������� ���� ����������.
 *  �������� �����, ������� ������� ����� �������� ���� ����������, � �����,������� ������� ���������� �������� �� ���� ���� ����������.
 */

public class Main {
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.setFirstVariable(5);
		test.setSecondVariable(2);
		test.printVariables();
		test.sumVariables();
	}
}
