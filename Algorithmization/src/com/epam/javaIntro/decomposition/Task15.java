package com.epam.javaIntro.decomposition;

/*
 * 15.Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
 *    последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию. 
 */

public class Task15 {
	public static void main(String[] args) {
		printIncreasingNumbers(4);
	}
	
	public static void printIncreasingNumbers(int n) {
		int [] number = new int[n];
        number[0] = 1;
        while (number[n - 1] < 9) {
            for (int i = 1; i < number.length; i++) {
                number[i] = number[0] + i;
            }
            for (int element : number) {
                System.out.print(element);
            }
            System.out.print(" ");
            number[0]++;
        }
	}
}
