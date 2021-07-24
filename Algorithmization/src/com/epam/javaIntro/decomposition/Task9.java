package com.epam.javaIntro.decomposition;

/*
 * 9.Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 *	 если угол между сторонами длиной X и Y— прямой. 
 */

public class Task9 {
	public static void main(String[] args) {
		System.out.printf("Площадь четырехугольника: %.2f", calculateSquare(5, 5, 7, 7));
	}
	
	public static double calculateSquare(double x, double y, double z, double t) {
		/*
		 * Проведем диагональ, не через прямой угол, получим два треугольника
		 * Найдем площадь прямогуольного треугольника, потом и его гипотенузу
		 * Потом по формуле Герона находим площадь второго треугольнка
		 * Потом просто складывает площади обоих треугольников
		 */
		double hypotenuse = Math.sqrt(x * x + y * y);
		double firstSquare = 1/2 * x * y;
		
		double p = (z + t + hypotenuse) / 2;
		double secondSquare = Math.sqrt(p * (p - z) * (p - t) * (p - hypotenuse));
		
		return firstSquare + secondSquare;
	}
}
