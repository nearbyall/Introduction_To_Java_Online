package MultiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */


public class Task3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во строк матрицы: ");
        int N = in.nextInt();
        System.out.println("Введите кол-во столбцов матрицы: ");
        int M = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][M];

        System.out.println("Сгенерированная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrixA[i][j] = (int) (Math.random() * 100) - 50;
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nНомер строки, которую необходимо вывести: ");
        int K = in.nextInt();
        System.out.println("\nНомер столбца, который необходимо вывести: ");
        int L = in.nextInt();

        System.out.println("\nСтрока: ");
        for (int j = 0; j < M; j++) {
            System.out.printf("%3d ", matrixA[K - 1][j]);
        }
        System.out.println("\nСтолбец: ");
        for (int i = 0; i < N; i++) {
            System.out.printf("\n%3d", matrixA[i][L - 1]);
        }
        in.close();

    }
}
