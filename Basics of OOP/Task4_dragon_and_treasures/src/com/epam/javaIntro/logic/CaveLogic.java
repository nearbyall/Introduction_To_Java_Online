package com.epam.javaIntro.logic;

import com.epam.javaIntro.bean.Cave;
import com.epam.javaIntro.bean.Treasure;
import com.epam.javaIntro.storage.TreasureStorage;

public class CaveLogic {
	public static void fillTreasuresFromFile(Cave cave) {
		TreasureStorage treasureStorage = new TreasureStorage();
		treasureStorage.loadTreasures(cave.getTreasures());
	}
	
	public static void addTreasure(Cave cave, Treasure treasure) {
		cave.getTreasures().add(treasure);
	}
	
	public static Treasure getMostExpensiveTreasure(Cave cave) {
		Treasure mostExpanciveTreasure = cave.getTreasures().get(0);
		for (Treasure treasure : cave.getTreasures()) {
			if (treasure.getPrice() > mostExpanciveTreasure.getPrice()) {
				mostExpanciveTreasure = treasure;
			}
		}
		return mostExpanciveTreasure;
	}
	
	public static void printMostExpanciveTreasure(Cave cave) {
		System.out.println("Самое дорогое сокровище: " + getMostExpensiveTreasure(cave).toString());
	}
	
	public static void printTreasuresForGivenAmount(Cave cave, double amount) {
		double currentSum = 0;
		System.out.println("Сокровища на сумму: " + amount + "$");
		for (Treasure treasure : cave.getTreasures()) {
			if (currentSum + treasure.getPrice() <= amount) {
				System.out.println(treasure.toString());
				currentSum += treasure.getPrice();
			}
		}
		
	}
	
	public static void printAllTreasures(Cave cave) {
		for (Treasure treasure : cave.getTreasures()) {
			System.out.println(treasure.toString());
		}
	}
}
