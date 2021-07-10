package com.epam.javaIntro.customer;

public class Customer {
	private int id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String address;
	private String creditCardNumber;
	private String bankAccountNumber;
	
	public Customer(int id, String lastName, String firstName, String patronymic, String address, String creditCardNumber, String bankAccountNumber) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public String toString() {
		return String.format("Id клиента: %d\n"
						   + "Имя: %s %s %s\n"
						   + "Адресс: %s\n"
						   + "Номер кредитной карточки: %s\n"
						   + "Номер банковского счета: %s\n",
						   id, lastName, firstName, patronymic, address, creditCardNumber, bankAccountNumber);
	}
	
	public int getId() {
		return id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getPatronymic() {
		return patronymic;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setPetronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
}
