package ba.bitcamp.vjezbe;

import java.util.ArrayList;

public class Task8 {

	public static void main(String[] args) {
		
		Book b1 = new Book("Ludilo1");
		Book b2 = new Book("Ludilo2");
		Book b3 = new Book("Ludilo3");
		Book b4 = new Book("Ludilo4");
		Book b5 = new Book("Ludilo5");
		
		
		ArrayList<Book> b = new ArrayList<Book>();
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		
		for(Book print:b){
			System.out.println(print);
		}

	}

}
