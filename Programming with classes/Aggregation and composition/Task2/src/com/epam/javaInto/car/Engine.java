package com.epam.javaInto.car;

public class Engine {
	private String enginePowerType;
	private int engineDisplacement;
	private int countOfCylinders;
	
	public Engine(String enginePowerType, int engineDisplacement, int countOfCylinders) {
		this.enginePowerType = enginePowerType;
		this.engineDisplacement = engineDisplacement;
		this.countOfCylinders = countOfCylinders;
	}
	
	@Override
	public String toString() {
		return String.format("��� ������� ���������: %s\n"
						   + "������� ����� ���������: %s �\n"
						   + "���-�� ���������: %s\n",
						   enginePowerType, engineDisplacement, countOfCylinders);
	}
	
	public void start() {
		System.out.println("��������� �������!");
	}
	
	public void stop() {
		System.out.println("��������� ����������.");
	}
	
	public String getEnginePowerType() {
		return enginePowerType;
	}
	
	public int getEngineDisplacement() {
		return engineDisplacement;
	}
	
	public int getCountOfCylinders() {
		return countOfCylinders;
	}
	
	public void setEnginePowerTypee(String enginePowerType) {
		this.enginePowerType = enginePowerType;
	}
	
	public void setEngineDisplacement(int engineDisplacement) {
		this.engineDisplacement = engineDisplacement;
	}
	
	public void setCountOfCylinders(int countOfCylinders) {
		this.countOfCylinders = countOfCylinders;
	}
}
