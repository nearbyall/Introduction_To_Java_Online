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
	
	public void addToList(Book book) {
		books.add(book);
	}
	
	public void printBooks() {
		System.out.println("������ ����:\n");
		for (Book book : books) {
			System.out.println(book.toString());
		}
	}
	
	public void printBooksByAuthor(String author) {
		System.out.printf("����� ���������� %s:\n", author);
		for (Book book : books) {
			if (book.getAuthors().equalsIgnoreCase(author)) {
				System.out.println(book.toString());
			}
		}
	}
	
	public void printBooksByPublisher(String publisher) {
		System.out.printf("����� �������� %s:\n", publisher);
		for (Book book : books) {
			if (book.getPublisher().equalsIgnoreCase(publisher)) {
				System.out.println(book.toString());
			}
		}
	}
	
	public void printBooksAfterSpecificYear(int yearOfPublishing) {
		System.out.printf("����� ���������� �� %d ������������:\n", yearOfPublishing);
		for (Book book : books) {
			if (book.getYearOfPublishing() >= yearOfPublishing) {
				System.out.println(book.toString());
			}
		}
	}
}
