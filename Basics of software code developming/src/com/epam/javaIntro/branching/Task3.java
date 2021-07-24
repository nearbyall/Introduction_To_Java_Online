package com.epam.javaIntro.branching;

import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/*
 * 3.Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.  
 */

public class Task3 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату x для точки A: ");
        double x1 = in.nextDouble();
        System.out.print("Введите координату y для точки A: ");
        double y1 = in.nextDouble();
        System.out.print("Введите координату x для точки C: ");
        double x2 = in.nextDouble();
        System.out.print("Введите координату y для точки C: ");
        double y2 = in.nextDouble();
        System.out.print("Введите координату x для точки D: ");
        double x3 = in.nextDouble();
        System.out.print("Введите координату y для точки D: ");
        double y3 = in.nextDouble();

        double ab, bc, ca, p, s;
        //Нахождение сторон AB, BC и CA
        ab = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
        bc = sqrt(pow(x3 - x2, 2) + pow(y3 - y2, 2));
        ca = sqrt(pow(x1 - x3, 2) + pow(y1 - y3, 2));
        //Вычисление полупериметра теугольника
        p =  (ab + bc + ca) / 2;
        //По формулене Герона вычисляем площадь "треугольника"
        s = sqrt(p * (p - ab) * (p - bc) * (p - ca));
        if (s == 0) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            System.out.println("Точки не лежат на одной прямой");
        }
        in.close();
    }
}
