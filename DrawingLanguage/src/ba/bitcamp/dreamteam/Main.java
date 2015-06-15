package ba.bitcamp.dreamteam;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.naming.PartialResultException;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);

	}

	public static void line(int x1, int y1, int x2, int y2, Graphics g) {
		
		g.drawLine(x1, y1, x2, y2);
	}

	public static void rect(int x, int y, int h, int w, Graphics g) {
		
		g.drawRect(x, y, h, w);
	}
	
public static void eclipseLogo(int x, int y, int w, int h, Graphics g){
		
		g.setColor(Color.LIGHT_GRAY);

		g.fillRect(0 + x, 0 + y, 200 + w, 200 + h );

		g.setColor(Color.ORANGE);
		g.fillOval(10 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(20 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(new Color(60, 10, 70));
		g.fillOval(25 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(Color.BLACK);
		g.drawOval(25 + x, 10 + y, 100 + w, 100 + h);
		g.drawOval(24 + x, 10 + y, 100 + w, 100 + h);

		g.setColor(Color.WHITE);
		g.drawLine(25 + x, 60 + y, 125 + w, 60 + h);
		g.drawLine(25 + x, 61 + y, 125 + w, 61 + h);
		g.drawLine(25 + x, 62 + y, 125 + w, 62 + h);
		g.drawLine(25 + x, 58 + y, 125 + w, 58 + h);
		g.drawLine(25 + x, 59 + y, 125 + w, 59 + h);

		g.drawLine(25 + x, 53 + y, 125 + w, 53 + h);
		g.drawLine(25 + x, 52 + y, 125 + w, 52 + h);
		g.drawLine(25 + x, 51 + y, 125 + w, 51 + h);
		g.drawLine(25 + x, 50 + y, 125 + w, 50 + h);
		g.drawLine(25 + x, 49 + y, 125 + w, 49 + h);

		g.drawLine(25 + x, 67 + y, 125 + w, 67 + h);
		g.drawLine(25 + x, 68 + y, 125 + w, 68 + h);
		g.drawLine(25 + x, 69 + y, 125 + w, 69 + h);
		g.drawLine(25 + x, 70 + y, 125 + w, 70 + h);
		g.drawLine(25 + x, 71 + y, 125 + w, 71 + h);

	}
	
	

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		TextIO.readFile("src/ba/bitcamp/dreamteam/draw");

		String part1 = "";
		String part2 = "";
		String part3 = "";
		String part4 = "";
		String part5 = "";

		while (!TextIO.eof()) {

			String s = TextIO.getln();
			String[] parts = s.split(" ");
			part1 = parts[0];
			if (part1.equals("C")) {
				part2 = parts[1];
			}else  {
				part2 = parts[1];
				part3 = parts[2];
				part4 = parts[3];
				part5 = parts[4];				
			}
			
			
			switch (part2) {
			
			case "RED":
				g.setColor(Color.RED);
				break;
			case "BLUE":
				g.setColor(Color.BLUE);
				break;
			case "GREEN":
				g.setColor(Color.green);

			
			 
			 }

			switch (part1) {
			case "L":
				line(Integer.parseInt(part2), Integer.parseInt(part3),
						Integer.parseInt(part4), Integer.parseInt(part5), g);

				break;
			case "E":
				eclipseLogo(Integer.parseInt(part2),Integer.parseInt(part3),
						Integer.parseInt(part4), Integer.parseInt(part5), g);
			case "DR":
				rect(Integer.parseInt(part2), Integer.parseInt(part3),
						Integer.parseInt(part4), Integer.parseInt(part5), g);
				break;
			case "C":
 
				break;
			}
			
		}
		TextIO.readStandardInput();

		// line(100, 100, 50, 50, g);
		// g.setColor(Color.ORANGE);
		// g.drawOval(100, 100, 400, 100);
		//
		// g.setColor(Color.RED);
		// g.setFont(new Font("Cambria", Font.BOLD, 18));
		// g.drawString("BitCamp <3", 250, 150);
		//
		// g.setColor(Color.BLUE);
		// g.drawLine(100, 200, 500, 200);
		//
		// // *******************
		w.setImage(img);
	}
}
