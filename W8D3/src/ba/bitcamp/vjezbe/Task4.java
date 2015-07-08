package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class Task4 {

	public static void findTheOne(String s, char c) {
		s.toCharArray();
		Arrays.sort(s.toCharArray());
		Arrays.binarySearch(s.toCharArray(), c);

		System.out.println(Arrays.binarySearch(s.toCharArray(), c));
	}

	public static void main(String[] args) {

		findTheOne("Mladen", 'n');

	}

}
