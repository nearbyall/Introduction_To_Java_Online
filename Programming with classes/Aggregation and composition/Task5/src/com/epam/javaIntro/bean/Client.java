package com.epam.javaIntro.bean;

public class Client {
	private String lastName;
	private String firstName;
	Voucher voucher;
	
	public Client() {
		this.lastName = "";
		this.firstName = "";
		this.voucher = null;
	}
	
	public Client(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.voucher = null;
	}

	public String getInfo() {
		if (voucher != null) {
			return String.format("Клиент %s %s\n"
					           + "%s", 
					           lastName, firstName, voucher.toString());
		} else {
			return String.format("Клиент %s %s\n",
					             lastName, firstName);
		}
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [lastName=" + lastName + ", firstName=" + firstName + ", voucher=" + voucher + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((voucher == null) ? 0 : voucher.hashCode());
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
		Client other = (Client) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (voucher == null) {
			if (other.voucher != null)
				return false;
		} else if (!voucher.equals(other.voucher))
			return false;
		return true;
	}
}
