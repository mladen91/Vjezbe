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

public class Task6 extends JFrame {

	private static final long serialVersionUID = 2830661930132074603L;

	private JPanel panel = new MyPanel();

	private String s = "";
	Font f1 = new Font("Serif", Font.BOLD, 20);

	public Task6() {

		setLayout(new BorderLayout());
		add(panel);
		panel.addMouseMotionListener(new MH());
		panel.setFont(f1);
		setSize(500, 500);
		setLocation(550, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Task6();

	}

	private class MyPanel extends JPanel {
		private static final long serialVersionUID = -6302911398550823044L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.drawString(s, 170, 250);

		}
	}

	public class MH implements MouseMotionListener, MouseListener {

		@Override
		public void mouseDragged(MouseEvent e) {

		}

		@Override
		public void mouseMoved(MouseEvent e) {

			s = "X:   " + e.getX() + "  Y:   " + e.getY();
			panel.repaint();
		}

		@Override
		public void mouseClicked(MouseEvent e) {

		}

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseEntered(MouseEvent e) {

		}

		@Override
		public void mouseExited(MouseEvent e) {

		}
	}
}
