package Vjezbe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		
		while (true) {
		try {
		
		System.out.println("Insert first number: ");
		double num1=in.nextInt();
		System.out.println("Insert second number: ");
		double num2=in.nextInt();
		
		double div = num1/num2;
		System.out.println(div);
		
		}catch (InputMismatchException ex) {
			System.out.println("Wrong format!");
			in.nextLine();
			
		}
		}
		
		

	}

}
