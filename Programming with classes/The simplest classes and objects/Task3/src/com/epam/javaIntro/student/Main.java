package com.epam.javaIntro.student;

/*
 * 3.Создайте классс именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
 *   Создайте массив из десяти элементов такого типа.
 *   Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */

public class Main {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		students[0] = new Student("Мельников В.С.", "1A", new int[]{3, 4, 6, 2, 1});
		students[1] = new Student("Савченко Р.И.", "1G", new int[]{9, 9, 9, 9, 9});
		students[2] = new Student("Король М.С.", "2D", new int[]{8, 2, 3, 6, 5});
		students[3] = new Student("Юшкевич К.В.", "2H", new int[]{9, 10, 4, 7, 8});
		students[4] = new Student("Коваленко К.В.", "3J", new int[]{10, 10, 10, 10, 10});
		students[5] = new Student("Астахов А.Г.", "1K", new int[]{2, 2, 6, 2, 1});
		students[6] = new Student("Крылов Г.Г.", "3D", new int[]{1, 2, 1, 1, 1});
		students[7] = new Student("Романов А.Г.", "2A", new int[]{9, 9, 10, 9, 10});
		students[8] = new Student("Козловский А.Н.", "1A", new int[]{8, 7, 6, 2, 1});
		students[9] = new Student("Жерело В.В.", "1A", new int[]{9, 9, 9, 9, 10});
		
		Student.printBestStudents(students);
	}
}
