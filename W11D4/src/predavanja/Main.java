package predavanja;

public class Main implements Runnable{

	
	public static void main(String[] args) {
		Main m = new Main();
        Thread t = new Thread(m);
        t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("main");
		}
	}

	@Override
	public void run() {
		for (int i = 0; i<10;i++){
			System.out.println("Thread");
		}
		
	}
}
