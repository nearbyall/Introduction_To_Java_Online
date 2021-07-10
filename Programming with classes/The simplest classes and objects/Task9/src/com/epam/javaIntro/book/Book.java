package com.epam.javaIntro.book;

public class Book {
	private int id;
	private String name;
	private String authors;
	private String publisher;
	private int yearOfPublishing;
	private int numberOfPages;
	private float price;
	private String bindingType;
	
	public Book(int id,String name , String authors, String publisher, int yearOfPublishing, int numberOfPages, float price, String bindingType) {
		this.id = id;
		this.name = name;
		this.authors = authors;
		this.publisher = publisher;
		this.yearOfPublishing = yearOfPublishing;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}
	
	public String toString() {
		return String.format("Id книги: %d\n"
						   + "Название: %s\n"
						   + "Автор(ы): %s\n"
						   + "Издательство: %s\n"
						   + "Год публикации: %d\n"
						   + "Цена: %.2f $\n"
						   + "Тип переплета: %s\n",
						   id, name, authors, publisher, yearOfPublishing, price, bindingType);
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAuthors() {
		return authors;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public int getYearOfPublishing() {
		return yearOfPublishing;
	}
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public float getPrice() {
		return price;
	}
	
	public String getBindingType() {
		return bindingType;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public void setYearOfPublishing(int yearOfPublishing) {
		this.yearOfPublishing = yearOfPublishing;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
}
