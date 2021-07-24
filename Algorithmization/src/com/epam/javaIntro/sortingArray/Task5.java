package com.epam.javaIntro.sortingArray;

/*
 * 5.Сортировка вставками.Дана последовательность чисел a1, a1, a3, ..., an. Требуется переставить числа в порядке возрастания.
 *   Делается это следующим образом. Пусть a1, a1, a3, ..., an - упорядоченная последовательность, т. е. a1<=a2<=a3<=...<=an.
 *   Берется  следующее  число a(i+1) и  вставляется  в  последовательность  так,  чтобы  новая последовательность была тоже возрастающей.
 *   Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны. 
 *   Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
 *   Двоичный поиск оформить в виде отдельной функции.
 */

public class Task5 {
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 6, 10, 9, 8, 1, 5, 12, 16, 15};
		
		 int temp;
	     for (int i = 1; i < array.length - 1; i++) {
	        if (array[i] > array[i + 1]) {
	            temp = array[i + 1];
	            int j = bynSearch(array, i, array[i + 1]);
	            for (int k = i + 1; k > j; k--) {
	                array[k] = array[k - 1];
	            }
	            array[j] = temp;
	        }
	    }
	     
	    System.out.println("\nМассив отсортированный методом вставки: ");
	    for (int i = 0; i < array.length; i++) {
	        System.out.print(array[i] + " ");
	    }
	}
	
	private static int bynSearch (int [] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
}
