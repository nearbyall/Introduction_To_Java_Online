package com.epam.javaIntro.input;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.epam.javaIntro.bean.BookType;
import com.epam.javaIntro.bean.UserType;

public class Input {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String checkInputLine() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{4,30}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Вводимая строка должна содержать от 4 до 30 символов");
        }
        return scanner.nextLine().trim();
    }

    public static int checkInputChoice(UserType userType) {
        Pattern pattern;
        if(userType == UserType.ADMIN) {
            pattern = Pattern.compile("[0-6[9]]");
        } else {
            pattern = Pattern.compile("[0-3[9]]");
        }
        while (!scanner.hasNext(pattern)) {
        	System.out.println("Выбрана несуществующая операция, попробуйте еще раз");
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public static int checkInputYear() {
        Pattern pattern = Pattern.compile("[\\d ]{4}");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Год должен состоять из четырех цифр");
        }
        return scanner.nextInt();
    }

    public static BookType checkInputBookType() {
        Pattern pattern = Pattern.compile("[1-2]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Неверный выбор. Попробуйте еще раз");
        }
        if (scanner.nextInt() == 1) {
            return BookType.E_BOOK;
        } else return BookType.P_BOOK;
    }

    public static int checkPageNumber() {
        Pattern pattern = Pattern.compile("[\\d]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Неверный выбор. Попробуйте еще раз");
        }
            return scanner.nextInt();
    }
}
