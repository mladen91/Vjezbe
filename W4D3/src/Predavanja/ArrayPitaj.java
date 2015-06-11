package Predavanja;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPitaj {

	/**
	 * <h1>This method prints our 2D Array</h1>
	 * 
	 * @param matrix
	 *            - represents our 2D Array
	 * @param column
	 *            - represents number of columns in our Array
	 */
	public static void print2DArray(int[][] matrix, int column) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
				if (j == column - 1) {
					System.out.println("\n");
				}
			}
		}
		System.out.println();
	}

	/**
	 * <h1>This method is used to return wanted column elements</h1>
	 * 
	 * @param array
	 *            - represents 2D Array
	 * @param column
	 *            - represents number of column we want
	 * @return method returns wanted column
	 */

	public static int[] getColumn(int[][] array, int column) {

		int[] oneColumn = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			oneColumn[i] = array[i][column];

		}
		return oneColumn;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert number of rows:");
		int rows = in.nextInt();
		System.out.println("Insert number of columns:");
		int columns = in.nextInt();

		int[][] matrix = new int[rows][columns];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Insert element on indexes: [" + i + "] ["
						+ j + "]");
				matrix[i][j] = in.nextInt();
			}
		}
		print2DArray(matrix, columns);
		System.out.println("Which column do you want to print:");
		int columnForPrint = in.nextInt();

		System.out.println(Arrays
				.toString(getColumn(matrix, columnForPrint - 1)));

		in.close();
	}

}
