package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 5.Даны целые числа а1,а2 ,..., аn. Вывести на печать только те числа, для которых аi > i.
 */

public class Task5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int N = in.nextInt();
        
        int[] array = new int[N];
        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\nЧисла, значения которых больше их порядкового номера: ");
        for (int i = 0; i < N; i++) {
            if (array[i] > i + 1) {
                System.out.print(array[i] + " ");
            }
        }
        
        in.close();
    }
}
