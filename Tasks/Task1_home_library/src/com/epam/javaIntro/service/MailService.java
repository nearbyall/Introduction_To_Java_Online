package com.epam.javaIntro.service;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.input.Input;

public class MailService {
	public static void notifyAllAboutUpdate(Book book) {
		System.out.printf("Все были оповещены о поступлении книги: %s\n", book.getName());
	}
	
	public static void suggestBook() {
		System.out.println("Введите название книги: ");
		String bookName = Input.checkInputLine();
		System.out.printf("У администратора была запрошена книга: %s\n", bookName);
	}
}
