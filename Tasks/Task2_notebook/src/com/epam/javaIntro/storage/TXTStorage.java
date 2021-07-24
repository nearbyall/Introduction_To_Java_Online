package com.epam.javaIntro.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.epam.javaIntro.bean.Note;
import com.epam.javaIntro.builder.NoteBuilder;

public class TXTStorage {
	private static String notesFile = "resources/notes.txt";
	
	public static ArrayList<Note> loadNotes() {
    	String line;
        String splitBy = ",";
        ArrayList<Note> notes = new ArrayList<Note>();
        try (BufferedReader br = new BufferedReader(new FileReader(notesFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                Note note = new NoteBuilder()
                			   .withSubject(data[0])
                			   .withCreationDate(data[1])
                			   .withEmail(data[2])
                			   .withMessage(data[3])
                			   .build();   
                notes.add(note);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return notes;
    }
    
    public static void saveNotes(ArrayList<Note> notes) {
    	try (BufferedWriter bw = new BufferedWriter(new FileWriter(notesFile))) {
            for (Note note : notes) {
                StringBuilder sb = new StringBuilder();
                sb.append(note.getSubject());
                sb.append(",");
                sb.append(note.getCreationDate());
                sb.append(",");
                sb.append(note.getEmail());
                sb.append(",");
                sb.append(note.getMessage());
                bw.write(sb.toString());
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
