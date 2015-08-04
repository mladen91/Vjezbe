package vjezbe;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task5 extends JFrame {

	public Task5() {

		DrawPanel panel = new DrawPanel();
		

		setLocationRelativeTo(null);
		setSize(1920, 1080);
		
		setVisible(true);
	
		add(panel);
			play();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Task5();
	}

	// public class MyThread implements Runnable(){
	//
	// }
	
	public void play()
	{
	    boolean playing = true;
	    //Graphics g = new Graphics();
	    while (playing)
	    {
	        repaint();
	    }

	} //

	public class DrawPanel extends JPanel {
		//private Image image;
		private BufferedImage img = null;

		public DrawPanel() {

			try {
				img = ImageIO.read(new File("pic.jpg"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}

			
		}

		public void paintComponent(Graphics g) {

			g.drawImage(img, 3, 4, this);
		}
	}
	
	
}
