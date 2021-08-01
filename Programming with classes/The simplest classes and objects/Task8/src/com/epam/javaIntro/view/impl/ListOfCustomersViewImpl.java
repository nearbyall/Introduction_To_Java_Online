package com.epam.javaIntro.view.impl;

import java.util.ArrayList;

import com.epam.javaIntro.bean.Customer;
import com.epam.javaIntro.bean.ListOfCustomers;
import com.epam.javaIntro.view.ListOfCustomersView;

public class ListOfCustomersViewImpl implements ListOfCustomersView {

	@Override
	public void printList(ListOfCustomers listOfCustomers) {
		System.out.println("Вывод клиентов: \n");
		for (Customer customer : listOfCustomers.getBase()) {
			System.out.println(customer.getInfo());
		}
	}

	@Override
	public void printCustomersByCardRange(ListOfCustomers listOfCustomers, String minBound, String maxBound) {
		System.out.println("Вывод клиентов в диапазоне номера карточки: \n");
		ArrayList<Customer> tempBase =  new ArrayList<Customer>();
		for (Customer customer : listOfCustomers.getBase()) {
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
