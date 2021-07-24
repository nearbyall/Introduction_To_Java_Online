package com.epam.javaIntro.main;

import com.epam.javaIntro.bean.Flower;
import com.epam.javaIntro.bean.FlowerComposition;
import com.epam.javaIntro.bean.Wrap;
import com.epam.javaIntro.bean.Wrap.WrapType;
import com.epam.javaIntro.builder.FlowerBuilder;
import com.epam.javaIntro.builder.FlowerCompositionBuilder;
import com.epam.javaIntro.builder.WrapBuilder;
import com.epam.javaIntro.service.FlowerCompositionService;

/*
 *  Задача 5. 
 *	Создать консольное приложение, удовлетворяющее следующим требованиям:  
 *	• Корректно спроектируйте и реализуйте предметную область задачи.  
 *	• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов 
 *    проектирования. 
 *	• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента. 
 *  • для проверки корректности переданных данных можно применить регулярные выражения. 
 *  • Меню выбора действия пользователем можно не реализовывать, используйте заглушку. 
 *  • Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode(). 
 *
 *
 *  Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции 
 *  (объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы 
 *  и упаковка.
 */

public class Main {
	public static void main(String[] args) {
		Flower rose = new FlowerBuilder("Роза")
					     .withColor("Красный")
					     .withFloweringSeason("Весна")
					     .withPrice(9.99)
					     .build();
		Flower tulip = new FlowerBuilder("Тюльпан")
						  .withColor("Белый")
						  .withFloweringSeason("Лето")
						  .withPrice(5.99)
						  .build();
		Flower lily = new FlowerBuilder("Лилия")
				  		 .withColor("Голубой")
				  		 .withFloweringSeason("Осень")
				  		 .withPrice(6.99)
				  		 .build();
		
		Wrap wrap = new WrapBuilder()
					   .withWrapType(WrapType.PAPER)
					   .withPrice(2.99)
					   .build();
		
		FlowerComposition boquet = new FlowerCompositionBuilder()
									  .withWrap(wrap)
									  .addFlower(rose)
									  .addFlower(tulip)
									  .addFlower(lily)
									  .build();
		
		FlowerCompositionService flowerCompositionService = new FlowerCompositionService(boquet);
		flowerCompositionService.printInfo();	
	}	
}
