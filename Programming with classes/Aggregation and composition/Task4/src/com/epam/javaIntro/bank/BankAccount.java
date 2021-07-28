package com.epam.javaIntro.bank;

public class BankAccount {
	private int id;
	private double balance;
	private boolean isOpen = true;
	
	public BankAccount(int id, double balance) {
		this.balance = balance;
		this.id = id;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [id=" + id + ", balance=" + balance + ", isOpen=" + isOpen + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + (isOpen ? 1231 : 1237);
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
		BankAccount other = (BankAccount) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (id != other.id)
			return false;
		if (isOpen != other.isOpen)
			return false;
		return true;
	}

	public String getInfo() {
		return String.format("ID: %d\n"
				   	       + "Баланс: %.2f\n"
				           + "Счет открыт: %s\n", 
				           id, balance, isOpen ? "открыт" : "закрыт");
	}
	
	public void printStatus() {
		if (isOpen = true) {
			System.out.printf("\nСчет %d открыт\n", id);
		} else if (isOpen = false) {
			System.out.printf("\nСчет %d закрыт\n", id);
		}
	}
	
	public void blockAccount() {
		isOpen = false;
	}
	
	public void unlockAccount() {
		isOpen = true;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setStatus(boolean isOpen) {
		this.isOpen = isOpen;
	}	
}
