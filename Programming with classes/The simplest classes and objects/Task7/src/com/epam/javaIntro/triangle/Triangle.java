package com.epam.javaIntro.triangle;

public class Triangle {
    //Точки A,B и C точки вершин треугольника, Point отдельный класс
	private Point A;
	private Point B;
	private Point C;
	private double AB;
	private double BC;
	private double AC;
	
	public Triangle(Point A, Point B, Point C) {
		this.A = A;
		this.B = B;
		this.C = C;
		AB = Point.getDistanceBetweenPoints(A, B);
		BC = Point.getDistanceBetweenPoints(B, C);
		AC = Point.getDistanceBetweenPoints(A, C);
	}
	
	public static Triangle createTriangle(Point A, Point B, Point C) {
		Triangle triangle = new Triangle(A, B, C);
		return triangle;
	}
	
	public double getPerimeter() {
		return AB + BC + AC;
	}
	
	//По формуле Герона, p - полупериметр
	public double getSquare() {
		double p = this.getPerimeter() / 2;
		return Math.sqrt(p*(p - AB)*(p - BC)*(p - AC));
	}
	
	public Point getMedianIntersectionPoint() {
		double x = (C.getX() + A.getX() + B.getX()) / 3;
		double y = (C.getY() + A.getY() + B.getY()) / 3;
		Point point = new Point(x, y);
		return point;
	}
	
	public void showInfo() {
		System.out.printf("\nВершина A треугольника: (%.2f;%.2f)"
					    + "\nВершина B треугольника: (%.2f;%.2f)"
					    + "\nВершина C треугольника: (%.2f;%.2f)",
					    A.getX(), A.getY(), B.getX(), B.getY(), C.getX(), C.getY());
	}
}
