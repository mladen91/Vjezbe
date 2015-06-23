package ba.bitcamp.vjezbe.part2.task2;

import java.util.Arrays;

import ba.bitcamp.vjezbe.task1.Computer;

public class ArrayManipulation {

	/**
	 * This method will extend array by one
	 * 
	 * @param c
	 *            -represents array of computers
	 */
	public static void extendArray(Computer[] c) {
		Computer[] compArray = new Computer[c.length + 1];

		for (int i = 0; i < c.length; i++) {
			compArray[i] = c[i];
		}
		c = compArray;

		System.out.println(Arrays.toString(c));
	}

	/**
	 * This method will shrink array by one
	 * 
	 * @param c
	 *            -represents array of computers
	 * @param idx
	 *            - represents index of computer that will be shrinked
	 */
	public static void shrinkArray(Computer[] c, int idx) {
		Computer[] compArray = new Computer[c.length - 1];
		int j = 0;
		for (int i = 0; i < compArray.length; i++) {

			if (j == idx) {
				j++;
			}
			compArray[i] = c[j];
			j++;
		}

	}

}
