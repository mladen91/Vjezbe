package ba.bitcamp.vjezbe;

public class Task7 {

	public static void printAllNumbers(int i, int... array) {
		int counter = 0;
		for (int j = 0; j < array.length; j++) {
			if (i == array[j]) {
				switch (i) {
				case 0:
					counter++;
					break;
				case 1:
					counter++;
					break;
				case 2:
					counter++;
					break;
				case 3:
					counter++;
					break;
				case 4:
					counter++;
					break;
				case 5:
					counter++;
					break;
				case 6:
					counter++;
					break;
				case 7:
					counter++;
					break;
				case 8:
					counter++;
					break;
				case 9:
					counter++;
					break;
				}
			}
		}
		System.out.println(counter);

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		printAllNumbers(3, arr);

	}

}
