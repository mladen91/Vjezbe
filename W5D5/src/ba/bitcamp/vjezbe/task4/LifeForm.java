package ba.bitcamp.vjezbe.task4;

public abstract class LifeForm {

	private boolean isAlive;

	/**
	 * <h1>Creating constructor for attribute isAlive</h1>
	 * 
	 * @param isAlive
	 *            - checks if animal is alive
	 */
	public LifeForm(boolean isAlive) {
		super();
		this.isAlive = isAlive;
	}

	// Getters and setters
	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	//Standard equals method
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LifeForm other = (LifeForm) obj;
		if (isAlive != other.isAlive)
			return false;
		return true;
	}

	//Prints basic information about animal
	public void printInformation() {
		String s = "";
		s = "Is this animal alive: " + isAlive;
	}

}
