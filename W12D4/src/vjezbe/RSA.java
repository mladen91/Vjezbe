package vjezbe;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class RSA {

	private static BigInteger n = new BigInteger("1050809377681880902769");
	private static BigInteger j = new BigInteger("1");

	private static LinkedBlockingQueue<Task> queue;
	private static Object lock = new Object();
	private static ArrayList<Worker> workers;

	public static void main(String[] args) {

		queue = new LinkedBlockingQueue<>();
		BigInteger workLoad = new BigInteger("10000000");
		// int workLoad = 1_000;
		BigInteger loadTaken = new BigInteger("0");
		// int loadTaken = 0;
		while (loadTaken.compareTo(new BigInteger("10000000000")) < 0) {

			Task t = new Task(loadTaken, loadTaken.add(workLoad));
			queue.add(t);
			loadTaken = loadTaken.add(workLoad);
			System.out.println(loadTaken + " " + workLoad);
		}

		workers = new ArrayList<>();
		long t = System.currentTimeMillis();
		for (int i = 0; i < 4; i++) {
			Worker w = new Worker();
			w.start();
			workers.add(w);
		}

		for (Worker w : workers) {
			try {
				w.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Time [ms]: " + (System.currentTimeMillis() - t));
		// System.out.println("Primes: " + primeCounter);

	}

	public static boolean isPrime(BigInteger n) {
		BigInteger _0 = new BigInteger("0");
		BigInteger _1 = new BigInteger("1");
		BigInteger _2 = new BigInteger("2");

		if (n.compareTo(_0) == 0 || n.compareTo(_1) == 0) {
			return false;
		}

		if (n.compareTo(_2) == 0) {
			return true;
		}

		if (n.remainder(_2).compareTo(_0) == 0) {
			return false;
		}

		BigInteger v = n.subtract(_1);
		while (v.remainder(_2).compareTo(_0) == 0) {
			v = v.divide(_2);
		}

		return true;
	}

	static class Worker extends Thread {
		@Override
		public void run() {
			while (!queue.isEmpty()) {
				try {
					Task t = queue.take();
					t.run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static class Task implements Runnable {

		private BigInteger start;
		private BigInteger end;

		public Task(BigInteger start, BigInteger end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public void run() {

			for (BigInteger i = new BigInteger("" + start); i.compareTo(end) < 0; i = i
					.add(new BigInteger("1"))) {

				if (isPrime(i)) {
					synchronized (lock) {
						
						if (n.mod(i).compareTo(new BigInteger("0")) == 0) {
							BigInteger c = n.divide(i);
							if (isPrime(c)) {

								System.out.println(i + ":" + c);
								return;
							}
						}
					}
				}
			}

		}

	}

}
