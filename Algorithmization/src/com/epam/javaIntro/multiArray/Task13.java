package com.epam.javaIntro.multiArray;

import java.util.Scanner;

/*
 * 13. ������������� ������� ������� �� ����������� � �������� �������� ��������.
 */

public class Task13 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ���-�� ����� �������: ");
        int N = in.nextInt();
        System.out.println("������� ���-�� �������� �������: ");
        int M = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][M];

        System.out.println("��������������� �������: ");
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

        System.out.println("������� � ��������� ���������������� �� ������������");
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

        System.out.println("������� � ��������� ���������������� �� ��������");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
