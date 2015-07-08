package ba.bitcamp.vjezbe;

public class Task1 {

	private static String[] day1 = new String[] { "Monday", "Tuesday",
			"Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	private static String s = "";

	public static String integerToDay(int day) {
		if (day < 0 || day > 7) {
			throw new ArrayIndexOutOfBoundsException("Invalid index!");
		}
		s = day1[day - 1];
		return s;

	}

	public static void main(String[] args) {

		System.out.println(integerToDay(8));

	}

}
