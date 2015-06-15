package Vjezbe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		/*
		 * g.setColor(Color.BLACK); g.drawOval(200, 100, 150, 300);
		 * g.fillOval(200, 100, 150, 300); g.setFont(new Font("Cambria",
		 * Font.BOLD, 18)); g.drawString(". 1", 130, 250); g.drawString(". 2",
		 * 156, 270); g.drawString("S1/S2={1,2}", 190, 430);
		 * 
		 * 
		 * g.setColor(Color.BLACK); g.drawOval(100, 100, 150, 300);
		 */

		// g.setColor(Color.RED);
		// g.setFont(new Font("Cambria", Font.BOLD, 18));
		// g.drawString("Mladen <3", 250, 150);

		// g.setColor(Color.BLACK);
		// g.drawLine(400, 100, 400, 500);

		// g.setColor(Color.BLACK);
		// g.drawLine(400, 100, 280, 300);

		// *******************

		g.setColor(Color.BLACK);
		for (int i = 30; i <= 240; i += 30) {

			for (int j = 30; j < 240; j += 30) {
				g.drawRect(i, j, 30, 30);
				int a=i/10;
				int  b=j/10;
				if (a%2!=0 && b%2!=0) {
					g.fillRect(i, j, 30, 30);
				}else if(a%2==0 &&b%2==0) {
					g.fillRect(i, j, 30, 30);
				}
			}
		}

				

		w.setImage(img);
	}
}
