package ba.bitcamp.vjezbe.task2;

public class Main2 {

	public static void main(String[] args) {

		printEverySecondNumber(10);

	}

	private static void printEverySecondNumber(int i) {

		if (i == 0) {
			return;
		}

		System.out.println(i);
		printEverySecondNumber(i - 2);

	}

}
