package ba.bitcamp.vjezbe.task1;

public abstract class PersonalComputer {

	private String oS;
	private int memory;
	private int price;
	
	

	public PersonalComputer(String oS, int memory, int prize) {
		super();
		this.oS = oS;
		this.memory = memory;
		this.price = prize;
	}

	public String getoS() {
		return oS;
	}

	public void setoS(String oS) {
		this.oS = oS;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public int getPrize() {
		return price;
	}

	public void setPrize(int prize) {
		this.price = prize;
	}

	public String toString() {
		String s = "";
		s = "Operating system: " + oS;
		s = s + "\nRAM memory: " + memory;
		s = s + "\nPrize of computer: " + price;
		return s;
	}
	public void printInformation(){
		String s = "";
		
		s = "Operating system: " + oS;
		s = s + "\nRAM memory: " + memory;
		s = s + "\nPrize of computer: " + price;
		System.out.println(s);
	} 
	

}
