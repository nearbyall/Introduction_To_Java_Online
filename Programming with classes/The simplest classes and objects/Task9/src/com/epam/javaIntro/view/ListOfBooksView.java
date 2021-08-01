package com.epam.javaIntro.view;

import com.epam.javaIntro.bean.ListOfBooks;

public interface ListOfBooksView {
	void printBooks(ListOfBooks listOfBooks);
	void printBooksByAuthor(ListOfBooks listOfBooks, String author);
	void printBooksByPublisher(ListOfBooks listOfBooks, String publisher);
	void printBooksAfterSpecificYear(ListOfBooks listOfBooks, int yearOfPublishing);
}
