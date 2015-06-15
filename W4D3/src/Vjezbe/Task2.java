package Vjezbe;

import ba.vjezbe.TextIO;

public class Task2 {

	public static void main(String[] args) {

		TextIO.readFile("src/Vjezbe/niz.txt");

		
		int rowsAsNum = TextIO.getInt();
		int columnsAsNum = TextIO.getInt();
		
		int[][] num = new int[rowsAsNum][columnsAsNum];
		
			
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
							num[i][j]=TextIO.getInt();
			
							
			System.out.print(num[i][j]+" ");	
			}
			System.out.println();
		}
	
		
		
		
		
		
		
	}

}
