package com.epam.javaIntro.book;

/*
 * 9.—оздать класс Book, спецификаци€ которого приведена ниже.
 *   ќпределить конструкторы, set-и get- методы и метод  toString().
 *   —оздать второй класс, агрегирующий массив типа Book, с подход€щими конструкторами и методами.
 *   «адать критерии выбора данных и вывести эти данные на консоль.
 *   Book: id, название, автор(ы), издательство, год издани€, количество страниц, цена, тип переплета.
 *   Ќайти и вывести:
 *   a) список книг заданного автора;
 *   b) список книг, выпущенных заданным издательством;
 *   c) список книг, выпущенных после заданного года.
 */

public class Main {
	public static void main(String[] args) {
		ListOfBooks books = new ListOfBooks();
		
		books.addToList(new Book(1, "Anxious people", "Fredrik Backman", "Sinbad", 2020, 416, 25, "Hard cover"));
		books.addToList(new Book(2, "The Raven King", "Nora Sakavich", "Popcorn Books", 2020, 432, 21, "Soft cover"));
		books.addToList(new Book(3, "Beowulf", "Kathleen Kiernan", "ј—“", 2007, 318, 3, "Hard cover"));
		books.addToList(new Book(4, "451 degrees Fahrenheit", "Ray Bradbury", "Pocket Book", 2017, 256, 17, "Soft cover"));
		books.addToList(new Book(5, "Call me by your name", "Andre Asiman", "Popcorn Books", 2019, 362, 12, "Soft cover"));
		books.addToList(new Book(6, "Britt-Marie was here", "Fredrik Backman", "Sinbad", 2018, 416, 29, "Hard cover"));
		
		books.printBooks();
		
		books.printBooksByAuthor("Fredrik Backman");
		
		books.printBooksByPublisher("Pocket Book");
		
		books.printBooksAfterSpecificYear(2019);
	}
}
