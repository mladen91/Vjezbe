import java.util.Scanner;

public class Task2 {

	public static String getExtension(String filename) {
		int length = filename.length();
		int counter = 0;
		String extension = "";
		String rev="";

		for (int i = length - 1; i > 0; i--) {
			counter++;
			if (filename.charAt(i) == '.') {
				break;
			}
			extension += Character.toString((filename.charAt(i)));
		}
		
		for (int i=extension.length()-1;i>=0;i--) {
			rev+=Character.toString(extension.charAt(i));
		}
		
		

		if (counter == length - 1) {
			return null;
		} else {
			return "."+rev;
		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println(getExtension("text.ext"));

	}

}
