package com.epam.javaIntro.bean;

import java.util.ArrayList;

public class ListOfBooks {
	private ArrayList<Book> books;
	
	public ListOfBooks() {
		this.books = new ArrayList<Book>();
	}
	
	public ListOfBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public void addToList(Book book) {
		books.add(book);
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
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
}
