package com.epam.javaIntro.service;

import java.util.ArrayList;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.bean.Catalog;
import com.epam.javaIntro.bean.UserType;
import com.epam.javaIntro.builder.BookBuilder;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.storage.TXTStorage;

public class CatalogService {
	public static boolean printBooks(Catalog catalog) {
		if(catalog.getBooks().size() != 0) {
            int page = 1;
            int booksOnPage = 5;
            int numberOfPages = catalog.getBooks().size() / booksOnPage + 1;
            while (page > 0 && page <= numberOfPages) {
                System.out.println("Page " + page + " of " + numberOfPages + ":");
                int i = page * booksOnPage - booksOnPage;
                for (; i < page * booksOnPage && i < catalog.getBooks().size(); i++) {
                    System.out.print(i + 1 + " ");
                    System.out.println(getBookLine(catalog.getBooks().get(i)));
                }
                System.out.print("Введите номер страницы, или 0 для выхода: ");
                page = Input.checkPageNumber();
            }
            return true;
        }
        return false;
	}
	
	private static boolean printFindedBooks(ArrayList<Book> books, Catalog catalog) {
		System.out.println("Найденные книги: ");
		if(books.size() != 0) {
            int page = 1;
            int booksOnPage = 5;
            int numberOfPages = books.size() / booksOnPage + 1;
            while (page > 0 && page <= numberOfPages) {
                System.out.println("Page " + page + " of " + numberOfPages + ":");
                int i = page * booksOnPage - booksOnPage;
                for (; i < page * booksOnPage && i < books.size(); i++) {
                    System.out.print(i + 1 + " ");
                    System.out.println(getBookLine(books.get(i)));
                }
                System.out.print("Введите номер страницы, или 0 для выхода: ");
                page = Input.checkPageNumber();
            }
            return true;
        }
        return false;
	}
	
	public static String getBookLine(Book book) {
        return String.format("%s, \"%s\", %d год, тип: %s",
                    book.getAuthor(), book.getName(),
                    book.getPublicationYear(), book.getBookType().getValue());
    }
	
	public boolean addBook(Book book, Catalog catalog) {
		if(catalog.getUser().getUserType() == UserType.ADMIN) {
			catalog.getBooks().add(book);
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean removeBook(Book book, Catalog catalog) {
		for (Book onebook : catalog.getBooks()) {
			if (onebook.equals(book)) {
				catalog.getBooks().remove(book);
				TXTStorage.saveBooks(catalog.getBooks());
				return true;
			}
		}
		return false;
	}
	
	public static boolean addNewBook(Catalog catalog) {
		Book newBook = createBook();
		if(!catalog.getBooks().contains(newBook)) {
			catalog.getBooks().add(newBook);
			TXTStorage.saveBooks(catalog.getBooks());
			MailService.notifyAllAboutUpdate(newBook);
			return true;
		} else {
			return false;
		}
	}
	
	public static Book createBook() {
		BookBuilder bookBuilder = new BookBuilder();
		System.out.println("Введите имя автора: ");
		bookBuilder.setAuthor(Input.checkInputLine());
		System.out.println("Введите название книги: ");
		bookBuilder.setName(Input.checkInputLine());
		System.out.println("Введите год публикации книги: ");
		bookBuilder.setPublicationYear(Input.checkInputYear());
		System.out.println("Введите 1 если книга в электронном варианте\n"
						 + "Введите 2 если книга в бумажном варианте:\n");
		bookBuilder.setBookType(Input.checkInputBookType());
		return bookBuilder.build();
	}
	
	public static boolean findBook(Catalog catalog) {
		ArrayList<Book> result = null;
		System.out.println("Введите 1 для поиска книги по автору\n"
						 + "Введите 2 для поиска книги по названию\n");
		int choise = Input.checkInputChoice(catalog.getUser().getUserType());
		if (choise == 1) {
			System.out.println("Введите имя автора: ");
			String author = Input.checkInputLine();
			result = findBookByAuthor(author, catalog);
		} else if (choise == 2) {
			System.out.println("Введите название книги: ");
			String name = Input.checkInputLine();
			result = findBookByName(name, catalog);
		} else {
			return false;
		}
		if (result.size() != 0) {
			printFindedBooks(result, catalog);
		} else {
			System.out.println("Книги не были найдены");
		}
		return true;
	}
	
	public static ArrayList<Book> findBookByAuthor(String author, Catalog catalog) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : catalog.getBooks()) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				result.add(book);
			}
		}
		return result;
	}
	
	public static ArrayList<Book> findBookByName(String name, Catalog catalog) {
		ArrayList<Book> result = new ArrayList<Book>();
		for (Book book : catalog.getBooks()) {
			if (book.getName().equalsIgnoreCase(name)) {
				result.add(book);
			}
		}
		return result;
	}
}
