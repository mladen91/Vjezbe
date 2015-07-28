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

public class ClientFile {

	public static void main(String[] args) {

		URL url = null;
		
		try {
			System.out.println("Client application started");
			Socket socket = new Socket("10.0.82.98", 7777);
			System.out.println("Connected to localhost");
		
	
			InputStream in = socket.getInputStream();
			File file = new File("output.txt");
			FileOutputStream fileWrite = new FileOutputStream(file);
			byte[] data = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(data, 0, 1024)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}

			fileWrite.close();

		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
