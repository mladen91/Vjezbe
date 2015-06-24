package ba.bitcamp.vjezbe.task3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main3 extends JFrame {

	private JLabel l1 = new JLabel("Choose one");
	private JButton b1 = new JButton("Do not exit");
	private JButton b2 = new JButton("Exit");

	public Main3() {
		setVisible(true);
		add(l1);
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		setTitle("Task2");
		setSize(250, 150);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
		b2.addActionListener(new BH2());
		b1.addActionListener(new BH2());
	}

	public static void main(String[] args) {

		new Main3();

	}

	public class BH2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				l1.setText("It did not exit");
			} else {
				System.exit(EXIT_ON_CLOSE);
			}

		}

	}
}
