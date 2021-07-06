package MultiArray;

import java.util.Scanner;

/*
 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task12 {
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
                matrixA[i][j] = (int) (Math.random() * 100 - 50);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < M - 1; i++) {
                for (int j = 0; j < M - i - 1; j++) {
                    if (matrixA[k][j] > matrixA[k][j + 1]) {
                        int temp = matrixA[k][j];
                        matrixA[k][j] = matrixA[k][j + 1];
                        matrixA[k][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Матрица с строками отсортированными по возврастанию");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        for (int k = 0; k < N; k++) {
            for (int i = 0; i < M - 1; i++) {
                for (int j = 0; j < M - i - 1; j++) {
                    if (matrixA[k][j] < matrixA[k][j + 1]) {
                        int temp = matrixA[k][j];
                        matrixA[k][j] = matrixA[k][j + 1];
                        matrixA[k][j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Матрица с строками отсортированными по убыванию");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
