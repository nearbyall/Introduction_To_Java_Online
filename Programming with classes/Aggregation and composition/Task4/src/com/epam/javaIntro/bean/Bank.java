package com.epam.javaIntro.bean;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private String name;
	private List<Client> clients;
	
	public Bank() {
		this.name = "";
		this.clients = new ArrayList<Client>();
	}
	
	public Bank(String name) {
		this.name = name;
		this.clients = new ArrayList<Client>();
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
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [name=" + name + ", clients=" + clients + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Bank other = (Bank) obj;
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
		return true;
	}
	
}
