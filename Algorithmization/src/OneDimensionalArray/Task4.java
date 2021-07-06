package OneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 4. Даны действительные числа а1,а2,..., а(n). Поменять местами наибольший и наименьший элементы.
 */

public class Task4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int N = in.nextInt();
        int[] array = new int[N];
        System.out.println("Сгенерированный массив N элементов: ");
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
            System.out.print(array[i] + " ");
        }
        int smallestIndex = 0;
        int biggestIndex = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] > array[biggestIndex]) {
                biggestIndex = i;
            }
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        int temp = array[smallestIndex];
        array[smallestIndex] = array[biggestIndex];
        array[biggestIndex] = temp;
        System.out.println("\nИзмененный массив N элементов: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        in.close();
	}
}
