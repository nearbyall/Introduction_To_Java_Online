package MultiArray;

import java.util.Scanner;

/*
 * 6. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
 *      1   1   1  ... 1   1   1
 *      0   1   1  ... 1   1   0
 *      0   0   1  ... 1   0   0
 *      .   .   .  ... .   .   .
 *      0   1   1  ... 1   1   0
 *      1   1   1  ... 1   1   1
 */

public class Task6 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();
        while (N % 2 != 0) {
        	System.out.println("������ ������� ������ ���� ������");
        	System.out.println("������� ����������� ���������� ������� �������: ");
            N = in.nextInt();
        }

        int[][] matrixA;
        matrixA = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = 0;
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = count; j < N - count; j++) {
                matrixA[i][j] = 1;
            }
            count++;
        }

        count = 0;
        for (int i = N - 1; i >= 0; i--) {
            for (int j = count; j < N - count; j++) {
                matrixA[i][j] = 1;
            }
            count++;
        }

        System.out.println("��������������� �������: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
	}
}
