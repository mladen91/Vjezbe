package ba.bitcamp.vjezbe.speaker;

public class Speaker {

	private static final int MAXVOLUME = 100;
	private static final int MINVOLUME = 10;

	private String manufacturerName;
	private int speakerPrize;
	private boolean isOn;
	private int currentVolume;
	private double batteryUsage;

	/**
	 * Creating constructor
	 * 
	 * @param manufacturerName
	 *            - represents manufacturer name
	 * @param speakerPrize
	 *            - represents speaker prize
	 * @param batteryUsage
	 *            - represents battery usage
	 */
	public Speaker(String manufacturerName, int speakerPrize,
			double batteryUsage) {

		if (speakerPrize<0) {
			throw new IllegalArgumentException("Prize can't be negative.");
		}
		this.manufacturerName = manufacturerName;
		this.speakerPrize = speakerPrize;
		this.batteryUsage = batteryUsage;
		this.isOn = isOn = true;
		this.currentVolume = currentVolume = 0;
	}

	/**
	 * <h1>This method will get manufacturer name</h1>
	 * 
	 * @return manufacturer name
	 */
	public String getManufacturerName() {
		return manufacturerName;
	}

	/**
	 * <h1>This method will get speaker prize</h1>
	 * 
	 * @return speaker prize
	 */
	public int getSpeakerPrize() {
		return speakerPrize;
	}

	/**
	 * <h1>This method will get current volume</h1>
	 * 
	 * @return current volume
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}

	/**
	 * <h1>This method will turn on speaker</h1>
	 */
	public void enable() {
		isOn = true;
	}

	/**
	 * <h1>This method will turn off speaker</h1>
	 */
	public void disable() {
		isOn = false;
	}

	/**
	 * <h1>This method will decrease speaker volume by 10</h1>
	 */
	public void lowerVolume() {
		if (isOn == true && currentVolume > MINVOLUME) {
			currentVolume -= 10;

		}
	}

	/**
	 * <h1>This method will increase speaker volume by 10</h1>
	 */
	public void increaseVolume() {
		if (isOn == true && currentVolume < MAXVOLUME) {
			currentVolume += 10;
		}
	}

	/**
	 * <h1>This method will check if speaker is on, and print current volume</h1>
	 * 
	 * @return
	 */
	public String CheckOn() {
		if (isOn == true) {
			return getCurrentVolume() + "";
		} else {
			return "Off";
		}
	}

	/**
	 * This method will print manufacturer name, and speaker status
	 */
	public String toString() {
		String s = " ";
		s = "Manufacturer name: " + manufacturerName;
		s = s + "\nAre speakers on: " + CheckOn();
		return s;
	}

}
