package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 4. � ������� ������� ����������� � �������� ������������ ��������� �� ������ ����� ������������� ����� �����.
 */

public class Task4 {
	public static String informaticsToCake (String informatics) {
		String cake = String.valueOf(informatics.charAt(informatics.indexOf('�')));
		cake += String.valueOf(informatics.charAt(informatics.indexOf('�')));
		cake += String.valueOf(informatics.charAt(informatics.indexOf('�')));
		cake += String.valueOf(informatics.charAt(informatics.indexOf('�')));
		return cake;
	}
	
	public static void main(String[] args) {
		String informatics = "�����������";
		System.out.println(informaticsToCake(informatics));
	}
}
