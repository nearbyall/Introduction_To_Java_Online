package Branching;

import java.util.Scanner;

/*
 * 4. ������ ������� �, � �������������� ��������� � ������� �, �, z�������. 
 * ����������, ������� �� ������ ����� ���������.
 */

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("������� �������� ���������� A: ");
        int A = in.nextInt();
        System.out.print("������� �������� ���������� B: ");
        int B = in.nextInt();
        System.out.print("������� �������� ���������� x: ");
        int x = in.nextInt();
        System.out.print("������� �������� ���������� y: ");
        int y = in.nextInt();
        System.out.print("������� �������� ���������� z: ");
        int z = in.nextInt();

        if (A > 0 && B > 0 && x > 0 && y > 0 && z > 0) {
            if ((A > x && B > y) || (A > y && B > x)) {
                System.out.println("������ ������� ����� ���������.");
            } else if ((A > x && B > z) || (A > z && B > x)) {
                System.out.println("������ ������� ����� ���������.");
            } else if ((A > y && B > z) || (A > z && B > y)) {
                System.out.println("������ ������� ����� ���������.");
            } else {
                System.out.println("������ �� ������� ����� ���������.");
            }
        } else {
            System.out.println("���������� ������� ����������");
        }
        in.close();
	}
}
