package ba.bitcamp.vjezbe;

import java.util.Arrays;

public class Task2 {

	public static void shiftAnArray(char[] c) {

		char tmp = c[0];
		for (int i = c.length - 1; i > 0; i--) {
			c[i] = c[i - 1];
		}
		c[0] = tmp;

		System.out.println(Arrays.toString(c));
	}

	public static void main(String[] args) {

		char[] letters = new char[] { 'a', 'b', 'c', 'd', 'e' };

		shiftAnArray(letters);
	}

}
