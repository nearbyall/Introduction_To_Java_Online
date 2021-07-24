package com.epam.javaIntro.input;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String checkInputMessage() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{1,40}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Вводимое сообщение должно содержать от 1 до 40 символов");
        }
        return scanner.nextLine().trim();
    }
	
	public static String checkInputSubject() {
        Pattern pattern = Pattern.compile("[\\D\\w ]{1,20}");
        scanner.useDelimiter("[\r\n]");
        while (!scanner.hasNext(pattern)) {
            scanner.nextLine();
            System.out.println("Вводимая тема должна содержать от 1 до 20 символов");
        }
        return scanner.nextLine().trim();
    }
	
	public static String checkInputDate() {
		Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d");
		scanner.useDelimiter("[\r\n]");
		while (!scanner.hasNext(pattern)) {
			scanner.nextLine();
            System.out.println("Дата должна быть вида DD/MM/YYYY");
		}
		return scanner.nextLine().trim();
	}
	
	public static String checkInputEmail() {
		Pattern pattern = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");
		scanner.useDelimiter("[\r\n]");
		while (!scanner.hasNext(pattern)) {
			scanner.nextLine();
            System.out.println("Email должен быть вида example@mail.dom");
		}
		return scanner.nextLine().trim();
	}
	
	public static int checkInputChoice() {
        Pattern pattern;       
        pattern = Pattern.compile("[1-5]");
        while (!scanner.hasNext(pattern)) {
        	System.out.println("Выбрана несуществующая операция, попробуйте еще раз");
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
	
	public static int checkInputMainChoice() {
        Pattern pattern;       
        pattern = Pattern.compile("[0-3]");
        while (!scanner.hasNext(pattern)) {
        	System.out.println("Выбрана несуществующая операция, попробуйте еще раз");
            scanner.nextLine();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }
	
	 public static int checkPageNumber() {
	        Pattern pattern = Pattern.compile("[\\d]");
	        while (!scanner.hasNext(pattern)) {
	            scanner.nextLine();
	            System.out.println("Неверное значение, попробуйте еще раз");
	        }
	            return scanner.nextInt();
	    }
}
