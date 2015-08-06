package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {

	static int a = 0;
	static int b = 1000;
	static int count = 0;

	public static void main(String[] args) {
		Socket client = null;
		try {
			while (true) {
				client = new Socket("10.0.82.98", 8000);
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				String line = reader.readLine();
				String[] arr = line.split(" ");
				a = Integer.parseInt(arr[0]);
				b = Integer.parseInt(arr[1]);
				count = 0;
				for (int i = a; i < b; i++) {
					if (isPrime(i)) {

						count++;

					}
				}

				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				writer.write(String.valueOf(count));
				writer.newLine();
				writer.flush();

			}
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		if (num % 2 == 0) {
			return false;
		}

		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
}
