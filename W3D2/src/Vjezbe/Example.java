package Vjezbe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num;
		
	try {
		System.out.println("Insert your number: ");
		num = in.nextInt();
		
		
		
	} catch (InputMismatchException e) {
		System.out.println("Insert new number: ");
		
	}

	}

}
