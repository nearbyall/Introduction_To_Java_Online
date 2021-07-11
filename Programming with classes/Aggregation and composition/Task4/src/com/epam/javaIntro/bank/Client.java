package com.epam.javaIntro.bank;

import java.util.ArrayList;
import java.util.Comparator;

public class Client {
	private String lastName;
	private String firstName;
	private String passportID;
	private ArrayList<BankAccount> clientAccounts;
	
	Client(String lastName, String firstName, String passportID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.passportID = passportID;
		clientAccounts= new ArrayList<BankAccount>();
	}

	@Override
	public String toString() {
		return "Клиент " + lastName + " " + firstName + ", Номер паспорта = " + passportID;
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
	
	public void printInformation() {
		System.out.println("Пользователь " + toString() + " имеет аккаунты: ");
		for (BankAccount account : clientAccounts) {
			System.out.println(account.toString());
		}
	}
	
	public String getBalance() {
		double balance = 0;
		for (BankAccount account : clientAccounts) {
			balance += account.getBalance();
		}
		return String.format("Общий баланс: %.2f $", balance);
	}
	
	public String getPositiveBalances() {
		double balance = 0;
		for (BankAccount account : clientAccounts) {
			if (account.getBalance() > 0) {
				balance += account.getBalance();
			}

		}
		return String.format("Общий баланс с позитивных счетов: %.2f $", balance);
	}
	
	public String getNegativeBalances() {
		double balance = 0;
		for (BankAccount account : clientAccounts) {
			if (account.getBalance() < 0) {
				balance += account.getBalance();
			}

		}
		return String.format("Общий баланс с отрицательных счетов: %.2f $", balance);
	}
	
	public void sortByBalance() {
		clientAccounts.sort(Comparator.comparing(BankAccount::getBalance));
	}
	
	public void addNewAccount(BankAccount account) {
		clientAccounts.add(account);
	}
	
	public void blockAccountById(int id) {
		for (BankAccount account : clientAccounts) {
			if (account.getId() == id) {
				account.blockAccount();
			}
		}
	}
	
	public void unlockAccountById(int id) {
		for (BankAccount account : clientAccounts) {
			if (account.getId() == id) {
				account.unlockAccount();
			}
		}
	}
	
	public BankAccount getAccountById(int id) {
		for (BankAccount account : clientAccounts) {
			if (account.getId() == id) {
				return account;
			}
		}
		return null;
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

	public ArrayList<BankAccount> getClientAccounts() {
		return clientAccounts;
	}

	public void setClientAccounts(ArrayList<BankAccount> clientAccounts) {
		this.clientAccounts = clientAccounts;
	}
	
}
