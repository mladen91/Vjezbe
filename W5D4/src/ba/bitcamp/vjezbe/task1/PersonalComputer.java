package ba.bitcamp.vjezbe.task1;

public abstract class PersonalComputer {

	private String oS;
	private int memory;
	private int prize;

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
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}
	
	public String toString(){
		String s="";
		s= "Operating system: "+oS;
		s=s+"\nRAM memory: "+memory;
		s=s+"\nPrize of computer: "+prize;
		return s;
	}

}
