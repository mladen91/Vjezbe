package vjezbe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Calendar;

import org.codehaus.jackson.map.ObjectMapper;

public class RingSender {

	public static void main(String[] args) throws UnknownHostException,
			IOException {
		System.out.println("Server started");
		ServerSocket server = new ServerSocket(8000);
		Socket fromAdnan = server.accept();
		System.out.println("Client connected");

		InputStream byteReader = fromAdnan.getInputStream();
		OutputStream byteWriter = new FileOutputStream(new File("test.json"));

		int line;
		byte[] buffer = new byte[1024];
		while ((line = byteReader.read(buffer, 0, 1024)) > 0) {
			byteWriter.write(buffer, 0, line);
		}
		byteWriter.flush();
		fromAdnan.close();
		System.out.println("File je primio");

		ObjectMapper mapper = new ObjectMapper();

		ArrayList<Message> s1 = mapper.readValue(new File("test.json"),
				ArrayList.class);
		String time = Calendar.getInstance().getTime() + "";
		Message msg = new Message("Mladen ", time.split(" ")[3], "Evo mladje");

		Socket toHajro = new Socket("10.0.82.54", 8000);

		s1.add(msg);
		System.out.println(s1);

		try {
			mapper.writeValue(new File("test.json"), s1);
			System.out.println("It worked!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		InputStream reader = new FileInputStream(new File("test.json"));
		OutputStream writer = toHajro.getOutputStream();

		int line1;
		byte[] buffer1 = new byte[1024];
		while ((line1 = reader.read(buffer1, 0, 1024)) > 0) {
			writer.write(buffer1, 0, line1);
		}
		writer.flush();
		toHajro.close();
		System.out.println("Otislo hajri");

	}

}
