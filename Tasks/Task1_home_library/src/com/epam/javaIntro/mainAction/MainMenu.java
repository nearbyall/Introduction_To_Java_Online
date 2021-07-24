package com.epam.javaIntro.mainAction;

import java.util.ArrayList;

import com.epam.javaIntro.bean.Book;
import com.epam.javaIntro.bean.Catalog;
import com.epam.javaIntro.bean.User;
import com.epam.javaIntro.bean.UserType;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.service.CatalogService;
import com.epam.javaIntro.service.MailService;
import com.epam.javaIntro.service.UserService;
import com.epam.javaIntro.storage.TXTStorage;

public class MainMenu {
	private static Catalog catalog = null;
	
	public static void start() {
		System.out.println("Добро пожаловать в библиотеку!");
		if (entrance()) {
			System.out.println("Вход успешный");
		}
		while (true) {
			UserType userType = catalog.getUser().getUserType();
			System.out.println(getMainOptions(userType));
			int option = Input.checkInputChoice(userType);
			if (option != 0) {
				performOperation(option);
			} else {
				System.out.println("Досвидания, завершение работы.");
				return;
			}
		}
	}
	
	private static boolean entrance() {
		User user = null;
		while (user == null) {
			System.out.println("Введите логин: ");
			String login = Input.checkInputLine();
			System.out.println("Введите пароль: ");
			String password = Input.checkInputLine();
			user = UserService.login(login, password);
			if (user == null) {
				System.out.println("Неверный логин или пароль, попробуйте еще раз");
			}
		}
		ArrayList<Book> books = TXTStorage.loadBooks();
		catalog = new Catalog(books, user);
		return true;
	}
	
	private static String getMainOptions(UserType userType) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nДоступные опции:\n").append("1. Просмотреть книги в каталоге.\n");
        sb.append("2. Найти книги в каталоге.\n");
        if(userType == UserType.ADMIN) {
            sb.append("3. Добавить книгу в каталог.\n");
            sb.append("4. Удалить книгу из каталога.\n");
            sb.append("5. Зарегистрировать нового пользователя.\n");
            sb.append("6. Удалить пользователя.\n");
        } else {
            sb.append("3.Запросить у администратора добавить новую книгу.\n");
        }
        sb.append("9. Сменить пользователя\n");
        sb.append("0. Закончить работу\n");
        return sb.toString();
    }
	
	private static void performOperation(int option) {
        switch (option) {
            case 1:
                if (CatalogService.printBooks(catalog)){
                        System.out.println("Библиотека пуста");
                }
                break;
            case 2:
                while (!CatalogService.findBook(catalog)) {
                    System.out.println("Ошибка, попробуйте еще раз");
                }
                break;
            case 3:
                if (catalog.getUser().getUserType() == UserType.ADMIN) {
                    if (CatalogService.addNewBook(catalog)) {
                        System.out.println("Книга успешно добавлена");
                    } else {
                        System.out.println("Книга уже есть в каталоге");
                    }
                } else {
                    MailService.suggestBook();
                }
                break;
            case 4:
                Book removeBook = CatalogService.createBook();
                if (CatalogService.removeBook(removeBook, catalog)) {
                    System.out.println("Книга успешно удалена из каталога.");
                } else {
                    System.out.println("Каталог не содержит этой книги.");
                }
                break;
            case 5:
                if(UserService.addUser()) {
                    System.out.println("Новый пользователь успешно добавлен.");
                }
                break;
            case 6:
                if (UserService.removeUser()) {
                    System.out.println("Пользователь успешно удален");
                }
                break;
            case 9:
                if(entrance()) {
                    System.out.println("Добрый день, " + catalog.getUser().getUsername() + "!");
                }
                
        }
	}
}
