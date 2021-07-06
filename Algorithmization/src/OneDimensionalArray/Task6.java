package OneDimensionalArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 6. Задана последовательность Nвещественных чисел. 
 * Вычислить сумму чисел, порядковые номера которых являются простыми числами.
 */

public class Task6 {
	public static boolean Simple(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во элементов массива: ");
        int N = in.nextInt();
        double[] array = new double[N];
        System.out.println("Сгенерированный массив N элементов: ");
        for (int i = 0; i < N; i++) {
            array[i] = (Math.random() * 100 - 50); // Случайная числовая последовательность
            System.out.print(array[i] + " ");
        }
        double sum = 0;
        for (int i =0;i<N;i++) {
            if (Simple(i)) {
                sum += array[i];
            }
        }
        System.out.println("\nСумма элементов порядковый номер которых является простым числом: " + sum);
        in.close();
    }
}
