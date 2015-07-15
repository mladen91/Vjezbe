package vjezbe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class NumbersList {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		LinkedList<Integer> numberListIterator = new LinkedList<Integer>();
		LinkedList<Integer> numberListFor = new LinkedList<Integer>();

		Random r = new Random();

		for (int i = 0; i < 100000; i++) {
			numberListIterator.add(r.nextInt(100));
			numberListFor.add(r.nextInt(100));
		}

		System.out.println("Insert one number:");
		int num = in.nextInt();

		Iterator<Integer> numbers = numberListIterator.iterator();

		long startIterator = System.currentTimeMillis();
		while (numbers.hasNext()) {

			if (numbers.next() % num == 0) {
				numbers.remove();
			}
		}
		long finishIterator = System.currentTimeMillis() - startIterator;
		System.out.println("It took: " + finishIterator);

		long startFor = System.currentTimeMillis();
		for (int i = 0; i < numberListFor.size(); i++) {

			if (numberListFor.get(i) % num == 0) {
				numberListFor.remove(i);
			}
		}
		long finishFor = System.currentTimeMillis() - startFor;

		System.out.println("It took " + finishFor);
	}

}
