package com.epam.javaIntro.multiArray;

import java.util.Scanner;

/*
 * 16.Магическим квадратом порядка n называется квадратная матрица размера nxn,
 *    составленная из чисел 1, 2, 3, ...,2n так, что суммы по каждому столбцу, 
 *    каждой строке и каждой из двух больших диагоналей равны между собой. Построить такой квадрат.
 * 
 * 	  При написании опирался на источник:
 * 	  http://www.klassikpoez.narod.ru/metody.htm
 */

public class Task16 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность магического квадрата: ");
        int n = in.nextInt();
        while (n < 3 || (((n - 1) % 2 != 0)) && (n % 4 != 0)) {
            System.out.printf("Размерность %d не подходит.%n", n);
            System.out.println("Введите размерность магического квадрата: ");
            n = in.nextInt();
        }
        
        if ((n - 1) % 2 == 0) {
        	int [][] square = new int[n][n];
        	int i = 0;
            int j = (n - 1) / 2;
            square[i--][j++] = 1;
            for (int k = 2; k <= n * n; i--, j++, k++) {
                if (i < 0 && j > n - 1) {
                    i += 2;
                    j--;
                }
                if (i < 0) {
                    i = n - 1;
                }
                if (j > n - 1) {
                    j = 0;
                }
                if (square[i][j] != 0) {
                    i += 2;
                    j--;
                }
                square[i][j] = k;
            }
            System.out.println("\nСгенерированный магический квадрат нечетного порядка:");
            for (int[] array : square) {
                for (int element : array) {
                    System.out.printf("%4d ", element);
                }
                System.out.println();
            }
        } else if (n % 4 == 0) {
        	 int [][] square = new int[n][n];
             int k = 1;

             for (int i = 0; i < square.length; i++) {
                 for (int j = 0; j < square.length; j++) {
                     square[i][j] = k;
                     k++;
                 }
             }

             for (int i = 0; i < n; i += 4 ) {
                 for (int j = 1; j < n; j += 4) {
                         square[i][j] = n * n + 1 - square[i][j];
                         square[i + 3][j] = n * n + 1 - square[i + 3][j];
                         square[i][j + 1] = n * n + 1 - square[i][j + 1];
                         square[i + 3][j + 1] = n * n + 1 - square[i + 3][j + 1];
                     }
             }
             for (int i = 1; i < n; i += 4 ) {
                 for (int j = 0; j < n; j += 4) {
                     square[i][j] = n * n + 1 - square[i][j];
                     square[i + 1][j] = n * n + 1 - square[i + 1][j];
                     square[i][j + 3] = n * n + 1 - square[i][j + 3];
                     square[i + 1][j + 3] = n * n + 1 - square[i + 1][j + 3];
                 }
             }
             
             System.out.println("\nСгенерированный магический квадрат четно-четного порядка:");
             for (int[] array : square) {
                 for (int element : array) {
                     System.out.printf("%4d ", element);
                 }
                 System.out.println();
             }
        }    
        in.close();
    }
}