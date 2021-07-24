package com.epam.javaIntro.sortingArray;

/*
 * 6.Сортировка Шелла. Дан  массив n действительных  чисел.  Требуется  упорядочить  его  по  возрастанию.
 *   Делается это следующим образом: сравниваются два соседних элемента ai и a(i+1). Если ai<=a(i+1), 
 *   то продвигаются на один элемент вперед. Если ai > a(i+1), то производится перестановка
 *   и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.
 */

public class Task6 {
	public static void main(String[] args) {
		int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		System.out.println("\nМассив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
		
        int i = 1;
        while (i < array.length) {
        	if (array[i - 1] > array[i]) {
        		int temp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = temp;
				if (i - 1 > 0) {
                    i--;
                }
        	} else {
        		i++;
        	}
        }
		
		System.out.println("\nМассив отсортированный методом Шелла: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
	}
}
