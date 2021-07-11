package com.epam.javaIntro.touristVouchers;

public class Voucher {
	private String country;
	private int countOfDays;
	private double price;
	VoucherType voucherType;
	TransportType transportType;
	FoodType foodType;
	
	public Voucher(String country, int countOfDays, double price, VoucherType voucherType, TransportType transportType, FoodType foodType) {
		this.country = country;
		this.countOfDays = countOfDays;
		this.price = price;
		this.voucherType = voucherType;
		this.transportType = transportType;
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return String.format("Путевка\n"
						   + "Cтрана: %s\n"
						   + "Кол-во дней: %d\n"
						   + "Цена: %.2f $\n"
						   + "Вид путевки: %s\n"
						   + "Вид транспорта: %s\n"
						   + "Вид питания: %s\n",
						   country, countOfDays, price, voucherType.getValue(), transportType.getValue(), foodType.getValue());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countOfDays;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((transportType == null) ? 0 : transportType.hashCode());
		result = prime * result + ((voucherType == null) ? 0 : voucherType.hashCode());
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
		Voucher other = (Voucher) obj;
		if (countOfDays != other.countOfDays)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (foodType != other.foodType)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (transportType != other.transportType)
			return false;
		if (voucherType != other.voucherType)
			return false;
		return true;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getCountOfDays() {
		return countOfDays;
	}

	public void setCountOfDays(int countOfDays) {
		this.countOfDays = countOfDays;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public VoucherType getVoucherType() {
		return voucherType;
	}

	public void setVoucherType(VoucherType voucherType) {
		this.voucherType = voucherType;
	}

	public TransportType getTransportType() {
		return transportType;
	}

	public void setTransportType(TransportType transportType) {
		this.transportType = transportType;
	}

	public FoodType getFoodType() {
		return foodType;
	}

	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
}
