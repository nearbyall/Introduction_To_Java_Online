package LinearPrograms;

import java.util.Scanner;
import java.lang.Math;


/*
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) *  𝑡𝑔 𝑥𝑦
 */

public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x, y, z;
		System.out.println("Введите значение переменной X: ");
		x = in.nextDouble();
		System.out.println("Введите значение пееменной Y: ");
		y = in.nextDouble();	
		if ((Math.cos(x) - Math.sin(y)) != 0) {
			z = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
			System.out.println("результат: " + z);
		} else {
			System.out.println("Произошло деление на ноль.");
		}
		in.close();
	}
}
