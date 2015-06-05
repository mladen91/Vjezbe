import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void drawRectangles(int n, int m, Graphics g) {

		for (int i = n; i <300; i+=50) {
			for (int j = m; j <200; j+=50) {
				g.setColor(Color.BLACK);
				g.drawRect(i, j, 50, 50);
			}
		}
	}

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();

		drawRectangles(4, 3, g);

		w.setImage(img);
	}
}
