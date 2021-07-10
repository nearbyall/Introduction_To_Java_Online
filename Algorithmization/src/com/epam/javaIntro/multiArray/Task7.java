package com.epam.javaIntro.multiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 7. Сформировать квадратную матрицу порядка N по правилу:
 *  A[I,J] = sin((I^2 - J^2) / N)
 *  и подсчитать количество положительных элементов в ней.
 */

public class Task7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность квадратной матрицы матрицы: ");
        int N = in.nextInt();

        double[][] matrixA;
        matrixA = new double[N][N];

        System.out.println("Сгенерированная матрица: ");
        int positiveCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = Math.sin((Math.pow(i + 1, 2) - Math.pow(j + 1, 2)) / N);
                if (matrixA[i][j] > 0) {
                    positiveCount++;
                }
                System.out.printf("%10f ",matrixA[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\nКол-во положительных элементов: %d", positiveCount);
        in.close();
    }
}
