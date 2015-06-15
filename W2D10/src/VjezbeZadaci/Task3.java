package VjezbeZadaci;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert your number: ");
		int num = in.nextInt();

		for (int i = 2; i <= num; i++) {

			while (num % i == 0) {
				System.out.print(i + " ");
				num = num / i;
			}

		}

	}

}
