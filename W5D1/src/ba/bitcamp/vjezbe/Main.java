package ba.bitcamp.vjezbe;

public class Main {

	public static void main(String[] args) {

		//Making a suitcase
		Suitcase s1 = new Suitcase(80);
		
		System.out.println("Max bag capacity is: "+s1.getMaxCapacity());
		System.out.println("Current bag capacity is: "+s1.getCurrentCapacity());
		s1.addToSuitcase(50);
		System.out.println("Current bag capacity is (free space left): "+s1.getFreeSpace());
		s1.removeFromSuitcase(10);
	}

}
