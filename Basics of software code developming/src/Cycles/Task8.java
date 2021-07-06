package Cycles;

import java.util.Scanner;
import java.util.ArrayList;

/*
 * 8. ���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����.
 */

public class Task8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ �����: ");
		int x = (int) in.nextLong();
		System.out.println("������� ������ �����");
		int y = (int) in.nextLong();
		ArrayList<Boolean> list = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
            list.add(false);
        }
		int temp, num;
		while (x > 0) {
            num = x % 10;
            x /= 10;
            temp = y;
            while (temp > 0) {
                if (temp % 10 == num) {
                    list.set(num, true);
                    break;
                }
                temp /= 10;
            }
        }
		for (int i = 0; i < 10; i++) {
            if (list.get(i))
                System.out.print(i + " ");

        }
		in.close();
	}
}
