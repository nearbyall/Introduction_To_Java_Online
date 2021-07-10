package com.epam.javaIntro.multiArray;

import java.util.Scanner;

/*
 * 13. Отсотрировать столбцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task13 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк матрицы: ");
        int N = in.nextInt();
        System.out.println("Введите кол-во столбцов матрицы: ");
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

        for (int k = 0; k < M; k++) {
            for (int j = k; j < M; j++) {
                for (int i = 0; i < N - 1; i++) {
                    if (matrixA[i][k] > matrixA[i + 1][k]) {
                        int temp = matrixA[i][k];
                        matrixA[i][k] = matrixA[i + 1][k];
                        matrixA[i + 1][k] = temp;
                    }
                }
            }
        }

        System.out.println("Матрица с столбцами отсортированными по возврастанию");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        for (int k = 0; k < M; k++) {
            for (int j = k; j < M; j++) {
                for (int i = 0; i < N - 1; i++) {
                    if (matrixA[i][k] < matrixA[i + 1][k]) {
                        int temp = matrixA[i][k];
                        matrixA[i][k] = matrixA[i + 1][k];
                        matrixA[i + 1][k] = temp;
                    }
                }
            }
        }

        System.out.println("Матрица с столбцами отсортированными по убыванию");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
