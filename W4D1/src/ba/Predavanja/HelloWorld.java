package ba.Predavanja;

import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {

	public static int[] getSum(int n, int m) {

		Scanner in = new Scanner(System.in);
		int N = 0;
		int M = 0;
        //Method for summing M and N..
		int[] array1 = new int[n];
		int[] array2 = new int[m];
		int[] arraySum = new int[n];
		if (n > m) {
			arraySum = new int[n];
		} else
			arraySum = new int[m];

		for (int i = 0; i < array1.length; i++) {
			System.out.println("Insert index " + i + " value for N: ");
			N = in.nextInt();
			array1[i] += N;
		}
		for (int j = 0; j < array2.length; j++) {
			System.out.println("Insert index " + j + " value for M: ");
			M = in.nextInt();
			array2[j] += M;
		}
		for (int i = 0; i < arraySum.length; i++) {

			if (i == array2.length || i > array2.length) {
				arraySum[i] += array1[i];
			} else if (i == array1.length || i > array1.length) {
				arraySum[i] += array2[i];
			} else {
				arraySum[i] += array1[i] + array2[i];
			}
		}
		return arraySum;
	}
	
	public static boolean getEquals(String word1, String word2) {
		boolean b = false;
		char letter1 = ' ';
		char letter2 = ' ';
		String letter1AsString = "";
		String letter2AsString = "";
		String finall = "";
		int counter = 0;
        
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				letter1 = word1.charAt(i);
				letter1AsString += Character.toString(letter1);
				letter2 = word2.charAt(j);
				letter2AsString += Character.toString(letter2);
				if (letter1 == letter2) {
					counter++;
					finall += letter2;
					break;
				}
			}
		}
		System.out.println(counter);
		if (counter == word1.length() && word2.length() >= word1.length()) {
			return true;
		}
		return b;
	}	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert first String: ");
		String word1 = in.nextLine();
		System.out.println("Insert second String: ");
		String word2 = in.nextLine();
		System.out.println(getEquals(word1, word2));
	}
}
