package com.epam.javaIntro.touristVouchers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TouristAgency {
	private String name;
	private ArrayList<Client> clients;
	private ArrayList<Voucher> vouchers;
	
	public TouristAgency(String name) {
		super();
		this.name = name;
		this.clients = new ArrayList<Client>();
		this.vouchers = new ArrayList<Voucher>();
	}

	@Override
	public String toString() {
		return "Туристическое агенство: " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((vouchers == null) ? 0 : vouchers.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouristAgency other = (TouristAgency) obj;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vouchers == null) {
			if (other.vouchers != null)
				return false;
		} else if (!vouchers.equals(other.vouchers))
			return false;
		return true;
	}

	public void addVoucher(Voucher voucher) {
		vouchers.add(voucher);
	}
	
	public void printVouchers() {
		int start = 1;
		for (Voucher voucher : vouchers) {
			System.out.println(start + ". " + voucher.toString());
			start++;
		}
	}
	
	public void sortVouchersByPrice() {
		vouchers.sort(Comparator.comparing(Voucher::getPrice));
	}
	
	public void sortVouchersByCountOfDays() {
		vouchers.sort(Comparator.comparing(Voucher::getCountOfDays));
	}
	
	public void addClient(Client client, Voucher voucher) {
		client.setVoucher(voucher);
		clients.add(client);
	}
	
	public void addClientWithChoices(Client client) {
		Scanner in = new Scanner(System.in);
		String choise = "";
		while (!choise.equals("exit")) {
			System.out.println("Выберите путевку введя соответсвующую ей цифру.\n"
							 + "Чтобы отсортировать список по цене введите \"price\"\n"
							 + "Чтобы отсортировать список по кол-ву дней введите \"days\"\n"
							 + "Чтобы выйти введите \"exit\"\n");
			printVouchers();
			choise = in.nextLine();
			switch (choise) {
				case "price":
					sortVouchersByPrice();
					printVouchers();
					break;
					
				case "days":
					sortVouchersByCountOfDays();
					printVouchers();
					break;
					
				case "exit":
					break;
					
				default:
					if (Integer.parseInt(choise) > 0 && Integer.parseInt(choise) <= vouchers.size()) {
						client.setVoucher(vouchers.get(Integer.parseInt(choise) - 1));
						clients.add(client);
						choise = "exit";
					} else {
						System.out.println("Вы ввели некоректное значение\n");
					}
			}
		}
		in.close();
	}
	
	public void printClients() {
		for (Client client : clients) {
			System.out.println(client.toString());
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public ArrayList<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}	
}
