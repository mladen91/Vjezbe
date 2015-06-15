import java.util.Scanner;

public class Task4 {

	public static int getRandomNumber(int min, int max) {
		int random = 0;
		for (int i = min; i < max; i++) {
			random = (int) (Math.random() * max + min);
		}
		if (min > max) {
			random = -1;
		} 
		return random;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert two parameters: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		System.out.println(getRandomNumber(num1, num2));

	}

}
