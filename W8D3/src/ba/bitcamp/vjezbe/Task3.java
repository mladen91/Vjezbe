package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class Task3 {

	public static void findTheOne(String... s) {
		int counter = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				counter++;
			}
		}

		String[] tmp = new String[counter];
		int index = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				tmp[index] = s[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(tmp));

	}

	public static void main(String[] args) {

		findTheOne("Mladen", null, "Ajdin", null, "Semir");

	}

}
