package MultiArray;

import java.util.Scanner;

/*
 *  4. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      1   2   3   ... n
 *      n  n-1 n-2  ... 1
 *      .   .   .   ... .
 *      n  n-1 n-2  ... 1
 */

public class Task4 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();
        if(N % 2 != 0) {
            System.out.println("����������� ������� ������ ���� ������");
        } else {
        	int[][] matrixA;
            matrixA = new int[N][N];

            System.out.println("��������������� �������: ");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i % 2 == 0 || i == 0) {
                        matrixA[i][j] = j + 1;
                    } else {
                        matrixA[i][j] = N - j;
                    }
                    System.out.printf("%3d ", matrixA[i][j]);
                }
                System.out.println();
            }
        }
        in.close();
    }
}
