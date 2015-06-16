package ba.bitcamp.predavanja;

public class MainCircle {

	public static void main(String[] args) {

		Spot s1 = new Spot(3, 3);
		Spot s2 = new Spot(500, 50);

		Circle c1 = new Circle(s1, 10);
		Circle c2 = new Circle(s2, 15);
		System.out.println(s1.calculateDistance(s2));
		System.out.println(c1);
		System.out.println(c1.Intersection(c2));

	}

}
