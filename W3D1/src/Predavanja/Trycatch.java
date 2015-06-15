package Predavanja;

import java.util.InputMismatchException;
import java.util.Scanner;











public class Trycatch {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int num1;
		int num2;

		while (true) {
			try {
				System.out.println("Insert your number: ");
				num1 = in.nextInt();
				num2 =in.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Not a number!");
				in.nextLine();
			}
		}

	}

}
