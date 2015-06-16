package ba.bitcamp.predavanja;

public class Main2 {

	public static void main(String[] args) {
		
		Spot s = new Spot(5, 10);
		
		System.out.println(s);

		System.out.printf("Distance: %.2f",s.calculateDistance(s));
	}

}
