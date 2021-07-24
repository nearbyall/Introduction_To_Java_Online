package com.epam.javaIntro.storage;

import java.util.ArrayList;

import com.epam.javaIntro.bean.Treasure;

public interface TreasureTXTStorage {

	public void loadTreasures(ArrayList<Treasure> treasures);
	
}
