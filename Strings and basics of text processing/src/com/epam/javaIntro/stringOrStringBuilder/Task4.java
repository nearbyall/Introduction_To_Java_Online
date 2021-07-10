package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task4 {
	public static String informaticsToCake (String informatics) {
		String cake = String.valueOf(informatics.charAt(informatics.indexOf('т')));
		cake += String.valueOf(informatics.charAt(informatics.indexOf('о')));
		cake += String.valueOf(informatics.charAt(informatics.indexOf('р')));
		cake += String.valueOf(informatics.charAt(informatics.indexOf('т')));
		return cake;
	}
	
	public static void main(String[] args) {
		String informatics = "информатика";
		System.out.println(informaticsToCake(informatics));
	}
}
