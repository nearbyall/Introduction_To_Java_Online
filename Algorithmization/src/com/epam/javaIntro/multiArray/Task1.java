package com.epam.javaIntro.multiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 1. ���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������ ����������.
 */

public class Task1 {
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
                matrixA[i][j] = (int) (Math.random() * 100) - 50;
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n�������� �������,� ������� �������� ���������� �������� ������ �������� ������� ��������: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j += 2) {
                if (matrixA[0][j] > matrixA[N - 1][j]) {
                    System.out.printf("%3d ", matrixA[i][j]);
                }
            }
            System.out.println();
        }
        in.close();
    }
}
