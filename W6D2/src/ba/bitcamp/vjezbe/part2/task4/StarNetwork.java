package ba.bitcamp.vjezbe.part2.task4;

import ba.bitcamp.vjezbe.part2.task1.Functionable;
import ba.bitcamp.vjezbe.task1.Computer;
import ba.bitcamp.vjezbe.task2.Network;
import ba.bitcamp.vjezbe.task3.Server;

public class StarNetwork extends Network implements Functionable {

	private Server s;
	
	public StarNetwork(String networkName, Computer[] arrayComputer) {
		super(networkName, arrayComputer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isFunctioning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addComputer(Computer c) {
	
		
	}

	@Override
	public void removeComputer(Computer c) {
		// TODO Auto-generated method stub
		
	}

	
}
