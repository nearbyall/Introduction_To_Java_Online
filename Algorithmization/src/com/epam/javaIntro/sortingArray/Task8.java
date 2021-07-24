package com.epam.javaIntro.sortingArray;

/*
 * 8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
 *   которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
 */

public class Task8 {
	public static void main(String[] args) {
		Fraction [] array = {new Fraction(7, 12), new Fraction(2, 12),
							 new Fraction(2, 3), new Fraction(2, 24),
							 new Fraction(11, 3), new Fraction(9, 24),
							 new Fraction(6, 6), new Fraction(25, 24)};
		
		Fraction.toCommonDenominator(array);
		Fraction.sortByNumerator(array);
		Fraction.printArrayOfFractions(array);
	}
	
	static class Fraction {
		private int numerator, denominator;
		
		public Fraction(int numerator, int denominator) {
			this.numerator = numerator;
			this.denominator = denominator;
		}
		
		public void toNewDenominator(int newDenominator) {
			numerator *= (newDenominator / denominator);
			denominator = newDenominator;
		}
		
		public static void toCommonDenominator(Fraction[] array) {
			boolean isCommon = false;
			int commonDenominator = 0;
			while (!isCommon) {
				isCommon = true;
				commonDenominator++;
				for (Fraction fraction : array) {
					if (commonDenominator % fraction.denominator != 0) {
						isCommon = false;
					}
				}
			}
			
			for (Fraction fraction : array) {
				fraction.toNewDenominator(commonDenominator);
			}
		}
		
		public static void sortByNumerator(Fraction[] array) {
			int i = 1;
	        while (i < array.length) {
	        	if (array[i - 1].numerator > array[i].numerator) {
	        		Fraction temp = array[i - 1];
					array[i - 1] = array[i];
					array[i] = temp;
					if (i - 1 > 0) {
	                    i--;
	                }
	        	} else {
	        		i++;
	        	}
	        }
		}
		
		public static void printArrayOfFractions(Fraction[] array) {
			System.out.println("Массив дробей из натуральных чисел: \n");
			for (Fraction fraction : array) {
				System.out.print(fraction.toString());
			}
		}
		
		@Override
		public String toString() {
			return String.format("%d/%d ", numerator, denominator);
		}

		public int getNumerator() {
			return numerator;
		}

		public void setNumerator(int numerator) {
			this.numerator = numerator;
		}

		public int getDenominator() {
			return denominator;
		}

		public void setDenominator(int denominator) {
			this.denominator = denominator;
		}
	}
}
