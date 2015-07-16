package vjezbe;

import java.util.ArrayList;
import java.util.ListIterator;


public class Task1 {


	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 50; i < 101; i++) {
			list1.add(i);
		}
	
		ListIterator<Integer> iter = list1.listIterator();
		
		while (iter.hasNext()) {
			list2.add(iter.next());
		
		}
		
		while (iter.hasPrevious()) {
			list2.add(iter.previous());
		
		}
		System.out.println(list2);

	}

}
