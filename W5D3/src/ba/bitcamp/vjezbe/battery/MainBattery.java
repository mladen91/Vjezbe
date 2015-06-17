package ba.bitcamp.vjezbe.battery;

public class MainBattery {

	public static void main(String[] args) {
		
		Battery b1 = new Battery("Battery life", 2);
		b1.chargeBattery(10);
		b1.decreaseBattery(5);
		System.out.println(b1);

	}

}
