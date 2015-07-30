package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(8888);
			Socket client = null;
			while (true) {

				client = server.accept();
				Thread t = new Thread(new ClientThread(client));
				t.start();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static class ClientThread implements Runnable {

		Socket client;

		public ClientThread(Socket client) {
			this.client = client;

		}

		@Override
		public void run() {
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(
						client.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
						client.getOutputStream()));
				String s = "";
				while ((s = br.readLine()) != null) {
					System.out.println(s);
				}
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
