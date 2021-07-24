package com.epam.javaIntro.storage;

import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.epam.javaIntro.bean.Treasure;
import com.epam.javaIntro.bean.Jewelry;
import com.epam.javaIntro.bean.Jewelry.JewelryType;
import com.epam.javaIntro.bean.Money;
import com.epam.javaIntro.bean.Money.MoneyType;
import com.epam.javaIntro.bean.Gem;
import com.epam.javaIntro.bean.Gem.GemType;

public class TreasureStorage implements TreasureTXTStorage {
	private final String workDir = System.getProperty("user.dir");
	private final File file = new File(workDir + "/resources/treasures.txt");
	private final String separator = ",";

	@Override
	public void loadTreasures(ArrayList<Treasure> treasures) {
		treasures.clear();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = "";
			while((line = br.readLine()) != null) {
				String[] temp = line.split(separator);
				Treasure treasure = null;
				if (temp[0].equalsIgnoreCase("Украшение")) {
					if (temp[4].equalsIgnoreCase("Серьги")) {
						treasure = new Jewelry(temp[1], temp[2], Double.parseDouble(temp[3]), JewelryType.EARRINGS);
					}
					if (temp[4].equalsIgnoreCase("Цепочка")) {
						treasure = new Jewelry(temp[1], temp[2], Double.parseDouble(temp[3]), JewelryType.CHAIN);
					}
					if (temp[4].equalsIgnoreCase("Браслет")) {
						treasure = new Jewelry(temp[1], temp[2], Double.parseDouble(temp[3]), JewelryType.BRACELET);
					}
				}
				if (temp[0].equalsIgnoreCase("Деньги")) {
					if (temp[4].equalsIgnoreCase("Монета")) {
						treasure = new Money(temp[1], temp[2], Double.parseDouble(temp[3]), MoneyType.COIN);
					}
					if (temp[4].equalsIgnoreCase("Банкнота")) {
						treasure = new Money(temp[1], temp[2], Double.parseDouble(temp[3]), MoneyType.BANK_NOTE);
					}
				}
				if (temp[0].equalsIgnoreCase("Камень")) {
					if (temp[4].equalsIgnoreCase("Алмаз")) {
						treasure = new Gem(temp[1], temp[2], Double.parseDouble(temp[3]), GemType.DIAMOND);
					}
					if (temp[4].equalsIgnoreCase("Изумруд")) {
						treasure = new Gem(temp[1], temp[2], Double.parseDouble(temp[3]), GemType.EMERALD);
					}
					if (temp[4].equalsIgnoreCase("Нефрит")) {
						treasure = new Gem(temp[1], temp[2], Double.parseDouble(temp[3]), GemType.NEPHRITIS);
					}
				}
				treasures.add(treasure);
			}
		} catch (IOException exc) {
			exc.getLocalizedMessage();
		}
	}
}