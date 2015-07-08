package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class Task5 {

	public static String[] aToZ(String... s) {

		Arrays.sort(s);
		return s;

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(aToZ("Mladen", "Ajdin", "Semir")));

	}

}
