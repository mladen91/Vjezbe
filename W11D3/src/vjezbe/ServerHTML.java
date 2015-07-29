package vjezbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ServerHTML {

	public static void main(String[] args) {

		ServerSocket server;
		try {
			server = new ServerSocket(5555);
			Set<String> ipSet = new TreeSet<>();
			BufferedReader ipReader = new BufferedReader(new FileReader(
					"ipAddresses.txt"));

			while (true) {
				Socket client = server.accept();
				while (ipReader.ready()) {
					ipSet.add(ipReader.readLine());
				}
				BufferedWriter writer = new BufferedWriter(
						new OutputStreamWriter(client.getOutputStream()));
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				BufferedReader fileReader = null;
				String htmlDoc = "";
				boolean printIps = true;
				try {
					String fromClient = reader.readLine();
					String[] wantedAddress = fromClient.split(" ");
					String address = "src/vjezbe/example.html";
					if (wantedAddress[1].equals("/about.html")) {
						address = "src/vjezbe/about.html";
						printIps = false;
					}
					fileReader = new BufferedReader(new FileReader(new File(
							address)));

				} catch (NullPointerException e) {
					continue;
				}

				while (fileReader.ready()) {
					htmlDoc += fileReader.readLine();
				}

				if (printIps) {
					Iterator<String> it = ipSet.iterator();
					while (it.hasNext()) {
						htmlDoc += it.next() + "<br>\n";
					}
				}
				htmlDoc += "</p></body></html>";
				writer.write(htmlDoc);
				writer.close();
				client.close();
				fileReader.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
