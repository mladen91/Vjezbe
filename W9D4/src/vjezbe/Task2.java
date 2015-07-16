package vjezbe;

import java.util.Scanner;
import java.util.TreeSet;

public class Task2 {

	public static void main(String[] args) {

		TreeSet<Character> tset = new TreeSet<>();

		boolean isTrue = true;
		Scanner in = new Scanner(System.in);
		System.out.println("Insert word");
		String word = in.nextLine();
		for (int i = 0; i < word.length(); i++) {
			tset.add(word.charAt(i));
		}

		while (isTrue) {
			System.out.println("Insert word:");
			word = in.nextLine();
			for (int i = 0; i < word.length(); i++) {
				tset.add(word.charAt(i));
			}
			if (word.equals("end")) {
				isTrue = false;
			}

		}

		if (!isTrue) {
			System.out.println(tset);
			System.out
					.println("Number of different characters: " + tset.size());
		}

	}
}
