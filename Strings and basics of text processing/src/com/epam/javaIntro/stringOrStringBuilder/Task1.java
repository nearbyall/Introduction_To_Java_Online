package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 1.Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем. 
 */

public class Task1 {
	public static int countOfSpaces(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				int tempCount = 0;
				for (int j = i; j < str.length(); j++) {
					if (str.charAt(j) == ' ') {
						tempCount++;
					}
					if (str.charAt(j) != ' ') {
						break;
					}
				}
				if (tempCount > count) {
					count = tempCount;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String text = " My name    is Vlad     ";
		System.out.println("Наибольшее кол-во подряд идущих пробелов: " + countOfSpaces(text));
	}
}
