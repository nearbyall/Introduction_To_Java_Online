package com.epam.javaInto.car;

/*
 * 2.Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *   Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля. 
 */

public class Main {
	public static void main(String[] args) {
		Engine engine = new Engine("Бензиновый", 2, 8);
		Wheel wheel = new Wheel("Стальной", "Зимняя", "30");
		Car car = new Car(engine, wheel, 4);
		
		System.out.println(car.toString());
		
		car.fillTheCar();
		car.changeWheelInCar(wheel, 3);
		car.driveCar();
	}
}
