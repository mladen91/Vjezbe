package predavanja;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		
		
		try {
			Socket client = new Socket("10.0.82.113",7321);
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			Scanner in = new Scanner(System.in);
			
			
			String s = in.nextLine();
			writer.write(s);
			writer.newLine();
			writer.flush();
			
			String line = " ";
			while ((line = reader.readLine())!=null) {
				System.out.println(line);
			}
					
			
			
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		

	}

}
