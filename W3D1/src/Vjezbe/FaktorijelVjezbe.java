package Vjezbe;

import java.util.Scanner;

public class FaktorijelVjezbe {

	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		System.out.println("Insert your number:");
		int num = in.nextInt();
		long product = 1;
		long newNum = 0;
		
		for (int i=1;i<=num;i++) {
			
			product = product * i;
			while (product % 10 == 0) {
				product /= 10;
			}
			product %= 1000000;
			
		}
		
		newNum=product%100;
		while (newNum<10) {
			product=product/10;
			if(product==0) {
				break;
			}
			newNum = (product % 10) * 10 + newNum;
		}
		
		System.out.println(newNum);

	}

}
