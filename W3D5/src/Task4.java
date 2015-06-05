
public class Task4 {

	public static void writeToFile(String filename, String msg) {
		
		
		TextIO.readFile(filename);
		TextIO.writeFile(filename);
		TextIO.putln(msg);
		
		
	}
	
	
	public static void main(String[] args) {
		
		writeToFile("src/text.txt", "BitCamp<3");
		

	}

}
