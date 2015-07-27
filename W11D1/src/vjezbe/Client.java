package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			System.out.println("Client application started");
			Socket socket = new Socket("10.0.82.30", 7654);
			System.out.println("Connected to localhost");
			
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("OPERATING AVAILABLE NOW");
			System.out.println("Server: "+reader.readLine());
			writer.write("Odlicno moj Selvere");
			writer.newLine();
			writer.flush();
			
			
			URL url = null;
			
			URLConnection conn = url.openConnection();
			InputStream in = conn.getInputStream();
			File file = new File("output.jpg");
			FileOutputStream fileWrite = new FileOutputStream(file);
			byte[] data = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(data, 0, 1024)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}
			
			fileWrite.close();

			
			
			Scanner input = new Scanner (System.in);
			
			boolean end = false;
			while (!end){
				System.out.println("Server: "+reader.readLine());
				
				System.out.print("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
