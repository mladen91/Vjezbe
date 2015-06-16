package ba.bitcamp.predavanja;

public class Spot {

	private Integer x;
	private Integer y;

	public Spot(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Get coordinate x
	 * 
	 * @return coordinate x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Get coordinate y
	 * 
	 * @return coordinate y
	 */
	public int getY() {
		return y;
	}

	/**
	 * This method will print our class
	 */

	public String toString() {
		String output = String.format("Coordinate X: %d, Coordinate Y: %d. ",
				x, y);
		return output;

	}

	/**
	 * <h1>This method will check if first spot is equal to second</h1>
	 * 
	 * @param other
	 *            - represents other spot
	 * @return - true if its equal, false if it is not equal.
	 */
	public boolean equals(Spot other) {
		if (this.x == other.x && this.y == other.y) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <h1>This method will calculate distance between two spots
	 * 
	 * @param other
	 *            - represents other spot
	 * @return distance between two spots
	 */
	public double calculateDistance(Spot other) {
		double d;
		int deltaX = this.x - other.x;
		int deltaY = this.y - other.y;
		d = Math.sqrt((double) (deltaX) * (double)(deltaX) + (double) (deltaY)
				* (double)(deltaY));

		return d;
	}

}
