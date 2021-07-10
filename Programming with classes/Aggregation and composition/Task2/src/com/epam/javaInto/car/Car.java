package com.epam.javaInto.car;

public class Car {
	private Engine engine;
	private Wheel[] wheels;
	
	public Car(Engine engine, Wheel wheel, int countOfWheels) {
		this.engine = engine;
		this.wheels = new Wheel[countOfWheels];
		for (int i = 0; i < countOfWheels; i++) {
			wheels[i] = wheel;
		}
	}
	
	@Override
	public String toString() {
		return String.format("Информация о машине.\n"
						   + "Двигатель:\n"
						   + "%s\n"
						   + "Колличество колес: %d\n"
						   + "Колесо: \n"
						   + "%s",
						   engine.toString(), wheels.length, wheels[0].toString());
	}
	
	public void driveCar() {
		engine.start();
		System.out.println("Машина едет.\n");
	}
	
	public void fillTheCar() {
		System.out.println("Машина была заправлена.\n");
	}
	
	public void changeWheelInCar(Wheel wheel, int numberOfWheel) {
		if (numberOfWheel > 0 && numberOfWheel <= wheels.length) {
			wheels[numberOfWheel - 1].changeWheel(wheel);
		}
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public Wheel[] getWheels() {
		return wheels;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}
}
