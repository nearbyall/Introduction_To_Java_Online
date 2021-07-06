package MultiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

public class Task2 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность квадратной матрицы матрицы: ");
        int N = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][N];

        System.out.println("Сгенерированная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = (int) (Math.random() * 100) - 50;
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nЭлементы стоящие на диагонали матрицы: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    System.out.printf("%3d ", matrixA[i][j]);
                }
            }
        }
        in.close();
    }
}
