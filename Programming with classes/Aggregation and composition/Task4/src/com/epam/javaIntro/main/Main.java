package com.epam.javaIntro.main;

import com.epam.javaIntro.bean.Bank;
import com.epam.javaIntro.bean.BankAccount;
import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.service.ServiceProvider;
import com.epam.javaIntro.view.ViewProvider;

/*
 * 4.Счета. Клиент может иметь несколько счетов в банке.
 *   Учитывать возможность блокировки/разблокировки счета.
 *   Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам.
 *   Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */

public class Main {
	public static void main(String[] args) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		ViewProvider viewProvider = ViewProvider.getInstance();
		
		Bank bank = new Bank("Alfa-Bank");
		
		Client client = new Client("Шевцов", "Владислав", "MF2944400");
		
		BankAccount account1 = new BankAccount(81546732, 66);
		BankAccount account2 = new BankAccount(54738163, 12);
		BankAccount account3 = new BankAccount(94562819, -33);
		
		serviceProvider.getBankService().addClient(bank, client);
		
		serviceProvider.getClientService().addNewAccount(client, account1);
		serviceProvider.getClientService().addNewAccount(client, account2);
		serviceProvider.getClientService().addNewAccount(client, account3);
		
		serviceProvider.getClientService().sortByBalance(client);
		
		viewProvider.getClientView().printInformation(client);
	}
}
