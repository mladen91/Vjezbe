package Predavanja;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);
		System.out.println("Unesite max broj elemenata: ");
		int maxBrojElemenata=in.nextInt();
		System.out.println("Unesite max "+maxBrojElemenata+ " brojeva, a 0 za prekid unosa: ");
		int[] brojevi = new int [maxBrojElemenata];
		
		for (int idx=0;idx<brojevi.length;idx++) {
			int br=in.nextInt();
			if(br>0) {
				brojevi[idx]=br;
			}else 
				break;
		}
		int max=-1;
		for (int idx=0;idx<brojevi.length;idx++) {
			int elementNiza=brojevi[idx];
			if (elementNiza>max) {
				max=elementNiza;;
			}
		}
		System.out.println("Najveci je: "+ max);
	}

}
