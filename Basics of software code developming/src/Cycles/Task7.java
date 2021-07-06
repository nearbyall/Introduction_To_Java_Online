package Cycles;

import java.util.Scanner;

/*
 * 7. Для каждого натурального числа в промежутке от mдо nвывести все делители, 
 * кроме единицы и самого числа. mи nвводятся с клавиатуры.
 */

public class Task7 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение переменной m: ");
        int m = in.nextInt();
        System.out.print("Введите значение переменной n: ");
        int n = in.nextInt();
        if (m > 0 && n > 0 && m < n) {
            for (int i = m; i <= n; i++) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        System.out.println("Число " + i + " Делитель " + j);
                    }
                }
            }
        } else {
            System.out.println("Вы ввели неверный значения границ m и n.");
        }
        in.close();
    }
}
