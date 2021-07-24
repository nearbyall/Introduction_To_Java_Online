package com.epam.javaIntro.builder;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.bean.BookType;

public class BookBuilder {
	private String name;
	private String author;
	private BookType bookType;
	private int publicationYear;
	
	public BookBuilder() {
		this.name = "";
		this.author = "";
		this.bookType = BookType.UNIDENTIFIED;
		this.publicationYear = 0;
	}
	
	public BookBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public BookBuilder withAuthor(String author) {
		this.author = author;
		return this;
	}
	
	public BookBuilder withBookType(BookType bookType) {
		this.bookType = bookType;
		return this;
	}
	
	public BookBuilder withPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
		return this;
	}
	
	public Book build() {
		return new Book(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
}
