package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */

public class Task5 {
	public static int countOfSymbol(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String text = "Have your friends collect your records\n"
					+ "and then change your number\n"
					+ "I guess that I don't need that though\n"
					+ "Now you're just somebody that I used to know\n";
		System.out.println("Кол-во: " + countOfSymbol(text, 'a'));
	}
}
