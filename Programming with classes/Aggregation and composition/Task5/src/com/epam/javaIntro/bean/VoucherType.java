package com.epam.javaIntro.bean;

public enum VoucherType {
	REST("Отдых"),
	EXCURSIONS("Экскурсия"),
	TREATMENT("Лечение"),
	SHOPPING("Шопинг"),
	CRUISE("Круиз");
	
	private final String value;

    private VoucherType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
