package Vjezbe;

import java.util.Scanner;

public class StringName {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert your name: ");
		String name = in.nextLine();

		int length = name.length();

		for (int i = 0; i < length; i++) {

			if (i % 2 == 0) {
				name = name.toUpperCase();

				System.out.println(name.charAt(i));
			} else {
				name = name.toLowerCase();
				System.out.println(name.charAt(i));
			}

		}

	}

}
