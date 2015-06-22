package ba.bitcamp.vjezbe.task4;

public class CampStringBuilder {

	private char[] characters;
	public static final int DEFAULT_SIZE = 0;

	public CampStringBuilder() {
		this.characters = new char[DEFAULT_SIZE];
	}

	/**
	 * Places characters in the end
	 */
	public void append(Object o) {
		int charLength = characters.length;
		int newChar = charLength;
		newChar += o.toString().length();
		// Creating temp character array that will keep our letters
		char[] temp = new char[newChar];
		// Putting characters into temp array using loop
		for (int i = 0; i < characters.length; i++) {
			temp[i] = characters[i];
		}
		int counter = 0;
		// Converting word that comes in as object to characters, using loop
		for (int i = characters.length; i < temp.length; i++) {
			temp[i] = o.toString().charAt(counter++);
		}
		characters = temp;
	}

	// Places characters at the beginning
	public void prepend(Object o) {

		int charLength = characters.length;
		int newChar = charLength;
		newChar += o.toString().length();

		// Creating temp character array that will keep our letters
		StringToolbox.extendArray(characters, o.toString().length());

	}

	// Print method
	public String toString() {
		String s = "";
		for (int i = 0; i < characters.length; i++) {
			s += characters[i];
		}
		return s;
	}

	private static class StringToolbox {

		public static void extendArray(char[] characters, int num) {
			char[] array = new char[characters.length + num];
			for (int i = 0; i < array.length; i++) {
				array[i] = characters[i];
			}
			characters = array;
		}

	}

	public static void insertInto(char[] characters, String s, int beginIndex) {
		char[] array = new char[characters.length + s.length()];
		if (0 <= beginIndex && beginIndex < characters.length) {
			for (int i = 0; i < beginIndex; i++) {
				array[i] = characters[i];
			}
		}
		for (int i = beginIndex; i < s.length(); i++) {
			array[i] = s.charAt(i - beginIndex);
		}
		for (int i = beginIndex + s.length(); i < array.length; i++) {
			array[i] = characters[i - s.length()];
		}
	}

}
