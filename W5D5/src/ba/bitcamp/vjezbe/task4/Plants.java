package ba.bitcamp.vjezbe.task4;

public class Plants extends LifeForm {

	public static final int LOW = 1;
	public static final int NORMAL = 2;
	public static final int HIGH = 3;

	private boolean isPoisonous;
	private int quantity;

	public Plants(boolean isAlive, boolean isPoisonous, int quantity) {
		super(isAlive);
		this.isPoisonous = isPoisonous;
		this.quantity = quantity;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plants other = (Plants) obj;
		if (isPoisonous != other.isPoisonous)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	// This method will print informations about plants
	public void printInformation() {
		String s = "";
		super.printInformation();
		s = "Is plant poisonous: " + isPoisonous;
		if (quantity == LOW) {
			s = s + "\nQuantity of parts that you can eat: Low";
		} else if (quantity == NORMAL) {
			s = s + "\nQuantity of parts that you can eat: Normal";
		} else {
			s = s + "\nQuantity of parts that you can eat: High";
		}

		System.out.println(s);
	}

}
