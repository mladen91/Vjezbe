package ba.bitcamp.vjezbe.task3;

public class Main3 {

	public static void main(String[] args) {

		System.out.println(getSum(100));

	}

	private static int getSum(int i) {

		if (i == 1) {
			return 1;
		} else
			return i + getSum(i - 1);

	}

}
