package com.epam.javaIntro.service;

import com.epam.javaIntro.bean.Flower;
import com.epam.javaIntro.bean.FlowerComposition;

public class FlowerCompositionService {
	private FlowerComposition flowerComposition;

	public FlowerCompositionService(FlowerComposition flowerComposition) {
		this.flowerComposition = flowerComposition;
	}
	
	public void printInfo() {
		System.out.printf("Информакция о букете: \n"
						+ "Цена букета: %.2f\n"
						+ "Цена обертки: %.2f\n"
						+ "Обертка: %s\n\n"
						+ "Состав букета: \n",
						flowerComposition.getPrice(), flowerComposition.getWrap().getPrice(), flowerComposition.getWrap().getWrapType().getValue());
		for(Flower flower : flowerComposition.getFlowers()) {
			System.out.println(flower.toString());
		}
		
	}
}
