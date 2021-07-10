package com.epam.javaIntro.multiArray;

import java.lang.Math;

/*
 * 11. ћатрицу 10x20 заполнить случайными числами от 0 до 15. 
 * ¬ывести на экран саму матрицу и номера строк, в которых число 5 встречаетс€ три и более раз.
 */

public class Task11 {
	public static void main(String[] args) {
        int N = 10, M = 20;
        int[][] matrixA;
        matrixA = new int[N][M];

        System.out.println("—генерированна€ матрица 10 на 20: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = (int) (Math.random() * 16);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nЌомера строк в которых число 5 встречаетс€ три или более раз: ");
        for (int i = 0; i < N; i++) {
            int current = 0;
            int rowIndex = 0;
            for (int j = 0; j < M; j++) {
                if (matrixA[i][j] == 5) {
                    current++;
                }
            }
            if (current >= 3) {
                rowIndex = i + 1;
                System.out.printf("%2d ", rowIndex);
            }
            current = 0;

        }
	}
}
