package vjezbe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class ServerNormal {

	public static void main(String[] args) {

		try {
			System.out.println("Server started!");
			ServerSocket server = new ServerSocket(5555);
			Socket client = server.accept();
			System.out.println("Client connected");
			String ip = client.getInetAddress().getHostAddress();
			BufferedWriter writer = new BufferedWriter(new FileWriter(new File(
					"IpAddresses.txt"), true));

			Calendar cl = Calendar.getInstance();
			int hour = cl.get(Calendar.HOUR);
			int min = cl.get(Calendar.MINUTE);
			int sec = cl.get(Calendar.SECOND);
		

			writer.write(hour + ":" + min + ":" + sec + " " + ip);
			writer.newLine();
			writer.flush();
			OutputStream streamWriter = client.getOutputStream();
			FileInputStream streamReader = new FileInputStream(new File(
					"output.jpg"));

			byte[] buffer = new byte[1024];
			int readBytes;

			while ((readBytes = streamReader.read(buffer, 0, 1024)) > 0) {
				streamWriter.write(buffer, 0, readBytes);
			}
			System.out.println("File sent!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
