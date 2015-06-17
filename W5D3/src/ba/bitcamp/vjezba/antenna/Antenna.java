package ba.bitcamp.vjezba.antenna;

public class Antenna {

	private String antennaManufacturer;
	private int signalPower;
	private int batteryUsage;
    /**
     * <h1>Creating constructors for there attributes</h1>
     * @param antennaManufacturer - manufacturer name 
     * @param batteryUsage - represents battery usage
     */
	public Antenna(String antennaManufacturer, int batteryUsage) {
		this.antennaManufacturer = antennaManufacturer;
		this.signalPower = 4;
		this.batteryUsage = batteryUsage;
	}

	/**
	 * <h1>Getting Anntena Manufacturer
	 * @return antenna manufacturer
	 */
	public String getAntennaManufacturer() {
		return antennaManufacturer;
	}

	/**
	 * <h1>Getting Signal Power</h1>
	 * <p>
	 * @return signal strength
	 */
	public int getSignalPower() {
		return signalPower;
	}

	/**
	 *  <h1>Setting signal strength</h1>
	 * <p>
	 * @param power - signal strength
	 */
	public void setSignalPower(int power) {
		if (power > 4 || power < 0) {
			System.out.println("Insert signal power between 0-4");
		} else {
			signalPower = power;
		}
	}

	/**
	 *  <h1>This method will check incoming signal</h1>
	 * <p>
	 * @param signalPow - represents signal power of new call
	 * @param signal - represents  string signal
	 * @return - 
	 */
	public boolean incomingSignal(int signalPow, String signal) {
		String firstThreeLetters = signal.substring(0, 3);
		String secondThreeLetters = signal.substring(3, 6);

		if (signalPow > signalPower) {
			return false;
		}

		if (firstThreeLetters.equals("CAL") || firstThreeLetters.equals("SMS")) {
			return true;
		} else if (!firstThreeLetters.equals("CAL")
				&& !firstThreeLetters.equals("SMS")) {
			return false;
		}
		if (secondThreeLetters.equals("387")) {
			return true;
		} else if (!secondThreeLetters.equals("387")) {
			return false;
		}
		if (signal.length() - 3 == 11) {
			return true;
		} else if (signal.length() - 3 != 11) {
			return false;
		}

		return true;

	}

	/**
	 * This method will print manufacturer name and signal strength
	 */
	public String toString() {
		String s = "";
		s = "Manufacturer name: " + antennaManufacturer;
		s = s + "\nSignal strenght: " + signalPower;
		return s;
	}
}
