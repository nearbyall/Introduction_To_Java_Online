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

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [A=" + A + ", B=" + B + ", C=" + C + ", AB=" + AB + ", BC=" + BC + ", AC=" + AC + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((A == null) ? 0 : A.hashCode());
		long temp;
		temp = Double.doubleToLongBits(AB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(AC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((B == null) ? 0 : B.hashCode());
		temp = Double.doubleToLongBits(BC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((C == null) ? 0 : C.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (A == null) {
			if (other.A != null)
				return false;
		} else if (!A.equals(other.A))
			return false;
		if (Double.doubleToLongBits(AB) != Double.doubleToLongBits(other.AB))
			return false;
		if (Double.doubleToLongBits(AC) != Double.doubleToLongBits(other.AC))
			return false;
		if (B == null) {
			if (other.B != null)
				return false;
		} else if (!B.equals(other.B))
			return false;
		if (Double.doubleToLongBits(BC) != Double.doubleToLongBits(other.BC))
			return false;
		if (C == null) {
			if (other.C != null)
				return false;
		} else if (!C.equals(other.C))
			return false;
		return true;
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
