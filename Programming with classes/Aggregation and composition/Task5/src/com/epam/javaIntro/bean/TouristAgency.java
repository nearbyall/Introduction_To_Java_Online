package com.epam.javaIntro.bean;

import java.util.ArrayList;
import java.util.List;

public class TouristAgency {
	private String name;
	private List<Client> clients;
	private List<Voucher> vouchers;
	
	public TouristAgency() {
		this.name = "";
		this.clients = new ArrayList<Client>();
		this.vouchers = new ArrayList<Voucher>();
	}
	
	public TouristAgency(String name) {
		this.name = name;
		this.clients = new ArrayList<Client>();
		this.vouchers = new ArrayList<Voucher>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(ArrayList<Voucher> vouchers) {
		this.vouchers = vouchers;
	}	

	@Override
	public String toString() {
		return "TouristAgency [name=" + name + ", clients=" + clients + ", vouchers=" + vouchers + "]";
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
}
