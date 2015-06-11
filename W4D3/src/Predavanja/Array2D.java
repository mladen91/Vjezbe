package Predavanja;

import java.util.Arrays;

public class Array2D {

	public static void print2DArray(int[][] array) {

		int[][] newArray = new int[4][5];

		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				System.out.println((newArray[i][j] + " "));
			}

		}
	}

	public static int[] getColumn(int[][] array, int column) {

		int[] oneColumn = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			oneColumn[i] = array[i][column];

		}
		return oneColumn;
	}

	// public static void printArray (int [] array1) {
	//
	// for (int i=0;i<array1.length;i++) {
	// array1[i]=0;
	// }
	// }
	public static void main(String[] args) {

		int[][] matrix = new int[4][5];

		int counter=1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j]=counter++;
				System.out.print(matrix[i][j] + "\t");
				if (j == 4) {
					System.out.print("\n");
			}
		}
		
		

		}
		System.out.println(Arrays.toString(getColumn(matrix, 4)));
		System.out.println();
		//

	}

}
