package Vjezbe;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		try {

			System.out.println("Insert array length: ");
			int N = in.nextInt();
			int[] arr = new int[N];
			System.out.println("Insert number of inputs: ");
			int K = in.nextInt();
			int index = 0;
			int value = 0;

			for (int i = 0; i < K; i++) {
				System.out.println("Index: ");
				index = in.nextInt();
				System.out.println("Value: ");
				value = in.nextInt();
				arr[index] = value;

			}
			System.out.println(Arrays.toString(arr));

		} catch (IllegalArgumentException ex) {
			System.out.println("You are stupid!");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("You should see your for loop.");
		} catch (InputMismatchException ex) {
			System.out.println("No letters.");
		}

	}

}
