package ba.vjezbe;

import java.util.Scanner;

public class Task1 {
	/**
	 * <h1> This method will print 2D array with random values from 5 to 10.</h1>
	 * <p>
	 * @param rows - represents number of rows. 
	 * @param columns - represents number of columns.
	 * @return - 2DArray
	 */

	public static int[][] get2DArray(int rows, int columns) {

		int[][] array = new int[rows][columns];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 6 + 5);
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();

		}

		return array;
	}
	/**
	 * <h1> This method will check if our value is true.</h1>
	 * <p>
	 * @param isTrue - checks if our case is true or false
	 * @param array - represents our 2D array
	 */

	public static void isTrue(boolean isTrue, int[][] array) {

		if (isTrue == true) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.printf("%2d ", array[i][j]);
				}
				System.out.println();

			}
		} else if (isTrue == false) {
			for (int i = array.length - 1; i >= 0; i--) {
				for (int j = array[i].length - 1; j >= 0; j--) {
					System.out.printf("%2d ", array[i][j]);
				}
				System.out.println();

			}
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number of rows:");
		int rows = in.nextInt();
		System.out.println("Insert number of columns:");
		int columns = in.nextInt();

		// Calling isTrue method 
		isTrue(false, get2DArray(rows, columns));
		
		in.close();
	}

}
