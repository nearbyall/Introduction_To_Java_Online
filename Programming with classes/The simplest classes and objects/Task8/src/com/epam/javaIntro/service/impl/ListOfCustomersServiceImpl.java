package com.epam.javaIntro.service.impl;

import java.util.Comparator;

import com.epam.javaIntro.bean.Customer;
import com.epam.javaIntro.bean.ListOfCustomers;
import com.epam.javaIntro.service.ListOfCustomersService;

public class ListOfCustomersServiceImpl implements ListOfCustomersService {

	@Override
	public void addToList(ListOfCustomers listOfCustomers, Customer customer) {
		listOfCustomers.getBase().add(customer);
	}

	@Override
	public void sortListByAlphabet(ListOfCustomers listOfCustomers) {
		listOfCustomers.getBase().sort(Comparator.comparing(Customer::getLastName));
	}

}
