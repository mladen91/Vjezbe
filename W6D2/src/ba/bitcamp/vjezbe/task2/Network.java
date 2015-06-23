package ba.bitcamp.vjezbe.task2;

import ba.bitcamp.vjezbe.task1.Computer;

public abstract class Network {

	private String networkName;
	private Computer[] arrayComputer;
    //Constructor that adds network name and get array of computers
	public Network(String networkName, Computer[] arrayComputer) {
		this.networkName = networkName;
		this.arrayComputer = null;
	}
	
	

	public String getNetworkName() {
		return networkName;
	}



	public Computer[] getArrayComputer() {
		return arrayComputer;
	}



	// Abstract method for adding computers
	public abstract void addComputer(Computer c);

	// Abstract method for removing computers
	public abstract void removeComputer(Computer c);

}
