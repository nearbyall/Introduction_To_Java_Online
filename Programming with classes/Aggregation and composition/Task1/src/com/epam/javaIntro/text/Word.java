package com.epam.javaIntro.text;

public class Word {
	private StringBuilder word;
	
	public Word(String word) {
		this.word = new StringBuilder(word);
	}
	
	@Override
	public String toString() {
		return word.toString();
	}
	
	public void changeWord(String word) {
		this.word = new StringBuilder(word);
	}
	
	public StringBuilder getWord() {
		return word;
	}
	
	public void setWord(StringBuilder word) {
		this.word = word;
	}
	
	//ћетод дл€ перевода первой буквы к верхнему регистру
	public void converFirstLetterToUppercase() {
		word.setCharAt(0, Character.toUpperCase(word.charAt(0)));
	}
	
	//ћетод дл€ перевода первой буквы к нижнему регистру
	public void converFirstLetterToLowercase() {
		word.setCharAt(0, Character.toLowerCase(word.charAt(0)));
	}
}
