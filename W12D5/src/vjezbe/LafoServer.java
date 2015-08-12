package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class LafoServer {

	public static String ipAdd = "";
	public static ArrayList<String> list;
	public static ObjectMapper map = new ObjectMapper();
	public static ArrayList<Snake> snakes;

	public static void main(String[] args) {

		list = new ArrayList<String>();

		try {
			ServerSocket server = new ServerSocket(5555);
			BufferedWriter writer;
			 snakes = new ArrayList<Snake>();

			while (true) {
				Socket client = server.accept();
				System.out.println("Client connected");

				ClientThread ct = new ClientThread(client);
				snakes.add(new Snake());
				
				Thread t = new Thread(ct);

				list.add(client.getInetAddress().getHostAddress());
				// writer = new BufferedWriter(new
				// OutputStreamWriter(client.getOutputStream()));
				// writer.write(ipAdd);
				// writer.flush();

				t.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static class ClientThread implements Runnable {

		private Socket client;
		public String ip;

		public ClientThread(Socket client) {
			this.client = client;
			this.ip = client.getInetAddress().getHostAddress();
		}

		public void run() {
			try {
				// TODO write JSON to output stream

				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));

			//	while (client.isConnected()) {
					
					map.writeValue(client.getOutputStream(),
							snakes);

				//}
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
	}
}
