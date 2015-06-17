package ba.bitcamp.vjezbe.display;

public class MainDisplay {

	public static void main(String[] args) {
		

		Display d1 = new Display("LG", 10);
		d1.turnOn();
		d1.decreaseDisplayStrength();
		System.out.println(d1);

	}

}
