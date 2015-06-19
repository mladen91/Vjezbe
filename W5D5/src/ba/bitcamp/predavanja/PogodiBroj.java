package ba.bitcamp.predavanja;

import java.util.Scanner;

public class PogodiBroj {

	private int maxNumber;
	private int numberOfTry;

	public PogodiBroj(int maxNumber, int numberOfTry) {
		super();
		this.maxNumber = maxNumber;
		this.numberOfTry = numberOfTry;
	}

	public PogodiBroj(int maxNumber) {
		this(maxNumber, maxNumber / 100 + 1);

	}

	public PogodiBroj() {
		this(1000, 10);
	}

	public int getMaxNumber() {
		return maxNumber;
	}

	public void setMaxNumber(int maxNumber) {
		this.maxNumber = maxNumber;
	}

	public int getNumberOfTry() {
		return numberOfTry;
	}

	public void setNumberOfTry(int numberOfTry) {
		this.numberOfTry = numberOfTry;
	}
	
	public void game() {
		int counter = 0;
		int number = 0;
		int tryIt = 0;
		Scanner in = new Scanner(System.in);
		number = (int) (Math.random() * 99 + 1);
		while (true) {
			if (counter < numberOfTry) {
				System.out.println("Insert your number: ");
				tryIt = in.nextInt();
				counter++;
			} else {
				System.out.println("Game over!");
				System.out.println("Zamisljeni broj je: "+number);
				break;
			}
			if (tryIt == number) {
				System.out.println("You Won!");
			} else {
				if (counter >= numberOfTry) {
					System.out.println("Game over!");
					System.out.println("Zamisljeni broj je: "+number);
					break;
				} else {
					if (tryIt > number) {
						System.out.println("Zamislio sam manji broj!");
					} else if (tryIt < number) {
						System.out.println("Zamislio sam veci broj!");
					}
				}
			}
		}
		in.close();
	}

}
