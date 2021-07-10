package com.epam.javaIntro.book;

/*
 * 9.������� ����� Book, ������������ �������� ��������� ����.
 *   ���������� ������������, set-� get- ������ � �����  toString().
 *   ������� ������ �����, ������������ ������ ���� Book, � ����������� �������������� � ��������.
 *   ������ �������� ������ ������ � ������� ��� ������ �� �������.
 *   Book: id, ��������, �����(�), ������������, ��� �������, ���������� �������, ����, ��� ���������.
 *   ����� � �������:
 *   a) ������ ���� ��������� ������;
 *   b) ������ ����, ���������� �������� �������������;
 *   c) ������ ����, ���������� ����� ��������� ����.
 */

public class Main {
	public static void main(String[] args) {
		ListOfBooks books = new ListOfBooks();
		
		books.addToList(new Book(1, "Anxious people", "Fredrik Backman", "Sinbad", 2020, 416, 25, "Hard cover"));
		books.addToList(new Book(2, "The Raven King", "Nora Sakavich", "Popcorn Books", 2020, 432, 21, "Soft cover"));
		books.addToList(new Book(3, "Beowulf", "Kathleen Kiernan", "���", 2007, 318, 3, "Hard cover"));
		books.addToList(new Book(4, "451 degrees Fahrenheit", "Ray Bradbury", "Pocket Book", 2017, 256, 17, "Soft cover"));
		books.addToList(new Book(5, "Call me by your name", "Andre Asiman", "Popcorn Books", 2019, 362, 12, "Soft cover"));
		books.addToList(new Book(6, "Britt-Marie was here", "Fredrik Backman", "Sinbad", 2018, 416, 29, "Hard cover"));
		
		books.printBooks();
		
		books.printBooksByAuthor("Fredrik Backman");
		
		books.printBooksByPublisher("Pocket Book");
		
		books.printBooksAfterSpecificYear(2019);
	}
}
