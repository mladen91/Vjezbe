package ba.bitcamp.vjezbe.task4;

public class Main4 {

	public static void main(String[] args) {

		System.out.println(getFibonacciNumber(9));

	}

	public static int getFibonacciNumber(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else
			return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
	}

}
