package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 6.Задана последовательность Nвещественных чисел.
 *   Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива N: ");
        int N = in.nextInt();
        
        double[] array = new double[N];
        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < N; i++) {
            array[i] = (Math.random() * 100 - 50);
            System.out.printf("%.2f ", array[i]);
        }
        
        double sum = 0;
        for (int i =0;i<N;i++) {
        	//Проверка, является
        	boolean isSimple = true;
        	for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                	isSimple = false;
                }
            }
            if (isSimple) {
                sum += array[i];
            }
        }
        System.out.printf("\nСумма чисел, порядковые номера которых являются простыми числами: %.2f", sum);
        
        in.close();
    }
}
