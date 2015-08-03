package predavanja;

import java.io.IOException;
import java.util.Scanner;

public class MainSearch {

	public static void main(String[] args) {
		

		System.out.println("Enter search: ");
		Scanner in = new Scanner(System.in);
		String searchString = in.nextLine();
		
		try {
		Search search = new Search(searchString);
		
			search.startSearch();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		in.close();

	}

}
