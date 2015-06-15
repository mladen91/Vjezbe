package Vjezbe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insert your String: ");
		String name = in.nextLine();
		char chars;
		char[] arr=new char[name.length()];
		
		for (int i=0;i<name.length();i++) {
			chars=name.charAt(i);
			arr[i]=chars;			
			System.out.print(arr[i]+"\n");
		}
		
		
		char[] reversedArray=new char[name.length()];
		
		for(int i=0; i<name.length() ;i++) {
			
			reversedArray[i]=arr[(name.length()-1)-i];
			System.out.print(reversedArray[i]);
		}
		

		
		

	}

}
