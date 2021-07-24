package com.epam.javaIntro.mainAction;

import com.epam.javaIntro.bean.NoteList;
import com.epam.javaIntro.input.Input;
import com.epam.javaIntro.service.NoteListService;
import com.epam.javaIntro.storage.TXTStorage;

public class MainMenu {
private static NoteList noteList = null;
	
	public static void start() {
		noteList = new NoteList();
		noteList.setNotes(TXTStorage.loadNotes());
		System.out.println("Добро пожаловать в блокнот!");
		while (true) {
			System.out.println(getMainOptions());
			int option = Input.checkInputMainChoice();
			if (option != 0) {
				performOperation(option);
			} else {
				System.out.println("Досвидания, завершение работы.");
				TXTStorage.saveNotes(noteList.getNotes());
				return;
			}
		}
	}
	
	private static String getMainOptions() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nДоступные опции:\n").append("1. Вывести заметки.\n");
        sb.append("2. Найти заметки по параметрам в отсортированном виде.\n");
        sb.append("3. Добавить заметку\n");
        sb.append("0. Закончить работу\n");
        return sb.toString();
    }
	
	private static void performOperation(int option) {
        switch (option) {
            case 1:
                if (NoteListService.printNotes(noteList.getNotes())){
                        System.out.println("Заметок нет.\n");
                }
                break;
            case 2:
                while (!NoteListService.findNotes(noteList)) {
                    System.out.println("Ошибка, повторите еще раз.");
                }
                break;
            case 3:
            	if (NoteListService.addNote(noteList)) {
                    System.out.println("Заметка успешно добавлена.");
                } else {
                    System.out.println("Заметека уже есть в базе.\n");
                }
                break;
        }
	}
}
