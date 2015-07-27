package predavanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static final int ECHO =12345;
	
	
	public static void main(String[] args) {
		

		try {
			ServerSocket server = new ServerSocket(ECHO);
			while (true) {
				System.out.println("Waiting fow next request");
				Socket clientSocket =server.accept();
				System.out.println("waiting for request");
				InputStream rqStream = clientSocket.getInputStream();
				BufferedReader rqReader = new BufferedReader(new InputStreamReader(rqStream));
				String rq = rqReader.readLine();
				System.out.println("Request accepted"+rq);
				System.out.println("Waiting response..");
				OutputStream os = clientSocket.getOutputStream();
				OutputStreamWriter writer = new OutputStreamWriter(os);
				writer.write("OK");
				writer.write(rq);
				writer.flush();
				System.out.println("Respones flushed");
				os.flush();
				writer.close();
				server.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
