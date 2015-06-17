package ba.bitcamp.vjezbe.display;

public class Display {

	private String manufacturerName;
	private int displayStrength;
	private boolean isOn;
	private int batteryUsage;

	/**
	 * <h1>Constructor for these attributes</h1>
	 * 
	 * @param manufacturerName
	 *            - represents inserted manufacturer name
	 * @param batteryUsage
	 *            - inserted battery usage
	 */
	public Display(String manufacturerName, int batteryUsage) {
		this.manufacturerName = manufacturerName;
		this.displayStrength = 100;
		this.isOn = isOn;
		this.batteryUsage = batteryUsage;
	}

	/**
	 * This method will turn on display
	 */
	public void turnOn() {
		isOn = true;
	}

	/**
	 * This method will turn off display
	 */
	public void turnOff() {
		isOn = false;
	}

	/**
	 * This method will increase display strength
	 */
	public void increaseDisplayStrength() {
		if (isOn == true) {
			displayStrength += 10;
		}
		if (displayStrength > 100) {
			displayStrength = 100;
		}
	}

	/**
	 * This method will decrease display strength
	 */
	public void decreaseDisplayStrength() {
		if (isOn == true) {
			displayStrength -= 10;
		}
		if (displayStrength < 0) {
			displayStrength = 0;
		}
	}

	/**
	 * This method checks if display is on, and then returns display strength
	 * @return
	 */
	public String checkStatus() {
		if (isOn = true) {
			return displayStrength + "";
		} else
			return "Off";
	}

	/**
	 * Prints manufacturer name and display strength
	 */
	public String toString() {
		String s = "";
		s = "Manufacturer name: \n" + manufacturerName;
		s = s + "\nDisplay strength: "+checkStatus();
		return s;

	}

}
