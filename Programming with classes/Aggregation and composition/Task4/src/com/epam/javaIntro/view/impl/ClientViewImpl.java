package com.epam.javaIntro.view.impl;

import com.epam.javaIntro.bean.BankAccount;
import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.view.ClientView;

public class ClientViewImpl implements ClientView {

	@Override
	public void printInformation(Client client) {
		System.out.println("Пользователь " + client.getFirstName() + " " + client.getLastName() + " имеет аккаунты: ");
		for (BankAccount account : client.getClientAccounts()) {
			System.out.println(account.getInfo());
		}
	}

}
