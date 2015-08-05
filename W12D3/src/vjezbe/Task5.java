package vjezbe;

import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class Task5 {

	static LinkedBlockingQueue<Runnable> queue;

	private static Integer counterFile=0;
	private static Integer counterDirectory=0;
	private static Object lock= new Object();
	static ArrayList<Slave> slaves;

	public static void main(String[] args) {
		queue = new LinkedBlockingQueue<Runnable>();

		
			queue.add(new Task(new File("/Users/mladen.teofilovic/Documents")));
		
		slaves = new ArrayList<>();
		for (int i = 0; i < 1; i++) {
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
		System.out.println("Number of files: "+counterFile);
		System.out.println("Number of directories: "+counterDirectory);

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

		private File f;

		public Task(File f) {
			this.f = f;

		}

		@Override
		public void run() {

			for (File f : f.listFiles()) {
				if (f.isFile()) {
					synchronized (lock) {
					counterFile++;	
					}
					
				} else if (f.isDirectory()) {
					synchronized (lock) {
					counterDirectory++;
					queue.add(new Task(f));	
					}
					
				}
			}
		}
	}

}
