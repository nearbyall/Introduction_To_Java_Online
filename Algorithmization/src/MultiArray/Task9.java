package MultiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 9. ������ ������� ��������������� �����. 
 * ��������� ����� ��������� � ������ �������. 
 * ����������, ����� ������� �������� ������������ �����.
 */

public class Task9 {
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
                matrixA[i][j] = (int) (Math.random() * 100);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        int biggestSum = 0;
        int currentSum = 0;
        int columnIndex = 0;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                currentSum += matrixA[i][j];
            }
            if (currentSum > biggestSum) {
                biggestSum = currentSum;
                columnIndex = j + 1;
            }
            currentSum = 0;

        }

        System.out.println("\n������� � ���������� ������: " + columnIndex + ", ����� ��������� �������: " + biggestSum);
        in.close();
    }
}
