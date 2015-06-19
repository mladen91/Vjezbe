package ba.bitcamp.vjezbe.task4;

public class Zebra extends Animal {

	public static final int HEALTHLY = 1;
	public static final int SICK = 2;
	public static final int DEADLYSICK = 3;

	private int age;
	private int state;

	/**
	 * <h1>Creating constructor for these attributes</h1>
	 * <p>
	 * 
	 * @param isAlive
	 *            - checks if animal is alive
	 * @param weight
	 *            - represents animal weight
	 * @param mainFood
	 *            - represents animal favorite food (animals or plants)
	 * @param age
	 *            - Zebra age
	 * @param state
	 *            - Zebra status
	 */
	public Zebra(boolean isAlive, int weight, int mainFood, int age, int state) {
		super(isAlive, weight, mainFood);
		this.age = age;
		this.state = state;
		mainFood = PLANTS;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zebra other = (Zebra) obj;
		if (age != other.age)
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	// This method will print informations about Zebra
	public void printInformation() {
		String s = "";
		super.printInformation();
		s = "Animal is: " + age + " months old.";
		if (state == HEALTHLY) {
			s = s + "\nZebra health status: Healthly";
		} else if (state == SICK) {
			s = s + "\nZebra health status: Sick";
		} else {
			s = s + "\nZebra health status: Deadly sick";
		}
		System.out.println(s);
	}

	/**
	 * This method will simulate Zebras meal Zebra wouldn't eat another animals
	 * If Zebra tries to attack tiger, tiger will eat itself. Zebra will only
	 * eat plants
	 */
	public void eat(LifeForm lifeForm) {
		if (lifeForm instanceof Animal) {
			Animal animal = (Animal) lifeForm;
			if (animal instanceof Tiger) {
				System.out.println("Tiger will eat Zebra");
			} else if (animal instanceof Zebra) {
				Zebra zebra = (Zebra) animal;
				System.out.println("Zebra wouldn't eat animals.");
			}
		}
		if (lifeForm instanceof Plants) {
			Plants plant = (Plants) lifeForm;
			if (plant instanceof Plants) {
				if (plant.isPoisonous() == true) {
					System.out.println("Zebra will die");
				} else
					System.out.println("Zebra will eat this plant.");
			}
		}
	}

	public String toString() {
		return "Zebra";
	}

}
