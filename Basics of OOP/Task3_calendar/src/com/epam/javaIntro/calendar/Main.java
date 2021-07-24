package com.epam.javaIntro.calendar;

import com.epam.javaIntro.calendar.Calendar.Date.DateType;
import com.epam.javaIntro.calendar.Calendar.Date;

/*
 * Задача 3. 
 * Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о 
 * выходных и праздничных днях.
 */

public class Main {
	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		calendar.addDate(new Date("04.08.2003", DateType.HOLIDAY));
		calendar.addDate(new Date("12.11.2001", DateType.WEEKEND));
		calendar.addDate(new Date("19.05.2005", DateType.WEEKDAY));
		calendar.deleteDate(new Date("19.05.2005", DateType.WEEKDAY));
		calendar.printDates();
	}
}
