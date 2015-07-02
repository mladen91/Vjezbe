package ba.bitcamp.vjezbe.task1;

public abstract class PortableComputer extends PersonalComputer {

	private double computerWeight;
	private double displaySize;
	private boolean supportWiFi;
	
	

	public PortableComputer(String oS, int memory, int price,
			double computerWeight, double displaySize, boolean supportWiFi) {
		super(oS, memory, price);
		this.computerWeight = computerWeight;
		this.displaySize = displaySize;
		this.supportWiFi = supportWiFi;
	}

	public double getComputerWeight() {
		return computerWeight;
	}

	public void setComputerWeight(double computerWeight) {
		this.computerWeight = computerWeight;
	}

	public double getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	public boolean isSupportWiFi() {
		return supportWiFi;
	}

	public void setSupportWiFi(boolean supportWiFi) {
		this.supportWiFi = supportWiFi;
	}
	
	public String toString(){
		String s="";
		s= "Computer weight: "+computerWeight;
		s=s+"\nDisplay size: "+displaySize;
		s=s+"\nDoes it support WiFi: "+supportWiFi;
		return s;
	}
	
	public void printInformation(){
		String s="";
		super.printInformation();
		s= "Computer weight: "+computerWeight;
		s=s+"\nDisplay size: "+displaySize;
		s=s+"\nDoes it support WiFi: "+supportWiFi;
		System.out.println(s);
	} 
	

}
