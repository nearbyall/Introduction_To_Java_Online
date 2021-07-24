package com.epam.javaIntro.regularExpression;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 1.Cоздать  приложение,  разбирающее  текст  (текст  хранится  в  строке)  и  позволяющее  выполнять  с  текстом  три  различных 
 *	 операции:  отсортировать  абзацы  по  количеству  предложений;  в  каждом  предложении  отсортировать  слова  по  длине; 
 *	 отсортировать лексемы в предложении  по убыванию количества вхождений заданного символа, а в случае равенства – по 
 *	 алфавиту.
 */

public class Task1 {
	private static void functionalMenu(String str) {
		Scanner in = new Scanner(System.in);
		System.out.println("\tПрограмма для работы с текстом\t\n" +
						   "Введите 1 для сортировки текста по кол-во предложений в абзацах\n" +
						   "Введите 2 для сортировки в каждом предложении слов по длине\n" +
						   "Введите 3 для сортировки лексем в предложении по убывнию кол-ва\n" +
						   "заданного символа, а в случае равенства по - по алфавиту\n" +
						   "Введите 4 чтобы закончить работу");
		String userChoise = "Nothing";
		
		while (!userChoise.equalsIgnoreCase("4")) {
			System.out.println("\nВыберите действие: ");
			userChoise = in.nextLine();
			switch (userChoise) {
				case "1":
					sortingParagraphs(str);
					break;
				case "2":
					sortingWords(str);
					break;
				case "3":
					sortingLexemes(str);
					break;
				case "4":
					System.out.println("\nВыход из программы");
					break;
				default:
					System.out.println("\nВыбрано непрвильное действие, выберите заного: \n");
				
			}
		}		
		in.close();
	}

	private static void sortingParagraphs(String str) {
		//РВ для деления текста на абзацы, опираясь на четыре пробела
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
		
		//РВ для деления абзацев на предложения
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
		
		int[] countOfSentences = new int[paragraphs.length];
		int maxLength = 0;
		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentences = paragraphs[i].split(SENTENCES_SPLIT_REGEX);
			countOfSentences[i] = sentences.length;
			if (sentences.length > maxLength) {
				maxLength = sentences.length;
			}
		}
		
		for (int i = 1; i <= maxLength; i++) {
			for (int j = 0; j < countOfSentences.length; j++) {
				if (i == countOfSentences[j]) {
					System.out.println(paragraphs[j]);
				}
			}
		}
		
		System.out.println();		
	}
	
	private static void sortingWords(String str) {
		//РВ для деления текста на абзацы, опираясь на четыре пробела
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
		
		//РВ для деления абзацев на предложения
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
		
		//РВ для деления предложений на слова
		String WORDS_SPLIT_REGEX = "\\s*(\\s|,|;|:|-)\\s*";
		
		for (String paragraph : paragraphs) {
			String[] sentences = paragraph.split(SENTENCES_SPLIT_REGEX);
			for(String sentence : sentences) {
				String[] words = sentence.split(WORDS_SPLIT_REGEX);
				
				for (int k = words.length - 1; k >= 0; k--) {
                    for (int l = 0; l < k; l++) {
                        if (words[l].length() > words[l + 1].length()) {
                            String temp = words[l];
                            words[l] = words[l + 1];
                            words[l + 1] = temp;
                        }
                    }
                }
				
				for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print(". ");
			}
			System.out.println();
		}
		System.out.println("    ");
	}
	
	private static void sortingLexemes(String str) {
		//РВ для деления текста на абзацы, опираясь на четыре пробела
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
				
		//РВ для деления абзацев на предложения
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
				
		//РВ для деления предложений на слова
		String WORDS_SPLIT_REGEX = "\\s*(\\s|,|;|:|-)\\s*";
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nВведите символ: ");
		String symbol = in.nextLine();

		for (String paragraph : paragraphs) {
			String[] sentences = paragraph.split(SENTENCES_SPLIT_REGEX);
			for (String sentence : sentences) {
				String[] words = sentence.split(WORDS_SPLIT_REGEX);
				
				for (int k = words.length - 1; k >= 0; k--) {
                    for (int l = 0; l < k; l++) {
                        int countFirst = 0; //Кол-во заданного символа в одной лексеме
                        int countSecond = 0; //Кол-во заданного символа в другой лексеме
                        
                        for (int n = 0; n < words[l].length(); n++) { 
                            if (String.valueOf(words[l].charAt(n)).compareToIgnoreCase(symbol) == 0) {
                            	countFirst++;
                            }
                        }
                        
                        for (int n = 0; n < words[l + 1].length(); n++) { 
                            if (String.valueOf(words[l + 1].charAt(n)).compareToIgnoreCase(symbol) == 0) {
                            	countSecond++;
                            }
                        }
                        
                        if (countFirst < countSecond) {   
                            String tmp = words[l];
                            words[l] = words[l + 1];
                            words[l + 1] = tmp;
                        } else if (countFirst == countSecond) { 
                            String [] forCompare = {words[l], words[l + 1]};
                            Arrays.sort(forCompare);
                            words[l] = forCompare[0];
                            words[l + 1] = forCompare[1];
                        }
                    }
				}
				
				for (String  word : words) {
                    System.out.print(word + " ");
                }
                System.out.print(". ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		String text = "    Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель,\n"
				    + "жизненную задачу, он невольно дает себе оценку. По тому, ради чего человек живет,\n"
				    + "можно судить и о его самооценке - низкой или высокой.\n"
				    + "    Если человек живет, чтобы приносить людям добро, облегчать их страдания, давать\n"
				    + "людям радость, то он оценивает себя на уровне этой своей человечности. Он ставит себе\n"
				    + "цель, достойную человека.\n"
				    + "    Только такая цель позволяет человеку прожить свою жизнь с достоинством и получить\n"
				    + "настоящую радость. Да, радость! Подумайте: если человек ставит себе задачей увеличивать\n"
				    + "в жизни добро, приносить людям счастье, какие неудачи могут его постигнуть? Не тому помочь?\n"
				    + "Но много ли людей не нуждаются в помощи?\n";
		System.out.println(text);
		functionalMenu(text);
	}
}
