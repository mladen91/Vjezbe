package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Client {

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

		Socket client = null;
		try {
			client = new Socket("10.0.82.98", 8000);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			String line = reader.readLine();
			String[] arr = line.split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

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

		try {
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			writer.write(count.toString());
			writer.newLine();
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
