package ba.bitcamp.vjezbe.battery;

public class Battery {

	private String batteryManufacturerName;
	private double batteryPercent;
	private double chargingSpeed;

	/**
	 * <h1>Creating constructor for attributes</h1>
	 * 
	 * @param batteryManufacturerName
	 *            - manufacturer name
	 * @param chargingSpeed
	 *            - charging speed
	 */
	public Battery(String batteryManufacturerName, double chargingSpeed) {
		this.batteryManufacturerName = batteryManufacturerName;
		this.batteryPercent = batteryPercent = 50;
		this.chargingSpeed = chargingSpeed;
	}

	/**
	 * <h1>Getting battery manufacturer name</h1>
	 * 
	 * @return manufacturer name
	 */
	public String getBatteryManufacturerName() {
		return batteryManufacturerName;
	}

	/**
	 * <h1>Getting battery percent</h1>
	 * 
	 * @return battery percent
	 */
	public double getBatteryPercent() {
		return batteryPercent;
	}

	/**
	 * <h1>Method that charges battery</h1>
	 * <p>
	 * 
	 * @param time
	 *            - represents time parameter
	 * @return new battery percent
	 */
	public double chargeBattery(double time) {
		return batteryPercent += chargingSpeed * time;
	}

	/**
	 * <h1>Method that decreases battery percent</h1>
	 * <p>
	 * 
	 * @param parameter
	 *            - represents parameter that decreases battery percent
	 * @return new battery percent
	 */
	public double decreaseBattery(double parameter) {

		if (batteryPercent - parameter<0) {
			batteryPercent = 0;
		} else {
			 batteryPercent -= parameter;
		} return batteryPercent;
	}
	/**
	 * This method prints manufacturer name and battery status
	 */
	public String toString(){
		String s="";
		s="Manufacturer name: "+batteryManufacturerName;
		s="\n Battery percent: "+batteryPercent;
		return s;
	}

}
