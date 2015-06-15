import ba.bitcamp.dreamteam.TextIO;


public class Proba2 {

	public static void main(String[] args) {

		TextIO.readFile("src/Draw");
		
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];
			

			System.out.println(part1);
		}
		TextIO.readStandardInput();

	}

}
