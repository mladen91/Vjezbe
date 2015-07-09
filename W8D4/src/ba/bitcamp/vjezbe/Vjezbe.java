package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class Vjezbe {

	public static void intInsertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0 && temp < array[j]; j--) {
				array[j + 1] = array[j];
			}

			array[j + 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 16, 7, 4, 5 };

		intInsertionSort(arr);

	}

}
