package com.epam.javaIntro.main;

/*
 *  Задача 4. 
 *	Создать консольное приложение, удовлетворяющее следующим требованиям:  
 *	• Приложение должно быть объектно-, а не процедурно-ориентированным.  
 *	• Каждый класс должен иметь отражающее смысл название и информативный состав.  
 *	• Наследование должно применяться только тогда, когда это имеет смысл.  
 *	• При кодировании должны быть использованы соглашения об оформлении кода java code convention.  
 *  • Классы должны быть грамотно разложены по пакетам.  
 *	• Консольное меню должно быть минимальным.  
 *  • Для хранения данных можно использовать файлы. 
 *
 *	Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере 
 *	дракона. Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и 
 *	выбора сокровищ на заданную сумму.
 */

import com.epam.javaIntro.bean.*;
import com.epam.javaIntro.bean.Dragon.DragonStatus;
import com.epam.javaIntro.consoleAction.Menu;
import com.epam.javaIntro.logic.CaveLogic;

public class Main {
	public static Dragon dragon = new Dragon("Огнедув", 8374, DragonStatus.AWAKE, 20, 326);
	public static Cave cave = new Cave("Адская долина", dragon);
	
	public static void main(String[] args) {
		CaveLogic.fillTreasuresFromFile(cave);
		Menu menu = new Menu();
		menu.startMenu();
	}
}
