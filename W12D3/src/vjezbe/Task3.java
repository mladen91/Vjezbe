package vjezbe;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		
		int[] arr = new int[10000000];
		Random r = new Random();
		int counter = 0;
		long start =System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(100);
		}
		int N = r.nextInt(100);
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==N){
				counter++;
			}
		}
		System.out.println("Time: "+(System.currentTimeMillis()-start));
		System.out.println(counter);
		
	}
}
