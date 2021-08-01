package com.epam.javaIntro.bean;

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
	
	
	public String getInfo() {
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
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", name=" + name + ", authors=" + authors + ", publisher=" + publisher
				+ ", yearOfPublishing=" + yearOfPublishing + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", bindingType=" + bindingType + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authors == null) ? 0 : authors.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfPages;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + yearOfPublishing;
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
		if (authors == null) {
			if (other.authors != null)
				return false;
		} else if (!authors.equals(other.authors))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}
}

