package com.epam.javaIntro.multiArray;

import java.util.Scanner;

/*
 * 15.Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */

public class Task15 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк N: ");
        int N = in.nextInt();
        System.out.println("Введите кол-во столбцов M: ");
        int M = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][M];

        System.out.println("Сгенерированная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = (int) (Math.random() * 100 - 50);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        int biggestElement = matrixA[0][0];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrixA[i][j] > biggestElement) {
                    biggestElement = matrixA[i][j];
                }
            }
        }

        System.out.println("\nИзмененная матрица: ");
        int currentElement = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (currentElement % 2 != 0) {
                    matrixA[i][j] = biggestElement;
                }
                System.out.printf("%3d ", matrixA[i][j]);
                currentElement++;
            }
            System.out.println();
        }
        in.close();
    }
}
