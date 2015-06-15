import java.io.ObjectInputStream.GetField;
import java.util.Scanner;


public class Task6 {

	public static String fixSentence(String sentence) {
		char firstChar=sentence.charAt(0);
		String allSentence="";
		String firstCharAsString;
		firstCharAsString=Character.toString(firstChar);
		String firstCharAsStringUpperCase=firstCharAsString.toUpperCase();
		
		for (int i=1;i<sentence.length();i++) {
			allSentence+=sentence.charAt(i);					
		}
		String allInOne=firstCharAsStringUpperCase+allSentence+".";
		return allInOne;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Insert String: ");
		String name = in.nextLine();
		System.out.println(fixSentence(name));

	}

}
