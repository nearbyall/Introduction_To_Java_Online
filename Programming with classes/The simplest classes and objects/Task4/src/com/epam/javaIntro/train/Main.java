package com.epam.javaIntro.train;

/*
 * 4.�������� ����� Train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������.
 *   �������� ������ � ������ �� ���� ��������� ���� Train, �������� ����������� ���������� ��������� ������� �� ������� �������.
 *   �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
 *   �������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� ������ ���� 
 *   ����������� �� ������� �����������.
 */

public class Main {
	public static void main(String[] args) {
		Train[] trains = new Train[5];
		
		trains[0] = new Train("Zhodino", 6, "22:43");
		trains[1] = new Train("Borisow", 2, "09:22");
		trains[2] = new Train("Minsk", 1, "20:33");
		trains[3] = new Train("New-York", 3, "18:48");
		trains[4] = new Train("Minsk", 4, "04:20");
		
		System.out.println("����� ������ �� ������������� ������:");
		Train.printTrainByNumber(trains, 2);
		
		System.out.println("\n���������� ������� �� ������: ");
		Train.sortByNumber(trains);
		Train.printTrains(trains);
		
		System.out.println("\n���������� ������� �� ����� ����������(���� ���������, �� �� ������� �����������): ");
		Train.sortByDestination(trains);
		Train.printTrains(trains);
	}
}
