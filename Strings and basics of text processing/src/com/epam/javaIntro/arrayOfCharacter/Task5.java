package com.epam.javaIntro.arrayOfCharacter;

/*
 * 5.Удалить  в  строке  все  лишние  пробелы,  то  есть  серии  подряд  идущих  пробелов  заменить  на  одиночные  пробелы. 
 *   Крайние пробелы в строке удалить. 
 */

public class Task5 {
	public static String stringTrim(String str) {
		StringBuilder strBuilder = new StringBuilder();

		//Удаление всех лишних пробелов
		boolean isSpace = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				if (!isSpace) {
					strBuilder.append(' ');
				}
				isSpace = true;
			} else {
				strBuilder.append(str.charAt(i));
				isSpace = false;
			}
		}
		
		//Удаление крайних пробелов
		if (strBuilder.charAt(0) == ' ') {
			strBuilder.deleteCharAt(0);
		}
		if (strBuilder.charAt(strBuilder.length() - 1) == ' ') {
			strBuilder.deleteCharAt(strBuilder.length() - 1);
		}
		
		return strBuilder.toString();
	}
	
	public static void main(String[] args) {
		String text = "  Hello,  my name   is Vlad ";
		String trimmedText = stringTrim(text);
		System.out.println(trimmedText);
	}
}
