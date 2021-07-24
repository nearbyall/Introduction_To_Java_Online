package com.epam.javaIntro.linearPrograms;

/*
 * 4.Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
 *   Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Task4 {
	public static void main(String[] args) {
		double R = 657.918;
        double result = (R * 1000) % 1000 + (int) R / 1000.0;
        System.out.println(result);
	}
}



