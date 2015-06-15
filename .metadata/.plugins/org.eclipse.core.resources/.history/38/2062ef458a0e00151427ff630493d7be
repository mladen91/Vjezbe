import java.util.Scanner;


public class MladenInput {

	public static void inputCurrency() {
		TextIO.readFile("src/Currency.txt");
		System.out.println("Ponudjene valute za konverziju:");
		while (!TextIO.eof()) {
			String s= TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];
			
		System.out.println(part1);
		}
		TextIO.readStandardInput();
		System.out.println("Koju valutu zelite pretvoriti .npr EUR");
		Scanner in= new Scanner (System.in);
		String value1= in.nextLine();
		System.out.println("U koju valutu pretvarate: ");
		String valute2=in.nextLine();		
		System.out.println("Koliko"+value1+" zelite pretvoriti:");
		int value= in.nextInt();
	}
	
	
	
	public static void main(String[] args) {
		

		inputCurrency();
		

	}

}
