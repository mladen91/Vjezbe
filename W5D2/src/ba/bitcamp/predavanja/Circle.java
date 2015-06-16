package ba.bitcamp.predavanja;

import ba.bitcamp.predavanja.Spot;

public class Circle {

	private Spot center;
	private double radius;

	// Constructor for Circle
	public Circle(Spot c, double radius) {
		this.center = c;
		this.radius = radius;
	}

	/**
	 * <h1>This method will get Center of Circle for us</h1>
	 * 
	 * @return center
	 */
	public Spot getCenter() {
		return center;
	}

	/**
	 * <h1>This method will get Radius of Circle for us</h1>
	 * 
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <h1>This method will set Center of Circle for us</h1>
	 * 
	 * @return new center value
	 */
	public void setCenter(Spot c) {
		this.center = c;
	}

	/**
	 * <h1>This method will set radius of Circle for us</h1>
	 * 
	 * @return new radius value
	 */
	public void setRadius(double r) {
		this.radius = r;
	}

	/**
	 * This method will print our class
	 */
	public String toString() {
		String output = String.format("Center: %s, Radius: %.2f. ", center,
				radius);
		return output;

	}

	/**
	 * <h1>This method will check if two circles or two radius are equal</h1>
	 * 
	 * @param other
	 *            - represents another center or radius
	 * @return true if it's true, and false if it's not
	 */
	public boolean equals(Circle other) {
		if (this.center.equals(other.center) && this.radius == other.radius) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * <h1>This method will check if two circles would intersect each other.</h1>
	 * 
	 * @param other
	 *            - represents another value
	 * @return true if there is intersection, else print false
	 */
	public boolean Intersection(Circle other) {
		double sum = this.radius + other.radius;
		if (sum > this.center.calculateDistance(other.center)) {
			return true;
		} else {
			return false;
		}
	}

}
