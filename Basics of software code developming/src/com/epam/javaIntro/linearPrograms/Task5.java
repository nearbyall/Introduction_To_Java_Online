package com.epam.javaIntro.linearPrograms;

/*
 * 5. Дано  натуральное  число Т, которое  представляет  длительность  прошедшего  времени  в  секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме:ННч ММмин SSc.
 */

public class Task5 {
	public static void main(String[] args) {
		int T = 1289369;
        int hours = T / 3600;
        int minutes = (T - hours * 3600) / 60;
        int seconds = (T - hours * 3600) % 60;
        String result = String.format("%s%sч%s%sмин%s%sсек", hours / 10, hours % 10, minutes / 10, minutes % 10, seconds / 10, seconds % 10);
        System.out.println(result);
	}

}
