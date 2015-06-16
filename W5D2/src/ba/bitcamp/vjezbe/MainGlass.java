package ba.bitcamp.vjezbe;

public class MainGlass {

	public static void main(String[] args) {
		
		Glass g1 = new Glass(80);
		//Adding liquid and name of drink
		g1.addLiquid("7UP", 50);
		//Getting current capacity
		System.out.println(g1.getCurrentCapacity());
		//Getting type of liquid
		System.out.println(g1.getTypeOfLiquid());

	}

}
