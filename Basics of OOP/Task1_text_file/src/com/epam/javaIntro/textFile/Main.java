package com.epam.javaIntro.textFile;

/*
 * Задача 1.  
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, 
 * вывести на консоль содержимое, дополнить, удалить. 
 */

public class Main {
	public static void main(String[] args) {
		Directory directory = new Directory("javaIntro");
		String name = "Task1";
		TextFile file = TextFile.create(name, directory);
		file.addText("Задание номер 1, необходимо вывести в консоль cумму квадратов первых двухста чисел.");
		file.printContent();
		file.deleteText("Задание номер 1, ");
		file.printContent();
	}

}
