package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 6. Из заданной строки получить новую, повторив каждый символ дважды.
 */

public class Task6 {
	public static String repeatEachCharacterTwice(String str) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			strBuilder.append(str.charAt(i));
			strBuilder.append(str.charAt(i));
		}
		return strBuilder.toString();
	}
	
	public static void main(String[] args) {
		String text = "Have your friends collect your records\n"
					+ "and then change your number\n"
					+ "I guess that I don't need that though\n"
					+ "Now you're just somebody that I used to know\n";
		System.out.println(repeatEachCharacterTwice(text));
	}
}
