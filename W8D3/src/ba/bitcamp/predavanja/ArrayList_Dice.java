package ba.bitcamp.predavanja;

import java.util.Random;

public class ArrayList_Dice {
	static Random rnd = new Random();
	
	public static int throwDice(){
		int diceOne = rnd.nextInt(6)+1;
		int diceTwo = rnd.nextInt(6)+1;
		return diceOne+diceTwo;
	}
	
	public static void main(String[] args) {
		int result;
		int[] distribution = new int[13]; 
		
		for (int i= 0; i<36;i++){
			result = throwDice();
			distribution[result-1]++;
			
			
		}
		for (int i = 2; i<13; i++){
				System.out.println(i+" -> " +distribution[i]);
			}

	}

}
