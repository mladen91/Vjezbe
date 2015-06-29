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
import javax.swing.JPanel;

public class Task3 extends JFrame {
	String s = "Last pressed";
	JPanel panel = new MyPanel();
	Font f1 = new Font("Monospaced", Font.PLAIN, 20);

	public Task3() {
		setLayout(new BorderLayout());
		add(panel);
		panel.setFont(f1);
		setSize(500, 500);
		
		setLocationRelativeTo(null);
		panel.addMouseListener(new MH());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Task3();

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

	public class MH implements MouseMotionListener, MouseListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseClicked(MouseEvent e) {

			if (e.getButton() == MouseEvent.BUTTON1) {
				s = "Last pressed: Left";
			} else if (e.getButton() == MouseEvent.BUTTON2) {
				s = "Last pressed: Middle";
			} else {
				s = "Last pressed: Right";
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}

}
