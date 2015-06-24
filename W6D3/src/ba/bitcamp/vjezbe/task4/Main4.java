package ba.bitcamp.vjezbe.task4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main4 extends JFrame {

	private JLabel l1 = new JLabel("Press one to disable the other...");
	private JButton b1 = new JButton("Button 1");
	private JButton b2 = new JButton("Button 2");
	int counter = 0;

	public Main4() {
		setVisible(true);
		add(l1);
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		l1.setFont(new Font("Serif", Font.BOLD, 18));
		setTitle("Task 3");
		setSize(250, 150);
		setLocation(700, 350);
		b2.setEnabled(false);
		setDefaultCloseOperation(3);
		b1.addActionListener(new ButtonHandler());
		b2.addActionListener(new ButtonHandler());

	}

	public static void main(String[] args) {
		new Main4();
	}

	public class ButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (counter < 5) {
				if (e.getSource() == b1) {
					b2.setEnabled(true);
					b1.setEnabled(false);

				} else if (e.getSource() == b2) {
					b1.setEnabled(true);
					b2.setEnabled(false);
				}
				counter++;
			} else {
				System.exit(3);
			}

		}

	}

}
