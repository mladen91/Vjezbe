package ba.bitcamp.predavanja;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();

		ArrayList<Integer> newArr = new ArrayList<Integer>();

		ArrayList<String> strArr = new ArrayList<String>();
		ArrayList<String> newStrArr = new ArrayList<String>();
		strArr.add(0, "this");
		strArr.add(1, "3232r32");
		strArr.add(2, "thisSSIAF");

		for (int i = 0; i < strArr.size(); i++) {
			if (strArr.get(i).length() == 4) {
				newStrArr.add(i, "**** ");

			} else {
				newStrArr.add(i, strArr.get(i));
			}
		}

		System.out.println(newStrArr);

		for (int i = 0; i < 5; i++) {

			int rand = (int) (Math.random() * 5);
			a.add(rand);

		}
		System.out.println(a);
		for (int i = 0; i < a.size() - 1; i += 2) {

			int temp = a.get(i);
			a.set(i, a.get(i + 1));
			a.set(i + 1, temp);

		}

		System.out.println(a);

		for (int i = a.size() - 1; i >= 0; i--) {
			newArr.add(a.get(i));
		}

		System.out.println(a);
		while (a.indexOf(2) != -1) {
			a.remove((Integer) 2);
		}

		System.out.println(a);

		System.out.println(newArr);
	}

}
