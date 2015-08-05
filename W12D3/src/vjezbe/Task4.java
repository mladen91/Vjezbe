package vjezbe;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		int[][] arr = new int[10000][10000];
		Random r = new Random();
		int counter = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
					arr[i][j] = r.nextInt(100);
			}
			
			
		
		}
		int N = r.nextInt(100);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == N) {
				counter++;
			}
			}
			
		}
		System.out.println("Time: " + (System.currentTimeMillis() - start));
		System.out.println(counter);

	}

}
