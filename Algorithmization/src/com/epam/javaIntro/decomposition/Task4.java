package com.epam.javaIntro.decomposition;

/*
 * 4.На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими 
 *	 из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
 */

public class Task4 {
	public static void main(String[] args) {
		Point[] points = {new Point(3,6), new Point(15,86), new Point(-93, -105),
						 new Point(17,12), new Point(2, 2), new Point(-12, 12)};
		Point[] result = Point.getPointsWithMaxDistance(points);
		System.out.println("Точки с наибольшим расстоянием между собой: " + result[0].toString() + result[1].toString());
	}
	
	static class Point{
		private double x, y;

		public Point(double x, double y) {
			this.x = x;
			this.y= y;
		}
		
		@Override
		public String toString() {
			return String.format("(%.1f;%.1f) ", x, y);
		}
		
		public static double getDistanceBetweenPoints (Point a, Point b) {
			return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
		}
		
		public static Point[] getPointsWithMaxDistance (Point[] points) {
			Point[] result = new Point[2];
			double distance;
			double maxDistance = 0;
			for(int i = 0; i < points.length - 1; i++) {
				for (int j = i + 1; j < points.length; j++) {
					distance = getDistanceBetweenPoints(points[i], points[j]);
					if (distance > maxDistance) {
	                    maxDistance = distance;
	                    result[0] = points[i];
	                    result[1] = points[j];
	                }
				}
			}
			return result;
		}
		
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}
	}
}
