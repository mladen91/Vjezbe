package ba.vjezbe;

import java.util.Arrays;

public class Task2 {

	/**
	 * At first, this method will count number of rows. If number of rows is equal 1
	 * we need to declare new String array and collect our values with getln.
	 * If number of rows is greater that 0, we need to count number of rows using TextIO.eof method.
	 * Then we need to make a int array and collect our values with getInt.
	 */
	public static void doSomething() {
		TextIO.readFile("src/ba/vjezbe/fajl.txt");
		int counter = 0;
		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}

		TextIO.readStandardInput();
		if (counter == 1) {

			TextIO.readFile("src/ba/vjezbe/fajl.txt");
			String[] array = new String[counter];

			for (int i = 0; i < array.length; i++) {

				array[i] = TextIO.getln();
			}
			System.out.println(Arrays.toString(array));
			

		} else {

			TextIO.readFile("src/ba/vjezbe/fajl.txt");
			int[] array = new int[counter];

			for (int i = 0; i < array.length; i++) {

				array[i] = TextIO.getInt();
			}
			System.out.println(Arrays.toString(array));
			
		}
	}

	public static void main(String[] args) {

		doSomething();
	}

}
