package ba.bitcamp.vjezba.antenna;

public class MainAntenna {

	public static void main(String[] args) {
		

		Antenna a1= new Antenna("Samsung", 10);
		System.out.println(a1.incomingSignal(3, "CAL38761550661"));
		System.out.println(a1);

	}

}
