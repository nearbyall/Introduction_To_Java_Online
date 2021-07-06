package RegularExpression;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 1.Cоздать  приложение,  разбирающее текст (текст  хранится  в  строке) и  позволяющее  выполнять  с  текстом
 *   три различных операции: отсортировать абзацы  по  количеству  предложений; в каждом  предложении  отсортировать  слова  по  длине;
 *   отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.
 */

public class Task1 {
	private static void functionalMenu(String str) {
		Scanner in = new Scanner(System.in);
		System.out.println("\tПрограмма для работы с текстом\t\n" +
						   "Введите 1 для сортировки абзацев в тексте по кол-ву предложений\n" +
						   "Введите 2 для сортировки слов по своей длине в каждои предложении\n" +
						   "Введите 3 для сортировки лексем в предложении по убыванию кол-ва\n" +
						   "заданного символа, а в случае равенства - по алфавиту\n" +
						   "Введите 4 для завершения работы программы.");
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
					System.out.println("\nЗавершение работы. Всего доброго");
					break;
				default:
					System.out.println("\nВведенная вами команда неверная, повторите попытку\n");
				
			}
		}		
		in.close();
	}

	private static void sortingParagraphs(String str) {
		//Разделение по абзацам, предполагая что абзацы идут через 4 пробела
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
		
		//РВ для разделения абзацев на предложения
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
		
		//Нахождение наибольшего числа предложений в абзаце
		int[] countOfSentences = new int[paragraphs.length];
		int maxLength = 0;
		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentences = paragraphs[i].split(SENTENCES_SPLIT_REGEX);
			countOfSentences[i] = sentences.length;
			if (sentences.length > maxLength) {
				maxLength = sentences.length;
			}
		}
		
		//Упорядоченный вывод абзацев от самого короткого до самого длинного
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
		//Разделение по абзацам, предполагая что абзацы идут через 4 пробела
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
		
		//РВ для разделения абзацев на предложения
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
		
		//РВ для разделения предложений на слова.
		String WORDS_SPLIT_REGEX = "\\s*(\\s|,|;|:|-)\\s*";
		
		for (String paragraph : paragraphs) {
			String[] sentences = paragraph.split(SENTENCES_SPLIT_REGEX);
			for(String sentence : sentences) {
				String[] words = sentence.split(WORDS_SPLIT_REGEX);
				
				//Сортировка слов по возврастанию кол-ва символов
				for (int k = words.length - 1; k >= 0; k--) {
                    for (int l = 0; l < k; l++) {
                        if (words[l].length() > words[l + 1].length()) {
                            String temp = words[l];
                            words[l] = words[l + 1];
                            words[l + 1] = temp;
                        }
                    }
                }
				
				//Вывод слов
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
		//Разделение по абзацам, предполагая что абзацы идут через 4 пробела
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
				
		//РВ для разделения абзацев на предложения
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
				
		//РВ для разделения предложений на слова.
		String WORDS_SPLIT_REGEX = "\\s*(\\s|,|;|:|-)\\s*";
		
		Scanner in = new Scanner(System.in);
		System.out.println("\nВведите необходимый вам символ: ");
		String symbol = in.nextLine();

		for (String paragraph : paragraphs) {
			String[] sentences = paragraph.split(SENTENCES_SPLIT_REGEX);
			for (String sentence : sentences) {
				String[] words = sentence.split(WORDS_SPLIT_REGEX);
				
				//Сортировка лексем
				for (int k = words.length - 1; k >= 0; k--) {
                    for (int l = 0; l < k; l++) {
                        int countFirst = 0; //Кол-во заданных символов в первой лексеме
                        int countSecond = 0; //Кол-во заданных символов в следующей лексеме
                        
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
				
				//Вывод слов
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
		String text = "    Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель, жизненную задачу,\n"
					+ "он невольно дает себе оценку. По тому, ради чего человек живет, можно судить и о его самооценке -\n"
					+ "низкой или высокой.\n"
					+ "    Если человек живет, чтобы приносить людям добро, облегчать их страдания,\n"
					+ "давать людям радость, то он оценивает себя на уровне этой своей человечности. Он ставит себе цель,\n"
					+ "достойную человека. Только такая цель позволяет человеку прожить свою жизнь с достоинством и получить\n"
					+ "настоящую радость.\n"
					+ "    Да, радость! Подумайте: если человек ставит себе задачей увеличивать в жизни добро,\n"
					+ "приносить людям счастье, какие неудачи могут его постигнуть? Не тому помочь? Но много ли людей \n"
					+ "не нуждаются в помощи? Если жить только для себя, своими мелкими заботами о собственном благополучии,\n"
					+ "то от прожитого не останется и следа.Если же жить для других, то другие сберегут то, чему служил,\n"
					+ "чему отдавал силы.\n";
		System.out.println(text);
		functionalMenu(text);
	}
}
