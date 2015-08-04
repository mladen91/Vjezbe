package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Task4 {

	public static void main(String[] args) {

		ServerSocket socket = null;

		try {
			System.out.println("Server started");
			socket = new ServerSocket(8000);
			while (true) {
				Socket client = socket.accept();
				System.out.println("Client connected");
				Thread t = new Thread(new MyThread(client));
				t.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class MyThread implements Runnable {

		Socket client;

		public MyThread(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {

			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				String line = br.readLine();
				BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
						"logger.txt"), true));

				String s = converter(line);
				if (s.equals("")) {
					bw.write("There is an error in input");
				} else {
					bw.write(s);
					bw.newLine();
					bw.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static String converter(String line) {
		String[] arr = line.split(" ");

		switch (arr[0]) {
		case "1":
			return "[Temperature] " + arr[1] + " K";

		case "2":
			return "[Pressure] " + arr[1] + " hPa";

		case "3":
			return "[Movement] " + arr[1];
		case "4":
			return "[Error] " + line.substring(1, line.length());
		default:
			return "";
		}
	}

}
