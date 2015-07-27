package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		System.out.println("Application started");
		try {
			ServerSocket server = new ServerSocket(8888);
			System.out.println("Server socket made");
			
			System.out.println("Listening for a client");
			Socket client = server.accept();
			System.out.println("Client found!");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			System.out.println("OPERATING AVAILABLE NOW");
			writer.write("Kako si, sta ima!?");
			writer.newLine();
			writer.flush();
			
			System.out.println("Client: "+reader.readLine());
			Scanner input = new Scanner (System.in);
//			System.out.print("Msg: ");
//			writer.write(input.nextLine());
//			writer.flush();
			
			boolean end = false;
			while (!end){
				
				System.out.print("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				
				System.out.println("Client: "+reader.readLine());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
