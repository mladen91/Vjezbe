package ba.bitcamp.vjezbe.task1;

public abstract class StationaryComputer extends PersonalComputer {

	private double processorSpeed;
	private int psu;
	private int hdCapacity;
	
	

	public StationaryComputer(String oS, int memory, int price,
			double processorSpeed, int psu, int hdCapacity) {
		super(oS, memory, price);
		this.processorSpeed = processorSpeed;
		this.psu = psu;
		this.hdCapacity = hdCapacity;
	}

	public double getProcessorSpeed() {
		return processorSpeed;
	}

	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}

	public int getPsu() {
		return psu;
	}

	public void setPsu(int psu) {
		this.psu = psu;
	}

	public int getHdCapacity() {
		return hdCapacity;
	}

	public void setHdCapacity(int hdCapacity) {
		this.hdCapacity = hdCapacity;
	}
	
	public String toString(){
		String s="";
		s= "Processor speed: "+processorSpeed;
		s=s+"\nPSU: "+psu;
		s=s+"\nHD capacity: "+hdCapacity;
		return s;
	}
	public void printInformation(){
		String s="";
		super.printInformation();
		s= "Processor speed: "+processorSpeed;
		s=s+"\nPSU: "+psu;
		s=s+"\nHD capacity: "+hdCapacity;
		System.out.println(s);
	} 

}
