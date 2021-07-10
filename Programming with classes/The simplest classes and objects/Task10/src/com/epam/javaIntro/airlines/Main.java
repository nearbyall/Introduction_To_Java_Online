package com.epam.javaIntro.airlines;

/*
 * 10.������� ����� Airline, ������������ �������� ��������� ����.
 *    ���������� ������������, set-� get- ������ � �����  toString().
 *    ������� ������ �����, ������������ ������ ���� Airline, � ����������� �������������� � ��������.
 *    ������ �������� ������ ������ � ������� ��� ������ �� �������.
 *    Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
 *    ����� � �������: a) ������ ������ ������������ ������ ����������;
 *    b) ������ ������ ��� ��������� ��� ������; 
 *    c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.
 */

public class Main {
	public static void main(String[] args) {
		ListOfAirlines airlines = new ListOfAirlines();
		
		airlines.addAirline(new Airline("Minsk", "5123", "Boeing", "22:43", "Monday"));
		airlines.addAirline(new Airline("Moskow", "3425", "Maize", "11:22", "Saturday"));
		airlines.addAirline(new Airline("New-York", "1261", "Boeing", "13:16", "Saturday"));
		airlines.addAirline(new Airline("Minsk", "9678", "Jet", "22:43", "Thurstday"));
		airlines.addAirline(new Airline("Washington", "4764", "Boeing", "17:40", "Sunday"));
		airlines.addAirline(new Airline("Berlin", "5743", "Boeing", "11:26", "Monday"));
		
		airlines.printAirlines();
		
		airlines.printAirlinesByDestination("Minsk");
		
		airlines.printAirlinesByDayOfWeek("Monday");
		
		airlines.printAirlinesByDayOfWeekAndDepartureTime("Monday", "11:26");
	}
}
