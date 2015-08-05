package vjezbe;

public class Task1 {

	public static class MyThread implements Runnable {
		Integer count = 0;

		@Override
		public void run() {
			long start = System.currentTimeMillis();
			for (int i = 10; i < 1000000; i++) {
				if (isPrime(i)) {

					synchronized (count) {
						count++;
					}

				}
			}
			
			System.out.println(System.currentTimeMillis()-start);

			System.out.println(count);

		}

		private static boolean isPrime(int number) {
			for (int i = 2; i < number / 2; i++) {
				if (number % i == 0) {
					return false;
				}

			}
			return true;
		}
		
		public static void main(String[] args) {
			Thread t = new Thread(new MyThread());
			t.start();
		}
	}
}