package com.epam.javaInto.car;

/*
 * 2.������� ������ ������ ����������, ��������� ������ ������, ���������.
 *   ������: �����, ������������, ������ ������, ������� �� ������� ����� ����������. 
 */

public class Main {
	public static void main(String[] args) {
		Engine engine = new Engine("����������", 2, 8);
		Wheel wheel = new Wheel("��������", "������", "30");
		Car car = new Car(engine, wheel, 4);
		
		System.out.println(car.toString());
		
		car.fillTheCar();
		car.changeWheelInCar(wheel, 3);
		car.driveCar();
	}
}
