package Predavanja;

public class Nplus1 {

	public static String threeNPlusOne(int n) {

		String str = " ";
		int count = 1;
		while (n > 1) {

			if (n % 2 == 1) {
				n = 3 * n + 1;
			}else
				n = n / 2;
			count++;
			str += n;
		}

		//System.out.println("Terms " + count);
		return str;

	}

	public static void main(String[] args) {

		threeNPlusOne(7);

	}

}
