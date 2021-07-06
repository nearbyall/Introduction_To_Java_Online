package OneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 3.  ���  ������  ��������������  �����,  �����������  �������� N.
 * ����������,  �������  �  ���  �������������, ������������� � ������� ���������.
 */

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("������� ���-�� ��������� �������: ");
        int N = in.nextInt();
        int positiveCount = 0;
        int negativeCount = 0;
        int nullCount = 0;
        int[] array = new int[N];
        System.out.println("��������������� ������ N ���������: ");
        for (int i = 0;i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                nullCount++;
            }
        }
        System.out.println("\n ���-�� ������������� �����: " + positiveCount +
                           "\n ���-�� ������������� �����: " + negativeCount +
                           "\n ���-�� ������� ��������: " + nullCount );
        in.close();
	}
}
