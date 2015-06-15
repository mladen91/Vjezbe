package Vjezbe;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 3, 4,9,9 };
		int[] array2 = new int[] { 1, 2, 1, 2, 1, 2 };
		int number1 = 0;
		int number2 = 0;
		int b = 1;
		int b1 = 1;

		for (int i = array1.length - 1; i >= 0; i--) {
			number1 += array1[i] * b;
			b *= 10;
			System.out.println(array1[i]);
		}
		

		

		for (int i = array2.length - 1; i >= 0; i--) {
			number2 += array2[i] * b1;
			b1 *= 10;
		}
		int number3 = number1 + number2;
		

		int counter = 0;

		for (int i = number3; i > 0; i /= 10) {
			counter++;
		}

		int[] array3 = new int[counter];

		for (int i = counter - 1; i >= 0; i--) {

			array3[i] = number3 % 10;
			number3 /= 10;
		}
		System.out.println(Arrays.toString(array3));
	}
}
