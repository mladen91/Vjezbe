package ba.bitcamp.vjezbe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame {

	JLabel l1 = new JLabel("TEST");
	Font f1 = new Font("Monospaced", Font.PLAIN, 20);
	Font f2 = new Font("Monospaced", Font.BOLD, 20);

	public Task4() {

		add(l1);
		setSize(500, 500);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(f1);
		setLocationRelativeTo(null);
		l1.addMouseListener(new MH());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new Task4();

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

			if (e.getSource() == l1) {
				l1.setForeground(Color.RED);
			}

		}

		@Override
		public void mousePressed(MouseEvent e) {

			if (e.getSource() == l1) {
				l1.setFont(f2);
			}

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			if (e.getSource() == l1) {
				l1.setFont(f1);
			}

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == l1) {
				l1.setForeground(Color.RED);
			}

		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == l1) {
				l1.setForeground(Color.BLACK);
			}

		}
	}

}
