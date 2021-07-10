package com.epam.javaIntro.triangle;

import java.lang.Math;

public class Point {
	private final double x;
	private final double y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public static double getDistanceBetweenPoints(Point first, Point second) {
		return Math.sqrt(Math.pow(first.x - second.x, 2) + Math.pow(first.y - second.y, 2));
	}
}
