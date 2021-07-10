package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 3.  Дан  массив  действительных  чисел,  размерность  которого N.
 * Подсчитать,  сколько  в  нем  отрицательных, положительных и нулевых элементов.
 */

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int N = in.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int nullCount = 0;
        int[] array = new int[N];
        System.out.println("Сгенерированный массив N элементов: ");
        for (int i = 0;i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                nullCount++;
            }
        }
        System.out.println("\n Кол-во положительных чисел: " + positiveCount +
                           "\n Кол-во отрицательных чисел: " + negativeCount +
                           "\n Кол-во нулевых значений: " + nullCount );
        in.close();
	}
}
