package MultiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 7. ������������ ���������� ������� ������� N �� �������:
 *  A[I,J] = sin((I^2 - J^2) / N)
 *  � ���������� ���������� ������������� ��������� � ���.
 */

public class Task7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();

        double[][] matrixA;
        matrixA = new double[N][N];

        System.out.println("��������������� �������: ");
        int positiveCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = Math.sin((Math.pow(i + 1, 2) - Math.pow(j + 1, 2)) / N);
                if (matrixA[i][j] > 0) {
                    positiveCount++;
                }
                System.out.printf("%10f ",matrixA[i][j]);
            }
            System.out.println();
        }
        System.out.printf("\n���-�� ������������� ���������: %d", positiveCount);
        in.close();
    }
}
