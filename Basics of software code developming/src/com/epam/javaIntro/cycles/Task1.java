package com.epam.javaIntro.cycles;

import java.util.Scanner;

/*
 * 1.Напишите программу, где пользователь вводит любое целое положительное число.
 *   А программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число A: ");
        int A = in.nextInt();
        
        if (A > 0) {
            int sum = 0;
            for (int i = 0; i <= A; i++) {
                sum += i;
            }
            System.out.println("Сумма: " + sum);
        } else {
            System.out.println("Вы ввели некоректное число");
        }
        
        in.close();
	}
}
