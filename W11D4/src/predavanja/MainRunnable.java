package predavanja;

public class MainRunnable implements Runnable {

	private String name;
	
	public MainRunnable(String name){
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name+" counted to "+i);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MainRunnable r1 = new MainRunnable("Ross");
		MainRunnable r2 = new MainRunnable("Joey");
		MainRunnable r3 = new MainRunnable("Chandler");
		
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("End of main");
	}

}
