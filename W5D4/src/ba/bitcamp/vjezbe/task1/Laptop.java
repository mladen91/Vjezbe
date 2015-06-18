package ba.bitcamp.vjezbe.task1;

public class Laptop extends PortableComputer {

	protected int howManyCells;
	protected boolean hasBluetooth;
	protected boolean hasNumericKeyboard;

	public int getHowManyCells() {
		return howManyCells;
	}

	public void setHowManyCells(int howManyCells) {
		this.howManyCells = howManyCells;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}

	public boolean isHasNumericKeyboard() {
		return hasNumericKeyboard;
	}

	public void setHasNumericKeyboard(boolean hasNumericKeyboard) {
		this.hasNumericKeyboard = hasNumericKeyboard;
	}

	public void printTypeInfo(){
		System.out.println("Main advantage of this computer is portability, battery etc.");
		System.out.println("The main idea is possibility of configurations as you wish.");
	} 
	
	public String toString(){
		String s="";
		s= "How many cells battery has: "+howManyCells;
		s=s+"\nBluetooth integrated: "+hasBluetooth;
		s=s+"\nNumeric keyboard integrated: "+hasNumericKeyboard;
		return s;
	}
}
