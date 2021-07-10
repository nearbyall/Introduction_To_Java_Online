package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 2. В строке вставить после каждого символа 'a' символ 'b'.
 */

public class Task2 {
	public static String aToB(String str) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			strBuilder.append(str.charAt(i));
			if (str.charAt(i) == 'a') {
				strBuilder.append('b');
			}
		}
		return strBuilder.toString();
	}
	
	public static void main(String[] args) {
		String text = "My name is Vlad";
		System.out.println("Результат: " + aToB(text));
	}
}
