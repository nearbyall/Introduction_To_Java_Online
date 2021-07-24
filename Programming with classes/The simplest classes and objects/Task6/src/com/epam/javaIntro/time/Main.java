package com.epam.javaIntro.time;

/*
 * 6.Составьте описание класса для представления времени.
 *   Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда)
 *   с проверкой допустимости вводимых значений. В случае недопустимых  значений полей поле 
 *   устанавливается  в  значение  0.  Создать  методы  изменения  времени на заданное количество часов, минут и секунд.
 */

public class Main {
	public static void main(String[] args) {
		Time time = new Time(26, 10, 49);
		time.showTime();
		
		time.changeForHours(25);
		time.showTime();
		
		time.changeForMinutes(60);
		time.showTime();
		
		time.changeForSeconds(20);
		time.showTime();
	}
}
