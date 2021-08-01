package com.epam.javaIntro.main;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.bean.ListOfBooks;
import com.epam.javaIntro.view.ViewProvider;

/*
 * 9.Создать класс Book, спецификация которого приведена ниже.
 *   Определить конструкторы, set-и get- методы и метод  toString().
 *   Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
 *   Задать критерии выбора данных и вывести эти данные на консоль.
 *   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 *   Найти и вывести:
 *   a) список книг заданного автора;
 *   b) список книг, выпущенных заданным издательством;
 *   c) список книг, выпущенных после заданного года.
 */

public class Main {
	public static void main(String[] args) {
		ViewProvider viewProvider = ViewProvider.getInstance();
		
		ListOfBooks books = new ListOfBooks();
		
		books.addToList(new Book(1, "Anxious people", "Fredrik Backman", "Sinbad", 2020, 416, 25, "Hard cover"));
		books.addToList(new Book(2, "The Raven King", "Nora Sakavich", "Popcorn Books", 2020, 432, 21, "Soft cover"));
		books.addToList(new Book(3, "Beowulf", "Kathleen Kiernan", "АСТ", 2007, 318, 3, "Hard cover"));
		books.addToList(new Book(4, "451 degrees Fahrenheit", "Ray Bradbury", "Pocket Book", 2017, 256, 17, "Soft cover"));
		books.addToList(new Book(5, "Call me by your name", "Andre Asiman", "Popcorn Books", 2019, 362, 12, "Soft cover"));
		books.addToList(new Book(6, "Britt-Marie was here", "Fredrik Backman", "Sinbad", 2018, 416, 29, "Hard cover"));
		
		viewProvider.getListOfBooksView().printBooks(books);
		
		viewProvider.getListOfBooksView().printBooksByAuthor(books, "Fredrik Backman");
		
		viewProvider.getListOfBooksView().printBooksByPublisher(books, "Pocket Book");
		
		viewProvider.getListOfBooksView().printBooksAfterSpecificYear(books, 2019);
	}
}