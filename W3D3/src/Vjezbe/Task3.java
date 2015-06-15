package Vjezbe;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

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

		int counter=0;
		
		System.out.println("Which number you want to count?");	
			int number = in.nextInt();
		
			for (int values:arr) {
			
			if (values==number) {
			 counter++;
			}
		}
		System.out.println("Number "+number+" is written " +counter+ " times.");

	}

}
