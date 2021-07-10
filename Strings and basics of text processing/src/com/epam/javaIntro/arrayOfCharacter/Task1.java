package com.epam.javaIntro.arrayOfCharacter;

/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case
 */

public class Task1 {
	public static String[] toSnakeCase (String[] camelCase) {
		String[] snakeCase = new String[camelCase.length];
		for (int i = 0; i < snakeCase.length; i++) {
			StringBuilder snakeItem = new StringBuilder();
			for (int j = 0; j < camelCase[i].length(); j++) {
				char letter = camelCase[i].toCharArray()[j];
				if(Character.isLowerCase(letter)) {
					snakeItem.append(letter);
				} else {
					snakeItem.append('_');
					snakeItem.append(Character.toLowerCase(letter));
				}
			}
			snakeCase[i] = snakeItem.toString();
		}
		return snakeCase;
	}
	
	public static void main(String[] args) {
		String[] camelCase = {"orangeJuice", "appleJack", "holaBolaMola"};
		
		String[] snakeCase = toSnakeCase(camelCase);
		
		System.out.println(String.join(", ", camelCase));		
        System.out.println(String.join(", ", snakeCase));
	}
}

