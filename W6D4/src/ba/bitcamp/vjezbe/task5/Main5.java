package ba.bitcamp.vjezbe.task5;

import java.util.Arrays;

public class Main5 {

	private static int index = 0;

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 5 };
		int n = 6;
		System.out.println(isInArray(arr, n));

	}

	private static boolean isInArray(int[] arr, int n) {
		return isInArray(arr, n, 0);
	}

	private static boolean isInArray(int[] arr, int n, int i) {
		if (i >= arr.length) {
			return false;
		}
		if (arr[i] == n) {
			return true;
		} else
			i++;
		return isInArray(arr, n, i);

	}

	 public static void fillArray(int[] arr) {
	
	 if (index == arr.length) {
	 return;
	 }
	
	 arr[index] = index + 1;
	 index++;
	 fillArray(arr);
	
	 }

}
