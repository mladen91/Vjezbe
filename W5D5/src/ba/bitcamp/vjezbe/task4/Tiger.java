package ba.bitcamp.vjezbe.task4;

public class Tiger extends Animal {

	public static final int IDLE = 1;
	public static final int HUNTING = 2;
	public static final int EATING = 3;

	private int speed;
	private int state;

	/**
	 * <h1>Creating constructor for attributes from super class, and from this
	 * class</h1>
	 * <p>
	 * 
	 * @param isAlive
	 *            - checks if animal is alive
	 * @param weight
	 *            - represents animal weight
	 * @param mainFood
	 *            - represents animal favorite food (animals or plants)
	 * @param speed
	 *            - animal speed
	 * @param state
	 *            - animal state (idle, hunting, eating)
	 */
	public Tiger(boolean isAlive, int weight, int mainFood, int speed, int state) {
		super(isAlive, weight, mainFood);
		this.speed = speed;
		this.state = state;
		mainFood = ANIMALS;
	}

	// Getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
		Tiger other = (Tiger) obj;
		if (speed != other.speed)
			return false;
		if (state != other.state)
			return false;
		return true;
	}

	// This method will print informations about tiger
	public void printInformation() {
		String s = "";
		super.printInformation();
		s = "Animal speed: " + speed + " km/h";
		if (state == IDLE) {
			s = s + "\nTiger state: Idle";
		} else if (state == HUNTING) {
			s = s + "\nTiger state: Hunting";
		} else {
			s = s + "\nTiger state: Eating";
		}

		System.out.println(s);
	}

	/**
	 * Eating method for tiger Tiger will eat every animal except tiger 
	 * Tiger would die if he has eaten sick animal
	 * Tiger wouldn't eat himself.
	 */
	public void eat(LifeForm lifeForm) {
		if (lifeForm.isAlive() == true) {
			if (lifeForm instanceof Animal) {
				Animal animal = (Animal) lifeForm;
				if (animal instanceof Tiger) {
					System.out.println("I don't eat tigers");
				} else if (animal instanceof Zebra) {
					Zebra zebra = (Zebra) animal;

					if (zebra.getState() == Zebra.DEADLYSICK
							|| zebra.getState() == Zebra.SICK) {
						System.out.println("Tiger will die");
					} else {

						if (state == IDLE) {
							System.out.println("Tiger is resting.");
						} else if (state == HUNTING) {
							System.out.println("Tiger is hunting");
							System.out.println("Tiger will eat: " + zebra);
							state = EATING;
						} else if (state == EATING) {
							System.out.println("Tiger is eating zebra.");
						}
					}
				}
			}
		} else {
			System.out.println("Your tiger is dead");
		}
	}

}
