package com.epam.javaIntro.oneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 2.Дана последовательность действительных чисел а1,а2 ,..., аn.
 *   Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */

public class Task2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива N: ");
        int N = in.nextInt();
        System.out.println("Введите число Z");
        int Z = in.nextInt();
        
        int[] nums = new int[N];
        System.out.println("Сгенерированный массив: ");
        for (int i = 0; i < N; i++) {
            nums[i] = (int) (Math.random() * 100);
            System.out.print(nums[i] + " ");
        }
        
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] > Z) {
                nums[i] = Z;
                count++;
            }

        }
        
        System.out.println("\nИзмененный массив: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println("\nКол-во замен: " + count);
        
        in.close();
	}
}
