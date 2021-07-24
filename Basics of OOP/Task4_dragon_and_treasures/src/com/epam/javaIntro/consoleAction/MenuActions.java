package com.epam.javaIntro.consoleAction;

import com.epam.javaIntro.main.*;
import com.epam.javaIntro.logic.*;

import java.util.Scanner;

public class MenuActions {
	private Scanner scanner = new Scanner(System.in);
	
    public void printOptions() {
        String menuText = "ДРАКОН И СОКРОВИЩА:\n" 
        				+ "1 - Показать все сокровища;\n" 
        				+ "2 - Показать самое дорогое сокровище;\n" 
        				+ "3 - Показать сокровища на заданную сумму;\n" 
        				+ "4 - Закончить работу.";
        System.out.println(menuText);
    }
    
    public int makeChoice() {
        int choice;

        try {
            choice = Integer.parseInt(scanner.nextLine());
            if (choice > 4 || choice < 1) {
                System.out.println("Такой опции нету, повторите ввод\n");
                printOptions();
            } else {
                return choice;
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверное значение, повторите ввод\n");
            printOptions();
        }
        return -1;
    }
    
    public boolean processingOperation(int choice) {
        switch (choice){
            case 1:
                System.out.println("Список сокровищ в пещере:");
                CaveLogic.printAllTreasures(Main.cave);
                break;
            case 2:
                System.out.println("Самое дорого сокровище:");
                CaveLogic.printMostExpanciveTreasure(Main.cave);
                break;
            case 3:
            	System.out.println("Введите сумму на которую необходимо подобрать сокровища: ");
                double value;
                try {
                    value = Double.parseDouble(scanner.nextLine());
                    if (value < 0) {
                        System.out.println("Введено неверное значение, повторите ввод\n");
                    } else {
                    	CaveLogic.printTreasuresForGivenAmount(Main.cave, value);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Неверное значение\n");
                }
                break;
            case 4:
                System.out.println("Работа закончена.\nДосвидания!");
                return true;
        }
        return false;
    }
}
