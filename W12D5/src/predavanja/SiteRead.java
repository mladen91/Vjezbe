package predavanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SiteRead {

	public static void main(String[] args) throws IOException {
		

		try {
			URL url = new URL("http://klix.ba");
			URLConnection c = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream()));
			while (br.ready()){
				System.out.println(br.readLine());
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
