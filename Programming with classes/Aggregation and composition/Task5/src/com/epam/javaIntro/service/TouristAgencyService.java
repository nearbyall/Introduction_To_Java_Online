package com.epam.javaIntro.service;

import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.bean.TouristAgency;
import com.epam.javaIntro.bean.Voucher;

public interface TouristAgencyService {
	void addVoucher(TouristAgency touristAgency, Voucher voucher);
	void sortVouchersByPrice(TouristAgency touristAgency);
	void sortVouchersByCountOfDays(TouristAgency touristAgency);
	void addClient(TouristAgency touristAgency, Client client, Voucher voucher);
}
