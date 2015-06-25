package ba.bitcamp.vjezbe.task1;

public class Main1 {

	public static void main(String[] args) {

		print("Cersei", 3);

	}

	private static void print(String string, int i) {

		if (i == 0) {
			return;
		}
		System.out.println(string);
		print(string, i - 1);

	}

}
