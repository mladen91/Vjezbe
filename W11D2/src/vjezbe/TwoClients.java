package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoClients {

	public static void main(String[] args) {

		try {

			System.out.println("Server is waiting for connection!");
			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			String IP = client.getInetAddress().getHostAddress();
			String name = ClientHashMap.getName(IP);
			String message = reader.readLine();
			System.out.println("Connected successfully!");

			System.out.println(name + ": " + message);

			Socket client1 = new Socket("10.0.82.98", 8888);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client1.getOutputStream()));
			writer.write(message);
			writer.newLine();
			writer.flush();

			Scanner in = new Scanner(System.in);
			Socket client2 = null;
			try {
				while (true) {
					client2 = new Socket(ClientHashMap.getIP(), 8888);
					BufferedWriter writer2 = new BufferedWriter(
							new OutputStreamWriter(client2.getOutputStream()));
					System.out.println("Insert word: ");
					String s = in.nextLine();
					writer2.write(message + " " + s);
					writer2.newLine();
					writer2.flush();
					System.out.println("Connection successful");
					break;
				}
			} catch (ConnectException e) {
				System.out.println("Try again");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
