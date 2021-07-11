package com.epam.javaIntro.touristVouchers;

public enum TransportType {
	PLANE("Самолет"),
	BUS("Автобус"),
	MINIBUS("Маршрутка"),
	SHIP("Корабль"),
	TRAIN("Поезд");
	
	private final String value;

    private TransportType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
