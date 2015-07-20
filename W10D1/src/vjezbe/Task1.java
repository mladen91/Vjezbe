package vjezbe;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JComponent;

public class Task1 {

	public static <T> void printAll(Collection<T> coll) {
		System.out.println(coll);
	}

	public static <T> int countOccurences(Collection<T> coll, T num) {
		int counter = 0;
		Iterator<T> iter = coll.iterator();

		while (iter.hasNext()) {
			if (iter.next().equals(num)) {
				counter++;
			}
		}
		return counter;

	}

	public static <T extends JComponent> void printComponentInfo(Component c) {

		System.out.println("Width: " + c.getWidth() + "Height " + c.getHeight()
				+ " X: " + c.getX() + " Y: " + c.getY());

	}

	public static <T> void printType(Collection<T> coll) {
		if (coll instanceof List) {
			System.out.println("List");
		} else if (coll instanceof Map) {
			System.out.println("Map");
		} else if (coll instanceof Set) {
			System.out.println("Set");
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeSet<Integer> set = new TreeSet<Integer>();
		list.add(2);
		list.add(3);
		list.add(1);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("A");
		printAll(list);
		printAll(list2);

		System.out.println(countOccurences(list, 2));

		printType(set);

	}

}
