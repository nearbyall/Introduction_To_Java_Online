package com.epam.javaIntro.view;

import com.epam.javaIntro.bean.ListOfCustomers;

public interface ListOfCustomersView {
	void printList(ListOfCustomers listOfCustomers);
	void printCustomersByCardRange(ListOfCustomers listOfCustomers, String minBound, String maxBound);
}
