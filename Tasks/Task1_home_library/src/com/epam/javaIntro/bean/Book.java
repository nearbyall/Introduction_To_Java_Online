package com.epam.javaIntro.bean;

import com.epam.javaIntro.builder.BookBuilder;

public class Book {
	private String name;
	private String author;
	private BookType bookType;
	private int publicationYear;
	
	public Book() {
		this.name = "";
		this.author = "";
		this.bookType = BookType.UNIDENTIFIED;
		this.publicationYear = 0;
	}
	
	public Book(String name, String author, BookType bookType, int publicationYear) {
		this.name = name;
		this.author = author;
		this.bookType = bookType;
		this.publicationYear = publicationYear;
	}

	public Book(BookBuilder bookBuilder) {
		this.name = bookBuilder.getName();
		this.author = bookBuilder.getAuthor();
		this.bookType = bookBuilder.getBookType();
		this.publicationYear = bookBuilder.getPublicationYear();
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

	@Override
	public String toString() {
		return String.format("Название книги: %s\n"
						   + "Автор: %s\n"
						   + "Тип книги: %s\n"
						   + "Год выпуска: %d\n",
						   name, author, bookType.getValue(), publicationYear);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bookType == null) ? 0 : bookType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + publicationYear;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bookType != other.bookType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (publicationYear != other.publicationYear)
			return false;
		return true;
	}
}

