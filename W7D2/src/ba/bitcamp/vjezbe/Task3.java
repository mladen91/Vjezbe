package ba.bitcamp.vjezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task3 extends JFrame {

	private static final long serialVersionUID = 7846851375170421023L;

	private MyPanel panel = new MyPanel();
	private int size = 60;
	private int x = 10;
	private int y = 10;
	private int deltaX = 10;
	private int deltaY = 10;

	public Task3() {
		add(panel);

		setTitle("Timers example");
		setSize(800, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		Timer t = new Timer(50, new Action());
		t.start();
	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = 8281156269736697513L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			int red = (int) (Math.random() * 256);
			int green = (int) (Math.random() * 256);
			int blue = (int) (Math.random() * 256);

			g.setColor(new Color(red, green, blue));
			g.fillRect(x, y, size, size);
		}
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			x += deltaX;
			y += deltaY;

			if (y + size >= panel.getHeight()) {
				deltaY = -deltaY;
			}
			if (y <= 0) {
				deltaY = -deltaY;
			}
			if (x + size >= panel.getWidth()) {
				deltaX = -deltaX;
			}
			if (x <= 0) {
				deltaX = -deltaX;
			}

			repaint();
		}

	}

	public static void main(String[] args) {
		new Task3();

	}

}
