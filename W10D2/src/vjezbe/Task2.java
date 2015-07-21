package vjezbe;

import java.io.PrintWriter;

public class Task2 {

	public static void main(String[] args) {

		PrintWriter pw = new PrintWriter(System.out);

		char[] arr = new char[26];
		int counter = 65;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char) counter;
			counter++;
		}
		int count = 0;

		while (count < 20) {
			pw.write(arr, count, 10);
			count += 10;
		}
		pw.write(arr, 20, 6);
		pw.flush();

	}

}
