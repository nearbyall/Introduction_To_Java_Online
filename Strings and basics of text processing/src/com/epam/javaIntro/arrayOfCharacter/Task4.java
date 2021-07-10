package com.epam.javaIntro.arrayOfCharacter;

/*
 * 4. В строке найти количество чисел.
 */

public class Task4 {
	public static int countOfNumbers(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
				for (int j = i; j < str.length(); j++) {
					if (!Character.isDigit(str.charAt(j))) {
						i = j;
						break;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		String text = "I 2 am 3 studying 4 2 at 521 the 6 faculty 689 of physics";
		int count = countOfNumbers(text);
		System.out.println("Колличество чисел в тексте: " + count);
	}
}
