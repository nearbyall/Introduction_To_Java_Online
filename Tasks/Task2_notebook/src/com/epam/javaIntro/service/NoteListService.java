package com.epam.javaIntro.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.epam.javaIntro.bean.Note;
import com.epam.javaIntro.bean.NoteList;
import com.epam.javaIntro.builder.NoteBuilder;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.storage.TXTStorage;

public class NoteListService {
	
	public static boolean printNotes(ArrayList<Note> notes) {
        if(notes.size() != 0) {
            int page = 1;
            int notesOnPage = 5;
            int numberOfPages = notes.size() / notesOnPage + 1;
            while (page > 0 && page <= numberOfPages) {
                System.out.println("Страница " + page + " из " + numberOfPages + ":");
                int i = page * notesOnPage - notesOnPage;
                for (; i < page * notesOnPage && i < notes.size(); i++) {
                    System.out.print(i + 1 + " ");
                    System.out.println(notes.get(i).toString());
                }
                System.out.print("Введите номер страницы или 0 для выхода: ");
                page = Input.checkPageNumber();
            }
            return true;
        }
        return false;
	}
	
	public static Note createNote() {
		NoteBuilder noteBuilder = new NoteBuilder();
		System.out.println("Введите тему заметки: ");
		noteBuilder.setSubject(Input.checkInputSubject());
		System.out.println("Введите дату создания заметки: ");
		noteBuilder.setCreationDate(Input.checkInputDate());
		System.out.println("Введите email адрес создателя: ");
		noteBuilder.setEmail(Input.checkInputEmail());
		System.out.println("Введите содержимое заметки: ");
		noteBuilder.setMessage(Input.checkInputMessage());
		return noteBuilder.build();
	}
	
	public static boolean addNote(NoteList noteList) {
		Note note = createNote();
		if (!noteList.getNotes().contains(note)) {
			noteList.getNotes().add(note);
			TXTStorage.saveNotes(noteList.getNotes());
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean findNotes(NoteList noteList) {
		ArrayList<Note> notes = null;
		System.out.println("Введите 1 чтобы искать заметки по теме\n"
						 + "Введите 2 чтобы искать заметки по дате\n"
						 + "Введите 3 чтобы искать заметки по почте\n"
						 + "Введите 4 чтобы искать заметки по определенному слову\n"
						 + "Введите 5 чтобы искать заметки по теме и почте\n");
		int choise = Input.checkInputChoice();
		if (choise == 1) {
			System.out.println("Введите тему: ");
			notes = findNotesBySubject(noteList.getNotes(), Input.checkInputSubject());
		} else if (choise == 2) {
			System.out.println("Введите дату: ");
			notes = findNotesByDate(noteList.getNotes(), Input.checkInputDate());
		} else if (choise == 3) {
			System.out.println("Введите почту: ");
			notes = findNotesByEmail(noteList.getNotes(), Input.checkInputDate());
		} else if (choise == 4) {
			System.out.println("Введите слово: ");
			notes = findNotesByWordInMessage(noteList.getNotes(), Input.checkInputSubject());
		} else if (choise == 5) {
			System.out.println("Введите тему: ");
			notes = findNotesBySubject(noteList.getNotes(), Input.checkInputSubject());
			System.out.println("Введите почту: ");
			notes = findNotesByEmail(notes, Input.checkInputEmail());
		} else {
			return false;
		}
		if (notes.size() == 0) {
			System.out.println("Заметки не найдены"); 
		} else {
			System.out.println("Найденные заметки: ");
			printNotes(notes);
		}
		return true;
	}
	
	private static ArrayList<Note> findNotesBySubject(ArrayList<Note> notes, String subject) {
		ArrayList<Note> findedNotes = new ArrayList<Note>();
		for (Note note : notes) {
			if (note.getSubject().equalsIgnoreCase(subject)) {
				findedNotes.add(note);
			}
		}
		return findedNotes;
	}
	
	private static ArrayList<Note> findNotesByDate(ArrayList<Note> notes, String date) {
		ArrayList<Note> findedNotes = new ArrayList<Note>();
		for (Note note : notes) {
			if (note.getCreationDate().equalsIgnoreCase(date)) {
				findedNotes.add(note);
			}
		}
		sortNotesBySubject(notes);
		return findedNotes;
	}
	
	public static ArrayList<Note> findNotesByEmail(ArrayList<Note> notes, String email) {
		ArrayList<Note> findedNotes = new ArrayList<Note>();
		for (Note note : notes) {
			if (note.getEmail().equalsIgnoreCase(email)) {
				findedNotes.add(note);
			}
		}
		sortNotesBySubject(notes);
		return findedNotes;
	}
	
	public static ArrayList<Note> findNotesByWordInMessage(ArrayList<Note> notes, String word) {
		ArrayList<Note> findedNotes = new ArrayList<Note>();
		Pattern pattern = Pattern.compile(word);
		for (Note note : notes) {
			Matcher matcher = pattern.matcher(note.getMessage());
			if (matcher.find()) {
				findedNotes.add(note);
			}
		}
		sortNotesBySubject(notes);
		return findedNotes;
	}
	
	private static void sortNotesBySubject(ArrayList<Note> notes) {
		notes.sort(Comparator.comparing(Note::getSubject));
	}
}
