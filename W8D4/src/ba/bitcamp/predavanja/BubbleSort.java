package ba.bitcamp.predavanja;

import java.util.Arrays;

public class BubbleSort {

	public static void BubbleSort(int[] num) {

		boolean start = true;
		int temp;

		while (start) {
			start = false;
			for (int i = 0; i < num.length - 1; i++) {
				if (num[i] > num[i + 1]) {
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
					start = true;
				}
			}
		}
		System.out.println(Arrays.toString(num));
	}

	public static boolean binarySearch(int[] arr, int num) {
		int low = 0;
		int high = arr.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (arr[middle] == num) {
				return true;
			}
			if (arr[middle] < num) {
				low = middle + 1;
			}
			if (arr[middle] > num) {
				high = middle - 1;
			}
		}
		return false;
	}

	public static void intInsertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0 && temp < array[j]; j--)

				array[j + 1] = array[j];
			    array[j + 1] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 16, 7, 4, 5 };
		BubbleSort(arr);
		System.out.println(binarySearch(arr, 3));

		intInsertionSort(arr);

	}
}
