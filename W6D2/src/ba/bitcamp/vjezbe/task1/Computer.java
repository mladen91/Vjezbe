package ba.bitcamp.vjezbe.task1;

import java.util.Arrays;

public abstract class Computer {

	private String name;
	private MACAddress macAddress;

	// Constructor for getting name and mac address
	public Computer(String name, char[] macAddress) {
		this.name = name;
		this.macAddress = new MACAddress(macAddress);
	}

	// Empty constructor that defines default name, and mac address
	public Computer() {

		this.name = "Default Computer";
		this.macAddress = null;
	}

	// Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMacAddress() {
		return macAddress.toString();
	}

	public void setMacAddress(MACAddress macAddress) {
		this.macAddress = macAddress;
	}

	/**
	 * MAC Address class that defines mac address
	 * 
	 * @author mladen.teofilovic
	 *
	 */
	public class MACAddress {
		// 0123456789ab
		private char[] mac = new char[12];

		public MACAddress(char[] mac) {
			this.mac = mac;
		}

		@Override
		// 01:23:45:67:89:ab
		public String toString() {
			return "MACAddress [mac=" + Arrays.toString(mac) + "]";
		}

	}

}
