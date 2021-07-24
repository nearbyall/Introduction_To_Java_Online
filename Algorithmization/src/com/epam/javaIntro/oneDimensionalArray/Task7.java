package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 7.Даны действительные числа a1, a2, ..., a(n), ..., a(2n). 
  *  Найти max(a1 + a(2n), a2 + a(2n-1), ..., a(n) + a(n+1)) 
 */

public class Task7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива N: ");
        int N = in.nextInt();
        
        int[] array = new int[N];
        System.out.println("Cгенерированный массив: ");
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
        }
        
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 0; i < N; i++) {
            if (array[i] + array[array.length - i - 1] > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        
        System.out.println("\nМаксимальная сумма по заданным условиям: " + maxSum);
        in.close();
    }
}
