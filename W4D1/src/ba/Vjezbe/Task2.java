package ba.Vjezbe;

import java.awt.Font;

public class Task2 {

	public static void main(String[] args) {
		try {
		Font f=new Font("Times New Roman", Font.BOLD,14);
		printFontDetails(f);
		}catch (NullPointerException ex) {
			System.out.println("Is Null");
		}
	}
	/**
	 * 
	 * @param f - we use this parameter for displaying our <b>Name, Font</b>.
	 * 
	 * @exception NullPointerException - We will catch this Exception if we insert null value.
	 */
	
	public static void printFontDetails(Font f) {
	
		if (f==null) {
			throw new NullPointerException();
		}
		
		System.out.println(f.getName());
		System.out.println(f.getSize());
		System.out.println("Bold "+f.isBold());
		System.out.println("Italic "+f.isItalic());
		System.out.println("Plain "+f.isPlain());
		
		
	}
	
	
	
	

}
