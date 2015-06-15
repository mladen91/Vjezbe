package Vjezbe;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert length of Array: ");
		int first = in.nextInt();
		int[] arr = new int[first];
		int[] arr2 = new int[first * 2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 9 + 1);

			arr2[i] = arr[i];
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));

	}

}
