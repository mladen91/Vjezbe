package predavanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Networking {

	public static void main(String[] args) {
		try {
			URL abhUrl = new URL("http://atlantbh.com");
			URLConnection conn = abhUrl.openConnection();
			InputStream in = conn.getInputStream();
			String res = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line = null;
			while ((line = br.readLine()) != null) {
				res += "\n" + line;
			}
			System.out.println(res);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
