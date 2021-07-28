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

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", patronymic="
				+ patronymic + ", address=" + address + ", creditCardNumber=" + creditCardNumber
				+ ", bankAccountNumber=" + bankAccountNumber + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((bankAccountNumber == null) ? 0 : bankAccountNumber.hashCode());
		result = prime * result + ((creditCardNumber == null) ? 0 : creditCardNumber.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNumber == null) {
			if (other.bankAccountNumber != null)
				return false;
		} else if (!bankAccountNumber.equals(other.bankAccountNumber))
			return false;
		if (creditCardNumber == null) {
			if (other.creditCardNumber != null)
				return false;
		} else if (!creditCardNumber.equals(other.creditCardNumber))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		return true;
	}

	public String getInfo() {
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
