package Vjezbe;

public class Drink {

	
	String name;
	boolean isSoda;
	int expirationYear;
	String colour;
	
	public String toString() {
		String s = "";
		s=s+"Name: " + name + "\n";
		s=s+ "Is soda: " + isSoda + "\n";
		s=s+ "Colour: " + colour;
		
		return s;
		
	}
}
