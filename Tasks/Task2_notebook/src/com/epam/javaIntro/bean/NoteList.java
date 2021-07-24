package com.epam.javaIntro.bean;

import java.util.ArrayList;

public class NoteList {
	private ArrayList<Note> notes;
	
	public NoteList() {
		this.notes = new ArrayList<Note>();
	}

	public NoteList(ArrayList<Note> notes) {
		this.notes = notes;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
}
