package com.epam.javaIntro.triangle;

/*
 * 7.������� �����, �������������� �����������.
 *   ������������� ������ ��� �������� ��������, ���������� �������, ��������� � ����� ����������� ������.
 */

public class Main {
	public static void main(String[] args) {
		Point A = new Point(6, -2);
		Point B = new Point(-6, 3);
		Point C = new Point(-6, 11);
		
		Triangle triangle = Triangle.createTriangle(A, B, C);
		
		triangle.showInfo();
		
		System.out.printf("\n�������� ������������: %.2f", triangle.getPerimeter());
		System.out.printf("\n������� ������������: %.2f", triangle.getSquare());
		System.out.printf("\n���������� ����� ����������� ������: (%.2f;%.2f)", 
						  triangle.getMedianIntersectionPoint().getX(), triangle.getMedianIntersectionPoint().getY());
	}
}
