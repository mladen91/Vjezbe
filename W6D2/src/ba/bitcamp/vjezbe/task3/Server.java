package ba.bitcamp.vjezbe.task3;

import ba.bitcamp.vjezbe.task1.Computer;

public class Server extends Computer{

	private int maxNumOfComputers;

	//Getters setters
	public int getMaxNumOfComputers() {
		return maxNumOfComputers;
	}

	public void setMaxNumOfComputers(int maxNumOfComputers) {
		this.maxNumOfComputers = maxNumOfComputers;
	}

	public Server(String name, char[] macAddress, int maxNumOfComputers) {
		super(name, macAddress);
		this.maxNumOfComputers = maxNumOfComputers;
	}

	@Override
	public String toString() {
		return "Server [maxNumOfComputers=" + maxNumOfComputers + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Server other = (Server) obj;
		if (maxNumOfComputers != other.maxNumOfComputers)
			return false;
		return true;
	}
	
	
	
	
}
