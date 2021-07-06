package MultiArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*
 * 14. ������������ ��������� ������� mxn, ��������� �� ����� � ������, 
 * ������ � ������ ������� ����� ������ ����� ������ �������.
 */

public class Task14 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����������� ���������� ������� �������: ");
        int N = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i <= j) {
                    matrixA[i][j] = 1;
                } else {
                    matrixA[i][j] = 0;
                }
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arrayList.add(matrixA[j][i]);
            }
            Collections.shuffle(arrayList);
            for (int j = 0; j < N; j++) {
                matrixA[j][i] = arrayList.get(j);
            }
            arrayList.clear();
        }

        System.out.println("��������������� �������: ");
        for (int[] each : matrixA) {
            System.out.println(Arrays.toString(each));
        }
        in.close();
    }
}
