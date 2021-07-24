package com.epam.javaIntro.text;

import java.util.ArrayList;

public class Text {
	private String header;
	private StringBuilder text;
	
	public Text() {
		this.header = "nameless";
		this.text = new StringBuilder("");
	}
	
	public Text(String text, String header) {
		this.text = new StringBuilder(text);
		this.header = header;
	}
	
	public Text(ArrayList<Sentence> sentences, ArrayList<Word> header) {	
		this.text = new StringBuilder("");
		for (int i = 0; i < sentences.size(); i++) {
			this.text.append(sentences.get(i).toString() + " ");
		}
		
		Sentence headerSentence = new Sentence(header, "");
		this.header = headerSentence.toString();
	}
	
	@Override
	public String toString() {
		return String.format("\t\t%s\n%s", header, text.toString());
	}
	
	public void printText() {
		System.out.println(text.toString());
	}
	
	public void printHeader() {
		System.out.println("\t\t\t" + header);
	}
	
	public void addSentence(Sentence sentence) {
		text.append(sentence.toString() + " ");
	}
	
	public void addSentenceToNewParagraph(Sentence sentence) {
		text.append("\n    " + sentence.toString() + " ");
	}
	
	public String getHeader() {
		return header;
	}
	
	public void setHeader(String header) {
		this.header = header;
	}
}
