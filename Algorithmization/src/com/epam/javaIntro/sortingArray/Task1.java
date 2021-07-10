package com.epam.javaIntro.sortingArray;

import java.util.Scanner;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k.
 *  Объединить их в один  массив,  включив  второй  массив  между k-м  и  (k+1)-м  элементами  первого, 
 *  при  этом  не  используя дополнительный массив.
 */

public class Task1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrayA = new int[]{1, 8, 3, 4, 5, 6};
        int[] arrayB = new int[]{7, 8, 9, 0};

        System.out.println("Введите число натуральное число K: ");
        int K = in.nextInt();

        int[] resultArray = resultArray(arrayA, arrayB, K);
        System.out.println("\nНовый массив: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        in.close();
    }

    public static int[] resultArray(int[] a, int[] b, int i) {
        int aLenght = a.length;
        int bLenght = b.length;
        int[] c = new int[aLenght + bLenght];

        System.arraycopy(a, 0, c, 0, aLenght);
        System.arraycopy(b, 0, c, aLenght, bLenght);

        int shift;
        for (int index = 0; index < bLenght; index++) {
            shift = index + i;
            int temp = c[shift];
            c[shift] = c[shift + bLenght];
            c[shift + bLenght] = temp;
        }

        return c;
    }
}
