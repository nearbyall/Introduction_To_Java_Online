package com.epam.javaIntro.sortingArray;

/*
 * 7.Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm.
 *   Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в
 *   первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */

public class Task7 {
	public static void main(String[] args) {
		int[] array1 = {1, 3, 6, 7, 8, 11, 34, 55, 66, 77, 89, 98, 115};
		int[] array2 = {5, 9, 10, 25, 38, 69, 99};
		int[] result = new int[array1.length + array2.length];
		int[] insertionPoints = new int[array2.length];
		
		System.out.println("\nМассив 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        
        System.out.println("\nМассив 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
		
        int i, j, k;
        for (i = j = k = 0; i < array1.length && j < array2.length; k++) {
        	  if (array1[i] < array2[j]) {
        	    result[k] = array1[i];
        	    i++;
        	  } else {
        		insertionPoints[j] = i + 1;
        	    result[k] = array2[j];
        	    j++;
        	  }
        }

        for (; i < array1.length; i++, k++) {
        	result[k] = array1[i];
        }

        for (; j < array2.length; j++, k++) {
        	insertionPoints[j] = i;
        	result[k] = array2[j];
        }

        System.out.println("\nНовый массив: ");
        for (int m = 0; m < result.length; m++) {
            System.out.print(result[m] + " ");
        }
	}
}
