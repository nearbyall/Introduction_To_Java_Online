package com.epam.javaIntro.sortingArray;

import java.util.Arrays;

/*
 * 2.Даны две последовательности (неубывающие). Образовать из них новую
 * последовательность чисел так, чтобы она тоже была неубывающей.
 * Примечание. Дополнительный массив не использовать. 
 */

public class Task2 {
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {10, 11, 12, 13, 14, 15, 16};
        System.out.println(Arrays.toString(resultArray(arr1, arr2)));
    }

    private static int[] resultArray(int[] arr1, int[] arr2) {
        if (arr1 == null && arr2 == null) return null;
        if (arr1 == null) return arr2;
        if (arr2 == null) return arr1;
        if (arr1.length == 0) return arr2;
        if (arr2.length == 0) return arr1;

        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);

        return result;
    }
}
