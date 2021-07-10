package com.epam.javaIntro.state;

/*
 * 3.Создать объект класса Государство, используя классы Область, Район, Город.
 *   Методы: вывести на консоль столицу, количество областей, площадь, областные центры. 
 */

public class Main {
	public static void main(String[] args) {
		//Создание районов и добавление в них по паре городов
		District district1 = new District("Смолевический");
		district1.addCity(new City("Жодино", false, false, false));
		district1.addCity(new City("Смолевичи", false, false, true));
		
		District district2 = new District("Минский");
		district2.addCity(new City("Минск", true, true, true));
		district2.addCity(new City("Колодищи", false, false, false));
		
		District district3 = new District("Брестский");
		district3.addCity(new City("Мухавец", false, false, false));
		district3.addCity(new City("Брест", true, false, true));
		
		District district4 = new District("Пинский");
		district4.addCity(new City("Пинск", false, false, true));
		district4.addCity(new City("Полесье", false, false, false));
		
		District district5 = new District("Могилевский");
		district5.addCity(new City("Могилев", true, false, true));
		district5.addCity(new City("Сидоровичи", false, false, false));
		
		District district6 = new District("Бобруйский");
		district6.addCity(new City("Бобруйск", false, false, false));
		district6.addCity(new City("Мышковичи", false, false, false));
		
		//Создание областей и добавление в них по паре районов
		Region region1 = new Region("Минская");
		region1.setSquare(25);
		region1.addDistrict(district1);
		region1.addDistrict(district2);
		
		Region region2 = new Region("Брестская");
		region2.setSquare(30);
		region2.addDistrict(district3);
		region2.addDistrict(district4);
		
		Region region3 = new Region("Могилевская");
		region3.setSquare(35);
		region3.addDistrict(district5);
		region3.addDistrict(district6);
		
		//Создание государства и добавление в него областей
		State state = new State("Беларусь");
		state.addRegion(region1);
		state.addRegion(region2);
		state.addRegion(region3);
		
		state.printCapitalOfState();
		state.printCentersOfRegions();
		state.printCountOfRegions();
		state.printSquare();
	}
}
