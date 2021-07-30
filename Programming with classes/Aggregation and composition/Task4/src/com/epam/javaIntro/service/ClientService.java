package com.epam.javaIntro.service;

import com.epam.javaIntro.bean.BankAccount;
import com.epam.javaIntro.bean.Client;

public interface ClientService {
	void addNewAccount(Client client, BankAccount account);
	BankAccount getAccountById(Client client, int id);
	void unlockAccountById(Client client, int id);
	void blockAccountById(Client client, int id);
	void sortByBalance(Client client);
	double getBalance(Client client);
	double getNegativeBalances(Client client);
	double getPositiveBalances(Client client);
}
