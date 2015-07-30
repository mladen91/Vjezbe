package predavanja;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		NamedThread name1 = new NamedThread("Joey");
		NamedThread name2 = new NamedThread("Rachel");
		NamedThread name3 = new NamedThread("Mark");

		name1.start();
		name2.start();
		name3.start();
		name1.join();
		name2.join();
		name3.join();
		System.out.println("End of main");

	}

}