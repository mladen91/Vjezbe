import java.util.Scanner;

public class MladenInput {

	public static void inputCurrency() {
		TextIO.readFile("src/Currency.txt");
		System.out.println("Ponudjene valute za konverziju:");
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];

			System.out.println(part1);
		}
		TextIO.readStandardInput();
		System.out.println("Which currency you want to convert: ");
		Scanner in = new Scanner(System.in);
		String currency1 = in.nextLine();
		System.out.println("In which currency you want to convert: ");
		String currency2 = in.nextLine();
		System.out.println("How much " + currency1 + " you want to convert:");
		double value = in.nextDouble();
	}

	public static void main(String[] args) {

		inputCurrency();

	}

}
