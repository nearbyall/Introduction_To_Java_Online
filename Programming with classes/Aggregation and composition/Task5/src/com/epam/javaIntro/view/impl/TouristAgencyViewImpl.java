package com.epam.javaIntro.view.impl;

import java.util.Scanner;

import com.epam.javaIntro.bean.Client;
import com.epam.javaIntro.bean.TouristAgency;
import com.epam.javaIntro.bean.Voucher;
import com.epam.javaIntro.service.ServiceProvider;
import com.epam.javaIntro.view.TouristAgencyView;

public class TouristAgencyViewImpl implements TouristAgencyView {
	private ServiceProvider serviceProvider = ServiceProvider.getInstance();
	
	@Override
	public void addClientWithChoices(TouristAgency touristAgency, Client client) {
		Scanner in = new Scanner(System.in);
		String choise = "";
		while (!choise.equals("exit")) {
			System.out.println("Выберите путевку введя соответсвующую ей цифру.\n"
							 + "Чтобы отсортировать список по цене введите \"price\"\n"
							 + "Чтобы отсортировать список по кол-ву дней введите \"days\"\n"
							 + "Чтобы выйти введите \"exit\"\n");
			printVouchers(touristAgency);
			choise = in.nextLine();
			switch (choise) {
				case "price":
					serviceProvider.getTouristAgencyService().sortVouchersByPrice(touristAgency);
					printVouchers(touristAgency);
					break;
					
				case "days":
					serviceProvider.getTouristAgencyService().sortVouchersByCountOfDays(touristAgency);
					printVouchers(touristAgency);
					break;
					
				case "exit":
					break;
					
				default:
					if (Integer.parseInt(choise) > 0 && Integer.parseInt(choise) <= touristAgency.getVouchers().size()) {
						client.setVoucher(touristAgency.getVouchers().get(Integer.parseInt(choise) - 1));
						touristAgency.getClients().add(client);
						choise = "exit";
					} else {
						System.out.println("Вы ввели некоректное значение\n");
					}
			}
		}
		in.close();
	}

	@Override
	public void printVouchers(TouristAgency touristAgency) {
		int start = 1;
		for (Voucher voucher : touristAgency.getVouchers()) {
			System.out.println(start + ". " + voucher.getInfo());
			start++;
		}
	}

	@Override
	public void printClients(TouristAgency touristAgency) {
		for (Client client : touristAgency.getClients()) {
			System.out.println(client.getInfo());
		}
	}
	
}
