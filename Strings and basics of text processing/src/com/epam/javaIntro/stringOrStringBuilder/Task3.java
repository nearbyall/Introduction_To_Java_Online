package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 3. Проверить, является ли заданное слово палиндромом.
 */

public class Task3 {
	public static boolean isPalindrome(String str) {
		for (int i = 0, j = str.length() - 1; i < str.length() && j >= 0; i++, j-- ) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String firstWord = "шалаш";
		String secondWord = "разбойник";
		System.out.println(firstWord + " "  + isPalindrome(firstWord));
		System.out.println(secondWord + " "  + isPalindrome(secondWord));
	}
}
