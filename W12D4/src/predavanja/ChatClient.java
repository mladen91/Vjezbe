package predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient {

	private Socket client;
	private String id;
	private BufferedReader reader;
	private BufferedWriter writer;
	
	public ChatClient(Socket client) {
		
		this.client = client;
		id =client.getInetAddress().getHostAddress();
		
			try {
				reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}

	public Socket getClient() {
		return client;
	}

	public String getId() {
		return id;
	}


	public BufferedReader getReader() {
		return reader;
	}


	public BufferedWriter getWriter() {
		return writer;
	}

	
	public void closeSocket(){
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
