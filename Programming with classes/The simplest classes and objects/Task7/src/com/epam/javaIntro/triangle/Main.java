package com.epam.javaIntro.triangle;

/*
 * 7.Описать класс, представляющий треугольник.
 *   Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.
 */

public class Main {
	public static void main(String[] args) {
		Point A = new Point(6, -2);
		Point B = new Point(-6, 3);
		Point C = new Point(-6, 11);
		
		Triangle triangle = Triangle.createTriangle(A, B, C);
		
		triangle.showInfo();
		
		System.out.printf("\nПериметр треугольника: %.2f", triangle.getPerimeter());
		System.out.printf("\nПлощадь треугольника: %.2f", triangle.getSquare());
		System.out.printf("\nКоординаты точки пересечения медиан: (%.2f;%.2f)", 
						  triangle.getMedianIntersectionPoint().getX(), triangle.getMedianIntersectionPoint().getY());
	}
}
