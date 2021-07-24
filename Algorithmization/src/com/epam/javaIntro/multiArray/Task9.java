package com.epam.javaIntro.multiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 9.Задана матрица неотрицательных чисел.
 *   Посчитать сумму элементов в каждом столбце.
 *   Определить, какой столбец содержит максимальную сумму.
 */

public class Task9 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк: ");
        int N = in.nextInt();
        System.out.println("Введите кол-во столбцов: ");
        int M = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][M];

        System.out.println("Сгенерированная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        int biggestSum = 0;
        int currentSum = 0;
        int columnIndex = 0;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                currentSum += matrixA[i][j];
            }
            if (currentSum > biggestSum) {
                biggestSum = currentSum;
                columnIndex = j + 1;
            }
            currentSum = 0;

        }

        System.out.println("Номер столбца: " + columnIndex + ", Сумма элементов: " + biggestSum);
        in.close();
    }
}
