package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * Дана последовательность целых чисел a1, a2, ..., a(n).
 * Образовать новую последовательность, выбросив из исходной те члены,
 * которые равны min(a1, a2, ..., a(n)). 
 */

public class Task8 {
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

        int minCount = 0;
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                minCount++;
            }
        }

        int[] newArray = new int[array.length - minCount];
        int indexNewArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != minValue) {
                newArray[indexNewArray] = array[i];
                indexNewArray++;
            }
        }

        System.out.println("\nИзмененный по условиям массив: ");
        for (int i = 0; i < N - minCount; i++) {
            System.out.print(newArray[i] + " ");
        }
        in.close();
    }
}
