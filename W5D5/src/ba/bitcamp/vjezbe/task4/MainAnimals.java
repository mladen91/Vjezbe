package ba.bitcamp.vjezbe.task4;

public class MainAnimals {

	public static void main(String[] args) {

		Zebra z = new Zebra(true, 100, Animal.PLANTS, 20, Zebra.HEALTHLY);
		Tiger t1 = new Tiger(true, 20, Tiger.ANIMALS, 20, Tiger.EATING);
		Plants p1 = new Plants(true, true, Plants.HIGH);
		// t1.printInformation();

		t1.eat(z);
		 z.eat(p1);
	}

}
