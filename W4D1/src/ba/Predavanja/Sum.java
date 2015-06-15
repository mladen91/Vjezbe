package ba.Predavanja;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int sum=0;
	
		for (String number:args){
			
			sum+=Integer.parseInt(number);
			
		}
		System.out.println("Suma je"+sum);

	}

}
