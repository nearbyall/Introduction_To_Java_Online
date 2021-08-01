package com.epam.javaIntro.view.impl;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.bean.ListOfBooks;
import com.epam.javaIntro.view.ListOfBooksView;

public class ListOfBooksViewImpl implements ListOfBooksView {

	@Override
	public void printBooks(ListOfBooks listOfBooks) {
		System.out.println("Список книг:\n");
		for (Book book : listOfBooks.getBooks()) {
			System.out.println(book.getInfo());
		}
	}

	@Override
	public void printBooksByAuthor(ListOfBooks listOfBooks, String author) {
		System.out.printf("Книги написанные %s:\n", author);
		for (Book book : listOfBooks.getBooks()) {
			if (book.getAuthors().equalsIgnoreCase(author)) {
				System.out.println(book.getInfo());
			}
		}
	}

	@Override
	public void printBooksByPublisher(ListOfBooks listOfBooks, String publisher) {
		System.out.printf("Книги изданные %s:\n", publisher);
		for (Book book : listOfBooks.getBooks()) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(book.getInfo());
			}
		}
	}

	@Override
	public void printBooksAfterSpecificYear(ListOfBooks listOfBooks, int yearOfPublishing) {
		System.out.printf("Книги выпущенные от %d включительно:\n", yearOfPublishing);
		for (Book book : listOfBooks.getBooks()) {
			if (book.getYearOfPublishing() >= yearOfPublishing) {
				System.out.println(book.getInfo());
			}
		}
	}

}
