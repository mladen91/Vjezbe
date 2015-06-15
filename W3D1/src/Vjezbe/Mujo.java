package Vjezbe;

public class Mujo {

	public static void main(String[] args) {

		int counter = 0;
		int N = 4;
		int K = 1;

		for (int i = N; N % 2 != 1; N /= 2) {

			counter++;
			
			}
		if (N == K) {
			System.out.println("No new containers needed.");

		}
			N++;
		
		for (int i=N;N%2!=1;N/=2) {
		
			counter++;
			
			

		}
		
			N++;
		
		for (int i=N;N%2!=1;N/=2) {
			
			counter++;
			

		}
		System.out.println("Number of containers needed: "+counter);
		
		

	}

}
