package com.epam.javaIntro.sortingArray;

/*
 * 4.Сортировка  обменами. Дана  последовательность  чисел a1>=a2>=a3>=...>=an.
 *   Требуется  переставить  числа  в порядке  возрастания. 
 *   Для  этого  сравниваются  два  соседних  числа ai и a(i+1). 
 *   Если ai > a(i+1),  то  делается перестановка.
 *   Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 *   Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */

public class Task4 {
	public static void main(String[] args) {
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println("\nМассив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
        	for (int j = 0; j < array.length - 1; j++) {
        		if (array[j] > array[j + 1]) {
        			int temp = array[j];
        			array[j] = array[j + 1];
        			array[j + 1] = temp;
        			count++;
        		}
        	}
        }
        
        System.out.println("\nМассив отсортированный методом обмена: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("Кол-во замен: " + count);
	}
}
