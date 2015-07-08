package ba.bitcamp.vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

public class Task9 {

	public static void shiftAnArray(ArrayList<Character> c) {

		char tmp = c.get(0);
		for (int i = c.size() - 1; i > 0; i--) {
			c.set(i, c.get(i - 1));
		}
		c.set(0, tmp);

		System.out.println(c);
	}

	public static void findTheOne(String... s) {

		ArrayList<String> s1 = new ArrayList<String>(Arrays.asList(s));

		for (int i = 0; i < s1.size(); i++) {
			if (s1.get(i) == null) {
				s1.remove(i);
			}
		}
		System.out.println(s1);
	}

	public static void main(String[] args) {

		ArrayList<Character> c = new ArrayList<Character>(Arrays.asList('a',
				'b', 'c', 'd', 'e'));

		findTheOne("Mladen", null, "Ajdin", null, "Semir");

		shiftAnArray(c);
	}

}
