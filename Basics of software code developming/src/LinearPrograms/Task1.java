package LinearPrograms;

import java.util.Scanner;

/*
 * 1. Ќайдите  значение функции: z= ( (aЦ3 ) * b/ 2) + c.
 */

public class Task1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите значение переменной A: ");
		int a = in.nextInt();
		System.out.println("¬ведите значение переменной B: ");
		int b = in.nextInt();
		System.out.println("¬ведите значение переменной C: ");
		int c = in.nextInt();
		int z = ((a - 3) * b / 2) + c;
		System.out.println("–езультат: " + z);
		in.close();
	}
}
