package Vjezbe;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		System.out.println("Insert month: ");
		int season=in.nextInt();
		
		switch (season) {
			
		case 12: case 1: case 2:
			System.out.println("Winter");
			break;
		case 3: case 4: case 5:
			System.out.println("Spring");
			break;
		case 6: case 7: case 8:
			System.out.println("Summer");
			break;
		case 9:case 10:case 11:
			System.out.println("Autmn");
			break;

		}

	}

}
