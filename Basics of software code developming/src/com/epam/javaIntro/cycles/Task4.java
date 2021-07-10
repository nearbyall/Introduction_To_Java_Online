package com.epam.javaIntro.cycles;

import java.math.BigInteger;

/*
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {
	public static void main(String[] args) {
		BigInteger result = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++) {
            result = result.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println("Результат произведения квадратов первых двухста чисел: " + result);
	}
}
