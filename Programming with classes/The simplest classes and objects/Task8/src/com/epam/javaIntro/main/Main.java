package com.epam.javaIntro.main;

import com.epam.javaIntro.bean.Customer;
import com.epam.javaIntro.bean.ListOfCustomers;
import com.epam.javaIntro.service.ServiceProvider;
import com.epam.javaIntro.view.ViewProvider;

/*
 * 8.Создать класс Customer, спецификация которого приведена ниже.
 *   Определить конструкторы, set- и get- методы и метод toString().
 *   Создать второй класс, агрегирующий массив типа Customer,
 *   с подходящими конструкторами и методами. Задать критерии
 *   выбора данных и вывести эти данные на консоль. 
 *   
 *   Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 *   Найти и вывести: 
 *   a) список покупателей в алфавитном порядке; 
 *   b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

public class Main {
	public static void main(String[] args) {
		ViewProvider viewProvider = ViewProvider.getInstance();
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		
		ListOfCustomers list = new ListOfCustomers();
		
		serviceProvider.getListOfCustomersService()
					   .addToList(list, new Customer(1, "Melnikov", "Vladislav", "Sergeevich",
							      					 "Sovetskaya st. 45", "1111 1111 1111 1111", "67GJ71HN29NJDN2"));
		
		serviceProvider.getListOfCustomersService()
		   			   .addToList(list, new Customer(1, "Melnikov", "Vladislav", "Sergeevich", "Sovetskaya st. 45",
		   					   						 "1111 1111 1111 1111", "67GJ71HN29NJDN2"));
		
		serviceProvider.getListOfCustomersService()
					   .addToList(list, new Customer(2, "Kuznetsov", "Kirill", "Andreevich", "Mira st. 12",
							   						 "3333 3333 3333 3333", "177774HN33NJDS4"));
		
		serviceProvider.getListOfCustomersService()
					   .addToList(list, new Customer(3, "Lobach", "Sergey", "Vadimovich", "Nemiga st. 43",
							   						 "3333 3333 3333 3333", "67GJASDA123123F"));
		
		serviceProvider.getListOfCustomersService()
					   .addToList(list, new Customer(4, "Lyashenko", "Marina", "Nikolaevna", "Sovetskaya st. 42",
							   						 "5555 5555 5555 5555", "23G23123123JDN2"));

		serviceProvider.getListOfCustomersService()
		         	   .addToList(list, new Customer(5, "Furs", "Svetlana", "Vladimirovna", "Bobruyskaya st. 9",
		         			   						 "2222 2222 2222 2222", "123125HN29NJDN2"));


		serviceProvider.getListOfCustomersService().sortListByAlphabet(list);
		
		viewProvider.getListOfCustomersView().printList(list);
		
		viewProvider.getListOfCustomersView().printCustomersByCardRange(list, "2222 2222 2222 2222", "5555 5555 5555 5555");
	}
}
