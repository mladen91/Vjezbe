package ba.bitcamp.vjezbe;

import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task1 extends JFrame {


	private static final long serialVersionUID = -4202109254536325060L;
	private JLabel l1 = new JLabel("Not Clicked!");
	Font f1 = new Font("Monospaced", Font.PLAIN, 20);

	public Task1() {
		setSize(500, 500);
		setLocation(550, 300);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(f1);
		add(l1);
		l1.addMouseListener(new MH());
		setVisible(true);
	}

	public static void main(String[] args) {
		new Task1();

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
                l1.setText("It's clicked!");
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
