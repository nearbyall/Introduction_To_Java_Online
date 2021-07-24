package com.epam.javaIntro.text;

import java.util.ArrayList;

public class Sentence {
	private StringBuilder sentence;
	
	public Sentence(String sentence) {
		this.sentence = new StringBuilder(sentence);
	}
	
	public Sentence(ArrayList<Word> words, String endOfSentence) {
		this.sentence = new StringBuilder("");
		for (int i = 0; i < words.size(); i++) {
			if (i == 0) {
				words.get(i).converFirstLetterToUppercase();
				this.sentence.append(words.get(i) + " ");
				continue;
			} else if (i == words.size() - 1) {
				words.get(i).converFirstLetterToLowercase();
				this.sentence.append(words.get(i) + endOfSentence);
			} else {
				words.get(i).converFirstLetterToLowercase();
				this.sentence.append(words.get(i) + " ");
			}	
		}
	}
	
	@Override
	public String toString() {
		return sentence.toString();
	}
	
	public StringBuilder getSentence() {
		return sentence;
	}
	
	public void setSentence(StringBuilder sentence) {
		this.sentence = sentence;
	}	
}
