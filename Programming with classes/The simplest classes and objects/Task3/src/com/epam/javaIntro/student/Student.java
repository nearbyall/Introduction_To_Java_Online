package com.epam.javaIntro.student;

import java.util.Arrays;

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

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", group=" + group + ", marks=" + Arrays.toString(marks) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + Arrays.hashCode(marks);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (!Arrays.equals(marks, other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}