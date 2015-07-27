package vjezbe;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class URLExamples {

	public static void main(String[] args) throws IOException {
		URL url = null;

		try {
			url = new URL("http://boi2012.dms.rs/images/bah/c03.jpg");

			ImageIcon imageIcon = new ImageIcon(url);
			JFrame frame = new JFrame();
			frame.add(new JLabel(imageIcon));
			frame.setSize(500, 500);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		BufferedImage image = ImageIO.read(url);

		URLConnection conn = url.openConnection();
		InputStream in = conn.getInputStream();
		File file = new File("output.jpg");
		FileOutputStream fileWrite = new FileOutputStream(file);
		byte[] data = new byte[1024];
		int bytesRead;
		while ((bytesRead = in.read(data, 0, 1024)) > 0) {
			fileWrite.write(data, 0, bytesRead);
		}
		
		fileWrite.close();

	}

}
