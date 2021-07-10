package com.epam.javaIntro.customer;

import java.util.Comparator;
import java.util.ArrayList;

public class ListOfCustomers {
	private ArrayList<Customer> base;
	
	public ListOfCustomers() {
		this.base =  new ArrayList<Customer>()
	}
	
	public ListOfCustomers(ArrayList<Customer> base) {
		this.base = base;
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
			System.out.println(customer.toString());
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
			System.out.println(customer.toString());
		}
	}
}
