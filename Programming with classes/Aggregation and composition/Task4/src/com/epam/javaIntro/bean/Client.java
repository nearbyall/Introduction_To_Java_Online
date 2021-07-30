package com.epam.javaIntro.bean;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String lastName;
	private String firstName;
	private String passportID;
	private List<BankAccount> clientAccounts;
	
	public Client() {
		this.firstName = "";
		this.lastName = "";
		this.passportID = "";
		this.clientAccounts= new ArrayList<BankAccount>();
	}
	
	public Client(String lastName, String firstName, String passportID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.passportID = passportID;
		this.clientAccounts= new ArrayList<BankAccount>();
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

	public String getPassportID() {
		return passportID;
	}

	public void setPassportID(String passportID) {
		this.passportID = passportID;
	}

	public List<BankAccount> getClientAccounts() {
		return clientAccounts;
	}

	public void setClientAccounts(ArrayList<BankAccount> clientAccounts) {
		this.clientAccounts = clientAccounts;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [lastName=" + lastName + ", firstName=" + firstName + ", passportID=" + passportID
				+ ", clientAccounts=" + clientAccounts + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientAccounts == null) ? 0 : clientAccounts.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((passportID == null) ? 0 : passportID.hashCode());
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
		if (clientAccounts == null) {
			if (other.clientAccounts != null)
				return false;
		} else if (!clientAccounts.equals(other.clientAccounts))
			return false;
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
		if (passportID == null) {
			if (other.passportID != null)
				return false;
		} else if (!passportID.equals(other.passportID))
			return false;
		return true;
	}
	
}
