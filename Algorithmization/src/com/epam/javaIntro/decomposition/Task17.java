package com.epam.javaIntro.decomposition;

/*
 * 17.Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких 
 *    действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию. 
 */

public class Task17 {
	public static void main(String[] args) {
		System.out.println("Кол-во вычитаний: " + getCountOfSubtractions(874));
	}
	
	public static int getCountOfSubtractions(int number) {
		int count = 0;
		while (number > 0) {
			number -= getSumOfNumerals(number);
			count++;
		}
		return count;
	}
	
	public static int getSumOfNumerals(int number) {
		int sum = 0;
		while (number != 0) {
			sum += (number % 10);
			number /= 10;
		}
		return sum;
	}
}
