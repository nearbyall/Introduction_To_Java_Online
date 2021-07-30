package com.epam.javaIntro.main;

import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.bean.FoodType;
import com.epam.javaIntro.bean.TouristAgency;
import com.epam.javaIntro.bean.TransportType;
import com.epam.javaIntro.bean.Voucher;
import com.epam.javaIntro.bean.VoucherType;
import com.epam.javaIntro.service.ServiceProvider;
import com.epam.javaIntro.view.ViewProvider;

/*
 * 5.Туристические путевки. Сформировать набор предложений клиенту по выбору туристической
 *   путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 *   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {
	public static void main(String[] args) {
		ServiceProvider serviceProvider = ServiceProvider.getInstance();
		ViewProvider viewProvider = ViewProvider.getInstance();
		
		TouristAgency agency = new TouristAgency("Agency");
		
		serviceProvider.getTouristAgencyService()
					   .addVoucher(agency, new Voucher("Беларусь", 24, 299.99, VoucherType.EXCURSIONS, TransportType.BUS, FoodType.NOT_INCLUDET));
		serviceProvider.getTouristAgencyService()
						.addVoucher(agency, new Voucher("Швеция", 12, 499.99, VoucherType.REST, TransportType.MINIBUS, FoodType.BREAKFAST_ONLY));
		serviceProvider.getTouristAgencyService()
						.addVoucher(agency, new Voucher("Британия", 7, 399.99, VoucherType.SHOPPING, TransportType.PLANE, FoodType.NOT_INCLUDET));
		serviceProvider.getTouristAgencyService()
						.addVoucher(agency, new Voucher("Япония", 14, 799.99, VoucherType.CRUISE, TransportType.SHIP, FoodType.ALL_INCLUSIVE));
		serviceProvider.getTouristAgencyService()
						.addVoucher(agency, new Voucher("Китай", 28, 699.99, VoucherType.TREATMENT, TransportType.TRAIN, FoodType.BREAKFAST_ONLY));
		
		Client client = new Client("Мельников", "Владислав");
		
		viewProvider.getTouristAgencyView().addClientWithChoices(agency, client);
	}
}
