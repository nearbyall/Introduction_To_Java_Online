package com.epam.javaIntro.regularExpression;

import java.util.Scanner;
import java.util.Arrays;

/*
 * 1.C������  ����������,  ����������� ����� (�����  ��������  �  ������) �  �����������  ���������  �  �������
 *   ��� ��������� ��������: ������������� ������  ��  ����������  �����������; � ������  �����������  �������������  �����  ��  �����;
 *   ������������� ������� � ����������� �� �������� ���������� ��������� ��������� �������, � � ������ ��������� � �� ��������.
 */

public class Task1 {
	private static void functionalMenu(String str) {
		Scanner in = new Scanner(System.in);
		System.out.println("\t��������� ��� ������ � �������\t\n" +
						   "������� 1 ��� ���������� ������� � ������ �� ���-�� �����������\n" +
						   "������� 2 ��� ���������� ���� �� ����� ����� � ������ �����������\n" +
						   "������� 3 ��� ���������� ������ � ����������� �� �������� ���-��\n" +
						   "��������� �������, � � ������ ��������� - �� ��������\n" +
						   "������� 4 ��� ���������� ������ ���������.");
		String userChoise = "Nothing";
		
		while (!userChoise.equalsIgnoreCase("4")) {
			System.out.println("\n�������� ��������: ");
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
					System.out.println("\n���������� ������. ����� �������");
					break;
				default:
					System.out.println("\n��������� ���� ������� ��������, ��������� �������\n");
				
			}
		}		
		in.close();
	}

	private static void sortingParagraphs(String str) {
		//���������� �� �������, ����������� ��� ������ ���� ����� 4 �������
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
		
		//�� ��� ���������� ������� �� �����������
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
		
		//���������� ����������� ����� ����������� � ������
		int[] countOfSentences = new int[paragraphs.length];
		int maxLength = 0;
		for (int i = 0; i < paragraphs.length; i++) {
			String[] sentences = paragraphs[i].split(SENTENCES_SPLIT_REGEX);
			countOfSentences[i] = sentences.length;
			if (sentences.length > maxLength) {
				maxLength = sentences.length;
			}
		}
		
		//������������� ����� ������� �� ������ ��������� �� ������ ��������
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
		//���������� �� �������, ����������� ��� ������ ���� ����� 4 �������
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
		
		//�� ��� ���������� ������� �� �����������
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
		
		//�� ��� ���������� ����������� �� �����.
		String WORDS_SPLIT_REGEX = "\\s*(\\s|,|;|:|-)\\s*";
		
		for (String paragraph : paragraphs) {
			String[] sentences = paragraph.split(SENTENCES_SPLIT_REGEX);
			for(String sentence : sentences) {
				String[] words = sentence.split(WORDS_SPLIT_REGEX);
				
				//���������� ���� �� ������������ ���-�� ��������
				for (int k = words.length - 1; k >= 0; k--) {
                    for (int l = 0; l < k; l++) {
                        if (words[l].length() > words[l + 1].length()) {
                            String temp = words[l];
                            words[l] = words[l + 1];
                            words[l + 1] = temp;
                        }
                    }
                }
				
				//����� ����
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
		//���������� �� �������, ����������� ��� ������ ���� ����� 4 �������
		String PARAGRAPH_SPLIT_REGEX = "(?m)(?=^\\s{4})"; 
		String[] paragraphs = str.split(PARAGRAPH_SPLIT_REGEX);
				
		//�� ��� ���������� ������� �� �����������
		String SENTENCES_SPLIT_REGEX = "\\.*[.!?]\\s*";
				
		//�� ��� ���������� ����������� �� �����.
		String WORDS_SPLIT_REGEX = "\\s*(\\s|,|;|:|-)\\s*";
		
		Scanner in = new Scanner(System.in);
		System.out.println("\n������� ����������� ��� ������: ");
		String symbol = in.nextLine();

		for (String paragraph : paragraphs) {
			String[] sentences = paragraph.split(SENTENCES_SPLIT_REGEX);
			for (String sentence : sentences) {
				String[] words = sentence.split(WORDS_SPLIT_REGEX);
				
				//���������� ������
				for (int k = words.length - 1; k >= 0; k--) {
                    for (int l = 0; l < k; l++) {
                        int countFirst = 0; //���-�� �������� �������� � ������ �������
                        int countSecond = 0; //���-�� �������� �������� � ��������� �������
                        
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
				
				//����� ����
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
		String text = "    ����� ������� ����������� ��� ���������� �������� ���� � ����� �����-�� ����, ��������� ������,\n"
					+ "�� �������� ���� ���� ������. �� ����, ���� ���� ������� �����, ����� ������ � � ��� ���������� -\n"
					+ "������ ��� �������.\n"
					+ "    ���� ������� �����, ����� ��������� ����� �����, ��������� �� ���������,\n"
					+ "������ ����� �������, �� �� ��������� ���� �� ������ ���� ����� ������������. �� ������ ���� ����,\n"
					+ "��������� ��������. ������ ����� ���� ��������� �������� ������� ���� ����� � ������������ � ��������\n"
					+ "��������� �������.\n"
					+ "    ��, �������! ���������: ���� ������� ������ ���� ������� ����������� � ����� �����,\n"
					+ "��������� ����� �������, ����� ������� ����� ��� ����������? �� ���� ������? �� ����� �� ����� \n"
					+ "�� ��������� � ������? ���� ���� ������ ��� ����, ������ ������� �������� � ����������� ������������,\n"
					+ "�� �� ��������� �� ��������� � �����.���� �� ���� ��� ������, �� ������ �������� ��, ���� ������,\n"
					+ "���� ������� ����.\n";
		System.out.println(text);
		functionalMenu(text);
	}
}
