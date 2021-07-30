package com.epam.javaIntro.service.impl;

import java.util.Comparator;

import com.epam.javaIntro.bean.BankAccount;
import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.service.ClientService;

public class ClientServiceImpl implements ClientService {

	@Override
	public void addNewAccount(Client client, BankAccount account) {
		client.getClientAccounts().add(account);
	}

	@Override
	public BankAccount getAccountById(Client client, int id) {
		for (BankAccount account : client.getClientAccounts()) {
			if (account.getId() == id) {
				return account;
			}
		}
		return null;
	}

	@Override
	public void unlockAccountById(Client client, int id) {
		for (BankAccount account : client.getClientAccounts()) {
			if (account.getId() == id) {
				account.unlockAccount();
			}
		}
	}

	@Override
	public void blockAccountById(Client client, int id) {
		for (BankAccount account : client.getClientAccounts()) {
			if (account.getId() == id) {
				account.blockAccount();
			}
		}
	}

	@Override
	public void sortByBalance(Client client) {
		client.getClientAccounts().sort(Comparator.comparing(BankAccount::getBalance));
	}

	@Override
	public double getBalance(Client client) {
		double balance = 0;
		for (BankAccount account : client.getClientAccounts()) {
			balance += account.getBalance();
		}
		return balance;
	}

	@Override
	public double getNegativeBalances(Client client) {
		double balance = 0;
		for (BankAccount account : client.getClientAccounts()) {
			if (account.getBalance() < 0) {
				balance += account.getBalance();
			}

		}
		return balance;
	}

	@Override
	public double getPositiveBalances(Client client) {
		double balance = 0;
		for (BankAccount account : client.getClientAccounts()) {
			if (account.getBalance() > 0) {
				balance += account.getBalance();
			}

		}
		return balance;
	}

}
