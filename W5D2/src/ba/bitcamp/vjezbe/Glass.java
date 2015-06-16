package ba.bitcamp.vjezbe;

public class Glass {

	private String liquidType;
	private int liquidQuantity;
	private int maxLiquid;

	// Creating constructor
	public Glass(int maxLiquid) {
		this.liquidType = null;
		this.liquidQuantity = 0;
		this.maxLiquid = maxLiquid;

	}

	/**
	 * <h1>This method will get us type of liquid we want</h1>
	 * 
	 * @return type of liquid
	 */
	public String getTypeOfLiquid() {
		return liquidType;
	}

	/**
	 * <h1>This method will get us max Glass capacity</h1>
	 * 
	 * @return max capacity
	 */
	public int getMaxCapacity() {
		return maxLiquid;
	}

	/**
	 * <h1>This method will get current glass capacity</h1>
	 * 
	 * @return liquid in glass
	 */
	public int getCurrentCapacity() {
		return liquidQuantity;
	}

	/**
	 * <h1>This method will add liquid in glass</h1>
	 * 
	 * @return new liquid quantity
	 */
	public void addLiquid(String lt, int quantity) {
		if (liquidType == null) {
			liquidType = lt;
			liquidQuantity += quantity;
		} else if (liquidType.equals(lt)) {
			liquidQuantity += quantity;
			if (liquidQuantity > maxLiquid) {
				liquidQuantity = maxLiquid;
			}

		}

	}

	/**
	 * Method that returns quantity to 0
	 */
	public void emptyGlass() {
		liquidQuantity = 0;
	}

}
