package Predavanje;

import Models.Planeta;

public class Objects {

	public static void main(String[] args) {
		
		Planeta pl= new Planeta( 100,  600, "Lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(64);
		System.out.println("PL MASA"+pl.vrijednostMase());
		System.out.println("PL TEZINA"+pl.racunajTezinu());

		Planeta bl = new Planeta (435, 444, "Kocka", "Kockalo");
		bl.dodajMasu(-500);
		System.out.println("BL MASA"+bl.vrijednostMase());
		System.out.println("BL TEZINA"+bl.racunajTezinu());
	
	
	
	}
	
	
	
	

}
