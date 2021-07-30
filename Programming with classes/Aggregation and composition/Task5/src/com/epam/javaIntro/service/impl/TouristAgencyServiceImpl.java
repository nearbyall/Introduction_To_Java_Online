package com.epam.javaIntro.service.impl;

import java.util.Comparator;

import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.bean.TouristAgency;
import com.epam.javaIntro.bean.Voucher;
import com.epam.javaIntro.service.TouristAgencyService;

public class TouristAgencyServiceImpl implements TouristAgencyService {

	@Override
	public void addVoucher(TouristAgency touristAgency, Voucher voucher) {
		touristAgency.getVouchers().add(voucher);	
	}

	@Override
	public void sortVouchersByPrice(TouristAgency touristAgency) {
		touristAgency.getVouchers().sort(Comparator.comparing(Voucher::getPrice));
	}

	@Override
	public void sortVouchersByCountOfDays(TouristAgency touristAgency) {
		touristAgency.getVouchers().sort(Comparator.comparing(Voucher::getCountOfDays));
	}

	@Override
	public void addClient(TouristAgency touristAgency, Client client, Voucher voucher) {
		client.setVoucher(voucher);
		touristAgency.getClients().add(client);
	}
	
}
