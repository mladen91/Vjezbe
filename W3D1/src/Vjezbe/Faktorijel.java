package Vjezbe;

import java.util.Scanner;

public class Faktorijel {

	public static void main(String[] args) {
		
		

			Scanner in = new Scanner(System.in);
			System.out.println("Insert your number:");
			int num = in.nextInt();
			int product = 1;
			int newNum = 0;

			//We will get last 6 numbers here without zeroes
			for (int i = 1; i <= num; i++) {

				product = product * i;
				while (product % 10 == 0) {
					product /= 10;
				}
				product %= 1000000;

			}

			//Two digits that are not null
			newNum = product % 100;
			while (newNum < 10) {
				product /= 10;
				if (product == 0) {
					break;
				}
				newNum = (product % 10) * 10 + newNum;
			}

			System.out.println("Your result is: "+newNum);

	}

}
