package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class RingSender {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		ServerSocket server = new ServerSocket(5555);
		Socket fromSema = server.accept();

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				fromSema.getInputStream()));
		String message = reader.readLine();

		System.out.println("Od seme: " + message);
		Socket socket = new Socket("10.0.82.44", 1946);

		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
				socket.getOutputStream()));

		writer.write(message);
		writer.newLine();
		writer.close();
		System.out.println("Poslao poruku Cimi.");

	}

}
