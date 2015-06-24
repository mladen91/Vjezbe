package ba.bitcamp.vjezbe.task2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Form2 extends JFrame {

	JFrame window = new JFrame();
	
	// form 2
	private JLabel hello = new JLabel("Hello!");
	private JButton b2 = new JButton("OK");

	public Form2() {
		setVisible(true);
		add(hello);
		hello.setHorizontalAlignment(SwingConstants.CENTER);
		add(b2, BorderLayout.SOUTH);
		setTitle("Message");
		setSize(400, 300);
		setLocation(700, 350);
		setDefaultCloseOperation(3);
		ButtonHandler listener = new ButtonHandler();
		b2.addActionListener(listener);
	}

	public static void main(String[] args) {

		new Form2();

	}

	public void ActionPerformed(ActionEvent e) {
		System.exit(EXIT_ON_CLOSE);
	}

	private static class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(EXIT_ON_CLOSE);
		}
	}

}