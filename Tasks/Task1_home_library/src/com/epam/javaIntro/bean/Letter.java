package com.epam.javaIntro.bean;

public class Letter {
	private String recipientEmail;
	private String senderEmail;
	private Book book;
	private String message;
	
	public Letter(String recipientEmail, String senderEmail, Book book) {
		super();
		this.recipientEmail = recipientEmail;
		this.senderEmail = senderEmail;
		this.book = book;
		this.message = "";
	}

	public String getRecipientEmail() {
		return recipientEmail;
	}

	public void setRecipientEmail(String recipientEmail) {
		this.recipientEmail = recipientEmail;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s", recipientEmail, senderEmail, book.getName(), message);
	}
}
