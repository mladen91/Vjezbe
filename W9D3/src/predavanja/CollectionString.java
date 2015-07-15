package predavanja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionString {

	public static void print(Collection<?> s) {
		Iterator<?> names = s.iterator();

		while (names.hasNext()) {
			System.out.println(names.next());
		}
	}

	public static String maxString(Collection<String> strings) {
		Iterator<String> iter = strings.iterator();
		String max = null;
		while (iter.hasNext()) {
			String current = iter.next();
			if (max == null || max.compareTo(current) > 0) {
				max = current;
			}
		}
		return max;
	}
	

	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		test.add("X");
		test.add("asfaf");
		test.add("asfaf6");

		System.out.println(test);
	}

}
