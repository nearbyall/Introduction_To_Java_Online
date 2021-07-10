package com.epam.javaIntro.customer;

/*
 * 8.—оздать класс Customer, спецификаци€ которого приведена ниже.
 *   ќпределить конструкторы, set- и get- методы и метод toString().
 *   —оздать второй класс, агрегирующий массив типа Customer,
 *   с подход€щими конструкторами и методами. «адать критерии
 *   выбора данных и вывести эти данные на консоль. 
 *   
 *    ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета. 
 *   Ќайти и вывести: 
 *   a) список покупателей в алфавитном пор€дке; 
 *   b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале
 */

public class Main {
	public static void main(String[] args) {
		ListOfCustomers list = new ListOfCustomers();
		list.addToList(new Customer(1, "Melnikov", "Vladislav", "Sergeevich", "Sovetskaya st. 45",
									"1111 1111 1111 1111", "67GJ71HN29NJDN2"));
		list.addToList(new Customer(2, "Kuznetsov", "Kirill", "Andreevich", "Mira st. 12",
									"3333 3333 3333 3333", "177774HN33NJDS4"));
		list.addToList(new Customer(3, "Lobach", "Sergey", "Vadimovich", "Nemiga st. 43",
									"3333 3333 3333 3333", "67GJASDA123123F"));
		list.addToList(new Customer(4, "Lyashenko", "Marina", "Nikolaevna", "Sovetskaya st. 42",
									"5555 5555 5555 5555", "23G23123123JDN2"));
		list.addToList(new Customer(5, "Furs", "Svetlana", "Vladimirovna", "Bobruyskaya st. 9",
									"2222 2222 2222 2222", "123125HN29NJDN2"));
		
		list.sortListByAlphabet();
		list.printList();
		
		list.printCustomersByCardRange("2222 2222 2222 2222", "5555 5555 5555 5555");
	}
}
