package ba.bitcamp.vjezbe.task9;

import java.util.Arrays;

public class Main9 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		fillArray2(arr,5);
		System.out.println(Arrays.toString(arr));

	}

	private static void fillArray2(int[] arr, int i) {
		arr[i] = i;
		fillArray2(arr, i - 1, i - 1, true);
		fillArray2(arr, i + 1, i - 1, false);

	}

	private static void fillArray2(int[] arr, int i, int j, boolean b) {
		arr[i] = j;
		if (b == true) {
			arr[j-1]=i-1;
			j--;
			i--;
			if (i==0){
				return;
			}else 
				fillArray2(arr, i, j, b);
		} else if (b == false) {
			i++;
			j--;
			if (i<arr.length){
			fillArray2(arr, i, j, b);
			} else {
				return;
			}
		}

	}

}
