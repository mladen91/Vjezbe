package ba.bitcamp.vjezbe;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Task7 extends JFrame {

	private static final long serialVersionUID = 2830661930132074603L;
	private int[] values = { 10, 20, 50, 30, 50, 40, 20, 0, 10, 40, 90, 120 };
	private JPanel panel = new MyPanel();

	private String s = "";
	Font f1 = new Font("Serif", Font.BOLD, 20);
	int counter=0;

	public Task7() {

		setLayout(new BorderLayout());
		add(panel);
		panel.setFont(f1);
		setSize(500, 500);
		setLocation(550, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Task7();

	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g2d.setStroke(new BasicStroke(10));
			
			for (int i = 0; i < values.length; i++) {
				g2d.fill3DRect(i * 50 + 10, 100 - values[i], 50, values[i], true);
			}
		}
	}

}
