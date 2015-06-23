package ba.bitcamp.vjezbe.task4;

import ba.bitcamp.vjezbe.task1.Computer;
import ba.bitcamp.vjezbe.task2.Network;

public class Client extends Computer implements Connectable {

	private Computer connectedWith;
	private Network whichNetworkConnected;

	//Constructor for getting computer name, and mac address
	public Client(String name, char[] macAddress) {
		super(name, macAddress);
		this.connectedWith = connectedWith;
		this.whichNetworkConnected = whichNetworkConnected;
	}
    //Getters 
	public Computer getConnectedWith() {
		
		return connectedWith;
	}

	public Network getWhichNetworkConnected() {
		return whichNetworkConnected;
	}

	//Method that connects two computers 
	@Override
	public void connect(Computer c) {
		if (connectedWith!=null || whichNetworkConnected!=null){
			throw new IllegalArgumentException("Error");
		}else
		connectedWith = c;

	}
    //Method that gives link to network 
	@Override
	public void connect(Network n) {
		if (connectedWith!=null || whichNetworkConnected!=null){
			throw new IllegalArgumentException("Error");
		}else
		whichNetworkConnected = n;

	}

	@Override
	public void disconnect() {
		whichNetworkConnected = null;
		connectedWith = null;
	}

	@Override
	public String toString() {
		return "Client [connectedWith=" + connectedWith
				+ ", whichNetworkConnected=" + whichNetworkConnected + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (connectedWith == null) {
			if (other.connectedWith != null)
				return false;
		} else if (!connectedWith.equals(other.connectedWith))
			return false;
		if (whichNetworkConnected == null) {
			if (other.whichNetworkConnected != null)
				return false;
		} else if (!whichNetworkConnected.equals(other.whichNetworkConnected))
			return false;
		return true;
	}
	
	

}
