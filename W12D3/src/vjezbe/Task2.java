package vjezbe;

import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task2 {

	static LinkedBlockingQueue<Runnable> queue;
	static ArrayList<Slave> slaves;
	static Integer count = 0;
	static int a = 0;
	static int b = 1000;
	static long start = 0;
	static Object lock = new Object();

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<Runnable>();
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) {

			queue.add(new Task(a, b));
			a += 1000;
			b += 1000;
		}

		// Make the consumers and let them consume
		slaves = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			Slave s = new Slave();
			s.start();
			try {
				s.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			slaves.add(s);
		}
		System.out.println(count);
		System.out.println(System.currentTimeMillis() - start);
	}

	static class Slave extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Runnable job = queue.take();

					job.run();
				} catch (InterruptedException e) {
					break;
				}
			}
		}
	}

	static class Task implements Runnable {

		private int a;
		private int b;

		public Task(int a, int b) {
			this.a = a;
			this.b = b;
		}

		@Override
		public void run() {

			for (int i = a; i < b; i++) {
				if (isPrime(i)) {
					synchronized (lock) {
						count++;
					}

				}
			}

		}

	}

	private static boolean isPrime(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;
	}

}
