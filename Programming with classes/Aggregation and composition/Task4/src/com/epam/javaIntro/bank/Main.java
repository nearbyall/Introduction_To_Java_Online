package com.epam.javaIntro.bank;

/*
 * 4.Счета. Клиент может иметь несколько счетов в банке.
 *   Учитывать возможность блокировки/разблокировки счета.
 *   Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 *   Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
	public static void main(String[] args) {
		//Создание банка
		Bank bank = new Bank("Alfa-Bank");
		
		//Создание клиентов и счетов
		Client client1 = new Client("Мельников", "Владислав", "MC9482788");
		Client client2 = new Client("Ярмуш", "Иван", "MC6534788");
		Client client3 = new Client("Щекотов", "Никита", "MC9476548");
		
		client1.addNewAccount(new BankAccount(1, 306.90));
		client1.addNewAccount(new BankAccount(2, 115.30));
		client1.addNewAccount(new BankAccount(3, -206.90));
		
		client2.addNewAccount(new BankAccount(4, 117.99));
		client2.addNewAccount(new BankAccount(5, 123.99));
		client2.addNewAccount(new BankAccount(6, 427.92));
		
		client3.addNewAccount(new BankAccount(7, -15.78));
		client3.addNewAccount(new BankAccount(8, 796.30));
		client3.addNewAccount(new BankAccount(9, -205.23));
		
		//Занесение клиентов в банк
		bank.addClient(client1);
		bank.addClient(client2);
		bank.addClient(client3);
		
		//Проверка
		bank.getClientByPassportID("MC6534788").blockAccountById(5);
		bank.getClientByPassportID("MC6534788").printInformation();
		bank.getClientByPassportID("MC6534788").sortByBalance();
		bank.getClientByPassportID("MC6534788").printInformation();
		System.out.printf("%s\n"
						+ "%s\n"
						+ "%s\n",
						bank.getClientByPassportID("MC6534788").getBalance(),
						bank.getClientByPassportID("MC6534788").getPositiveBalances(),
						bank.getClientByPassportID("MC6534788").getNegativeBalances());
	}
}
