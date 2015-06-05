import java.util.Arrays;

public class Task6 {

	public static int[] getArray(int n, int m) {

		int[] array1 = new int[10];
		try {
			if (n > 10) {
				throw new IndexOutOfBoundsException();
			
			}
			for (int i = 0; i < array1.length; i++) {
				for (int j = n; j < array1.length; j++) {
					array1[j] = m;
				}
			}
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Ne valja index");
		}
		return array1;
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getArray(11, 1)));
	}
}
