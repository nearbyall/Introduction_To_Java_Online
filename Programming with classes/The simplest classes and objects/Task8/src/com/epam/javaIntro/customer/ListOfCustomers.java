package com.epam.javaIntro.customer;

import java.util.Comparator;
import java.util.ArrayList;

public class ListOfCustomers {
	private ArrayList<Customer> base;
	
	public ListOfCustomers() {
		this.base =  new ArrayList<Customer>();
	}
	
	public ListOfCustomers(ArrayList<Customer> base) {
		this.base = base;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [base=" + base + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
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
		ListOfCustomers other = (ListOfCustomers) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		return true;
	}

	public void addToList(Customer customer) {
		base.add(customer);
	}
	
	public void sortListByAlphabet() {
		base.sort(Comparator.comparing(Customer::getLastName));
	}
	
	public void printList() {
		System.out.println("Вывод клиентов: \n");
		for (Customer customer : base) {
			System.out.println(customer.getInfo());
		}
	}
	
	public void printCustomersByCardRange(String minBound, String maxBound) {
		System.out.println("Вывод клиентов в диапазоне номера карточки: \n");
		ArrayList<Customer> tempBase =  new ArrayList<Customer>();
		for (Customer customer : base) {
			if (customer.getCreditCardNumber().compareTo(minBound) > 0
			 && customer.getCreditCardNumber().compareTo(maxBound) < 0) {
				tempBase.add(customer);
			}
		}
		for (Customer customer : tempBase) {
			System.out.println(customer.getInfo());
		}
	}
}
