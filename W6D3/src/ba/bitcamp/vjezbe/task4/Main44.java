package ba.bitcamp.vjezbe.task4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main44 extends JFrame {

	private JLabel l1 = new JLabel("Don't press it.");
	private JButton b1 = new JButton("Button");
	int counter = 0;

	public Main44() {
		setVisible(true);
		add(b1, BorderLayout.SOUTH);
		add(l1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		setSize(250, 150);
		setLocation(700, 350);
		setTitle("Task 4");
		setDefaultCloseOperation(3);
		b1.addActionListener(new BH());
	}

	public static void main(String[] args) {
		new Main44();

	}

	public class BH implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			counter++;
			if (counter > 2) {
				counter = 0;
			}
			if (counter == 0 && e.getSource() == b1) {
				l1.setText("Don't press it.");

			}
			if (e.getSource() == b1 && counter == 1) {
				l1.setText("I told you not to press it!");

			}
			if (e.getSource() == b1 && counter == 2) {
				l1.setText("Look it's simple. Don't press it!");

			}
		}

	}

}
