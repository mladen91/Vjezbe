import java.util.Scanner;

public class Task5 {

	public static String getType(String value) {

		int i = 1;

		while (i > 0) {

			try {
				if (i == 1) {
					int name = Integer.parseInt(value);
					System.out.println("Value is integer.");
					break;
				} else if (i == 2) {
					double name = Double.parseDouble(value);
					System.out.println("Double");
				} else if (i == 3) {
					boolean name = Boolean.parseBoolean(value);
					System.out.println("Boolean");
					break;
				}

			} catch (Exception ex) {
				i++;
			}
		}
		return "";

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Insert String: ");
		String name = in.nextLine();
		System.out.println(getType(name));

	}

}
