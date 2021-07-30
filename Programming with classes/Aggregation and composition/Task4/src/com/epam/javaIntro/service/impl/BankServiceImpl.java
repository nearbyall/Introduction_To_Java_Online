package com.epam.javaIntro.service.impl;

import com.epam.javaIntro.bean.Bank;
import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.service.BankService;

public class BankServiceImpl implements BankService {

	@Override
	public Client getClientByPassportID(Bank bank, String passportID) {
		for (Client client : bank.getClients()) {
			if (client.getPassportID().equals(passportID)) {
				return client;
			}
		}
		return null;
	}

	@Override
	public void addClient(Bank bank, Client client) {
		bank.getClients().add(client);
	}

}
