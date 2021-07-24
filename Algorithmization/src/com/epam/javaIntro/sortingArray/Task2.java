package com.epam.javaIntro.sortingArray;

/*
 * 2.Даны две последовательности a1<=a2<=3<=...<=an и b1<=b2<=b3<=...<=bn. 
 *   Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
 *   Примечание.Дополнительный массив не использовать.
 */

public class Task2 {
	public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 4, 5, 6, 7, 8, 16, 23};
        int[] arr2 = {3, 11, 13, 14, 15, 25};
        
        
        System.out.println("\nНовый массив: ");
        for (int i = 0; i < resultArray(arr1, arr2).length; i++) {
            System.out.print(resultArray(arr1, arr2)[i] + " ");
        }
    }

    private static int[] resultArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
        	result[i] = arr1[i];
        }
        
        for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
        	result[i] = arr2[i - arr1.length];
        }
        
        for (int i = 0; i < result.length; i++) {
        	for (int j = i + 1; j < result.length - 1; j++) {
        		if (result[i] > result[j]) {
        			int temp = result[i];
        			result[i] = result[j];
        			result[j] = temp;
        		}
        	}
        }
        
        return result;
    }
}
