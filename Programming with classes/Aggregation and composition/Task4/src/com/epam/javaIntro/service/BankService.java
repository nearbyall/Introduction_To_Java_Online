package com.epam.javaIntro.service;

import com.epam.javaIntro.bean.Bank;
import com.epam.javaIntro.bean.Client;

public interface BankService {
	Client getClientByPassportID(Bank bank, String passportID);
	void addClient(Bank bank, Client client);
}
