package ba.bitcamp.vjezbe.task1;

public class DesktopComputer extends StationaryComputer {

	protected int freeSpaceForMemory;
	protected boolean isOverclocked;
	protected boolean hasOpticalDrive;
	
	public DesktopComputer(String oS, int memory, int price,
			double processorSpeed, int psu, int hdCapacity,
			int freeSpaceForMemory, boolean isOverclocked,
			boolean hasOpticalDrive) {
		super(oS, memory, price, processorSpeed, psu, hdCapacity);
		this.freeSpaceForMemory = freeSpaceForMemory;
		this.isOverclocked = isOverclocked;
		this.hasOpticalDrive = hasOpticalDrive;
	}

	public int getFreeSpaceForMemory() {
		return freeSpaceForMemory;
	}

	public void setFreeSpaceForMemory(int freeSpaceForMemory) {
		this.freeSpaceForMemory = freeSpaceForMemory;
	}

	public boolean isOverclocked() {
		return isOverclocked;
	}

	public void setOverclocked(boolean isOverclocked) {
		this.isOverclocked = isOverclocked;
	}

	public boolean isHasOpticalDrive() {
		return hasOpticalDrive;
	}

	public void setHasOpticalDrive(boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}

	public void printTypeInfo(){
		System.out.println("Desktop computer has wide usage.");
		System.out.println("The main idea is possibility of configurations as you wish.");
	} 
	public String toString(){
		String s="";
		s= "How many RAM free slots: "+freeSpaceForMemory;
		s=s+"\nOverclocked PC: "+isOverclocked;
		s=s+"\nOptical drive: "+hasOpticalDrive;
		return s;
	}
	public void printInformation(){
		String s="";
		super.printInformation();
		s= "How many RAM free slots: "+freeSpaceForMemory;
		s=s+"\nOverclocked PC: "+isOverclocked;
		s=s+"\nOptical drive: "+hasOpticalDrive;
		System.out.println(s);
	} 
}
