package ba.bitcamp.vjezbe.part2.task3;

import ba.bitcamp.vjezbe.part2.task1.Functionable;
import ba.bitcamp.vjezbe.part2.task2.ArrayManipulation;
import ba.bitcamp.vjezbe.task1.Computer;
import ba.bitcamp.vjezbe.task2.Network;
import ba.bitcamp.vjezbe.task3.Server;
import ba.bitcamp.vjezbe.task4.Client;

public class BusNetwork extends Network implements Functionable {

	private int counter;

	public BusNetwork(String networkName, Computer[] arrayComputer) {
		super(networkName, arrayComputer);

	}

	@Override
	// This method will check if our network is functioning
	public boolean isFunctioning() {
		counter = 0;
		for (int i = 0; i < getArrayComputer().length; i++) {

			if (getArrayComputer() != null) {
				counter++;

			}
		}
		if (counter >= 2) {
			return true;
		} else
			return false;
	}

	@Override
	// This method will add computer to network
	public void addComputer(Computer c) {

		ArrayManipulation.extendArray(getArrayComputer());
		getArrayComputer()[getArrayComputer().length - 1] = c;
		if (c instanceof Server) {
			throw new IllegalArgumentException("You can't add server.");
		} else if (c instanceof Client) {
			Client comp = (Client) c;
			comp.connect(this);
		}

	}

	@Override
	// This method will remove computer from network
	public void removeComputer(Computer c) {

		if (c instanceof Server) {
			throw new IllegalArgumentException("You can't remove server.");
		} else if (c instanceof Client) {
			Client comp = (Client) c;
			comp.disconnect();
			for (int i = 0; i < getArrayComputer().length; i++) {
				if (c.getName().equals(getArrayComputer()[i].getName())) {
					ArrayManipulation.shrinkArray(getArrayComputer(), i);
					return;
				}
			}
		}
		throw new IllegalArgumentException("Computer not found.");

	}

	public String toString(){
		String s="";
		
		s= ""+counter;
		s=s+
	}
}
