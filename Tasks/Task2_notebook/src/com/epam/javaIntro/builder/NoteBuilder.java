package com.epam.javaIntro.builder;

import com.epam.javaIntro.bean.Note;

public class NoteBuilder {
	private String subject;
	private String creationDate;
	private String email;
	private String message;
	
	public NoteBuilder() {
		this.subject = "";
		this.creationDate = "";
		this.email = "";
		this.message = "";
	}
	
	public NoteBuilder withSubject(String subject) {
		this.subject = subject;
		return this;
	}
	
	public NoteBuilder withCreationDate(String creationDate) {
		this.creationDate = creationDate;
		return this;
	}
	
	public NoteBuilder withEmail(String email) {
		this.email = email;
		return this;
	}
	
	public NoteBuilder withMessage(String message) {
		this.message = message;
		return this;
	}
	
	public Note build() {
		return new Note(this);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
