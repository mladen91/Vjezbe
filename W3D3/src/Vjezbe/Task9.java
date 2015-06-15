package Vjezbe;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert array length: ");
		int arrLength = in.nextInt();

		int[] arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Insert value: ");
			arr[i] = in.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		int[] counterArray = new int[9];

		for (int values : arr) {

			counterArray[values]++;
		}

		System.out.println(Arrays.toString(counterArray));

	}

}
