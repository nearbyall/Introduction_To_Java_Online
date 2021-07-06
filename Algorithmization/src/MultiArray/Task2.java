package MultiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 2. ���� ���������� �������. ������� �� ����� ��������, ������� �� ���������.
 */

public class Task2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][N];

        System.out.println("��������������� �������: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = (int) (Math.random() * 100) - 50;
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n�������� ������� �� ��������� �������: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.printf("%3d ", matrixA[i][j]);
                }
            }
        }
        in.close();
    }
}
