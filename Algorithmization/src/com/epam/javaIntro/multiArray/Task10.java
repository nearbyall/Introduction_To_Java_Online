package com.epam.javaIntro.multiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 10.Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class Task10 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность квадратной матрицы N: ");
        int N = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][N];

        System.out.println("Сгенирированная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = (int) ((Math.random() * 100) - 50);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nПоложительные элементы главной диагонали: ");
        for (int i =0;i<N;i++) {
            for (int j =0;j<N;j++) {
                if (i == j && matrixA[i][j] > 0) {
                    System.out.printf("%3d ",matrixA[i][j]);
                }
            }
        }
        in.close();
    }
}
