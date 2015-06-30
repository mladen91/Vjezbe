package ba.bitcamp.vjezbe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Task1 extends JFrame {
    String s = "Not in focus!";
	JPanel panel = new MyPanel();

	public Task1() {
		add(panel);
		setLocation(400, 300);
		setSize(500, 500);
		this.addFocusListener(new FH());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Task1();

	}

	public class FH implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			s="In Focus";
			repaint();

		}

		@Override
		public void focusLost(FocusEvent e) {
			s="Not In Focus";
			repaint();

		}

	}
	
	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setColor(Color.RED);
			g2d.drawString(s, 150, 150);

			repaint();

		}
	}
}
