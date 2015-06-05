package Predavanja;

public class Nplus1 {

	public static void threeNPlusOne(int n) {

		int count = 1;
		while (n > 1) {

			if (n % 2 == 1)
				n = 3 * n + 1;
			else
				n = n / 2;
			count++;
			System.out.println(n);
		}
		System.out.println("Terms " + count);
	}

	public static void main(String[] args) {

		threeNPlusOne(7);

	}

}
