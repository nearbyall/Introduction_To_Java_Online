package com.epam.javaIntro.student;

public class Student {
	private String name;
	private String group;
	private int[] marks;
	
	public Student(String name, String group, int[] marks) {
		this.name = name;
		this.group = group;
		this.marks = marks;
	}
	
	public static void printBestStudents(Student[] students) {
		System.out.println("Студенты, оценки которых равны или больше девяти:\n");
		for (Student student : students) {
			int minMark = 10;
			for (int i = 0; i < student.marks.length; i++) {
				if (student.marks[i] < minMark) {
					minMark = student.marks[i];
				}
			}
			if (minMark >= 9) {
				System.out.println("Имя студента: " + student.name +
								   "\nНомер группы студента: " + student.group + "\n");
			}
		}
	}
}