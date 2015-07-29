package preadavanja;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) {
		String fullPath = routeBuilder(route);
		StringBuilder sb = new StringBuilder();
		String s ="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(fullPath));
	
			try {
				while ((s = br.readLine()) != null) {
					sb.append(s);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     return sb.toString();
	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}
}
