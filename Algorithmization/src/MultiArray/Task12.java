package MultiArray;

import java.util.Scanner;

/*
 * 12. ������������� ������ ������� �� ����������� � �������� �������� ���������.
 */

public class Task12 {
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

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < M - 1; i++) {
                for (int j = 0; j < M - i - 1; j++) {
                    if (matrixA[k][j] > matrixA[k][j + 1]) {
                        int temp = matrixA[k][j];
                        matrixA[k][j] = matrixA[k][j + 1];
                        matrixA[k][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("������� � �������� ���������������� �� ������������");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < M - 1; i++) {
                for (int j = 0; j < M - i - 1; j++) {
                    if (matrixA[k][j] < matrixA[k][j + 1]) {
                        int temp = matrixA[k][j];
                        matrixA[k][j] = matrixA[k][j + 1];
                        matrixA[k][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("������� � �������� ���������������� �� ��������");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
