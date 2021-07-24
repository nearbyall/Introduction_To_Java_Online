package com.epam.javaIntro.consoleAction;

public class Menu {
	private MenuActions menuActions = new MenuActions();
	
	public void startMenu() {
		int choise;
		boolean isStopped = false;
		menuActions.printOptions();
		while (!isStopped) {
			System.out.println("Введите номер нужной операции: ");
			choise = menuActions.makeChoice();
			isStopped = menuActions.processingOperation(choise);
		}
	}
}
