package Cycles;

import static java.lang.Math.pow;

/*
 * 3. ����� ����� ��������� ������ ��� �����.
 */

public class Task3 {
	public static void main(String[] args) {
		int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += pow(i, 2);
        }
        System.out.println("����� ��������� ������ ��� �����: " + sum);
	}
}
