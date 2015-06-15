package VjezbeZadaci;

public class Task2 {

	public static int getNumberOfHoles(int num) {

		int counter = 0;
		int div = 0;

		for (int i = num; i > 0; i /= 10) {

			div = i % 10;

			if (div == 0 || div == 4 || div == 6 || div == 9) {

				counter += 1;
			} else if (div == 8) {
				counter += 2;
			}

		}
		return counter;

	}

	public static void main(String[] args) {
		int counter = getNumberOfHoles(1506);
		System.out.println(counter);

	}

}
