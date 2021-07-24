package com.epam.javaIntro.bean;

import java.util.ArrayList;

public class Catalog {
	private ArrayList<Book> books;
	private User user;
	
	public Catalog() {
		books = new ArrayList<Book>();
		user = null;
	}

	public Catalog(ArrayList<Book> books, User user) {
		super();
		this.books = books;
		this.user = user;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
