package com.epam.javaIntro.train;

/*
 * 4.Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 *   Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 *   Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
 *   Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть 
 *   упорядочены по времени отправления.
 */

public class Main {
	public static void main(String[] args) {
		Train[] trains = new Train[5];
		
		trains[0] = new Train("Zhodino", 6, "22:43");
		trains[1] = new Train("Borisow", 2, "09:22");
		trains[2] = new Train("Minsk", 1, "20:33");
		trains[3] = new Train("New-York", 3, "18:48");
		trains[4] = new Train("Minsk", 4, "04:20");
		
		System.out.println("Вывод поезда по определенному номеру:");
		Train.printTrainByNumber(trains, 2);
		
		System.out.println("\nСортировка поездов по номеру: ");
		Train.sortByNumber(trains);
		Train.printTrains(trains);
		
		System.out.println("\nСортировка поездов по точке назначения(если одинаковы, то по времени отправления): ");
		Train.sortByDestination(trains);
		Train.printTrains(trains);
	}
}
