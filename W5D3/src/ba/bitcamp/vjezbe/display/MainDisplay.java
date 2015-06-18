package ba.bitcamp.vjezbe.display;

public class MainDisplay {

	public static void main(String[] args) {
		
        //Creating new display
		Display d1 = new Display("LG", 10);
		//Turning on display
		d1.turnOn();
		//Decrease display strength
		d1.decreaseDisplayStrength();
		System.out.println(d1);

	}

}
