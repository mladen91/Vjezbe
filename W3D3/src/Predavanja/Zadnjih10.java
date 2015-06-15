package Predavanja;

import java.util.Scanner;

public class Zadnjih10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int maxBrojElemenata = in.nextInt();
		maxBrojElemenata = Math.max(maxBrojElemenata, 5);

		int poz = 0;
		int[] brojevi = new int[maxBrojElemenata];
		while (true) {

			int br = in.nextInt();

			if (br >= 0) {

				if (poz < brojevi.length) {
					brojevi[poz] = br;
					poz++;
				} else {
					for (int i = 1; i < brojevi.length; i++) {
						brojevi[i - 1] = brojevi[i];
					}
					brojevi[brojevi.length - 1] = br;
					poz++;
				}

			} else
				break;

		}
		System.out.println("Unijeto ukupno: " + poz);
		System.out.println("Zadnjih " + brojevi.length + " brojeva je:");
		for (int br : brojevi) {
			System.out.println(br);

		}
		int max = -1;
		for (int idx = 0; idx < brojevi.length; idx++) {
			int elementNiza = brojevi[idx];
			if (elementNiza > max) {
				max = elementNiza;
			}
		}
		System.out.println("Najveci je: " + max);
		in.close();

	}

}
