package com.epam.javaIntro.touristVouchers;

/*
 * 5.Туристические путевки. Сформировать набор предложений клиенту по выбору туристической
 *   путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 *   Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */

public class Main {
	public static void main(String[] args) {
		TouristAgency agency = new TouristAgency("Agency");
		
		agency.addVoucher(new Voucher("Беларусь", 24, 299.99, VoucherType.EXCURSIONS, TransportType.BUS, FoodType.NOT_INCLUDET));
		agency.addVoucher(new Voucher("Швеция", 12, 499.99, VoucherType.REST, TransportType.MINIBUS, FoodType.BREAKFAST_ONLY));
		agency.addVoucher(new Voucher("Британия", 7, 399.99, VoucherType.SHOPPING, TransportType.PLANE, FoodType.NOT_INCLUDET));
		agency.addVoucher(new Voucher("Япония", 14, 799.99, VoucherType.CRUISE, TransportType.SHIP, FoodType.ALL_INCLUSIVE));
		agency.addVoucher(new Voucher("Китай", 28, 699.99, VoucherType.TREATMENT, TransportType.TRAIN, FoodType.BREAKFAST_ONLY));
		
		Client client = new Client("Мельников", "Владислав");
		agency.addClientWithChoices(client);
		
		agency.printClients();
	}
}
