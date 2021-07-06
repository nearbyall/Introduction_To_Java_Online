package MultiArray;

import java.util.Scanner;
import java.lang.Math;

/*
 * 8. В числовой матрице поменять местами два столбцалюбых столбца,
 * т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
 *  а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность квадратной матрицы матрицы: ");
        int N = in.nextInt();

        int[][] matrixA;
        matrixA = new int[N][N];

        System.out.println("Сгенерированная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrixA[i][j] = (int) ((Math.random() * 100) - 50);
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }

        System.out.println("Введите номер столбца, который вы ходитете поменять местами с другим: ");
        int K = in.nextInt();
        System.out.println("Введите номер столбца, который вы ходитете поменять местами с другим: ");
        int L = in.nextInt();

        System.out.println("Измененная матрица: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j == K - 1) {
                    int temp = matrixA[i][j];
                    matrixA[i][j] = matrixA[i][L - 1];
                    matrixA[i][L - 1] = temp;
                }
                System.out.printf("%3d ", matrixA[i][j]);
            }
            System.out.println();
        }
        in.close();
    }
}
