import java.util.Arrays;

public class Task7 {

	public static int[] getArray(int n, int k) {

		int[] array1 = new int[n];
		int j = 1;
		for (int i = 0; i < array1.length; i++) {
			while (j <= k) {
				array1[i] = j;
				break;
			}
			if (j == k) {
				j = 1;

			} else {
				j++;
			}

		}

		return array1;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getArray(9, 5)));

	}

}
