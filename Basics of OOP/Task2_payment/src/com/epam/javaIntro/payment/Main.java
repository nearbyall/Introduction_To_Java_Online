package com.epam.javaIntro.payment;

/*
 * Задача 2.  
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку из 
 * нескольких товаров.
 */

public class Main {
	public static void main(String[] args) {
		Payment.Product product1 = new Payment.Product("Кола", 2.99);
		Payment.Product product2 = new Payment.Product("Пепси", 3.99);
		Payment.Product product3 = new Payment.Product("Фанта", 4.99);
		Payment payment = new Payment();
		
		payment.addProduct(product1);
		payment.addProduct(product2);
		payment.addProduct(product3);
		
		payment.printCart();
	}
}
