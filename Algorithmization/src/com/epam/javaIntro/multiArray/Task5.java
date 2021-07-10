package com.epam.javaIntro.multiArray;

import java.util.Scanner;

/*
 * 5. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
 *      1   1   1  ... 1   1   1
 *      2   2   2  ... 2   2   0
 *      3   3   3  ... 3   0   0
 *      .   .   .  ... .   .   .
 *     n-1 n-1  0  ... 0   0   0
 *      n   0   0  ... 0   0   0
 */

public class Task5 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();
        if (N % 2 != 0) {
        	System.out.println("����������� ������� ������ ���� ������");
        } else {
        	int[][] matrixA;
            matrixA = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrixA[i][j] = 0;
                }
            }

            int count = N;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < count; j++) {
                    matrixA[i][j] = i + 1;
                }
                count--;
            }

            System.out.println("��������������� �������: ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.printf("%3d ", matrixA[i][j]);
                }
                System.out.println();
            }
        }
        in.close();
    }
}
