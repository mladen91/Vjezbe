package ba.bitcamp.vjezbe;

public class Suitcase {

	private Integer capacity;
	private Integer currentCapacity;

	public Suitcase(Integer capacity) {
		this.capacity = capacity;
		this.currentCapacity = 0;

	}

	/**
	 * <h1>This method will show us Max Capacity</h1>
	 * <p>
	 * @return max capacity
	 */
	public int getMaxCapacity() {
		return capacity;
	}

	/**
	 * <h1>This method will show us current capacity</h1>
	 * <p>
	 * @return current capacity
	 */
	public int getCurrentCapacity() {
		return currentCapacity;
	}

	/**
	 * <h1>This method will count free space in the bag</h1>
	 * <p>
	 * @return Free space
	 */
	public int getFreeSpace() {
		return capacity - currentCapacity;
	}

	/**
	 * <h1>This method will add weight to bag</h1>
	 * <p>
	 * @return New weight
	 */
	public void addToSuitcase(int n) {
		if (currentCapacity + n <= capacity) {
			currentCapacity += n;
		}
		System.out.println("New current capacity: "+currentCapacity);

	}
	
	/**
	 * <h1>This method will remove weight from bag</h1>
	 * <p>
	 * @return New weight
	 */
	public void removeFromSuitcase (int n) {
		currentCapacity -= n;
		System.out.println("Capacity after removal: "+currentCapacity);
	}

}
