package com.epam.javaInto.car;

import java.util.Arrays;

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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + Arrays.hashCode(wheels);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		return true;
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
