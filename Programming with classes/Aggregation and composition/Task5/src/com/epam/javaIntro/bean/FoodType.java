package com.epam.javaIntro.bean;

public enum FoodType {
	ALL_INCLUSIVE("Все включено"),
    BREAKFAST_ONLY("Только завтрак"),
    NOT_INCLUDET("Не включено");
    
    private final String value;

    private FoodType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
