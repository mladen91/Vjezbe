package ba.bitcamp.vjezbe.task7;

public class Main8 {

	public static void main(String[] args) {

		int[] arr1 = { 1, 4, 3, 2, 5 };
		int[] arr2 = { 1, 4, 3, 2, 5 };
		System.out.println(areTheSame(arr1, arr2));

	}

	private static boolean areTheSame(int[] arr1, int[] arr2) {

		return areTheSame(arr1, arr2, 0);
	}

	private static boolean areTheSame(int[] arr1, int[] arr2, int i) {

		if (arr2.length != arr1.length) {
			return false;
		}

		if (i >= arr1.length) {
			return true;
		}

		if (arr1[i] != arr2[i]) {
			return false;
		} else
			i++;
		return areTheSame(arr1, arr2, i);

	}

}
