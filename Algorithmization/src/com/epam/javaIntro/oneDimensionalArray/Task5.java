package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 5. Даны целые числа а1,а2 ,..., а(n). Вывести на печать только те числа, для которых а(i)> i.
 */

public class Task5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int N = in.nextInt();
        int[] array = new int[N];
        System.out.println("Сгенерированный массив N элементов: ");
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nЭлементы значение которых больше значения их порядкового номера: ");
        for (int i = 0; i < N; i++) {
            if (array[i] > i + 1) {
                System.out.print(array[i] + " ");
            }
        }
        in.close();
    }
}
