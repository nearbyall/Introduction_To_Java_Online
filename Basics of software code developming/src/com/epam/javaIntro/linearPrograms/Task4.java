package com.epam.javaIntro.linearPrograms;

/*
 * 4. Дано действительное число Rвида nnn.ddd(три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
	public static void main(String[] args) {
		double x = 657.918;
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.println(y);
	}
}



