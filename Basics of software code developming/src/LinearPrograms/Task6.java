package LinearPrograms;

import java.util.Scanner;


/*
 * 6. ƒл€ данной области составить линейную программу, котора€ печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false Ч в противном случае.(—м. область в прикрепленном readme)
 */

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("¬ведите значение X: ");
        double x = in.nextDouble();
        System.out.print("¬ведите значение Y: ");
        double y = in.nextDouble();
        System.out.println((y <= 4 && y >= -3 && x >= -2 && x <= 2) || (y <= 0 && y >= -3 && x <= 4 && x >= -4));
        in.close();
	}
}
