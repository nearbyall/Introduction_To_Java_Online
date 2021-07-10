package com.epam.javaIntro.multiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 8. � �������� ������� �������� ������� ��� ������������ �������,
 * �. �. ��� �������� ������ ������� ��������� �� ��������������� �� ������� �������,
 *  � ��� �������� ������� ����������� � ������. ������ �������� ������ ������������ � ����������.
 */

public class Task8 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][N];

        System.out.println("��������������� �������: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = (int) ((Math.random() * 100) - 50);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("������� ����� �������, ������� �� �������� �������� ������� � ������: ");
        int K = in.nextInt();
        System.out.println("������� ����� �������, ������� �� �������� �������� ������� � ������: ");
        int L = in.nextInt();

        System.out.println("���������� �������: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == K - 1) {
                    int temp = matrixA[i][j];
                    matrixA[i][j] = matrixA[i][L - 1];
                    matrixA[i][L - 1] = temp;
                }
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
