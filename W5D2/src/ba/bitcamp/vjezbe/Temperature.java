package ba.bitcamp.vjezbe;

public class Temperature {

	//Attribute
	private double temperatureValue;
	
	//Constructor for temperature value
	public Temperature ( double t) {
		temperatureValue=t;
	}
	/**
	 * <h1>This method will generate temperature in Celsius</h1>
	 * <p>
	 * @return temperature in celsius
	 */
	public double getTemperatureInC() {
		return temperatureValue;
	}
	/**
	 * <h1>This method will generate temperature in Kelvin</h1>
	 * <p>
	 * @return temperature in Kelvin
	 */
	public double getTemperatureInK() {
		return temperatureValue+273.15;
	}
	
	/**
	 * <h1>This method will generate temperature in Fahrenheit</h1>
	 * <p>
	 * @return temperature in Fahrenheit
	 */
	public double getTemperatureInF() {
		return (temperatureValue*9/5)+32;
	}
	
	/**
	 * <h1>This method will set new temperature value in Celsius</h1>
	 * <p>
	 * @return new temperature value
	 */
	public void setTemperature(int t) {
		temperatureValue=t;
		System.out.println(temperatureValue);
	}
}
