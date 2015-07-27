package predavanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	private static final String host = "localhost";
	private static final int PORT = EchoServer.ECHO;

	public static void main(String[] args) {

		try {

			System.out.println("Connecting to " + host + ":" + PORT);
			Socket client = new Socket(host, PORT);
			System.out.println("Connection established");

			OutputStream rqStream = client.getOutputStream();
			OutputStreamWriter rqWriter = new OutputStreamWriter(rqStream);
			rqWriter.write("hello server\n");
			rqWriter.flush();
			System.out.println("Request sent, waiting for response");
			InputStream in = client.getInputStream();
			BufferedReader bf = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = bf.readLine()) != null) {
				System.out.println(line);
			}

			System.out.println(bf.readLine());
			System.out.println("Finishing program");
			client.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
