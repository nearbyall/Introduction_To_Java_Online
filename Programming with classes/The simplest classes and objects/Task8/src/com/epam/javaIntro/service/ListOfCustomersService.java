package com.epam.javaIntro.service;

import com.epam.javaIntro.bean.Customer;
import com.epam.javaIntro.bean.ListOfCustomers;

public interface ListOfCustomersService {
	void addToList(ListOfCustomers listOfCustomers, Customer customer);
	void sortListByAlphabet(ListOfCustomers listOfCustomers);
}
