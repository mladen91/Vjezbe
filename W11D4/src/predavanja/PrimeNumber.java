package predavanja;

public class PrimeNumber extends Thread {

	private int start;
	private int end;
	private int count;

	public PrimeNumber(int start, int end) {

		this.start = start;
		this.end = end;
		this.count = 0;

	}

	public void countPrimes(){
		for (int i = start; i < end; i++) {
			if(isPrime(i)){
				count++;
			}
		}
	}
	
	public int getCount(){
		return count;
	}
	
	private boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}
	
	public void run(){
		countPrimes();
	}

	public static void main(String[] args) throws InterruptedException {
		PrimeNumber[] counters = new PrimeNumber[5];
		int startInterval = 1, endInterval = 1000000;
		int step = endInterval / counters.length;
		for (int i = 0; i < counters.length; i++) {
			counters[i]= new PrimeNumber(i*step, (i+1)*step);
			counters[i].start();
		}
		int totalCount = 0;
		for (int i = 0; i < counters.length; i++) {
			counters[i].join();
			totalCount += counters[i].getCount();
		}
		
		System.out.println("Primes count "+totalCount);
				
	}
}
