package Vjezbe;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner (System.in);
		
		System.out.println("Insert first array length: ");
		int length=in.nextInt();
		System.out.println("Insert second array length: ");
		int length1=in.nextInt();
		
		
		int[] array1= new int[length];	
		int[] array2= new int[length1];
		int[] array3= new int[length+length1];
		int counter=0;
		
		for(int i=0;i<length;i++) {
		System.out.println("Insert values:");
		int val=in.nextInt();
		array1[i]=val;
		array3[i]=array1[i];
		counter++;
		}
		System.out.println(Arrays.toString(array1));
		
		for(int i=0;i<length1;i++) {
			System.out.println("Insert values:");
			int val=in.nextInt();
			array2[i]=val;
			array3[counter+i]=array2[i];
			}
			System.out.println(Arrays.toString(array3));
			
		

	}

}
