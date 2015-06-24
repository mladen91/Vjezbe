package ba.bitcamp.vjezbe.task1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main extends JFrame {

	JFrame window = new JFrame();
	private JLabel l1 = new JLabel("Hello World");
	private JButton b1 = new JButton("Hello!");

	public Main() {
		setVisible(true);
		add(l1);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		add(b1, BorderLayout.SOUTH);
		setTitle("Task1");
		setSize(400, 300);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
	}

	public static void main(String[] args) {

		new Main();

	}

}
