package ba.bitcamp.vjezbe.task4;

public abstract class Animal extends LifeForm {

	public static final int ANIMALS = 1;
	public static final int PLANTS = 2;

	private int weight;
	private int mainFood;

	/**
	 * <h1>Creating constructor for attributes weight and mainFood</h1>
	 * <p>
	 * 
	 * @param isAlive
	 *            - attribute from super class
	 * @param weight
	 *            - animal weight
	 * @param mainFood
	 *            - animal main food (Animals or plants)
	 */
	public Animal(boolean isAlive, int weight, int mainFood) {
		super(isAlive);
		this.weight = weight;
		this.mainFood = mainFood;

	}

	// Getters and Setters
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getMainFood() {
		return mainFood;
	}

	public void setMainFood(int mainFood) {
		this.mainFood = mainFood;
	}

	// This method will print informations about our animal
	public void printInformation() {
		String s = "";
		super.printInformation();
		s = "Animal weight: " + weight + " kg";
		if (mainFood == ANIMALS) {
			s = s + "\nAnimal main food is: Animals";
		} else if (mainFood == PLANTS) {
			s = s + "\nAnimal main food is: Plants";
		}
		System.out.println(s);

	}
    //Standard equals method
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (mainFood != other.mainFood)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}

	public abstract void eat(LifeForm lifeForm);

}
