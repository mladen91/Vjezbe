package vjezbe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class ClientHashMap {

	public static HashMap<String, String> map = new HashMap<String, String>();
	public static ArrayList<String> list = new ArrayList<>();

	public static String getName(String ip) {
		return map.get(ip);
	}

	public static String getIP() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File(
				"output.txt")));

		while (reader.ready()) {
			String s = reader.readLine();
			list.add(s.substring(0, s.indexOf(" ")));
			map.put(s.substring(0, s.indexOf(" ")),
					s.substring(s.indexOf(" ") + 1, s.length()));
		}
		int random = (int) (Math.random() * 26);

		if (map.containsKey(list.get(random)) && list.get(random) != "Mladen") {
			return (list.get(random));
		} else {
			return "";
		}

	}

	public static void main(String[] args) throws IOException {

		try {
			getIP();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
