package com.epam.javaIntro.bean;

import java.util.List;
import java.util.ArrayList;

public class ListOfCustomers {
	private List<Customer> base;
	
	public ListOfCustomers() {
		this.base =  new ArrayList<Customer>();
	}
	
	public ListOfCustomers(ArrayList<Customer> base) {
		this.base = base;
	}

	public List<Customer> getBase() {
		return base;
	}

	public void setBase(ArrayList<Customer> base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [base=" + base + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((base == null) ? 0 : base.hashCode());
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
		ListOfCustomers other = (ListOfCustomers) obj;
		if (base == null) {
			if (other.base != null)
				return false;
		} else if (!base.equals(other.base))
			return false;
		return true;
	}
}
