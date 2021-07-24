package com.epam.javaIntro.cycles;

/*
 * 6.Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Task6 {
	public static void main(String[] args) {
		System.out.print("ASCII символы и их численное обозначение в памяти компьютера:\n № символ OCT  HEX\n");
        for (int i = 33; i < 256; i++) {
            char ch = (char) i;
            String tempOct = Integer.toOctalString(i);
            String tempHex = Integer.toHexString(i);
            System.out.printf("%03d %3s %5s %4s%n", i, ch, tempOct, tempHex);
        }
	}
}
