package Vjezbe;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert first array values: ");
			int values = in.nextInt();
			array1[i]=values;
		}

		for (int i = 0; i < array2.length; i++) {
			System.out.println("Insert second array values: ");
			int values = in.nextInt();
			array2[i]=values;
		}
		
	
	}

}
