package vjezbe;

public class Task2 {

	private static Integer counter = 0;

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 20; i++) {
			startCount();

			System.out.println(counter);
			counter = 0;
		}

	}

	public static void startCount() throws InterruptedException {
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}

	public static class MyThread implements Runnable {

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {

				synchronized (counter) {
					counter += 10;

				}
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
