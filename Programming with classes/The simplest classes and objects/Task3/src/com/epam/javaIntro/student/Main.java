package com.epam.javaIntro.student;

/*
 * 3.�������� ������ ������ Student, ���������� ����: ������� � ��������, ����� ������, ������������ (������ �� ���� ���������).
 *   �������� ������ �� ������ ��������� ������ ����.
 *   �������� ����������� ������ ������� � ������� ����� ���������, ������� ������, ������ ������ 9 ��� 10.
 */

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new Student("��������� �.�.", "1A", new int[]{3, 4, 6, 2, 1});
		students[1] = new Student("�������� �.�.", "1G", new int[]{9, 9, 9, 9, 9});
		students[2] = new Student("������ �.�.", "2D", new int[]{8, 2, 3, 6, 5});
		students[3] = new Student("������� �.�.", "2H", new int[]{9, 10, 4, 7, 8});
		students[4] = new Student("��������� �.�.", "3J", new int[]{10, 10, 10, 10, 10});
		students[5] = new Student("������� �.�.", "1K", new int[]{2, 2, 6, 2, 1});
		students[6] = new Student("������ �.�.", "3D", new int[]{1, 2, 1, 1, 1});
		students[7] = new Student("������� �.�.", "2A", new int[]{9, 9, 10, 9, 10});
		students[8] = new Student("���������� �.�.", "1A", new int[]{8, 7, 6, 2, 1});
		students[9] = new Student("������ �.�.", "1A", new int[]{9, 9, 9, 9, 10});
		
		Student.printBestStudents(students);
	}
}
