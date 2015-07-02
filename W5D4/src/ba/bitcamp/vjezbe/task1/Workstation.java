package ba.bitcamp.vjezbe.task1;

public class Workstation extends StationaryComputer {

	protected int howManyDisplays;
	protected int howManyCores;
	protected boolean hasEccMemory;
	
	

	public Workstation(String oS, int memory, int price, double processorSpeed,
			int psu, int hdCapacity, int howManyDisplays, int howManyCores,
			boolean hasEccMemory) {
		super(oS, memory, price, processorSpeed, psu, hdCapacity);
		this.howManyDisplays = howManyDisplays;
		this.howManyCores = howManyCores;
		this.hasEccMemory = hasEccMemory;
	}

	public int getHowManyDisplays() {
		return howManyDisplays;
	}

	public void setHowManyDisplays(int howManyDisplays) {
		this.howManyDisplays = howManyDisplays;
	}

	public int getHowManyCores() {
		return howManyCores;
	}

	public void setHowManyCores(int howManyCores) {
		this.howManyCores = howManyCores;
	}

	public boolean isHasEccMemory() {
		return hasEccMemory;
	}

	public void setHasEccMemory(boolean hasEccMemory) {
		this.hasEccMemory = hasEccMemory;
	}
	
	public void printTypeInfo(){
		System.out.println("Workstations are used for scientific and research work with many operations");
	}
	public String toString(){
		String s="";
		s= "How many displays pc has: "+howManyDisplays;
		s=s+"\nHow many processors pc has: "+howManyCores;
		s=s+"\nECC memory: "+hasEccMemory;
		return s;
	}
	public void printInformation() {
		String s="";
		super.printInformation();
		s= "How many displays pc has: "+howManyDisplays;
		s=s+"\nHow many processors pc has: "+howManyCores;
		s=s+"\nECC memory: "+hasEccMemory;
		System.out.println(s);
	}

}
