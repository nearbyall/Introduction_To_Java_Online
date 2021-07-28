package com.epam.javaIntro.book;

import java.util.ArrayList;

public class ListOfBooks {
	private ArrayList<Book> books;
	
	public ListOfBooks() {
		this.books = new ArrayList<Book>();
	}
	
	public ListOfBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [books=" + books + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
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
		ListOfBooks other = (ListOfBooks) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		return true;
	}

	public void addToList(Book book) {
		books.add(book);
	}
	
	public void printBooks() {
		System.out.println("Список книг:\n");
		for (Book book : books) {
			System.out.println(book.getInfo());
		}
	}
	
	public void printBooksByAuthor(String author) {
		System.out.printf("Книги написанные %s:\n", author);
		for (Book book : books) {
			if (book.getAuthors().equalsIgnoreCase(author)) {
				System.out.println(book.getInfo());
			}
		}
	}
	
	public void printBooksByPublisher(String publisher) {
		System.out.printf("Книги изданные %s:\n", publisher);
		for (Book book : books) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(book.getInfo());
			}
		}
	}
	
	public void printBooksAfterSpecificYear(int yearOfPublishing) {
		System.out.printf("Книги выпущенные от %d включительно:\n", yearOfPublishing);
		for (Book book : books) {
			if (book.getYearOfPublishing() >= yearOfPublishing) {
				System.out.println(book.getInfo());
			}
		}
	}
}
