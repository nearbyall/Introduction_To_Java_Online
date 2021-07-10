package com.epam.javaIntro.sortingArray;

/*
 * 3. Сортировка выбором. Дана последовательность чисел (неубывающая). Требуется
 * переставить элементы так, чтобы они были расположены по убыванию. Для этого
 * в массиве, начиная с первого, выбирается наибольший элемент и ставится на
 * первое место, а первый - на место наибольшего. Затем, начиная со второго,
 * эта процедура повторяется. Написать алгоритм сортировки выбором. 
 */

public class Task3 {
	public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("\nМассив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            int biggestIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] > array[biggestIndex]) {
                    biggestIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[biggestIndex];
            array[biggestIndex] = temp;
        }

        System.out.println("\nОтсортированный методом выбора по убыванию массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
