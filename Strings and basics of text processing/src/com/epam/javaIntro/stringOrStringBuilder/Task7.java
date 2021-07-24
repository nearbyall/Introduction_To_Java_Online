package com.epam.javaIntro.stringOrStringBuilder;

/*
 * 7.Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено 
 *	 "abc cde def", то должно быть выведено "abcdef". 
 */

public class Task7 {
	public static String removeExtraCharactersAndSpaces(String str) {
		StringBuilder strBuilder = new StringBuilder(str);
		for (int i = 0; i < strBuilder.length(); i++) {
			//Удаление пробелов
			if (strBuilder.charAt(i) == ' ') {
				strBuilder.deleteCharAt(i);
				i--;
				continue;
			}
			//Удаление повторяющихся символов
			for (int j = i + 1; j < strBuilder.length(); j++) {
				if (strBuilder.charAt(j) == strBuilder.charAt(i)) {
					strBuilder.deleteCharAt(j);
					i--;
				}
			}	
		}
		return strBuilder.toString();
	}
	
	public static void main (String[] args) {
		String text = " epaaammm   ";
		System.out.println(removeExtraCharactersAndSpaces(text));
	}
}
