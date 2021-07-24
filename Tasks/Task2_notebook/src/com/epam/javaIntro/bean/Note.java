package com.epam.javaIntro.bean;

import com.epam.javaIntro.builder.NoteBuilder;

public class Note {
	private String subject;
	private String creationDate;
	private String email;
	private String message;
	
	public Note() {
		this.subject = "";
		this.creationDate = "";
		this.email = "";
		this.message = "";
	}
	
	public Note(String subject, String creationDate, String email, String message) {
		this.subject = subject;
		this.creationDate = creationDate;
		this.email = email;
		this.message = message;
	}
	
	public Note(NoteBuilder noteBuilder) {
		this.subject = noteBuilder.getSubject();
		this.creationDate = noteBuilder.getCreationDate();
		this.email = noteBuilder.getEmail();
		this.message = noteBuilder.getMessage();
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

	@Override
	public String toString() {
		return String.format("Тема: %s\n"
						   + "Дата создания: %s\n"
						   + "Почта: %s\n"
						   + "Сообщение: %s\n",
						   subject, creationDate, email, message);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
}
